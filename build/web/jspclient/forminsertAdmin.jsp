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
                                                                                                                                                                                                          
                                       
                                        <form:form action="processadmin.htm" modelAttribute="account">                                         
                                            <div class="col-sm-5">
                                                <!-- text input -->
                                                <div class="form-group">
                                                    <label>Tài khoản admin:</label>
                                                    <form:select path="tenDN">
                                                        <c:forEach items="${list}" var="c">
                                                            <form:option value="${c.tenDN}">${c.tenDN}-${c.email}</form:option>
                                                        </c:forEach>
                                                    </form:select>


                                                </div>
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
                                                    <th>Tên tài khoản</th>
                                                    <th>Email</th>
                                                    <th>Địa chỉ</th>
                                                    <th>Số điện thoại</th>
                                                    
                                                </tr>
                                            </thead>
                                            <tbody>                                                                                 
                                                <c:forEach items="${listadmin}" var="c" varStatus="m">
                                                <tr>
                                                    <td>${m.count}</td>
                                                   
                                                    <td>${c.tenDN}</td>
                                                    <td>${c.email}</td>
                                                    <td>${c.queQuan}</td>
                                                   
                                                    <td>${c.sdt}</td>                   
                                                    
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

