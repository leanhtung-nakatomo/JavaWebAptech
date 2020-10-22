<%-- 
    Document   : home
    Created on : Jan 6, 2020, 3:12:45 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/newtag_library"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Visitors an Admin Panel Category Bootstrap Responsive Website Template | Home :: w3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Visitors Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- bootstrap-css -->
        <jsp:include page="cssadmin.jsp" flush="true"/>
        <!-- //calendar -->
        <!-- //font-awesome icons -->
        <script src="/DuAnJAVAWeb/resourceadmin/js/jquery2.0.3.min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/js/raphael-min.js"></script>
        <script src="/DuAnJAVAWeb/resourceadmin/js/morris.js"></script>
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="${pageContext.request.contextPath}/resources/css/font- awesome.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <section id="container">
            <!--header start-->
            <jsp:include page="headeradmin.jsp" flush="true"/>
            <!--header end-->
            <!--sidebar start-->
            <aside>
                <jsp:include page="menuadmin.jsp" flush="true"/>
            </aside>
            <!--sidebar end-->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <!-- //market-->
<!--                    <div class="market-updates">
                        <div class="col-md-3 market-update-gd">
                            <div class="market-update-block clr-block-2">
                                <div class="col-md-4 market-update-right">
                                    <i class="fa fa-eye"> </i>
                                </div>
                                <div class="col-md-8 market-update-left">
                                    <h4>Visitors</h4>
                                    <h3>13,500</h3>
                                    <p>Other hand, we denounce</p>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                        </div>
                        <div class="col-md-3 market-update-gd">
                            <div class="market-update-block clr-block-1">
                                <div class="col-md-4 market-update-right">
                                    <i class="fa fa-users" ></i>
                                </div>
                                <div class="col-md-8 market-update-left">
                                    <h4>Users</h4>
                                    <h3>1,250</h3>
                                    <p>Other hand, we denounce</p>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                        </div>
                        <div class="col-md-3 market-update-gd">
                            <div class="market-update-block clr-block-3">
                                <div class="col-md-4 market-update-right">
                                    <i class="fa fa-usd"></i>
                                </div>
                                <div class="col-md-8 market-update-left">
                                    <h4>Sales</h4>
                                    <h3>1,500</h3>
                                    <p>Other hand, we denounce</p>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                        </div>
                        <div class="col-md-3 market-update-gd">
                            <div class="market-update-block clr-block-4">
                                <div class="col-md-4 market-update-right">
                                    <i class="fa fa-shopping-cart" aria-hidden="true"></i>
                                </div>
                                <div class="col-md-8 market-update-left">
                                    <h4>Orders</h4>
                                    <h3>1,500</h3>
                                    <p>Other hand, we denounce</p>
                                </div>
                                <div class="clearfix"> </div>
                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>	-->
                    <!-- //market-->
<!--                    <div class="row">
                        <div class="panel-body">
                            <div class="col-md-12 w3ls-graph">
                                agileinfo-grap
                                <div class="agileinfo-grap">
                                    <div class="agileits-box">
                                        <header class="agileits-box-header clearfix">
                                            <h3>Visitor Statistics</h3>
                                            <div class="toolbar">


                                            </div>
                                        </header>
                                        <div class="agileits-box-body clearfix">
                                            <div id="hero-area"></div>
                                        </div>
                                    </div>
                                </div>
                                //agileinfo-grap

                            </div>
                        </div>
                    </div>-->
                    <div class="agil-info-calendar">
                        <!-- lich giao hang -->
                        <div class=" agile-calendar">
                            <div class="calendar-widget">
                                <div class="panel-heading ui-sortable-handle">
                                    <span class="panel-icon">
                                        <i class="fa fa-calendar-o"></i>
                                    </span>
                                    <span class="panel-title">Đơn hàng</span>
                                </div>
                                <c:forEach items="${donhang}" var="donhang">
                                <div class="alert alert-info clearfix">
                                    <span class="alert-icon"><i class="fa fa-envelope-o"></i></span>
                                    <div class="notification-info">
                                        <ul class="clearfix notification-meta">
                                            <li class="pull-left notification-sender"><span><a href="#">${donhang.datHang.hoTen}</a></span> đã đặt hàng </li>                                        
                                        </ul>
                                        <h4>Sản phẩm : ${donhang.sanPhamChiTiet.maSP.tenSP}</h4>
                                        <h6>Họ tên : ${donhang.datHang.hoTen}</h6>
                                        <h6>Số lượng : ${donhang.datHang.diachigiaohang}</h6>
                                        <h6>Số điện thoại : ${donhang.datHang.sdt}</h6>
                                        <h6>Ngày đặt hàng : ${donhang.datHang.ngayDH}</h6>
                                        <h6 class="soluong">Số lượng : ${donhang.soLuong}</h6>
                                        <h6 class="dinhdang1">${donhang.giaBan}</h6>
                                        
                                    </div>
                                </div>
                                </c:forEach>
                                <mytag:Paganition offset="${offset}" maxResult="10" uri="list.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>
                            </div>
                        </div>
                        <!-- //calendar -->
