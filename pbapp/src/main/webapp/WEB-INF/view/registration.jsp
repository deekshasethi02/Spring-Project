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
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.5.0/css/all.css"
	integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU"
	crossorigin="anonymous">

<!-- Spring link preparation -->
<s:url value="/static/css/bootstrap.min.css" var="url_bootstrapcss"></s:url>
<link rel="stylesheet" href="${url_bootstrapcss}">
<s:url value="/static/css/style.css" var="url_stylecss"></s:url>
<link rel="stylesheet" href="${url_stylecss}">
</head>
<body>
	<%@include file="commons/navigation.jsp"%>
	<!-- Main section start -->
	<div class="container" style="width=700px">
		<h2>Registration</h2>
		<hr>
		<div class="row">
			<div class="col-md-12">
				<p class="well">Provide your detail for registration.</p>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<form>

					<div class="form-group">
						<label for="name">Name</label> <input type="text" name="name"
							class="form-control" placeholder="Enter Name" />
					</div>

					<div class="form-group">
						<label for="email">Email</label> <input type="text" name="email"
							class="form-control" placeholder="Enter Email" />
					</div>
					<div class="form-group">
						<label for="loginname">Login Name</label> <input type="text"
							name="loginname" class="form-control"
							placeholder="Enter Login Name" />
					</div>

					<div class="form-group">
						<label for="contact">Password:</label> <input type="password"
							name="password" class="form-control" placeholder="Enter Password" />
					</div>

					<button class="btn btn-success btn-block">Login</button>
				</form>
			</div>

		</div>
		<br>



	</div>
	<!-- end main section -->
<%-- Spring  - Link Preparation --%>
	<s:url value="/static/js/jquery-3.3.1.min.js" var="url_jquery" />
	<s:url value="/static/js/bootstrap.min.js" var="url_bootstrapjs" />

	<jsp:include page="commons/foot.jsp" />
	<script src="${url_jquery}"></script>
	<script src="${url_bootstrapjs}"></script>

</body>
</html>
