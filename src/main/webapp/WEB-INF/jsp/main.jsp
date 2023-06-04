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
                <option value="0">무기력한 행동 및 거식</option>
                <option value="1">입올림(떠오름)</option>
                <option value="2">침하(가라앉음)</option>
                <option value="3">빙빙 도는 등의 이상 행동</option>
                <option value="4">지나치게 검은 체색</option>
                <option value="5">과다한 점액 분비(또는 그로 인한 체표의 백탁)</option>
                <option value="6">체표의 상처 또는 궤양</option>
                <option value="7">등뼈 근처의 출혈</option>
                <option value="8">백색의 반흔</option>
                <option value="9">복부 팽만</option>
                <option value="10">지느러미 결손</option>
                <option value="11">지느러미 충혈</option>                
                <option value="12">지느러미 출혈</option>
                <option value="13">지느러미 가장자리의 백탁</option>
                <option value="14">머리의 충혈</option>
                <option value="15">안구의 백탁, 충혈, 돌출</option>
                <option value="16">안구 주변의 농양</option>
                <option value="17">아가미의 충혈</option>
                <option value="18">아가미의 괴사 및 출혈</option>
                <option value="19">턱에서의 충혈</option>
                <option value="20">항문의 확장과 출혈, 장의 돌출</option>
                <option value="21">종양</option>
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
