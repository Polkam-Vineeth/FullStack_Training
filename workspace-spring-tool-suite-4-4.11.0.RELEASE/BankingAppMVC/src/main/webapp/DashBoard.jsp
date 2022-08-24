<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>DashBoard</title>
    </head>
    <body>
    	<h1>Your DashBoard</h1>
        <table>
            <thead>
                <tr>
                    <th>Account No:</th>
                    <th>Name</th>
                    <th>Balance</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${allaccounts}" var="bank">
                    <tr>
                        <td>${bank.accountNo}</td>
                        <td>${bank.name}</td>
                        <td>${bank.balance}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>