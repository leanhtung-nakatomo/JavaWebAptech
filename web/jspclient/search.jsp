
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
<!--                    <div class="sort">
                        <p>Sắp xếp:
                            <select id="sort">
                                <option value="tangdan">Tăng dần</option>
                                <option value="giamdan">Giảm dần</option>			   				
                            </select>
                        </p>
                    </div>-->
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
                    <div class="clear"></div>
                </div>
                <!---728x90--->

                <div class="section group">
                    <div class="cont-desc span_1_of_2">
                        <div class="section group">
                            <c:forEach items="${list}" var="c" >
                                <div class="grid_1_of_4 images_1_of_5">
                                    <a href="detail.htm?id=${c.maSPCT}">
                                        <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" width="165" height="165"/>
                                    </a>
                                    <h3>Đồng hồ ${c.maSP.tenSP}</h3>
                                    <!--<h2>${c.maSPCT}</h2>-->
                                    <p>
                                        <!--<span class="strike dinhdang1">${c.giaGoc}</span>-->
                                        <span class="price dinhdang1">${c.giaKM}</span>
                                    </p>

                                    <div class="button">
                                        <span>
                                            <img src="" alt="" />
                                            <a href="giohang?id=${c.maSPCT} ">Đặt mua</a>
                                        </span> 
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <div class="rightsidebar span_3_of_1">
                        <h2>Sản phẩm khác</h2>
                        <ul>
                             <li><a href="iphone.htm">Iphone</a></li>
                                <li><a href="xiaomi.htm">Xiaomi</a></li>
                                <li><a href="samsung.htm">Samsung</a></li>					
                                <li><a href="google.htm">Google</a></li>
                                <li><a href="huawei.htm">Huawei</a></li>
                                <li><a href="sony.htm">Sony</a></li>
                        </ul>
<!--                        <div class="subscribe">
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
                            </div>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!---728x90--->
        <script>
            var elm = document.getElementsByClassName("dinhdang1");
            for(var i=0;i< elm.length;i++){
                var output = elm[i].innerHTML;
                var re = "";
                var d = 0;
                for (var j = 0 ; j <= output.length -1 ; j++) {
                    if(output[j]!="."){
                    d++;
                    re = re + output[j];
                    if(d%3==0&&j!=(output.length -1)){
                        re = re +".";
                    }
                    }
                }
                elm[i].innerHTML = re +" đ";                
            }             
    </script>
    <script>
        var elm = document.getElementById("sort").value;
        if(elm=="tangdan"){
            
        }
        if(elm=="giamdan"){
            
        }
    </script>
        <jsp:include page="footer.jsp" flush="true"/>
        <jsp:include page="jsfooter.jsp" flush="true"/>
  </body>
  </html>

