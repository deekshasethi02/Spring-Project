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
<body>
		<%@include file="commons/navigation.jsp"%>
	<div class=container>
		<h2>Contact Us</h2>
		<hr>
		<div class="well">
			<p>Thanks for giving this opportunity to serve you. Share your
				contact detail with us.</p>
		</div>
		<form action="">
			<div class="form-group">
				<label for=name">Name:</label> <input type="text"
					class="form-control" placeholder="Enter Name">
			</div>
			<div class="form-group">
				<label for=contact">Contact:</label> <input type="number"
					class="form-control" placeholder="Enter Contact">
			</div>
			<div class="form-group">
				<label for=email">Email:</label> <input type="email"
					class="form-control" placeholder="Enter Email">
			</div>
			<div class="form-group">
				<label for=comment">Comment:</label>
				<textarea class="form-control" rows="3"
					placeholder="Enter your opinion"></textarea>
			</div>
			<button type="submit" class="btn btn-success btn-block">Submit</button>
		</form>
		<br>
	</div>
<%-- Spring  - Link Preparation --%>
	<s:url value="/static/js/jquery-3.3.1.min.js" var="url_jquery" />
	<s:url value="/static/js/bootstrap.min.js" var="url_bootstrapjs" />

	<jsp:include page="commons/foot.jsp" />
	<script src="${url_jquery}"></script>
	<script src="${url_bootstrapjs}"></script>

</body>
</html>