<%-- 
    Document   : SPCTlist
    Created on : Jan 11, 2020, 4:32:03 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@taglib prefix="mytag" uri="/WEB-INF/tlds/newtag_library" %>--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Danh sách</title>
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
    <center>
        <div class="container">
            <div class="well">
                
                <br><br><br><br><br>
                <strong><center>Danh sách tài khoản </center></strong>
            </div>
            <br>
            <table class="table table-agile-info">
                <tr>
                    <th>Tên đăng nhập</th>
                    <th>Mật Khẩu hash</th>
                    <th>Họ tên</th>
                    <th>Địa chỉ</th>
                    <th>Email</th>
                    <th>Trạng thái Admin</th>
                </tr>
                
                <c:forEach items="${list}" var="account">
                    <tr>
                        <td>${account.tenDN}</td>
                        <td>${account.matKhau}</td>
                        <td>${account.hoTen}</td>
                        <td>${account.queQuan}</td>
                        <td>${account.email}</td>       
                        <td>${account.trangThai}</td>       
                    </tr>
                </c:forEach>
            </table>
         
           
        </div>
    </center>
    </body>
</html>
