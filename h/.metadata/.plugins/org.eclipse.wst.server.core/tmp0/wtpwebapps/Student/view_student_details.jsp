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

   		<%  List<Students> students = (List) request.getAttribute("students"); %>
   		<%for (Student stud : students) { %>
       <tr>
      <td><c:out value="${student.id}"/></td>
      <td><% stud.getId(); %></td>
    </tr>
    <% } %>
--%>


<c:forEach var="student" items="${students}">
	<tr>
	<td><c:out value="${student.id}"></c:out></td>
	<td><c:out value="${student.name}"></c:out></td>
	<td><c:out value="${student.age}"></c:out></td>
	<td><c:out value="${student.address}"></c:out></td>
	<td><c:out value="${student.grade}"></c:out></td>
	<td><c:out value="${student.grade}"></c:out></td>
	<td> <a href="edit?id=${student.id }">Edit </a></td>
	<td> <a href="delete?id=${student.id }">Delete </a></td>
	</tr>
</c:forEach>



  </tbody>
  
</table>

</div>
</form>\

<script>

</script>

<%@ include file="Header/footer.jsp"%>