<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String[] selectedOptions = request.getParameterValues("selectedOptions");
    String[] names = request.getParameterValues("names");
    String[] sols = request.getParameterValues("sols");

    String[] selectedDiseases = request.getParameterValues("expertDiseaseName");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>양식 광어의 질병 감염 여부 판별 시스템</title>
    <link href="../..//resources/css/style.css" rel="stylesheet"/>
</head>
<body>
    <div id="farmInputView">
        <h2>양식장 뷰(입력)</h2>
        <form method="post" enctype="multipart/form-data" action="/upload">
            <div>
                <br />
                <img class="uploadedImg" src='..\..\resources\images\<%=request.getParameter("filePath")%>' alt="이미지" /><br />
            </div><br />
            <select multiple id="symptom" name="symptom">
                <option value="s0" <%= containsValue(selectedOptions, "s0") ? "selected" : "" %>>무기력한 행동 및 거식</option>
                <option value="s1" <%= containsValue(selectedOptions, "s1") ? "selected" : "" %>>입올림(떠오름)</option>
                <option value="s2" <%= containsValue(selectedOptions, "s2") ? "selected" : "" %>>침하(가라앉음)</option>
                <option value="s3" <%= containsValue(selectedOptions, "s3") ? "selected" : "" %>>빙빙 도는 등의 이상 행동</option>
                <option value="s4" <%= containsValue(selectedOptions, "s4") ? "selected" : "" %>>지나치게 검은 체색</option>
                <option value="s5" <%= containsValue(selectedOptions, "s5") ? "selected" : "" %>>과다한 점액 분비(또는 그로 인한 체표의 백탁)</option>
                <option value="s6" <%= containsValue(selectedOptions, "s6") ? "selected" : "" %>>체표의 상처 또는 궤양</option>
                <option value="s7" <%= containsValue(selectedOptions, "s7") ? "selected" : "" %>>등뼈 근처의 출혈</option>
                <option value="s8" <%= containsValue(selectedOptions, "s8") ? "selected" : "" %>>백색의 반흔</option>
                <option value="s9" <%= containsValue(selectedOptions, "s9") ? "selected" : "" %>>복부 팽만</option>
                <option value="s10" <%= containsValue(selectedOptions, "s10") ? "selected" : "" %>>지느러미 결손</option>
                <option value="s11" <%= containsValue(selectedOptions, "s11") ? "selected" : "" %>>지느러미 충혈</option>
                <option value="s12" <%= containsValue(selectedOptions, "s12") ? "selected" : "" %>>지느러미 출혈</option>
                <option value="s13" <%= containsValue(selectedOptions, "s13") ? "selected" : "" %>>지느러미 가장자리의 백탁</option>
                <option value="s14" <%= containsValue(selectedOptions, "s14") ? "selected" : "" %>>머리의 충혈</option>
                <option value="s15" <%= containsValue(selectedOptions, "s15") ? "selected" : "" %>>안구의 백탁, 충혈, 돌출</option>
                <option value="s16" <%= containsValue(selectedOptions, "s16") ? "selected" : "" %>>안구 주변의 농양</option>
                <option value="s17" <%= containsValue(selectedOptions, "s17") ? "selected" : "" %>>아가미의 충혈</option>
                <option value="s18" <%= containsValue(selectedOptions, "s18") ? "selected" : "" %>>아가미의 괴사 및 출혈</option>
                <option value="s19" <%= containsValue(selectedOptions, "s19") ? "selected" : "" %>>턱에서의 충혈</option>
                <option value="s20" <%= containsValue(selectedOptions, "s20") ? "selected" : "" %>>항문의 확장과 출혈, 장의 돌출</option>
                <option value="s21" <%= containsValue(selectedOptions, "s21") ? "selected" : "" %>>종양</option>
            </select><br /><br />
        </form>
    </div>
    <hr />
    <div id="expertView">
        <h2>전문가 뷰</h2>
        <div>
            양식장 사진<br />
            <img class="uploadedImg" src='..\..\resources\images\<%=request.getParameter("filePath")%>' alt="이미지" /><br />
        </div><br />
        <div>
            <h3>ChatGPT의 의견</h3>
            예상되는 병명<br />
            <p id="gptDiseaseName" class="diseaseName">
                <%
                    for (int i = 0; i < names.length; i++) {
                        out.print(names[i]);
                    
                        if (i < names.length - 1) {
                            out.print(", ");
                        }
                    }
                %>
            </p>
            예방책 및 해결 방안<br />
            <p id="gptDiseaseSolution" class="diseaseSolution">
                <%
                    for (int i = 0; i < sols.length; i++) {
                        out.print(sols[i]);
                    
                        if (i < sols.length - 1) {
                            out.print("<br /><br />");
                        }
                    }
                %>
            </p>
        </div><br />
        <h3>전송한 의견</h3>
        <form method="post" action="finalFarmView.jsp">
            <select multiple id="expertDiseaseName" name="expertDiseaseName">
                <option value="d0" <%= containsValue(selectedDiseases, "d0") ? "selected" : "" %>>병에 걸리지 않음</option>
                <option value="d1" <%= containsValue(selectedDiseases, "d1") ? "selected" : "" %>>렙도바이러스병</option>
                <option value="d2" <%= containsValue(selectedDiseases, "d2") ? "selected" : "" %>>림포시스티스병</option>
                <option value="d3" <%= containsValue(selectedDiseases, "d3") ? "selected" : "" %>>바이러스성신경괴사증</option>
                <option value="d4" <%= containsValue(selectedDiseases, "d4") ? "selected" : "" %>>버나바이러스병</option>
                <option value="d5" <%= containsValue(selectedDiseases, "d5") ? "selected" : "" %>>헐피스 바이러스증</option>
                <option value="d6" <%= containsValue(selectedDiseases, "d6") ? "selected" : "" %>>비브리오병</option>
                <option value="d7" <%= containsValue(selectedDiseases, "d7") ? "selected" : "" %>>연쇄구균증</option>
                <option value="d8" <%= containsValue(selectedDiseases, "d8") ? "selected" : "" %>>에드워드병</option>
                <option value="d9" <%= containsValue(selectedDiseases, "d9") ? "selected" : "" %>>활주세균증</option>
                <option value="d10" <%= containsValue(selectedDiseases, "d10") ? "selected" : "" %>>백점충증</option>
                <option value="d11" <%= containsValue(selectedDiseases, "d11") ? "selected" : "" %>>스쿠티카증</option>
                <option value="d12" <%= containsValue(selectedDiseases, "d12") ? "selected" : "" %>>트리코디나증</option>
            </select><br /><br />
            예방책 및 해결 방안<br /><textarea id="expertDiseaseSolution" name="expertDiseaseSolution" cols="50" rows="10" maxlength="2000"><%=request.getParameter("expertDiseaseSolution")%></textarea><br />
        </form>
    </div>
    <hr />
    <div id="farmOutputView">
        <h2>양식장 뷰(출력)</h2>
        <img class="uploadedImg" src='..\..\resources\images\<%=request.getParameter("filePath")%>' alt="이미지" /><br />
        **ChatGPT가 제시한 의견에는 오류가 있을 수 있습니다.**<br /><br />
        작성자<br /><p id="author">Officer</p>
        예상되는 병명<br />
        <p id="diseaseName" class="diseaseName">
        <%
            String disease = "";
            for (int i = 0; i < selectedDiseases.length; i++) {
                disease = selectedDiseases[i];
                switch (disease) {
                    case "d0":
                        out.println("병에 걸리지 않음");
                        break;
                    case "d1":
                        out.println("렙도바이러스병");
                        break;
                    case "d2":
                        out.println("림포시스티스병");
                        break;
                    case "d3":
                        out.println("바이러스성신경괴사증");
                        break;
                    case "d4":
                        out.println("버나바이러스병");
                        break;
                    case "d5":
                        out.println("헐피스 바이러스증");
                        break;
                    case "d6":
                        out.println("비브리오병");
                        break;
                    case "d7":
                        out.println("연쇄구균증");
                        break;
                    case "d8":
                        out.println("에드워드병");
                        break;
                    case "d9":
                        out.println("활주세균증");
                        break;
                    case "d10":
                        out.println("백점충증");
                        break;
                    case "d11":
                        out.println("스쿠티카증");
                        break;
                    case "d12":
                        out.println("트리코디나증");
                        break;
                    default:
                        out.println("Invalid disease");
                }

                if (i < selectedDiseases.length - 1) {
                    out.print(", ");
                }
            }
        %>
        </p>
        예방책 및 해결 방안<br />
        <p id="diseaseSolution" class="diseaseSolution">
            <%=request.getParameter("expertDiseaseSolution")%>
        </p>
    </div>
    <!%
        boolean containsValue(String[] array, String value) {
            if (array == null || value == null) {
                return false;
            }
            for (String item : array) {
                if (value.equals(item)) {
                    return true;
                }
            }
            return false;
        }
    %>
</body>
</html>