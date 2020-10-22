<%-- 
    Document   : home
    Created on : May 11, 2020, 11:04:26 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="mytag" uri="/WEB-INF/tlds/newtag_library" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Thêm mới sản phẩm</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!-- Font Awesome -->
        <jsp:include flush="true" page="css2.jsp"/>
        <style>
            .column_2{
    -webkit-column-count: 2; /* Chrome, Safari, Opera */
    -moz-column-count: 2; /* Firefox */
    column-count: 2;
}
        </style>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <!-- Navbar -->
            <jsp:include flush="true" page="header2.jsp"/>
            <!-- /.navbar -->

            <!-- Main Sidebar Container -->
            <jsp:include flush="true" page="menu2.jsp"/>
            <h2 id="status" style="color:red" hidden>${status}</h2>
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <div class="container-fluid">
                        <div class="row mb-2">
                            <div class="col-sm-6">
                                <h1>Thêm mới sản phẩm</h1>
                            </div>
                            
                        </div>
                    </div><!-- /.container-fluid -->
                </section>
                
                <!-- Main content -->
                
                <section class="content">
                    <div class="container-fluid">
                        <div class="row">
                            <!-- left column -->

                            <!--/.col (left) -->
                            <!-- right column -->

                            <div class="col-md-3">
                                <!-- general form elements disabled -->
                                <div class="card card-warning">
                                    <div class="card-header">
                                        <h3 class="card-title">Thêm mới sản phẩm</h3>
                                    </div>
                                    <!-- /.card-header -->



                                    <div class="card-body">

                                        <form:form action="InsertSPCT.htm" method="post" modelAttribute="c" >
                                            <div class="row">
                                                <div class="col-sm-5">
                                                    <!-- text input -->
                                                    <div class="form-group">
                                                        <label>Tên sản phẩm:</label>

                                                        <form:select path="maSP.maSP">
                                                            <c:forEach items="${allsanpham}" var="s">

                                                                <form:option value="${s.maSP}">${s.tenSP}</form:option> 

                                                            </c:forEach>
                                                        </form:select>


                                                    </div>
                                                </div>
                                                
                                                <div class="col-sm-3">    
                                                    <div class="form-group">
                                                        <label>Kích thước</label>                                                       
                                                        <c:forEach items="${allkichthuoc}" var="kichthuoc" varStatus="m">
                                                             <p>Size${m.count}</p>
                                                                <label><input type="checkbox" name="Size${m.count}" value="${kichthuoc.maKichThuoc}">${kichthuoc.tenKichThuoc} mm</label> 
                                                        </c:forEach>
                                                    </div>
                                                </div>



                                                
                                                <div class="col-sm-4">
                                                    <div class="form-group">
                                                        <label>Màu sắc:</label>                                                                                                                         
                                                        <c:forEach items="${allmausac}" var="mausac" varStatus="c">
                                                            <p>Color${c.count}</p>
                                                                <label><input type="checkbox" name="Color${c.count}" value="${mausac.maMauSac}"> ${mausac.tenMauSac}</label> 
                                                        </c:forEach>                                                     
                                                    </div>
                                                </div>

                                            </div>
                                            

                                          

                                            <div class="form-group">
                                                <label class="col-form-label">Số lượng</label>
                                                <form:input class="form-control is-valid" path="soLuong" placeholder="Số lượng ..."/> 
                                            </div>

                                            <div class="form-group">
                                                <label class="col-form-label">Giá gốc</label>
                                                <form:input class="form-control is-valid" path="giaGoc" placeholder="Giá gốc ..."/> 
                                            </div>

                                            <div class="form-group">
                                                <label class="col-form-label">Giá khuyến mãi</label>
                                                <form:input class="form-control is-valid" path="giaKM" placeholder="Giá ..."/> 
                                            </div>

                                            <div class="row">
                                                <div class="col-sm-6">
                                                    <!-- checkbox -->
                                                    <label class="col-form-label">Ghi chú</label>
                                                    <div class="form-group">
                                                        <form:textarea class="form-control" rows="5" path="ghiChu"/>
                                                    </div>
                                                </div> 
                                                <div class="col-sm-6">

                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="col-form-label">Hình ảnh</label>
                                                <form:input type="file" path="imageSP"/>
                                            </div>

                                            <div class="form-group">
                                                <input type="submit" value="Thêm"/>
                                                <input type="reset" value="Xóa"/>                                    
                                            </div>

                                        </form:form>
                                    </div>
                                    <!-- /.card-body -->
                                </div>

                            </div>
                            <div class="col-md-9">
                                <div class="container">
                                    <div class="table-wrapper">
                                        <div class="table-title">
                                            <div class="row">
                                                <div class="col-sm-4">
                                                    <div class="card-header card card-info">
                                                        <h3 class="card-title">Thông tin sản phẩm</h3>
                                                    </div>
                                                </div>
