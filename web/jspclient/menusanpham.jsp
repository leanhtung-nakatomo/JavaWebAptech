
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
                        <form>
                            <input type="text" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search for Products';}"><input type="submit" value="SEARCH">
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
                        <span><a href="login.htm"><img src="/DuAnJAVAWeb/resourceclient/images/login.png" alt="" title="login"/></a></span>
                    </div>
                    <div class="clear"></div>
                </div>
                <div class="clear"></div>
            </div>
            <jsp:include page="menu.jsp" flush="true"/>                            
            <div class="clear"></div>
        </div>
        <div class="main">
            <div class="content">
                <div class="content_top">
                    <div class="back-links">
                        <p><a href="list.htm">Trang chủ</a> </p>
                    </div>
                    <div class="sort">
                        <p>Sort by:
                            <select>
                                <option>Lowest Price</option>
                                <option>Highest Price</option>
                                <option>Lowest Price</option>
                                <option>Lowest Price</option>
                                <option>Lowest Price</option>
                                <option>In Stock</option>  				   				
                            </select>
                        </p>
                    </div>
<!--                    <div class="show">
                        <p>Show:
                            <select>
                                <option>4</option>
                                <option>8</option>
                                <option>12</option>
                                <option>16</option>
                                <option>20</option>
                                <option>In Stock</option>  				   				
                            </select>
                        </p>
                    </div>-->
                    <div class="page-no">
                        <p>Result Pages:<ul>
                            <li><a href="#">1</a></li>
                            <li class="active"><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li>[<a href="#"> Next>>></a >]</li>
                        </ul></p>
                    </div>
                    <div class="clear"></div>
                </div>
                <!---728x90--->

                <div class="section group">
                    <div class="cont-desc span_1_of_2">
                        <div class="section group">
                            <div class="grid_1_of_4 images_1_of_4">
                            <c:forEach items="${list}" var="c" >
                                    <a href="detail.htm?id=${c.maSPCT}">
                                        <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" width="165" height="165"/>
                                    </a>
                                    <h2>${c.maSP.tenSP}</h2>
                                    <div class="discount">
                                        <span class="percentage">40%</span>
                                    </div>
        <!--                            <h2>${c.maSPCT}</h2>-->
                                    <p>
                                        <span class="strike">${c.giaGoc} đ</span>
                                        <span class="price">${c.giaKM} đ</span>
                                    </p>

                                    <div class="button">
                                        <span>
                                            <img src="" alt="" />
                                            <a href="giohang?id=${c.maSPCT} ">Đặt mua</a>
                                        </span> 
                                    </div>
                               
                            </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="rightsidebar span_3_of_1">
                        <h2>CATEGORIES</h2>
                        <ul>
                            <li><a href="#">Mobile Phones</a></li>
                            <li><a href="#">Desktop</a></li>
                            <li><a href="#">Laptop</a></li>
                            <li><a href="#">Accessories</a></li>
                            <li><a href="#">Software</a></li>
                            <li><a href="#">Sports & Fitness</a></li>
                            <li><a href="#">Footwear</a></li>
                            <li><a href="#">Jewellery</a></li>
                            <li><a href="#">Clothing</a></li>
                            <li><a href="#">Home Decor & Kitchen</a></li>
                            <li><a href="#">Beauty & Healthcare</a></li>
                            <li><a href="#">Toys, Kids & Babies</a></li>
                        </ul>
                        <div class="subscribe">
                            <h2>Newsletters Signup</h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod.......</p>
                            <div class="signup">
                                <form>
                                    <input type="text" value="E-mail address" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'E-mail address';"><input type="submit" value="Sign up">
                                </form>
                            </div>
                        </div>
                        <div class="community-poll">
                            <h2>Community POll</h2>
                            <p>What is the main reason for you to purchase products online?</p>
                            <div class="poll">
                                <form>
                                    <ul>
                                        <li>
                                            <input type="radio" name="vote" class="radio" value="1">
                                            <span class="label"><label>More convenient shipping and delivery </label></span>
                                        </li>
                                        <li>
                                            <input type="radio" name="vote" class="radio" value="2">
                                            <span class="label"><label for="vote_2">Lower price</label></span>
                                        </li>
                                        <li>
                                            <input type="radio" name="vote" class="radio"  value="3">
                                            <span class="label"><label for="vote_3">Bigger choice</label></span>
                                        </li>
                                        <li>
                                            <input type="radio" name="vote" class="radio"  value="5">
                                            <span class="label"><label for="vote_5">Payments security </label></span>
                                        </li>
                                        <li>
                                            <input type="radio" name="vote" class="radio" value="6">
                                            <span class="label"><label for="vote_6">30-day Money Back Guarantee </label></span>
                                        </li>
                                        <li>
                                            <input type="radio" name="vote" class="radio" value="7">
                                            <span class="label"><label for="vote_7">Other.</label></span>
                                        </li>
                                    </ul>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!---728x90--->

        <jsp:include page="footer.jsp" flush="true"/>
        <jsp:include page="jsfooter.jsp" flush="true"/>
  </body>
  </html>

