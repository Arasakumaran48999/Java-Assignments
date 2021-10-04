<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Creating account</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/bank" user="vish" password="vishaali"></sql:setDataSource>
<sql:transaction dataSource="${db }">
<sql:update var="count">insert into customer values('Arasa','root','root',9080681027,'chennai',501203590,30000);</sql:update>
<sql:update var="count">insert into customer values('kumaran','kumaran','kumaran',8855223366,'chennai',501203591,20000);</sql:update>
<sql:update var="count">insert into customer values('kugan priyan','kuga','kuga',9632587410,'cbe',501203592,40000);</sql:update>
<sql:update var="count">insert into customer values('thrisha','thrish','thrish',8855669920,'trichy',501203593,10000);</sql:update></sql:transaction>
 <c:if test="${count>=1}">
            <font size="5" color='green'> Congratulations ! Data updated
            successfully.</font>
              <a href="index.jsp">Go Home</a>          
        </c:if>
<sql:query dataSource="${db}" var="rs">
select*from customer;</sql:query>
<table border="2" width="70%" bgColor="yellow">
<tr>
<th>Name of the customer</th>
<th>Username of the customer</th>
<th>Password of the customer</th>
<th>Mobile number of the customer</th>
<th>Address of the customer</th>
<th>Account number of the customer</th>
<th>Balance amount of the customer</th></tr>
<c:forEach var="bankk" items="${rs.rows }">
<tr>
<td>${bankk.name}</td>
<td>${bankk.usname}</td>
<td>${bankk.password}</td>
<td>${bankk.mobno}</td>
<td>${bankk.address}</td>
<td>${bankk.accountnumber}</td>
<td>${bankk.balanceamount}</td>
</tr></c:forEach></table>

</body>
</html>