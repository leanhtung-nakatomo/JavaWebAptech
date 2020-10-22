<%-- 
    Document   : insertNSX
    Created on : Jan 10, 2020, 8:16:59 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm mới</title>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <script src="/DuAnJAVAWeb/resourceadmin/js/jquery2.0.3.min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/js/raphael-min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/js/morris.js"></script>
    </head>
    <body>
        <jsp:include page="headeradmin.jsp" flush="true"/>
        <jsp:include page="menuadmin.jsp" flush="true"/>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <jsp:include page="jsadmin.jsp" flush="true"/>
        <form:form action="InsertNSX.htm" modelAttribute="n">
        <center>
            <table>
                <br><br><br><br><br>
                <h1>Điền thông tin nhà sản xuất</h1>
                <br>
                <h3 style="color: red">${status}</h3>
                <br>
                <table>

                    
                    <tr>
                        <td>Tên nhà sản xuất: </td>
                        <td>
                            <form:input path="tenNSX"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Địa chỉ: </td>
                        <td>
                            <form:input path="diaChi"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Ghi chú: </td>
                        <td>
                            <form:input path="ghiChu"/>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Trạng thái: </td>
                        <td>
                            <form:radiobutton path="trangThai" value="true"/>1
                            <form:radiobutton path="trangThai" value="false"/>2
                        </td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td>
                        <input type="submit" value="Thêm"/>                      
                        <input type="reset" value="Xóa"/>
                        </td>
                    </tr>
                    
                </table>
            </table>
        </center>
        </form:form>
    </body>
</html>
