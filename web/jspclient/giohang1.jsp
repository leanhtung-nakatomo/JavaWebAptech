
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
                        <a href="list.htm">
                            <img src="/DuAnJAVAWeb/resourceclient/images/logo.png"/>
                        </a>
                    </div>
                    <div class="header_top_right">
                        <div class="search_box">
                            <form>
                                <input type="text" value="Search for Products" onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search for Products';
                                        }"><input type="submit" value="SEARCH">
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

                    <div class="section group">
                        <div class="cont-desc span_1_of_2">
                        
                            <center>                         
                                <table class="table">
                                    
                                        <tr>     
                                            <!--<th>STT</th>-->      
                                            <th>&nbsp;</th>
                                            <!--<th>Mã SP</th>--> 
                                            <th>STT</th>    
                                           
                                            <th>Sản phẩm</th>
                                            <th>Kích cỡ </th>
                                            <th>Màu sắc </th>
                                            <th>Giá</th>
                                            <th>Số lượng</th>
                                            <!--<th>Tổng cộng</th>-->
                                            <th>Xóa</th>
                                        </tr>
                                    

                                        <c:forEach items="${list}" var="giohang" varStatus="m1">
                                            <tr class="woocommerce-cart-form__cart-item cart_item">     
                                                <td>
                                                    <a href="detail.htm?id=${giohang.maSPCT.maSPCT}">
                                                        <img class="img-thumbnail" src="/DuAnJAVAWeb/jspadmin/resources/images/${giohang.maSPCT.imageSP}" width="50" height="50"/>
                                                    </a>
                                                </td>                                     
                                                <td>${m1.count}</td>
                                                <td hidden id="maSP">${giohang.maSPCT.maSPCT}</td>    
                                                <td>${giohang.maSPCT.maSP.tenSP}</td>       
                                                <td>${giohang.maSPCT.maKichThuoc.tenKichThuoc}</td> 
                                                <td>${giohang.maSPCT.maMauSac.tenMauSac}</td> 
                                               
                                                <td class="dinhdang1">${giohang.maSPCT.giaKM}</td>      
                                               
                                                <td class="product-quantity" data-title="Số lượng">
                                                    <div class="quantity">
                                                        <input type="number" onchange="xulythem(${giohang.soluong},${giohang.maSPCT.maSPCT})" class="input-text qty text" step="1" min="0" max="" value="${giohang.soluong}" size="1" pattern="[0-9]*" inputmode="numeric">
                                                    </div>
                                                </td>
                                            <p hidden class="value1">${giohang.soluong}</p>
                                                <!--<td class="xuly">${giohang.maSPCT.giaKM}</td>-->                                    
                                                <td class="product-remove">
                                                    <a href="xoagiohang?id=${giohang.maSPCT.maSPCT}">Xóa</a>
                                                </td>                                              
                                            </tr>
                                        </c:forEach>


                                  
                                </table>  

                            </center>
                            <div class="container">
                                <a href="dathang.htm" class="btn btn-info" role="button">Tiến hành thanh toán</a>
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
            <script>
                        

                        var elm = document.getElementsByClassName("dinhdang1");
                        for (var i = 0; i < elm.length; i++){
                var output = elm[i].innerHTML;
                        var re = "";
                        var d = 0;
                        for (var j = 0; j <= output.length - 1; j++) {
                if (output[j] != "."){
                d++;
                        re = re + output[j];
                        if (d % 3 == 0 && j != (output.length - 1)){
                re = re + ".";
                }
                }
                }
                elm[i].innerHTML = re + " đ";
                }
            </script>
            <script>         
                    function xulythem(soluong,maSP){
                        $.ajax({
                        type:'POST',
                        url: '${pageContext.request.contextPath}/ajax.htm',
                        data:{soluong:soluong , maSP:maSP},
                        success:function(result){
//                            $('#result').html(result)
                            alert(result);
                        },
                        error:function(XMLHttpRequest, textStatus, errorThrown){
                            alert("erro..." + XMLHttpRequest.toString());
                        }
                        });              
                    }              
            </script>
            
<!--            <script>
                var value1 = document.getElementsByClassName("value1").innerHTML;
                var value = document.getElementsByClassName("xuly").innerHTML;
               
                var s2 = "";
                for (var i1 = 0; i1 <= value.length-1; i1++) {
                    

                for (var i = 0; i <= value[i1].length-1; i++) {
                    if(i == value[i1].length) break;
                    if(value[i1][i]!=".")
                       s2 = s2 + value[i1][i];
                }
            }
                document.getElementById("xuly").innerHTML = s2*value1+ " đ";
                alert(s2)
                alert(value1)
            </script>-->
            <jsp:include page="footer.jsp" flush="true"/>
            <jsp:include page="jsfooter.jsp" flush="true"/>
    </body>
</html>

