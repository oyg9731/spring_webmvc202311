<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Web study</title>
</head>
<body>
    <c:choose>
        <c:when test="${g == 1}">
            <h1>로그인 성공 </h1>
        </c:when>
        <c:when test="${g == 2}">
            <h1>아이디가 존재하지 않습니다.</h1>
        </c:when>
        <c:when test="${g == 3}">
            <h1>비밀번호가 틀렸습니다.</h1>
        </c:when>
        <c:otherwise>
            <h1>왜 안데</h1>
        </c:otherwise>
    </c:choose>

    <a href="/hw/s-login-form">다시 로그인하기</a>
</body>
</html>