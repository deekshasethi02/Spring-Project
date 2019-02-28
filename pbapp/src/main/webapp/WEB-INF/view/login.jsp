<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>PhoneBook App</title>
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">

<!-- Spring link preparation -->
<s:url value="/static/css/bootstrap.min.css" var="url_bootstrapcss"></s:url>
<link rel="stylesheet" href="${url_bootstrapcss}">
<s:url value="/static/css/style.css" var="url_stylecss"></s:url>
<link rel="stylesheet" href="${url_stylecss}">

</head>
<body>
	<%@include file="commons/navigation.jsp"%>
<div class="container" style="width: 700px">
	<h1>Login</h1>
	<hr>
	<div class="row">
		<div class="col-md-12">
			<p class="well">Use your registration time credentials for login.</p>
	</div>
</div>
<c:if test="${err!=null}">
	<div class="alert alert-warning alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>Warning!</strong>${err}
</div>
</c:if>
<div class="row">
		<div class="col-md-12">
			
			<form:form action="./authenticate" modelAttribute="command">

				<div class="form-group">
					<label for="loginname">Login name :</label>
					<form:input path="loginname" class="form-control" placeholder="Enter login name" />
				</div>

				<div class="form-group">
					<label for="password">Password :</label>
					<form:password path="password" class="form-control" placeholder="Enter Password" />
				</div>
				<button type="submit" class="btn btn-success btn-block">Login</button>
			</form:form>
		</div>
	</div>
<br>
</div>

<%-- Spring  - Link Preparation --%>
	<s:url value="/static/js/jquery-3.3.1.min.js" var="url_jquery" />
	<s:url value="/static/js/bootstrap.min.js" var="url_bootstrapjs" />

	<jsp:include page="commons/foot.jsp" />
	<script src="${url_jquery}"></script>
	<script src="${url_bootstrapjs}"></script>

