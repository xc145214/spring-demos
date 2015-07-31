<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/7/31
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Student Information</h2>
<form:form method="POST" action="/HelloWeb/addStudent">
  <table>
    <tr>
      <td><form:label path="name">Name</form:label></td>
      <td><form:input path="name" /></td>
    </tr>
    <tr>
      <td><form:label path="age">Age</form:label></td>
      <td><form:input path="age" /></td>
    </tr>
    <tr>
      <td><form:label path="id">id</form:label></td>
      <td><form:input path="id" /></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" value="Submit"/>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>
