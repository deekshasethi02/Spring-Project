<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" href="../static/css/bootstrap.min.css">
<link rel="stylesheet" href="../static/css/style.css"> -->
<s:url value="/static/css/bootstrap.min.css" var="url_bootstrap"/>
<s:url value="/static/css/style.css" var="url_style"/>
<link rel="stylesheet" href="${url_bootstrap}">
<link rel="stylesheet" href="${url_style}">
<title>Phonebook App</title>

</head>
<body>

    <%@include file="commons/navigation.jsp"%>
    <div class="container" style="margin-top: 5%;">
<h1>Admin Dashboard</h1>
<h2>Welcome : ${loggedinuser.name}</h2>

<div class="jumbotron">
<table class="table">
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Address</th>
<th>Email</th>
<th>Status</th>
<th>Role</th>
<th>Loginname</th>
<th>Password</th>
</tr>

<c:forEach items="${users}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.phone}</td>
<td>${user.address}</td>
<td>${user.email}</td>
<td>${user.status}</td>
<td>${user.role}</td>
<td>${user.loginname}</td>
<td>${user.password}</td>
</tr>
</c:forEach>

</table>
</div>
</div>
<%@include file="commons/foot.jsp"%>
</body>
</html>