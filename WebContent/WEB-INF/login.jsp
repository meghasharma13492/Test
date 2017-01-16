<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>    
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
       
<form action="logged" method="post">  
Name:<input type="text" name="name"/><br/>  
Password:<input type="password" name="password"/><br/>  
<input type="submit" value="login"/>  
</form>  