    <%-- 
    Document   : header
    Created on : Nov 28, 2019, 12:23:29 AM
    Author     : PT-LS
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="header">
    <div class="header_top">
        <div class="logo">
            <a href="list.htm"><img src="/DuAnJAVAWeb/resourceclient/images/logo.png" alt="" /></a>
        </div>
        <!--Tìm kiếm-->
        <div class="header_top_right">
            <div class="search_box"> 
                <form action="searchbyname.htm">
                    <input type="text" name="search">
                    <input type="submit" value="Tìm kiếm">
                </form>
            </div> 
            <!--            giỏ hàng-->
            <div class="shopping_cart"> 
                <div class="cart">
                    <a href="viewgiohang.htm" title="View my shopping cart" rel="nofollow">
                        <strong class="opencart"> </strong>
                        <span class="cart_title">Giỏ hàng</span>
                        
                    </a>
                </div>
            </div>

            <!--đăng nhập-->
            <div class="login tab">             
                <span><a href="prelogin.htm"><img src="/DuAnJAVAWeb/resourceclient/images/login.png" alt="" title="login"/></a></span>
                    <!--<span class="cart_title">Anh Tùng</span>-->
            </div>
            <div class="clear"></div>
        </div>
        <div class="clear"></div>
    </div>
    <jsp:include page="menu.jsp" flush="true"/>

    <div class="header_bottom">
        <div class="header_bottom_left">
            <div class="section group">
                <div class="listview_1_of_2 images_1_of_2">
                    <div class="listimg listimg_2_of_1">
                        <a href="detail.htm?id=${SPNB1.sanPhamChiTiet.maSPCT}"> <img src="/DuAnJAVAWeb/jspadmin/resources/images/${SPNB1.sanPhamChiTiet.imageSP}" alt="" width="165" height="165"/></a>
                    </div>
                    <div class="text list_2_of_1">
                        <h2>${SPNB1.sanPhamChiTiet.maSP.tenSP}</h2>
                        <p>${SPNB1.sanPhamChiTiet.maSP.maNSX.tenNSX}</p>
                        <div class="button"><span><a href="giohang?id=${SPNB1.sanPhamChiTiet.maSPCT}">Đặt mua</a></span></div>
                    </div>
                </div>			
                <div class="listview_1_of_2 images_1_of_2">
                    <div class="listimg listimg_2_of_1">
                        <a href="detail.htm?id=${SPNB2.sanPhamChiTiet.maSPCT}"> <img src="/DuAnJAVAWeb/jspadmin/resources/images/${SPNB2.sanPhamChiTiet.imageSP}" alt="" width="165" height="165"/></a>
                    </div>
                    <div class="text list_2_of_1">
                        <h2>${SPNB2.sanPhamChiTiet.maSP.tenSP}</h2>
                        <p>${SPNB2.sanPhamChiTiet.maSP.maNSX.tenNSX}</p>
                        <div class="button"><span><a href="giohang?id=${SPNB2.sanPhamChiTiet.maSPCT}">Đặt mua</a></span></div>
                    </div>
                </div>	
            </div>
            <div class="section group">
                <div class="listview_1_of_2 images_1_of_2">
                    <div class="listimg listimg_2_of_1">
                        <a href="detail.htm?id=${SPNB3.sanPhamChiTiet.maSPCT}"> <img src="/DuAnJAVAWeb/jspadmin/resources/images/${SPNB3.sanPhamChiTiet.imageSP}" alt="" width="165" height="165"/></a>
                    </div>
                    <div class="text list_2_of_1">
                        <h2>${SPNB3.sanPhamChiTiet.maSP.tenSP}</h2>
                        <p>${SPNB3.sanPhamChiTiet.maSP.maNSX.tenNSX}</p>
                        <div class="button"><span><a href="giohang?id=${SPNB3.sanPhamChiTiet.maSPCT}">Đặt mua</a></span></div>
                    </div>
                </div>			
                <div class="listview_1_of_2 images_1_of_2">
                    <div class="listimg listimg_2_of_1">
                        <a href="detail.htm?id=${SPNB4.sanPhamChiTiet.maSPCT}"> <img src="/DuAnJAVAWeb/jspadmin/resources/images/${SPNB4.sanPhamChiTiet.imageSP}" alt="" width="165" height="165"/></a>
                    </div>
                    <div class="text list_2_of_1">
                        <h2>${SPNB4.sanPhamChiTiet.maSP.tenSP}</h2>
                        <p>${SPNB4.sanPhamChiTiet.maSP.maNSX.tenNSX}</p>
                        <div class="button"><span><a href="giohang?id=${SPNB4.sanPhamChiTiet.maSPCT}">Đặt mua</a></span></div>
                    </div>
                </div>	
            </div>
            <div class="clear"></div>
        </div>
        <div class="header_bottom_right_images">
            <!-- FlexSlider -->
            <section class="slider">
                <div class="flexslider">
                    <ul class="slides">
                        <c:forEach items="${allimage}" var="image">      
                            <li><img src="/DuAnJAVAWeb/jspadmin/resources/imagesfrontend/${image.image}" alt="" width="300" height="300"/></li>           
                        </c:forEach>
                    </ul>
                </div>
            </section>
            <!-- FlexSlider -->
        </div>
        <div class="clear"></div>
    </div>