<!--                        <div class="col-md-6 w3agile-notifications">
                            <div class="notifications">
                                notification start

                                <header class="panel-heading">
                                    Thông báo 
                                </header>
                                <div class="notify-w3ls">
                                    <div class="alert alert-info clearfix">
                                        <span class="alert-icon"><i class="fa fa-envelope-o"></i></span>
                                        <div class="notification-info">
                                            <ul class="clearfix notification-meta">
                                                <li class="pull-left notification-sender"><span><a href="#">Jonathan Smith</a></span> send you a mail </li>
                                                <li class="pull-right notification-time">1 min ago</li>
                                            </ul>
                                            <p>
                                                Urgent meeting for next proposal
                                            </p>
                                        </div>
                                    </div>
                                    <div class="alert alert-danger">
                                        <span class="alert-icon"><i class="fa fa-facebook"></i></span>
                                        <div class="notification-info">
                                            <ul class="clearfix notification-meta">
                                                <li class="pull-left notification-sender"><span><a href="#">Jonathan Smith</a></span> mentioned you in a post </li>
                                                <li class="pull-right notification-time">7 Hours Ago</li>
                                            </ul>
                                            <p>
                                                Very cool photo jack
                                            </p>
                                        </div>
                                    </div>
                                    <div class="alert alert-success ">
                                        <span class="alert-icon"><i class="fa fa-comments-o"></i></span>
                                        <div class="notification-info">
                                            <ul class="clearfix notification-meta">
                                                <li class="pull-left notification-sender">You have 5 message unread</li>
                                                <li class="pull-right notification-time">1 min ago</li>
                                            </ul>
                                            <p>
                                                <a href="#">Anjelina Mewlo, Jack Flip</a> and <a href="#">3 others</a>
                                            </p>
                                        </div>
                                    </div>
                                    <div class="alert alert-warning ">
                                        <span class="alert-icon"><i class="fa fa-bell-o"></i></span>
                                        <div class="notification-info">
                                            <ul class="clearfix notification-meta">
                                                <li class="pull-left notification-sender">Domain Renew Deadline 7 days ahead</li>
                                                <li class="pull-right notification-time">5 Days Ago</li>
                                            </ul>
                                            <p>
                                                Next 5 July Thursday is the last day
                                            </p>
                                        </div>
                                    </div>
                                    <div class="alert alert-info clearfix">
                                        <span class="alert-icon"><i class="fa fa-envelope-o"></i></span>
                                        <div class="notification-info">
                                            <ul class="clearfix notification-meta">
                                                <li class="pull-left notification-sender"><span><a href="#">Jonathan Smith</a></span> send you a mail </li>
                                                <li class="pull-right notification-time">1 min ago</li>
                                            </ul>
                                            <p>
                                                Urgent meeting for next proposal
                                            </p>
                                        </div>
                                    </div>

                                </div>

                                notification end
                            </div>
                        </div>-->
                        <div class="clearfix"> </div>
                    </div>
                    <!-- tasks -->
<!--                    <div class="agile-last-grids">
                        <div class="col-md-4 agile-last-left">
                            <div class="agile-last-grid">
                                <div class="area-grids-heading">
                                    <h3>Monthly</h3>
                                </div>
                                <div id="graph7"></div>
                                <script>
                                    // This crosses a DST boundary in the UK.
                                    Morris.Area({
                                        element: 'graph7',
                                        data: [
                                            {x: '2013-03-30 22:00:00', y: 3, z: 3},
                                            {x: '2013-03-31 00:00:00', y: 2, z: 0},
                                            {x: '2013-03-31 02:00:00', y: 0, z: 2},
                                            {x: '2013-03-31 04:00:00', y: 4, z: 4}
                                        ],
                                        xkey: 'x',
                                        ykeys: ['y', 'z'],
                                        labels: ['Y', 'Z']
                                    });
                                </script>

                            </div>
                        </div>
                        <div class="col-md-4 agile-last-left agile-last-middle">
                            <div class="agile-last-grid">
                                <div class="area-grids-heading">
                                    <h3>Daily</h3>
                                </div>
                                <div id="graph8"></div>
                                <script>
                                    /* data stolen from http://howmanyleft.co.uk/vehicle/jaguar_'e'_type */
                                    var day_data = [
                                        {"period": "2016-10-01", "licensed": 3407, "sorned": 660},
                                        {"period": "2016-09-30", "licensed": 3351, "sorned": 629},
                                        {"period": "2016-09-29", "licensed": 3269, "sorned": 618},
                                        {"period": "2016-09-20", "licensed": 3246, "sorned": 661},
                                        {"period": "2016-09-19", "licensed": 3257, "sorned": 667},
                                        {"period": "2016-09-18", "licensed": 3248, "sorned": 627},
                                        {"period": "2016-09-17", "licensed": 3171, "sorned": 660},
                                        {"period": "2016-09-16", "licensed": 3171, "sorned": 676},
                                        {"period": "2016-09-15", "licensed": 3201, "sorned": 656},
                                        {"period": "2016-09-10", "licensed": 3215, "sorned": 622}
                                    ];
                                    Morris.Bar({
                                        element: 'graph8',
                                        data: day_data,
                                        xkey: 'period',
                                        ykeys: ['licensed', 'sorned'],
                                        labels: ['Licensed', 'SORN'],
                                        xLabelAngle: 60
                                    });
                                </script>
                            </div>
                        </div>
                        <div class="col-md-4 agile-last-left agile-last-right">
                            <div class="agile-last-grid">
                                <div class="area-grids-heading">
                                    <h3>Yearly</h3>
                                </div>
                                <div id="graph9"></div>
                                <script>
                                    var day_data = [
                                        {"elapsed": "I", "value": 34},
                                        {"elapsed": "II", "value": 24},
                                        {"elapsed": "III", "value": 3},
                                        {"elapsed": "IV", "value": 12},
                                        {"elapsed": "V", "value": 13},
                                        {"elapsed": "VI", "value": 22},
                                        {"elapsed": "VII", "value": 5},
                                        {"elapsed": "VIII", "value": 26},
                                        {"elapsed": "IX", "value": 12},
                                        {"elapsed": "X", "value": 19}
                                    ];
                                    Morris.Line({
                                        element: 'graph9',
                                        data: day_data,
                                        xkey: 'elapsed',
                                        ykeys: ['value'],
                                        labels: ['value'],
                                        parseTime: false
                                    });
                                </script>

                            </div>
                        </div>
                        <div class="clearfix"> </div>
                    </div>-->
                    <!-- //tasks -->
