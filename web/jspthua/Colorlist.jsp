<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/newtag_library" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dữ liệu</title>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <script src="/DuAnJAVAWeb/resourceadmin/js/jquery2.0.3.min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/raphael-min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/morris.js"></script>
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
                <strong><center>Danh sách màu sắc</center></strong>
                <h3 style="color: green">${status1}</h3>
                <h3 style="color: red">${status2}</h3>
            </div>
            <br>

            <br>
            <table class="table table-agile-info">
                <tr>
                    <th>Mã màu sắc</th>
                    <th>Tên màu </th>
                    <th>Ghi chú</th>    
                    <th>Xóa</th>
                    <th>Cập nhật</th>
                </tr>
                
                <c:forEach items="${color}" var="c">
                    <tr>
                        <td>${c.maMauSac}</td>
                        <td>${c.tenMauSac}</td>
                        <td>${c.ghiChu}</td>
                        <td>
                            <a href="deleteColor.htm?id=${c.maMauSac}" onclick="return confirm('Bạn có chắc muốn xóa?')">Xóa</a>
                        </td>
                         <td>
                            <a href="PreUpdateColor.htm?id=${c.maMauSac}">Cập nhật</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <mytag:Paganition offset="${offset}" maxResult="10" uri="color.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>
           
            
        </div>
    </center>
    </body>
</html>
