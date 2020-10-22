
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Free Smart Store Website Template | Home :: w3layouts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <jsp:include page="css.jsp" flush="true"/>
    </head>
    <body>  
    <center>
        <div class="wrap">
            <%--<jsp:include page="header.jsp" flush="true"/>--%>	
        </div>
        <h3 style="color: red">${status}</h3>
        <p>Login Account</p>
        <spring:form action="processlogin.htm" modelAttribute="account" method="post">
            <table>
                <tr>
                    <td>User</td>
                    <td>
                        <spring:input path="tenDN"/>
                    </td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <spring:password path="matKhau"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Login"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </spring:form>
    </center>

    <%--<jsp:include page="footer.jsp" flush="true"/>--%>
    <%--<jsp:include page="jsfooter.jsp" flush="true"/>--%>
</body>
</html>

