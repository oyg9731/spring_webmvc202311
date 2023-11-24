<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Web study</title>
</head>
<body>
<form action="/hw/s-login-check" method="post">
    <h1>로그인하기~</h1>
    <p># 아이디 : <input type="text" name="i"></p>
    <p># 비밀번호 : <input type="text" name="p"></p>
    <input type="submit">
</form>
</body>
</html>