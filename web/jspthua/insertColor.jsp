<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
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
        
        <form:form action="InsertColor.htm" modelAttribute="c">
        <center>
            <br><br><br><br><br>
            <h3 style="color: red">${status}</h3>
            <h1>Điền thông tin màu sắc</h1>
            <br>
            <table>
                <tr>
                    <td>Tên màu: </td>
                    <td>
                        <form:select path="tenMauSac">
                            <form:option value="Trắng">Trắng</form:option>
                            <form:option value="Đen">Đen</form:option>
                            <form:option value="Xanh lam">Xanh lam</form:option>
                            <form:option value="Xanh lục">Xanh lục</form:option>
                            <form:option value="Vàng">Vàng</form:option>
                            <form:option value="Đỏ">Đỏ</form:option>
                            <form:option value="Nâu">Nâu</form:option>
                        </form:select>
                    </td>
                </tr>

                <tr>
                    <td>Ghi chú: </td>
                    <td>
                        <form:textarea path="ghiChu"/>
                    </td>
                </tr>               
                <tr>
                    <td>Trạng thái: </td>
                    <td>
                        <form:radiobutton path="trangThai" value="true"/>1
                        <form:radiobutton path="trangThai" value="false"/>0
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
            </center>
        </form:form>
    </body>
</html>
