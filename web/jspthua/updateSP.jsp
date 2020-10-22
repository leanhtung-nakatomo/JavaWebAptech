<%-- 
    Document   : insertDM
    Created on : Jan 10, 2020, 10:41:21 PM
    Author     : ASUS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <form:form action="UpdateSP.htm" modelAttribute="s">
            <br><br><br><br><br>
            <h1>Sửa thông tin sản phẩm</h1>
            <br>
            <h3 style="color: red">${error}</h3>
            <br>
            <table>
                
                <tr>
                    <td>Mã sản phẩm: </td>
                    <td>
                        <form:input path="maSP" readonly="true"/>
                    </td>
                </tr>
                
                <tr>
                    <td>Tên sản phẩm: </td>
                    <td>
                        <form:input path="tenSP"/>
                    </td>
                </tr>              
                    
                <tr>                          
                    <td>Nhà sản xuất: </td>
                    <td>
                        <form:select path="maNSX.maNSX">
                            <c:forEach items="${Nsx}" var="c">          

                                <form:option value="${c.maNSX}">${c.tenNSX}</form:option> 

                            </c:forEach>
                        </form:select>  
                    </td>  
                </tr>
                
                <tr>
                    <td>Danh mục: </td>
                    <td>
                        <form:select path="maDM.maDM"> 
                        <c:forEach items="${DM}" var="c">
                            <form:option value="${c.maDM}">${c.tenDM}</form:option>
                        </c:forEach>
                        </form:select>
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

