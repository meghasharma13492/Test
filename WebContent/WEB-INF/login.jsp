<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>    
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css"/>
<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>
<%-- <form:form method="post" commandName="emp" action="logged" name="login">     --%>
<!--         <table > -->
<!--         <tr>     -->
<!--           <td>Name : </td>    -->
<%--           <td><form:input path="firstName" /></td>   --%>
<!--          </tr>      -->
<!--          <tr>     -->
<!--           <td>Password : </td>    -->
<%--           <td><form:input path="lastName"  /></td>   --%>
<!--          </tr>     -->
<!--          <tr>     -->
<!--           <td colspan="2"><input type="submit" value="Save" /></td>     -->
<!--          </tr>     -->
<!--         </table>     -->
<%--        </form:form>    --%>
   

<form  action="logged" method="post">
  <div class="form-group">
    <label for="name">Email address:</label>
    <input type="text" name="name" class="form-control" id="name">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" name="password" class="form-control" id="pwd">
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
