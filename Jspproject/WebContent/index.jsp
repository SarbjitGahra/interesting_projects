<%@ page import ="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome to jagga jatts life</h1>
<%
 Date d = new Date();
out.println("date :" + d);
int i = 10;
int j = 5;
out.println( "<h1> hello from scriptlet");
out.println("<br/> i="+i);
out.println("<br/> j =" + j);
int k = i+j;
out.println("<br /> i + j" + k);
if(i>j){
	out.println("<br/> i is greater");
	
}else
	out.println("<br/> j is greater ");
int z = addInteger(20,30);
out.println("<br/> z =" + z);
	pageContext.setAttribute("defaultName", "Annonyonmous User",PageContext.SESSION_SCOPE);
	//session.setAttribute("defaultName", "Annoyonmous User");
	
%>
<%!
public int addInteger(int a , int b){
	return a + b;
}
 %>
 <jsp:scriptlet>
 <![CDATA[
 out.println("<br/> xml Scriptlet tag ...");
 ]]>
 
 </jsp:scriptlet>
 <form action="ans.jsp">
 <br/> UserNAme : <input type = "text" name ="username" />
 <br/> Gender : Male<input type="radio" name ="Male"/>
 				Female<input type="radio" name ="female"/>
 <br/> Fav hobbies : Singing<input type ="checkbox"	name ="singing"/>
 					Dancing<input type="checkbox" name = "dancing"/>
 					Travelling<input type="checkbox" name="Travelling"/>
 					
 <br/>no1 <input type="text" 	name="no1"/>
 <br/> no2<input type="text" name="no2"/>							
 <br/> <input type="submit" value="Divide"/>
 
 
 </form>
 <br/> Image path :<%=config.getInitParameter("image")%>
 <br/> Creator :<%=application.getInitParameter("creator")%>
  <br /> 5 * 6 = <%= 5*6 %>
  <br /> 5 + 6 = <%= 5 + 6 %>
  <br/> 2 + 2 = <%=addInteger(2,2) %>
  <%-- this is a comment --%>
</body>
</html>