<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ page import="java.util.Date,yp.vo.Person" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>开始页面</title>
</head>
<body>
   <%
   String birthday="1996-8-12";
   session.setAttribute("birthday", birthday);
  %>
 <s:form action="tag?name=Tom" method="post">
<s:bean name="yp.vo.Person" var="person">
 <s:param name="name" value="'Tom'"></s:param>
<s:param name="birthday" value="#session.birthday"></s:param>
  
</s:bean>
<s:property value="#person.name"></s:property>
 <s:date name="#person.birthday" format="yyyy-MM-dd" nice="false"/> 
  
  <s:submit value="提交"/>
 </s:form>
  <s:action name="tag" executeResult="true"></s:action><br>
  <s:url action="tag">
  <s:param name="id" value="'101'"></s:param>
  </s:url>
</body>
</html>