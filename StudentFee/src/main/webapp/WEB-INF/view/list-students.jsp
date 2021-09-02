<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head><title>List Students</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
  
  <div id="wrapper">
    <div id="header">
    <h1>Fee Head</h1>
    </div>
  </div>
  
       <div id="container">
          <div id="content">
               <input type="button" value="Add New" 
                  onclick="window.location.href='showFormForAdd'; return false;"
                  class="add-student-button"
               />
                <input type="button" value="Set Priority Order" 
                  onclick="window.location.href='showFormForAdd'; return false;"
                  class="add-student-button"
               />
          
               <table>
                 
                  <tr>
                  <th>Fee Name</th>
                  <th>Periodicity</th>
                  <th>Fine Applicable</th>
                  <th>Concession Applicable</th>
                  <th>Payement Prior</th>
                  <th>Account Heads</th>
                  </tr>
                  
                  <c:forEach var="tempStudents" items="${students}">
                  <c:url var="updateLink" value="/fee/update">
                  <c:param name="studentId" value="${tempStudents.id}"/>
                  </c:url>
                  
                  <c:url var="deleteLink" value="/fee/delete">
                  <c:param name="studentId" value="${tempStudents.id}"/>
                  </c:url>
               <tr>
                  <td>${tempStudents.feeName}</td>
                  <td>${tempStudents.periodicity}</td>
                  <td>${tempStudents.fineApplicable}</td>
                   <td>${tempStudents.concessionApplicable}</td>
                    <td>${tempStudents.payementPrior}</td>
                     <td>${tempStudents.accountHeads}</td>
                  <td><a href="${ updateLink}">Update</a>
                  |<a href="${ deleteLink}" onclick="if(!(confirm('Are you Sure you want to delete this detail?' ))) return false">Delete</a></td>
               </tr>
               
               </c:forEach>
            
               </table>
          </div>
       </div>
</body>

</html>