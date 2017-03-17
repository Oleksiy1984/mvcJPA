<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="string" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <link rel="stylesheet"
          href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
</head>
<body>
<h1>Hello</h1>

    <table>
        <tr>
        <th>ID</th>
        <th>Balance</th>
        </tr>
        <c:forEach items="${page}" var="item">
        <tr>
        <td>${item.id}</td>
        <td>${item.balance}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>