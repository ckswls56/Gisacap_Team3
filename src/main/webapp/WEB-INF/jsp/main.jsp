<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>양식 광어의 질병 감염 여부 판별 시스템</title>
    <link href="${path}/resources/css/style.css" rel="stylesheet"/> 
</head>
<body>
    <div id="farmInputView">
        <h2>양식장 뷰(입력)</h2>
        <form>
            <input type="image" id="fishImg" />
            <select multiple>
                <option value="0"></option>





            </select>
            <input type="submit" />
        </form>
    </div>
    <hr />
    <div id="expertView">
        <h2>전문가 뷰</h2>
        <img class="uploadedImg" />
        <p id="gptDiseaseName"></p>
        <p id="gptDiseaseSolution"></p>
        <form>
            <input type="text" id="expertDiseaseName" />
            <textarea id="expertDiseaseSolution" cols="30" rows="5"></textarea>
            <input type="submit" />
        </form>
        <textarea></textarea>
    </div>
    <hr />
    <div id="farmOutputView">
        <h2>양식장 뷰(출력)</h2>
        <img class="uploadedImg" />
        <p id="diseaseName"></p>
        <p id="diseaseSolution"></p>
    </div>
</body>
</html>
