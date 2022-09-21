<%@ include file="header.jsp"%>


<%@page import="java.util.List" %>


<div class="container container-fluid">
<br>
<br>

<form action="viewStudentDetails">
<table class="table table-dark table-striped">
  <thead>
    <tr>
      <th scope="row">ID</th>
      <th scope="row">Student Name</th>
      <th scope="row">Age</th>
      <th scope="row">Address</th>
      <th scope="row">Grade</th>
    </tr>
  </thead>
  <tbody>
  
<%-- 
    
   		<% List<Student> students = (List) request.getAttribute("students"); %>
   		<%for (Student stud : students) { %>
       <tr>
      <td><c:out value="${student.id}"/></td>
      <td><% stud.getId(); %></td>
      <td><% stud.getName(); %></td>
      <td><% stud.getAge(); %></td>
      <td><% stud.getGrade(); %></td>
      <td><% stud.getAddress(); %></td>
    </tr>
    <% } %>
--%>

<c:forEach var="student" items="${students}">
	<tr>
	<td><c:out value="${student.getId()}"></c:out></td>
	</tr>
</c:forEach>


  </tbody>
  
</table>

</div>
</form>

<%@ include file="Header/footer.jsp"%>