
<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Free Smart Store Website Template | Preview :: w3layouts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <jsp:include page="css.jsp" flush="true"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
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
                                <input type="text" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search for Products'; }"><input type="submit" value="SEARCH">
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
                
            <div class="main">
                <div class="content">
                    <!---728x90--->



                    <h3 style="color: red">${result}</h3>
                    <div class="section group">
                        <div class="cont-desc span_1_of_2">	

                            <h4>Thông tin người nhân hàng</h4>
                            <form:form action="ghidonhang.htm" modelAttribute="dathang" >

                                <div class="row">
                                    <div class="col-sm-5 ">                                 
                                        <div class="form-group">
                                            <label>Họ tên<abbr class="required" title="bắt buộc"> *</abbr></label>
                                            <form:input  class="form-control" path="hoTen"/>
                                        </div>  
                                        <div class="form-group">
                                            <label>Địa chỉ giao hàng</label><abbr class="required" title="bắt buộc"> *</abbr>
                                            <form:input class="form-control" placeholder="Address" path="diachigiaohang"/>
                                        </div>  
                                    </div>

                                    <div class="col-sm-5 ">                                 
                                        <div class="form-group">
                                            <label>Số điện thoại</label><abbr class="required" title="bắt buộc"> *</abbr>
                                            <form:input  class="form-control" path="sdt"/>
                                        </div>  
                                        <div class="form-group">
                                            <label>Email</label><abbr class="required" title="bắt buộc"> *</abbr>
                                            <form:input class="form-control" path="email"/>           
                                        </div>  
                                    </div>
                                </div>
                                        <div class="form-group">
                                            <label for="comment">Ghi chú đơn đặt hàng</label>
                                            <form:textarea class="form-control" rows="5" path="ghiChu"/>
                                        </div>        
                                <h4>Đơn hàng của bạn</h4>
                                <table class="table">

                                    <tr>                 
                                        <th>STT</th>    
                                        <th>&nbsp;</th>
                                        <th>Sản phẩm</th>    
                                        <th>Số lượng</th>
                                        

                                    </tr>

                                    <c:forEach items="${list}" var="giohang">
                                        <tr class="woocommerce-cart-form__cart-item cart_item">    
                                            <td>${m1.count}</td>
                                            <td>
                                                <img src="/DuAnJAVAWeb/jspadmin/resources/images/${giohang.maSPCT.imageSP}" width="20" height="20"/>
                                            </td>
                                            <td>${giohang.maSPCT.maSP.tenSP}</td>   
                                            <td class="dinhdang3">${giohang.soluong}</td>
                                            

                                        </tr>
                                    </c:forEach>


                                </table>  
                                <input class="btn btn-primary" type="submit" value="Đặt hàng"/>

                            </form:form>

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
<!--                            <div class="subscribe">
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
                            </div>-->
                        </div>
                    </div>
                </div>
            </div>
            <!---728x90--->
        
    <script>
            var giaban = document.getElementsByClassName("dinhdang2");
            var soluong = document.getElementsByClassName("dinhdang3");
            for(var i=0;i< giaban.length;i++){
                var output = giaban[i].innerHTML;
                var output1 = soluong[i].innerHTML;
                var outputs = output * output1 ;
                var re = "";
                var d = 0;
                for (var j = 0 ; j <= outputs.length -1 ; j++) {
                    
                    d++;
                    re = re + outputs[j];
                    if(d%3==0&&j!=(outputs.length -1)){
                        re = re +".";
                    }
                   
                }
               
                giaban[i].innerHTML =  outputs +"0 đ";                           
            }
            
    </script>
    <script>
        
    </script>
            <jsp:include page="footer.jsp" flush="true"/>
            <jsp:include page="jsfooter.jsp" flush="true"/>
    </body>
</html>

