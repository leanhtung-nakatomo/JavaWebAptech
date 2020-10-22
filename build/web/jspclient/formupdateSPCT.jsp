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
                                <h1>Cập nhật thông tin sản phẩm</h1>
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

                            <div class="col-md-12">
                                <!-- general form elements disabled -->
                                <div class="card card-warning">
                                    <div class="card-header">
                                        <h3 class="card-title">Cập nhật thông tin sản phẩm</h3>
                                    </div>
                                    <!-- /.card-header -->



                                    <div class="card-body">

                                        <form:form action="UpdateSPCT.htm" method="post" modelAttribute="c" enctype="multipart/form-data">
                                            <div class="row">
                                                <div class="col-sm-6">
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
                                                        <form:select path="maKichThuoc.maKichThuoc">
                                                            <c:forEach items="${allkichthuoc}" var="kichthuoc">
                                                                <form:option value="${kichthuoc.maKichThuoc}">${kichthuoc.tenKichThuoc} mm</form:option>
                                                            </c:forEach>
                                                        </form:select>
                                                    </div>

                                                </div>




                                                <div class="col-sm-3">
                                                    <div class="form-group">
                                                        <label>Màu sắc:</label>                                
                                       
                                                        <form:select path="maMauSac.maMauSac">
                                                            <c:forEach items="${allmausac}" var="mausac">
                                                                <form:option value="${mausac.maMauSac}">${mausac.tenMauSac}</form:option>
                                                            </c:forEach>
                                                        </form:select>

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
                                            </div>            
                                                    <p>Hình ảnh cũ của sản phẩm : ${c.imageSP}</p>    
                                                <label class="col-form-label">Hình ảnh</label>
                                                <form:input type="file" path="imageSP" />                                        
                                            <div class="form-group">
                                                <input type="submit" value="Thêm"/>
                                                <input type="reset" value="Xóa"/>                                    
                                            </div>

                                        </form:form>
                                    </div>
                                    <!-- /.card-body -->
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

