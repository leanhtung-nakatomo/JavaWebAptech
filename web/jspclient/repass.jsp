
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Free Smart Store Website Template | Preview :: w3layouts</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<jsp:include page="css.jsp" flush="true"/>
</head>
<body>
  <div class="wrap">
	<div class="header">
            <div class="header_top">
                <div class="logo">
                    <a href="list.htm"><img src="/DuAnJAVAWeb/resourceclient/images/logo.png" alt="" /></a>
                </div>
                <div class="header_top_right">

                    <div class="search_box"> 
                        <form action="searchbyname.htm">
                            <input type="text" name="search">
                            <input type="submit" value="Tìm kiếm">
                        </form>
                    </div> 

                    <div class="shopping_cart">
                        <div class="cart">
                            <a href="viewgiohang.htm" title="View my shopping cart" rel="nofollow">
                                <strong class="opencart"> </strong>
                                <span class="cart_title">Giỏ Hàng</span>
                                <span class="no_product"></span>
                            </a>
                        </div>
                    </div>
                    <div class="login">
                        <span><a href="prelogin.htm"><img src="/DuAnJAVAWeb/resourceclient/images/login.png" alt="" title="login"/></a></span>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="clear"></div>
            </div>
            <jsp:include page="menu.jsp" flush="true"/>                            
            <div class="clear"></div>
        </div>
        
            
        <jsp:include page="footer.jsp" flush="true"/>
        <jsp:include page="jsfooter.jsp" flush="true"/>
  </body>
  </html>

