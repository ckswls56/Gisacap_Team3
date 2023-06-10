<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String[] selectedOptions = request.getParameterValues("symptom");
    String filePath = request.getParameter("filePath");
    String symptomsString = "";
    if (selectedOptions != null && selectedOptions.length > 0) {
        symptomsString = String.join("\",\"", selectedOptions);
    }

    String symptomString = "{[\"" + symptomsString + "\"]}";
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <script>
        const xhr = new XMLHttpRequest();

        xhr.open("POST", "/expertInput");
        xhr.setRequestHeader('Content-type', 'application/json');
        xhr.send("<%=symptomString%>");

        xhr.onreadystatechange = function() {
            if (xhr.readyState === XMLHttpRequest.DONE) {
                if (xhr.status === 200) {
                    const response = JSON.parse(xhr.responseText);
                    const names = [];
                    const sols = [];

                    for (let i = 0; i < response.length; i++) {
                        const item = response[i];
                        names.push(item.name);
                        sols.push(item.sol);
                    }

                    // 각각의 name과 sol 값을 request 객체에 저장
                    request.setAttribute("names", names);
                    request.setAttribute("sols", sols);
                } else {
                    console.error("Request failed with status:", xhr.status);
                }
            }
        };
    </script>
</head>
<body>


</body>
<%=filePath%>
<%=symptomString%>
</html>
