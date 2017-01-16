 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %> 
 <c:out value="${username}"></c:out>
<c:out value="${email}"></c:out> 
<c:url var="logoutUrl" value="/logout"/>
<form action="${logoutUrl}" method="post">
  <input type="submit" value="Log out" />
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

<table>
<p>The length of the companies collection is : ${fn:length(list)}</p>  
<tr><th>Id</th><th>Name</th><th>Hour</th><th>Date</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.name}</td>  
   <td>${emp.hours}</td>  
   <td><a href="activities/${emp.id}/edit">Edit</a></td>  
   <td><a href="activities/delete/${emp.id}">Delete</a></td>  
   
   </tr>  
   </c:forEach>  
   </table>  