<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>    
  
       <form:form method="POST" commandName="employee" action="update">    
        <table >
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Hours :</td>    
          <td><form:input path="hours" /></td>  
         </tr>   
         <%-- <tr>    
          <td>Date :</td>    
          <td><form:input path="date" /></td>  
         </tr>  --%>  
         <tr>    
          <td colspan="2"><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    