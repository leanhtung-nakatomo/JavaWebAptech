<%-- 
    Document   : insertSPCT
    Created on : Jan 11, 2020, 5:49:36 PM
    Author     : ASUS
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <script src="/DuAnJAVAWeb/resourceadmin/js/jquery2.0.3.min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/js/raphael-min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/js/morris.js"></script>
        <title>Thêm mới</title>
    </head>
    <body>
    <center>
        <jsp:include page="headeradmin.jsp" flush="true"/>
        <jsp:include page="menuadmin.jsp" flush="true"/>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <jsp:include page="jsadmin.jsp" flush="true"/>
        <br><br><br><br><br>
        <form:form action="InsertSPCT.htm" method="post" modelAttribute="c" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>Mã sản phẩm:</td>
                    <td>
                        <form:select path="maSP.maSP">
                            <c:forEach items="${allsanpham}" var="s">
                                
                                <form:option value="${s.maSP}">${s.tenSP}</form:option> 
                                
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
                
                <tr>
                    <td>Mã màu sắc:</td>
                    <td>
                        <form:select path="maMauSac.maMauSac">
                            <c:forEach items="${allmausac}" var="mausac">
                                <form:option value="${mausac.maMauSac}">${mausac.tenMauSac}</form:option>
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
                
                <tr>
                    <td>Mã kích thước:</td>
                    <td>
                        <form:select path="maKichThuoc.maKichThuoc">
                            <c:forEach items="${allkichthuoc}" var="kichthuoc">
                                <form:option value="${kichthuoc.maKichThuoc}">${kichthuoc.tenKichThuoc}</form:option>
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
               

                <tr>
                    <td>Số lượng:</td>
                    <td>
                        <form:input path="soLuong"/>
                    </td>
                </tr>

                <tr>
                    <td>Giá gốc:</td>
                    <td>
                        <form:input path="giaGoc"/>
                    </td>
                </tr>

                <tr>
                    <td>Giá khuyến mại: </td>
                    <td>
                        <form:input path="giaKM"/>
                    </td>
                </tr>
                
                <tr>
                    <td>Ghi chú :</td>
                    <td>
                        <div class="form-group">
                            <form:textarea class="form-control" rows="5" path="ghiChu"/>
                        </div> 
                    </td>
                </tr>
                
                <tr>
                    <td>Hình ảnh: </td>
                    <td>
                        <form:input type="file" path="imageSP"/>
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
        </form:form>
    </center>
</body>
</html>
