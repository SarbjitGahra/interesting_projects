<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix ="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> list of books</h1>
<table border = "2">
<thead>
<tr>
<th>Book Id </th>
<th>Book Title</th>
<th>Book Author</th>
<th>Book Price</th>
<th>Date Published</th>
<th colspan="2"> Actions</th>
</tr>
</thead>
<tbody>
<c:forEach var ="b" items="${books }">
<tr>
<td><c:out value="${b.bookId }"></c:out></td>
<td><c:out value="${b.bookTitle }"></c:out></td>
<td><c:out value="${b.bookAuthor }"></c:out></td>
<td><c:out value="${b.bookPrice }"></c:out></td>
<td><c:out value="${b.datePub }"></c:out></td>
<td><fmt:formatDate  value ="${b.datePub}" pattern ="MM/dd/YYYY"/></td>
<td> <a href="BookController?action=edit&id=<c:out value ="${b.bookId }"/>" >edit</a> </td>
<td> <a href="BookController?action=delete&id=<c:out value ="${b.bookId }"/>" > edit</a> </td>
</tr>
</c:forEach>
</tbody>
</table>
<a href ="BookController?action=insert"> Add New Book</a> 
</body>
</html>