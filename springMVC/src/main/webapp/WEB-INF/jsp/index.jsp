<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/7/31
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Spring Page Redirection</h2>

<p>Click below button to redirect the result to new page</p>
<form:form method="GET" action="/HelloWeb/redirect">
    <table>
        <tr>
            <td>
                <input type="submit" value="Redirect Page"/>
            </td>
        </tr>
    </table>
</form:form>


<h2>Spring Landing Pag</h2>

<p>Click below button to get a simple HTML page</p>
<form:form method="GET" action="/HelloWeb/staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="Get HTML Page"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
