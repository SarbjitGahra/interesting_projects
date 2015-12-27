<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
    <%@taglib uri="/WEB-INF/custom.tld" prefix="ex" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Core Tags</h1>
<hr /><h1>
<c:out value="hello from c world"/>
<br/> <c:out value="${10 }"></c:out>
<br/> <c:set var="i" value = "10"/>
<br/> <c:set var="j" value = "15"/>
<br/> i + j = <c:out value ="${i+j}"/>
<c:catch var="e">
<br/> 10 /0=  <%=10/0 %>
</c:catch>
<br/>
 <c:out value ="{e}"/>
 
<c:if 
test ="${i>j}"/>

<c:out value="i is greater "/>

<c:forEach begin="1" end="5" var ="k">
<br/> k= <c:out value=" {k}"/>

</c:forEach>

</h1>
<h1> formatting tags</h1>
<h1>
<c:set var ="balance" value ="${12334556787.341234445}"/>
<br/> without formatting 
<c:out value="${balance}"/>
<br/> with formatting:
<fmt:formatNumber value = "${balance}" type ="currency" maxIntegerDigits="4"/>

<jsp:useBean id="date" class ="java.util.Date"/>
<c:set var ="d" value ="${date }"/>
<br/> without formatting :
<c:out value ="${d}" />
<br/> only date <fmt:formatDate value ="${d }" type ="date" dateStyle="long" />

<br/> asian style <fmt:formatDate value="${d }" type ="date" pattern="MM-dd-YYYY" />


 <sql:setDataSource var ="ds" driver ="com.mysql.jdbc.Driver"
 url="jdbc:mysql://localhost:3306/may_15" user="root" password="" />
 <sql:query var="resultset" dataSource="${ds }" sql ="select * from books" />
 <table border = "2">
 <tr>
 <th>Book Id</th>
 <th>Book Title</th>
 <th>Book author</th>
 <th>Book price</th>
 <th>Book Published</th>
 
 
 
 </tr>
 <c:forEach var="b" items ="${resultset.rows }">
 <tr>
 <td><c:out value ="${b.BookId}"/> </td>
 <td><c:out value ="${b.BookTitle}"/> </td>
 <td><c:out value ="${b.BookAuthor}"/> </td>
 <td><c:out value ="${b.BookPrice}"/> </td>

 <td> <fmt:formatDate value="${b.datePub }" type="date" pattern="MM/dd/yy"/> </td>
 </tr>
 </c:forEach>
 </table>
</h1>
<h1> Xml Tags</h1>
<c:import url="/Student.xml" var ="myxml"></c:import>
<x:parse doc="${myxml }" var="s"> </x:parse>
<x:out select="$s/students/student[1]/name"/>
<x:if select="$s/students/student">
<br/> <c:out value="you have atleast one student"/>
</x:if>
<x:if select="$s/students/student[2]/id=2">
<br/> <x:out select="$s/students/student[2]/name"/>
</x:if>
<x:forEach select="$s/students/student" var ="stud">
<br/> <x:out select ="stud/id"/>
	 <x:out select ="stud/name"/>
	 <x:out select ="stud/phone"/>

</x:forEach>

<ex:Hello></ex:Hello>
</body>
</html>