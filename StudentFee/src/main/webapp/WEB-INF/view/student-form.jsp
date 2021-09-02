<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Show Form for Add New</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/add-student-style.css"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
<script type="text/javascript" src="resources/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript" src="resources/js/jquery.validate.min.js"></script>

</head>
<body>
        <div id="wrapper">
        <div id="header">
        <h2>Fee Components</h2>
        
        </div>
        </div>

            <div id="container">
             
              
              <form:form action="save" modelAttribute="student" method="POST" id="studentForm">
              <form:hidden path="id"/>
            <table>
            <tbody>
                  <tr>
                   <td><label>Fee Description</label></td>
                   <td><form:input path="feeName" id= "feeName" name="feeName"/></td>
                </tr>
                 <tr>
                   <td><label>Periodicity:</label></td>
                   <td>
        <form:select path="periodicity">  
        <form:option value="One Time" label="One Time"/>  
        <form:option value="Yearly" label="Yearly"/>  
        <form:option value="As Required" label="As Required"/>  
        </form:select>                                 
                   </td></tr>
                 <tr>    
               <td><label>  fineApplicable </label><td><form:checkbox path="fineApplicable" value="Y"/>  
               
                  </td> </tr>
                <tr><td>
                <label>   concessionApplicable</label><td><form:checkbox path="concessionApplicable" value="Y"/> </td>
                   </td></tr>
                <tr><td>
                 <label> Refundable</label><td>  <form:checkbox path="Refundable" value="Y"/> </td>
                   </td></tr>
                <tr>
                   <td><label>accountHeads</label></td>
                 <td>  <form:select path="accountHeads">  
        <form:option value="WS" label="WS"/>  
        <form:option value="AR" label="AR"/>  
        <form:option value="JRC" label="JRC"/>  
        </form:select>     
        </td>
                </tr>
             
                <tr>
                   <td><label></label></td>
                   <td><input type="submit" value="Submit" class="save" />
                   <input type="button" value="Cancel" onclick="javascript:history.go(-1);" class="cancel"/></td>
                </tr>
            </tbody>
            
            </table>
            </form:form>
            <div style="clear; both;"></div>
		
		<p>
			<a href="${pageContext.request.contextPath}/fee/list">Back to List</a>
		</p>
	
            
            </div>
</body>
<script type="text/javascript">
$(document).ready(function(){
	
	$("#studentForm").validate({
		rules:{
			feeName: "required",
			periodicity: "required",
			fineApplicable: "required",
			concessionApplicable: "required",
			Refundable: "required",
			accountHeads: "required",
		},
		messages:{
			feeName: "Please enter fee desc",
			periodicity: "Please choose periodicity",
			fineApplicable: "Please choose fine is applicable or not.",
			concessionApplicable:"Please choose fine is applicable or not.",
			Refundable: "Please Enter City of the customer",
			accountHeads: "Please Enter account heads."
		}
	});
});

  </script>

</html>
