<%@ page import="com.example.model.NhanvienModel" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<style>
    table, th, td {
        border:1px solid black;
    }
</style>
<body>
<form action="<%=request.getContextPath()%>/search" method="post">
    <input type="text" name="search">
    <input type="submit">
</form>
<table>
    <tr>
        <th>IDNV</th>
        <th>Ho ten</th>
        <th>IDPB</th>
        <th>Diachi</th>
    </tr>

        <%
            List<NhanvienModel> nv = (List<NhanvienModel>) request.getAttribute("search");
            for (NhanvienModel item:nv){
        %>
            <tr>
                <td><%=item.getIDNV()%></td>
                <td><%=item.getHoten()%></td>
                <td><%=item.getIDPB()%></td>
                <td><%=item.getDiachi()%></td>
            </tr>
        <%
            }
        %>



</table>
</body>
</html>