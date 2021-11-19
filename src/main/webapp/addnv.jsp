<%@ page import="com.example.model.PhongBanModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/15/21
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/add" method="post">
    <table border="0" cellpadding="5">
        <tr>
            <td>Ma Nhan Vien: </td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Ho ten: </td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Ma Phong Ban: </td>
            <td>
                <select name="phongban" id="">
                    <%
                        List<PhongBanModel> list = (List<PhongBanModel>) request.getAttribute("phongban");
                        for (PhongBanModel item : list){
                    %>
                    <option value="<%=item.getIDPB()%>"><%=item.getTenpb()%></option>
                    <%
                        }
                    %>
                </select>
            </td>
        </tr>
        <tr>
            <td>Dia chi: </td>
            <td><input type="text" name="diachi"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" ></td>
        </tr>
    </table>
</form>
</body>
</html>
