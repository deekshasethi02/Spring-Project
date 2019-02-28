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
<h1>User Dashboard</h1>
<h2>Welcome : ${loggedinuser.name}</h2>

<div class="jumbotron">
<table class="table">
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Group Name</th>
<th>Address</th>
<th>Email</th>
<th>Remark</th>
</tr>

<c:forEach items="${contacts}" var="contact">
<tr>
<td>${contact.id}</td>
<td>${contact.name}</td>
<td>${contact.phone}</td>
<td>${contact.group_name}</td>
<td>${contact.address}</td>
<td>${contact.email}</td>
<td>${contact.remark}</td>
</tr>
</c:forEach>

</table>
</div>
</div>
<%@include file="commons/foot.jsp"%>
</body>
</html>