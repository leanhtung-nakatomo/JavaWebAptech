
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
                            <span><a href=""><img src="/DuAnJAVAWeb/resourceclient/images/login.png" alt="" title="login"/></a></span>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>
                </div>
                <jsp:include page="menu.jsp" flush="true"/>                            
                <div class="clear"></div>
            </div>
             <h3 id="result" style="color:red">${result}</h3>
             <h3 style="color:red">${err}</h3>
            <div class="main">
                <div class="content">
                    <div class="login_panel">
                        <h3>Đơn Hàng</h3>
                        <p>Lịch sử đơn hàng và thời gian vận chuyển</p>                                         
                        <p class="note" onclick="repass()"><a>Lấy lại mật khẩu</a></p>
<!--                        <div class="buttons"><div><button class="grey" action="signout.htm">Đăng xuất</button></div></div>     -->
                        <form action="signout.htm">
                            <div class="search">                    
                                <button class="grey">Đăng xuất</button>
                            </div>
                        </form>
                    </div>
                    <div class="register_account">
                        <h3>Thông tin tài khoản</h3>
                        <spring:form action="insign.htm" modelAttribute="account" method="post" formenctype="multipart/form-data" >
                            <table>
                                <tbody>
                                    <tr>
                                        <td>
                                            <div>
                                                <spring:input path="tenDN" name ="tenDN" id="tenDN" readonly="true"/>
                                            </div>

                                            <div>
                                                <spring:input path="matKhau" id="matKhau" value="**********" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                              this.value = '**********';}"/>                                             
                                            </div>
                                            <div>
                                                <spring:input  path="email" id="email" readonly="true"/>                                             
                                            </div>
                                        </td>
                                        <td>
                                            <div>
                                                <spring:input path="hoTen" id="hoTen"  />
                                            </div>

                                            <!--                                            <div>
                                                                                            <input type="text" value="Company Name" onfocus="this.value = '';" onblur="if (this.value == '') {
                                                                                                    this.value = 'Company Name';}">
                                                                                        </div>-->

                                            <div>
                                                <spring:input path="queQuan" id="queQuan"  />
                                            </div>

                                            <div>
                                                <spring:input path="sdt" id="sdt"  />
                                            </div>   
                                            <!--                                            <div>
                                                                                            <label for="birthday">Ngày sinh </label>
                                            <%--<spring:input type="date" path="hoTen" id="hoTen" value="Họ tên" onfocus="this.value = '';" onblur="if (this.value == '') {--%>
                                            <%--this.value = 'Họ tên';}"/>--%>
                                            </div>-->
                                        </td>
                                    </tr> 
                                </tbody>
                            </table> 
                            <div class="search">                    
                                <button class="grey">Cập nhật thông tin</button>
                            </div>
                            <!--<p class="terms">By clicking 'Create Account' you agree to the <a href="#">Terms &amp; Conditions</a>.</p>-->
                            <div class="clear"></div>
                        </spring:form>
                    </div>  	
                    <div class="clear"></div>
                </div>
            </div>
            <form id="form" action="repass.htm">
                <input type="hidden" id="gmail" name="gmail" value=""/>
            </form>
            <script>                 
                var elm = document.getElementById("result").innerHTML;
                if(elm.length>0){
                    if(elm == "Đăng kí thành công") alert("Đăng kí thành công");
                    else if(elm == "Đăng kí thất bại" ) alert("Đăng kí thất bại");
                    else alert(elm);
                }
            </script>
            <script>
                function repass(){
                        var gmail = prompt("Nhập gmail hoặc số điện thoại");
                        document.getElementById("gmail").value = gmail;
                        document.getElementById("form").submit();
                        if(gmail!="")
                            alert("Mật khẩu mới đã được gửi vào gmail đăng kí")
                }
            </script>
        <jsp:include page="footer.jsp" flush="true"/>
        <jsp:include page="jsfooter.jsp" flush="true"/>
  </body>
  </html>

