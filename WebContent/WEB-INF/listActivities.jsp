 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css"/>
<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
 <c:out value="${username}"></c:out>
<c:out value="${email}"></c:out> 
<c:url var="logoutUrl" value="/logout"/>
<form action="${logoutUrl}" method="post">
  <input type="submit" class="btn btn-danger" value="Log out" />
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
<a href="activities/new">Add Activity</a>
<p>The length of the activities collection is : ${fn:length(list)}</p>   
<table class="table table-striped">
<thead>
<tr>
<th>Id</th>
<th>Name</th>
<th>Hour</th>
<th class="center">Actions</th>
</tr>  
</thead>

<tbody>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.hours}</td>  
   <td><a href="activities/${emp.id}/edit">Edit</a> ||
   <a href="activities/delete/${emp.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
 </tbody>
 </table>  