<!--                    <div class="agileits-w3layouts-stats">
                        <div class="col-md-4 stats-info widget">
                            <div class="stats-info-agileits">
                                <div class="stats-title">
                                    <h4 class="title">Browser Stats</h4>
                                </div>
                                <div class="stats-body">
                                    <ul class="list-unstyled">
                                        <li>GoogleChrome <span class="pull-right">85%</span>  
                                            <div class="progress progress-striped active progress-right">
                                                <div class="bar green" style="width:85%;"></div> 
                                            </div>
                                        </li>
                                        <li>Firefox <span class="pull-right">35%</span>  
                                            <div class="progress progress-striped active progress-right">
                                                <div class="bar yellow" style="width:35%;"></div>
                                            </div>
                                        </li>
                                        <li>Internet Explorer <span class="pull-right">78%</span>  
                                            <div class="progress progress-striped active progress-right">
                                                <div class="bar red" style="width:78%;"></div>
                                            </div>
                                        </li>
                                        <li>Safari <span class="pull-right">50%</span>  
                                            <div class="progress progress-striped active progress-right">
                                                <div class="bar blue" style="width:50%;"></div>
                                            </div>
                                        </li>
                                        <li>Opera <span class="pull-right">80%</span>  
                                            <div class="progress progress-striped active progress-right">
                                                <div class="bar light-blue" style="width:80%;"></div>
                                            </div>
                                        </li>
                                        <li class="last">Others <span class="pull-right">60%</span>  
                                            <div class="progress progress-striped active progress-right">
                                                <div class="bar orange" style="width:60%;"></div>
                                            </div>
                                        </li> 
                                    </ul>
                                </div>
                            </div>
                        </div>-->
<!--                        <div class="stats-info stats-last widget-shadow">
                            <div class="stats-last-agile">
                                <table class="table stats-table ">
                                    <thead>
                                        <tr>
                                            <th>S.NO</th>
                                            <th>PRODUCT</th>
                                            <th>STATUS</th>
                                            <th>PROGRESS</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td>Lorem ipsum</td>
                                            <td><span class="label label-success">In progress</span></td>
                                            <td><h5>85% <i class="fa fa-level-up"></i></h5></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">2</th>
                                            <td>Aliquam</td>
                                            <td><span class="label label-warning">New</span></td>
                                            <td><h5>35% <i class="fa fa-level-up"></i></h5></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">3</th>
                                            <td>Lorem ipsum</td>
                                            <td><span class="label label-danger">Overdue</span></td>
                                            <td><h5 class="down">40% <i class="fa fa-level-down"></i></h5></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">4</th>
                                            <td>Aliquam</td>
                                            <td><span class="label label-info">Out of stock</span></td>
                                            <td><h5>100% <i class="fa fa-level-up"></i></h5></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">5</th>
                                            <td>Lorem ipsum</td>
                                            <td><span class="label label-success">In progress</span></td>
                                            <td><h5 class="down">10% <i class="fa fa-level-down"></i></h5></td>
                                        </tr>
                                        <tr>
                                            <th scope="row">6</th>
                                            <td>Aliquam</td>
                                            <td><span class="label label-warning">New</span></td>
                                            <td><h5>38% <i class="fa fa-level-up"></i></h5></td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>-->
                        <div class="clearfix"> </div>
                    </div>
                </section>
                <!-- footer -->
                <jsp:include page="footeradmin.jsp" flush="true"/>
                <!-- / footer -->
            </section>
            <!--main content end-->
        </section>
        <jsp:include page="jsadmin.jsp" flush="true"/>
        <!-- morris JavaScript -->    
        <script>
                        //thử chạ đi 
                        //có jquẻy chưa
//                var giaban = document.getElementsByClassName("soluong");
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
    </body>
</html> 
