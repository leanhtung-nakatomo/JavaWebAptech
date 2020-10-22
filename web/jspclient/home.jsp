<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/newtag_library"%>
<%@taglib prefix="mytag2" uri="/WEB-INF/tlds/newtag_library1" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Free Smart Store Website Template | Home :: w3layouts</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
        <jsp:include page="css.jsp" flush="true"/>
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/css/font- awesome.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="https://cdn.jsdelivr.net/gh/timdown/jshashtable/hashtable.js"></script>
        <script src="https://cdn.jsdelivr.net/gh/hardhub/jquery-numberformatter/src/jquery.numberformatter.js"></script>
    </head>
    <body>
        <div class="wrap">
            <jsp:include page="header.jsp" flush="true"/>	
        </div>
        <div class="main">
            <div class="content">
                <div class="content_top">
                    <div class="heading">
                        <h2>Đồng hồ Apple Watch</h2>
                    </div>

                    <div class="page-no">
                        <p>Trang sản phẩm</p>
                        <ul>
                            <mytag:Paganition offset="${offset1}" maxResult="4" uri="list.htm" totalRecord="${total1}" next="&raquo;" previous="&laquo;"></mytag:Paganition>
                            </ul></p>
                        </div>
                        <div class="clear">
                        </div>
                    </div>
                    <div class="section group">
                    <c:forEach items="${apple}" var="c" >
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="detail.htm?id=${c.maSPCT}">
                                <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" />
                            </a>
                            <h2>Đồng hồ ${c.maSP.tenSP}</h2>
                            <div class="discount">
                                <span class="percentage">40%</span>
                            </div>
<!--                            <h2>${c.maSPCT}</h2>-->
                            <p>
                                <span class="dinhdang1 strike">${c.giaGoc}</span>
                                <span class="dinhdang1 price ">${c.giaKM}</span>
                            </p>

                            <div class="button ">
                                <span>
                                    <img src="" alt="" />
                                    <a href="giohang?id=${c.maSPCT} ">Đặt mua</a>
                                </span> 
                            </div>               
                        </div>                         
                    </c:forEach>
                </div>

                <div class="content_bottom">
                    <div class="heading">
                        <h2>Đồng hồ XIAOMI AMAFIT</h2>
                    </div>
                    <div class="page-no">
                        <p>Trang sản phẩm<ul>
                            <mytag:Paganition offset="${offset}" maxResult="4" uri="list.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>
                            </ul></p>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <div class="section group">

                    <c:forEach items="${xiaomi}" var="c" >
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="detail.htm?id=${c.maSPCT}">
                                <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" width="300" height="300" alt="Lỗi"/>
                            </a>
                            <h2>Đồng hồ ${c.maSP.tenSP}</h2>
                            <div class="discount">
                                <span class="percentage">40%</span>
                            </div>
<!--                            <h2>${c.maSPCT}</h2>-->
                            <p>
                                <span class="dinhdang1 strike">${c.giaGoc}</span>
                                <span class="dinhdang1 price">${c.giaKM}</span>
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

                <div class="content_bottom">
                    <div class="heading">
                        <h2>Đồng hồ Samsung</h2>
                    </div>
                    <div class="page-no">
                        <p>Trang sản phẩm<ul>
                            <mytag:Paganition offset="${offset}" maxResult="4" uri="list.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>
                            </ul></p>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <div class="section group">

                    <c:forEach items="${samsung}" var="c" >
                        <div class="grid_1_of_4 images_1_of_4">
                            <a href="detail.htm?id=${c.maSPCT}">
                                <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" width="300" height="300" alt="Lỗi"/>
                            </a>
                            <h2>Đồng hồ ${c.maSP.tenSP}</h2>
                            <div class="discount">
                                <span class="percentage">40%</span>
                            </div>
<!--                            <h2>${c.maSPCT}</h2>-->
                            <p>
                                <span class="dinhdang1 strike">${c.giaGoc}</span>
                                <span class="dinhdang1 price">${c.giaKM}</span>
                            </p>

                            <div class="button">
                                <span>
                                    <img src="" alt="" />
                                    <a href="giohang?id=${c.maSPCT} ">Đặt mua</a>
                                </span> 
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>
    </div>
</div>
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
<jsp:include page="footer.jsp" flush="true"/>
<jsp:include page="jsfooter.jsp" flush="true"/>
</body>
</html>

