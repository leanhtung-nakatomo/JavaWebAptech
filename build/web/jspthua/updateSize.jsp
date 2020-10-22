<%-- 
    Document   : insertDM
    Created on : Jan 10, 2020, 10:41:21 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cập nhật</title>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <script src="/Admin/resources/js/jquery2.0.3.min.js"></script>
        <script src="/Admin/resources/js/raphael-min.js"></script>
        <script src="/Admin/resources/js/morris.js"></script>
    </head>
    <body>
        <jsp:include page="headeradmin.jsp" flush="true"/>
        <jsp:include page="menuadmin.jsp" flush="true"/>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <jsp:include page="jsadmin.jsp" flush="true"/>
    <center>
        <form:form action="UpdateSize.htm" modelAttribute="s">
            <br><br><br><br><br>
            <h1>Sửa thông tin kích thước</h1>
            <br>
            <table>
                
                <tr>
                    <td>Mã kích thước: </td>
                    <td>
                        <form:input path="maKichThuoc" readonly="true"/>
                    </td>
                </tr>
                
                <tr>
                    <td>Tên kích thước: </td>
                    <td>
                        <form:input path="tenKichThuoc"/>
                    </td>
                </tr>              
                    
                <tr>
                    <td>Ghi chú: </td>
                    <td>
                        <form:input path="ghiChu"/>
                    </td>
                </tr>
                              
                <tr>
                    <td></td>
                    <td>
                        <input type="submit"  value="Cập nhật"/>                       
                        <input type="reset"  value="Xóa"/>
                    </td>
                </tr>
            </table>       
        </form:form>
        </center>
    </body>
</html>

