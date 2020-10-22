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
                <strong><center>Danh sách sản phẩm chi tiết</center></strong>
            </div>
            <br>
            <table class="table table-hover">
                <tr>
                    <th>Mã SPCT</th>
                    <th>Mã Sản phẩm</th>
                    <th>Mã màu sắc</th>
                    <th>Mã kích thước</th>
                    <th>Số lượng</th>
                    <th>Giá gốc</th>
                    <th>Giá khuyến mại</th>
                    <th>Ghi chú</th>
                    <th>Hình ảnh minh họa</th>
                    <th>Xóa</th>
                    <th>Cập nhật</th>
                </tr>
                
                <c:forEach items="${SPCT}" var="c">
                    <tr>
                        <td>${c.maSPCT}</td>
                        <td>${c.maSP.tenSP}</td>
                        <td>${c.maMauSac.tenMauSac}</td>
                        <td>${c.maKichThuoc.tenKichThuoc}</td>
                        <td>${c.soLuong}</td>
                        <td>${c.giaGoc}</td>
                        <td>${c.giaKM}</td>  
                        <td>${c.ghiChu}</td>  
                        <td>
                            <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" width="150" height="150"/>
                        </td>
                        <td>
                            <a href="deleteSPCT.htm?id=${c.maSPCT}" onclick="return confirm('Bạn có chắc muốn xóa?')">Xóa</a>
                        </td>
                        <td>
                            <a href="PreUpdateSPCT.htm?id=${c.maSPCT}">Cập nhật</a>
                        </td>
                    </tr>
                </c:forEach>
                    
            </table>
            <mytag:Paganition offset="${offset}" maxResult="5" uri="SPCTlist.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>
            
            
            
        </div>
    </center>
    </body>
</html>
