<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%> 
<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
<%-- <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>  --%>   
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css"/>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employees Entries</title>
</head>
<body>
<a href="activities">List of activities</a>
<a href="activities/new">Add Activity</a>   
<c:url var="logoutUrl" value="/logout"/>
<form action="${logoutUrl}" method="post">
  <input type="submit" class="btn-danger" value="Log out" />
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>  
</body>
</html>