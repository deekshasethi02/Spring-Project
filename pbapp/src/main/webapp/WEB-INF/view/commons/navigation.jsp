<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Navigation -->
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#blognavbar-collapse"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a href="/pbapp/" class="navbar-brand"><i class="fab fa-blogger"></i> PhoneBook App</a>
			</div>
<div class="collapse navbar-collapse"
                    id="bs-example-navbar-collapse-1">
<c:choose>
  <c:when test="${loggedinuser.role==1}"><ul class="nav navbar-nav">

                        <li class="active"><a href="/pbapp/listUser">User<span
                                class="sr-only">(current)</span></a></li>
                        <li><a href="/pbapp/about">About</a></li>
                        <li><a href="/pbapp/contact">Contact</a></li>
                    </ul>
       <br /></c:when>
  <c:when test="${loggedinuser.role==2}">
  <ul class="nav navbar-nav">

                        <li class="active"><a href="/pbapp/listContact">List Contact<span
                                class="sr-only">(current)</span></a></li>
                        <li><a href="/pbapp/about">About</a></li>
                        <li><a href="/pbapp/contact">Contact</a></li>
                    </ul>
       <br />
  </c:when>
  <c:otherwise>
  <ul class="nav navbar-nav">

                        <li class="active"><a href="/pbapp/">Home<span
                                class="sr-only">(current)</span></a></li>
                        <li><a href="/pbapp/about">About</a></li>
                        <li><a href="/pbapp/contact">Contact</a></li>
                    </ul>
       <br />
  </c:otherwise>
</c:choose>        

                    
<c:choose>
   <c:when test="${loggedinuser!=null}">
     <div class="navbar-form navbar-right">
                        <a class="btn btn-success" href="/pbapp/logout">Logout</a>
                    </div>
       <br />
   </c:when>
   <c:otherwise>
          <div class="navbar-form navbar-right">
                        <a class="btn btn-success" href="/pbapp/login">Login</a> <a
                            class="btn btn-primary" href="/pbapp/registration">SignUp</a>
                    </div>
       <br />
 </c:otherwise>
</c:choose>
                
                </div>


        <!-- /.navbar-collapse -->

    </div>
    </nav>
	
	<!-- end navigation -->