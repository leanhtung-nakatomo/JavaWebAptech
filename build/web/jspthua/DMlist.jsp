<%-- 
    Document   : SPCTlist
    Created on : Jan 11, 2020, 4:32:03 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/newtag_library" %>

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
                <strong><center>Danh sách danh mục</center></strong>
            </div>
            <br>
            <table class="table table-agile-info">
                <tr>
                    <th>Mã danh mục</th>
                    <th>Tên danh mục</th>
                    <th>Ghi chú</th>
                    <th>Cập nhật</th>
                </tr>
                
                <c:forEach items="${DM}" var="c">
                    <tr>
                        <td>${c.maDM}</td>
                        <td>${c.tenDM}</td>
                        <td>${c.ghiChu}</td>
                        <td>
                            <a href="deleteDM.htm?id=${c.maDM}" onclick="return confirm('Bạn có chắc muốn xóa?')">Xóa</a>
                        </td>
                         <td>
                            <a href="PreUpdateDM.htm?id=${c.maDM}">Cập nhật</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>        
            <mytag:Paganition offset="${offset}" maxResult="15" uri="DM.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>

            
        </div>
    </center>
    </body>
</html>