<!--                                                <div class="col-sm-8">
                                                    <div class="search-box">

                                                        <input type="text" class="form-control" placeholder="Tìm kiếm sản phẩm">
                                                    </div>
                                                </div>-->
                                            </div>
                                        </div>
                                        <table class="table table-striped table-hover table-bordered">
                                            <thead>
                                                <tr>
                                                    <th>STT</th>
                                                    <th>Hình ảnh</th>
                                                    <th>Tên sản phẩm </th>
                                                    <th>Màu sắc</th>
                                                    <th>Kích thước</th>
                                                    <th>Số lượng</th>
                                                    <th>Giá gốc</th>    
                                                    <th>Giá khuyến mại</th>
                                                    <th>Trạng thái</th>
                                                    <th></th>
                                                </tr>
                                            </thead>
                                            <tbody>                                                                                 
                                                <c:forEach items="${listtable}" var="c" varStatus="m">
                                                <tr>
                                                    <td>${m.count}</td>
                                                    <td>
                                                        <img src="/DuAnJAVAWeb/jspadmin/resources/images/${c.imageSP}" width="100" height="100"/>
                                                    </td>
                                                    <td>${c.maSP.tenSP}</td>
                                                    <td>${c.maMauSac.tenMauSac}</td>
                                                    <td>${c.maKichThuoc.tenKichThuoc}</td>
                                                    <td>${c.soLuong}</td>
                                                    <td>${c.giaGoc}</td>
                                                    <td>${c.giaKM}</td>  
                                                    <td>${c.ghiChu}</td>  
                                                    <td>
                                                        <a href="PreUpdateSPCT.htm?id=${c.maSPCT}" class="edit" title="Edit" data-toggle="tooltip" ><i class="material-icons">&#xE254;</i></a>
                                                        <a href="deleteSPCT.htm?id=${c.maSPCT}" class="delete" title="Delete" data-toggle="tooltip" ><i class="material-icons">&#xE872;</i></a>
                                                    </td>
                                                    
                                                </tr> 
                                                </c:forEach>
                                            </tbody>
                                            <%--<mytag:Paganition offset="${offset}" maxResult="5" uri="SPCTlist.htm" totalRecord="${total}" next="&raquo;" previous="&laquo;"></mytag:Paganition>--%>
                                        </table>
                                        
                                    </div>
                                </div>     

                            </div>

                        </div><!-- /.container-fluid -->
                </section>

                <a id="back-to-top" href="#" class="btn btn-primary back-to-top" role="button" aria-label="Scroll to top">
                    <i class="fas fa-chevron-up"></i>
                </a>
            </div>
            <!-- /.content-wrapper -->

            <jsp:include flush="true" page="footer2.jsp"/>

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Control sidebar content goes here -->
            </aside>
            <!-- /.control-sidebar -->
        </div>
        <!-- ./wrapper -->
        <script>
            var status = document.getElementById("status").innerHTML;
                if(status.length>0){
                     alert(status);
                }
        </script>
        <!-- jQuery -->
        <jsp:include flush="true" page="js2.jsp"/>
    </body>
</html>

