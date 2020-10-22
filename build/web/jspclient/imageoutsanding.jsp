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
        <form:form action="saveimageoutsanding.htm" modelAttribute="image" >
            <table>                                        
                <tr>
                    <td>Mã sản phẩm chi tiết:</td>
                    <td>
                        <form:select path="maSPCT">
                            <c:forEach items="${spct}" var="spct">
                            <form:option value="${spct.maSPCT}">${spct.maSPCT}</form:option>
                            </c:forEach>
                        </form:select>
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
