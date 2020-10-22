<%-- 
    Document   : insertSPCT
    Created on : Jan 11, 2020, 5:49:36 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <script src="/Admin/resources/js/jquery2.0.3.min.js"></script>
        <script src="/Admin/resources/js/raphael-min.js"></script>
        <script src="/Admin/resources/js/morris.js"></script>
        <title>Cập nhật</title>
    </head>
    <body>
    <center>
        <jsp:include page="headeradmin.jsp" flush="true"/>
        <jsp:include page="menuadmin.jsp" flush="true"/>
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <jsp:include page="jsadmin.jsp" flush="true"/>
        <br><br><br><br><br>
        <spring:form action="UpdateSPCT.htm" method="post" modelAttribute="c" enctype="multipart/form-data">
            <br><br><br><br><br>
            <h1>Sửa thông tin sản phẩm chi tiết</h1>
            <br>
            <table>           
                <tr>                          
                    <td>Tên sản phẩm: </td>
                    <td>
                        <spring:select path="maSP.maSP">
                            <c:forEach items="${SP}" var="c">          

                                <spring:option value="${c.maSP}">${c.tenSP}</spring:option> 

                            </c:forEach>
                        </spring:select>  
                    </td>                
                </tr>    
                <tr>
                    <td>Màu sắc: </td>
                    <td>
                        <spring:select path="maMauSac.maMauSac">
                            <c:forEach items="${Color}" var="c">          

                                <spring:option value="${c.maMauSac}">${c.tenMauSac}</spring:option> 

                            </c:forEach>
                        </spring:select>  
                    </td>  
                </tr>
                
                <tr>                          
                    <td>Kích thước: </td>
                    <td>
                        <spring:select path="maKichThuoc.maKichThuoc">
                            <c:forEach items="${Size}" var="c">          

                                <spring:option value="${c.maKichThuoc}">${c.tenKichThuoc}</spring:option> 

                            </c:forEach>
                        </spring:select>  
                    </td>  
                </tr>
                
                <tr>
                        <td>Số lượng:</td>
                        <td>
                            <spring:input path="soLuong"/>
                        </td>
                </tr>
                
                <tr>
                        <td>Giá gốc:</td>
                        <td>
                            <spring:input path="giaGoc"/>
                        </td>
                </tr>
                
                <tr>
                        <td>Giá khuyến mại: </td>
                        <td>
                            <spring:input path="giaKM"/>
                        </td>
                </tr>
                
                <tr>
                        <td>Hình ảnh: </td>
                        <td>
                            <spring:input type="file" path="imageSP"/> 
                        </td>
                </tr>
                
                <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="Cập nhật"/>
                            <input type="reset" value="Xóa"/>
                        </td>
                    </tr> 
        </spring:form>
    </center>
    </body>
</html>
