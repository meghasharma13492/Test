<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%> 
<link rel="stylesheet" type="text/css" href="resources/css/bootstrap.min.css"/>
<script src="<c:url value='/resources/js/jquery.min.js' />"></script>
<script src="<c:url value='/resources/js/bootstrap.min.js' />"></script>    
 <div class="container-fluid">
 <h4>Edit Activity:</h4>
       <form:form method="POST" commandName="activity" action="update" class="form-horizontal">    
          <div class="form-group">
		    <label class="control-label col-sm-2" for="name">Name:</label>
		    <div class="col-sm-4">
		    <form:input path="name" class="form-control"/>
		    <%-- <input type="text" name="name" class="form-control" value=<%=activity.name%> id="name"> --%>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="hours">Hours:</label>
		    <div class="col-sm-4">
		    <form:input path="hours" class="form-control"/>
		    <!-- <input type="text" name="hours" class="form-control" id="hours" value="hours"> -->
		    </div>
		  </div>
		 <div class="form-group"> 
    		<div class="col-sm-offset-2 col-sm-10">
 				<input type="submit" class="btn btn-success" value="Save" /> 
 			</div>
 		</div>
       </form:form>    
       <a href="/FirstProject/activities">Back to activities</a>
</div>

