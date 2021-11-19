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
<%
    HttpSession session1 = request.getSession();

%>
<form action="<%=request.getContextPath()%>/delselect" method="post">
    <table>
        <tr>
            <th>IDNV</th>
            <th>Ho ten</th>
            <th>IDPB</th>
            <th>Diachi</th>
            <%
                if (session1.getAttribute("admin") != null){
            %>
                <th>XOA</th>
                <th>Chon</th>
            <%
                }
            %>

        </tr>

        <%
            List<NhanvienModel> nv = (List<NhanvienModel>) request.getAttribute("listnv");
            for (NhanvienModel item:nv){
        %>
        <tr>
            <td><%=item.getIDNV()%></td>
            <td><%=item.getHoten()%></td>
            <td><%=item.getIDPB()%></td>
            <td><%=item.getDiachi()%></td>
            <%
                if (session1.getAttribute("admin") != null){
            %>
            <td><a href="<%=request.getContextPath()%>/del?id=<%=item.getIDNV()%>">xoa</a></td>
            <td><input type="checkbox" value="<%=item.getIDNV()%>" name="selectdel"></td>
            <%
                }
            %>

        </tr>
        <%
            }
        %>
    </table>
    <%
        if (session1.getAttribute("admin") != null){
    %>
    <input type="submit" value="xoa nhieu muc">
    <%
        }
    %>

</form>

<%
    if (session1.getAttribute("admin") != null){
%>
<a href="<%=request.getContextPath()%>/add">them nhan vien</a>
<%
    }
%>
<br>

</body>
</html>