<%-- 
    Document   : index
    Created on : May 18, 2020, 10:41:18 PM
    Author     : PT-LS
--%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Free Smart Store Website Template | Preview :: w3layouts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <meta property="og:url"           content="https://www.your-domain.com/your-page.html" />
        <meta property="og:type"          content="website" />
        <meta property="og:title"         content="Your Website Title" />
        <meta property="og:description"   content="Your description" />
        <meta property="og:image"         content="https://www.your-domain.com/path/image.jpg" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

        <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
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
            <div class="main">
                <div class="content">
                    <div class="content_top">
                        <div class="back-links">
                            <p><a href="list.htm">Home</a> >> <a href="#">Electronics</a></p>
                        </div>
                       
                        <div class="clear"></div>
                    </div>
                    <!---728x90--->

                    <div class="section group">



                        <div class="cont-desc span_1_of_2">

                            <div class="grid images_3_of_2">

                                <div class="pro-img-details">                                
                                    <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" id="imagecenter" >       
                                </div>

                                <div class="pro-img-list">             
                                    <p hidden id="0">${c.imageSP}</p>
                                    <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}"  onclick="changeimage(0)" height="70" width="70" alt="Lỗi">                                                                                                              
                                    <c:forEach items="${listimage}" var="s" varStatus="s1">                                       
                                        <p hidden id="${s1.count}">${s.maHA.image}</p>
                                        <img src="/DuAnJAVAWeb/jspadmin/resources/imagesfrontend/${s.maHA.image}" onclick="changeimage(${s1.count})" height="70" width="70" alt="Lỗi" >                                    
                                    </c:forEach>   
                                </div>    
                            </div>
                            <div class="desc span_3_of_2">
                                <h2>Đồng hồ ${c.maSP.tenSP}</h2>
                                <p hidden id="maspct">${c.maSPCT}</p>
                                <div class="price">
                                    <p>Giá bán : <span class="dinhdang1">${c.giaKM}</span></p>
                                </div>

                                <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet" />
                                <div class="row">
                                    <div class="form-group-lg col-sm-5">
                                        <label class="control-label" for="facilities">Kích thước ${c.maKichThuoc.tenKichThuoc} mm</label>
                                        <div class="form-group-lg">
                                            <!--<label><input type="checkbox"  value="${c.maKichThuoc.maKichThuoc}" checked>${c.maKichThuoc.tenKichThuoc}</label>-->    
                                                <c:forEach items="${allkichthuoc}" var="kichthuoc" varStatus="m">
                                                             <!--<p>Size${m.count}</p>-->
                                                    <label><input type="checkbox" onclick="xulykichthuong(${kichthuoc.maKichThuoc})" value="${kichthuoc.maKichThuoc}">${kichthuoc.tenKichThuoc} mm</label> 
                                                </c:forEach>
                                        </div>
                                    </div>
                                    <div class="form-group-lg col-sm-7">
                                        <label class="control-label" for="facilities">Bạn đang xem phiên bản màu ${c.maMauSac.tenMauSac}</label>
                                        <div class="form-group-lg">
                                            <!--<label><input type="checkbox"  value="${c.maMauSac.maMauSac}" checked>${c.maMauSac.tenMauSac}</label>-->    
                                            <c:forEach items="${allmausac}" var="mausac" varStatus="c">
                                                        <!--<p>Color${c.count}</p>-->
                                                <label><input type="checkbox" onclick="xulymausac(${mausac.maMauSac})" value="${mausac.maMauSac}" > ${mausac.tenMauSac}</label> 
                                                
                                            </c:forEach>   
                                        </div>
                                    </div>
                                </div>

                                <div class="share">
                                    <p>Chia sẻ</p>
                                    <ul>
                                        <li>
                                            <div class="fb-share-button" 
                                                 data-href="https://developers.facebook.com/docs/plugins/share-button" 
                                                 data-layout="button_count">
                                            </div>
                                        </li>

                                        <!--<li><a href="#"><img src="/DuAnJAVAWeb/resourceclient/images/facebook.png" alt=""></a></li>-->
                                        <!--                                    <li><a href="#"><img src="/DuAnJAVAWeb/resourceclient/images/twitter.png" alt=""></a></li>
                                                                            <li><a href="#"><img src="/DuAnJAVAWeb/resourceclient/images/linkedin.png" alt=""></a></li>-->
                                    </ul>
                                </div>
                                <div class="add-cart">
                                    <div class="rating">
                                        <p>Đánh giá:<img src="/DuAnJAVAWeb/resourceclient/images/rating.png"><span>[3 of 5 Stars]</span></p>
                                    </div>
                                    <div class="button"><span><a href="giohang?id=${c.maSPCT}">Đặt mua</a></span></div>

                                    <div class="clear"></div>
                                </div>
                            </div>
                            <!--<h1 id="result3">Process</h1>-->
                            <div class="product-desc">
                                <h2>Thông tin sản phẩm</h2>
                                <p>${c.ghiChu}</p>
                            </div>


                            <div class="product-tags">
                                <h2>Bình luận</h2>
                                <div>
                                    <c:forEach items="${listcomment}" var="comment" >
                                        <div class="card card-inner remark1">
                                            <div class="card-body">
                                                <div class="row">
                                                    <div class="col-md-2">
                                                        <!--<img src="https://image.ibb.co/jw55Ex/def_face.jpg" width="50" height="50" class="img img-rounded img-fluid"/>-->
                                                        <p class="text-secondary text-center">${comment.timecomment}</p>
                                                    </div>
                                                    <div class="col-md-10">
                                                        <p><a href="https://maniruzzaman-akash.blogspot.com/p/contact.html"><strong>${comment.tenDN.tenDN}</strong></a></p>
                                                        <p>${comment.content}</p>
                                                        <p>
                                                            <a class="float-right btn btn-outline-primary ml-2">  <i class="fa fa-reply"></i>  Trả lời</a>
                                                            <!--<a class="float-right btn text-white btn-danger"> <i class="fa fa-heart"></i> Like</a>-->
                                                        </p>
                                                    </div>
                                                </div>
                                            </div>
                                        </div> 
                                    </c:forEach>
                                </div>
                                <div id="remark2">

                                </div>

                                <h4>Viết bình luận</h4>
                                <h1 hidden id="maspct1">${c.maSPCT}</h1>

                                <div class="input-box">
                                    <input type="text" id="content1"/>
                                </div>

                                <div class="button">
                                    <input type="submit" onclick="xulythembinhluan()" id="submit1" value="Thêm bình luận"/>
                                </div>
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

                        </div>
                    </div>
                </div>
            </div>
            <!--<h1 id="remark2">156156156</h1>-->
            <!---728x90--->
            
            <script>
                (function (d, s, id) {
                    var js, fjs = d.getElementsByTagName(s)[0];
                    $("#remark1").hide();
                    if (d.getElementById(id))
                        return;
                    js = d.createElement(s);
                    js.id = id;
                    js.src = "https://connect.facebook.net/en_US/sdk.js#xfbml=1&version=v3.0";
                    fjs.parentNode.insertBefore(js, fjs);
                }(document, 'script', 'facebook-jssdk'));
            </script>

            
            <form id="form" action="xulydieuhuong.htm">
                <input type="hidden" id="mamausac" name="mausac" value=""/>
                <input type="hidden" id="makichthuoc" name="makichthuoc" value=""/>
                <input type="hidden" id="maspct1" name="maspct1" value=""/>
            </form>
            
            <script>
                function xulymausac(maMS){
                    var maspct = document.getElementById("maspct").innerHTML;
                    document.getElementById("mamausac").value = maMS;
//                    alert(maMS+" "+document.getElementById("makichthuoc").value);
                    if(document.getElementById("mamausac").value.length >0 && document.getElementById("makichthuoc").value.length >0) 
                        document.getElementById("form").submit();
                }
            </script>
            
            <script>
                function xulykichthuong(maKT){
                    var maspct = document.getElementById("maspct").innerHTML;
                    document.getElementById("makichthuoc").value = maKT;
                    document.getElementById("maspct1").value = maspct;
                    if(document.getElementById("mamausac").value.length >0 && document.getElementById("makichthuoc").value.length >0) 
                        document.getElementById("form").submit();
//                    alert(maKT+" "+maspct);
                }
            </script>
            <script>
                function changeimage(stt) {
                    var s1 = document.getElementById(stt).innerHTML;
//                    alert(s1);
                    document.getElementById("imagecenter").src = "/DuAnJAVAWeb/jspadmin/resources/images/" + s1;
                }

            </script>
            <script>
                var elm = document.getElementsByClassName("dinhdang1");
                for (var i = 0; i < elm.length; i++) {
                    var output = elm[i].innerHTML;
                    var re = "";
                    var d = 0;
                    for (var j = 0; j <= output.length - 1; j++) {
                        if (output[j] != ".") {
                            d++;
                            re = re + output[j];
                            if (d % 3 == 0 && j != (output.length - 1)) {
                                re = re + ".";
                            }
                        }
                    }
                    elm[i].innerHTML = re + " đ";
                }
            </script>
            <!--            <script>
                            $(document).ready(function () {
                                $(".remark1").hide();
                            });
                        </script>-->
            <script type="text/javascript">
//                $(".remark1").hide();
                function xulythembinhluan() {
                    var content = $('#content1').val();
                    var idpost = $('#maspct1').html();
                    alert(content + " " + idpost);
                    $.ajax({
                        type: 'POST',
                        url: '${pageContext.request.contextPath}/ajax2.htm',
                        data: {content: content, idpost: idpost},
                        success: function (result) {
                            alert(result);
                            $("#remark1").hide();
                            $("#remark2").html(result);
                        },
                        error: function (XMLHttpRequest, textStatus, errorThrown) {
                            alert("error..." + XMLHttpRequest.toString());
                        }
                    });
                }
            </script>


            <jsp:include page="footer.jsp" flush="true"/>
            <jsp:include page="jsfooter.jsp" flush="true"/>
    </body>
</html>


