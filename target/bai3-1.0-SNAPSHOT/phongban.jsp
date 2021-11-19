<%@ page import="com.example.model.PhongBanModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/15/21
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<style>
    table, th, td {
        border:1px solid black;
    }
</style>
<body>
<table>
    <tr>
        <th>IDNV</th>
        <th>Ho ten</th>
        <th>IDPB</th>
        <th>Xem Nhan Vien</th>
        <th>Cap nhap</th>
    </tr>

    <%
        List<PhongBanModel> nv = (List<PhongBanModel>) request.getAttribute("listpb");
        for (PhongBanModel item:nv){
    %>
    <tr>
        <td><%=item.getIDPB()%></td>
        <td><%=item.getTenpb()%></td>
        <td><%=item.getMota()%></td>
        <td><a href="<%=request.getContextPath()%>"/>xem nhan vien</td>
        <td><a href="updatePb.jsp"/>cap nhap</td>
    </tr>
    <%
        }
    %>



</table>
</body>
</html>
