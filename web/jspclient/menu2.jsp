<%-- 
    Document   : menu
    Created on : May 11, 2020, 11:05:34 AM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <!--    <a href="/NewAdmin/resources/index3.html" class="brand-link">
          <img src="/NewAdmin/resources/dist/img/AdminLTELogo.png"
               alt="AdminLTE Logo"
               class="brand-image img-circle elevation-3"
               style="opacity: .8">
          <span class="brand-text font-weight-light">AdminLTE 3</span>
        </a>-->

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Sidebar user (optional) -->
        <div class="user-panel mt-3 pb-3 mb-3 d-flex">
            <!--        <div class="image">
                      <img src="/DuAnJAVAWeb/resourceadmin2/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
                    </div>-->
            <div class="info">
                <a href="listadmin.htm" class="d-block">ADMIN - ${login.tenDN}</a>
            </div>
        </div>

        <!-- Sidebar Menu -->
        <nav class="mt-2">
            <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">

                <li class="nav-item has-treeview menu-open">
                    <a href="#" class="nav-link active">
                        <i class="nav-icon fas fa-edit"></i>
                        <p>
                            Forms thêm mới 
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="preInsertSPCT.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới sản phẩm chi tiết</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preInsertSP.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới sản phẩm</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preInsertSize.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới kích cỡ sản phẩm</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preInsertColor.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới màu sắc sản phẩm</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preInsertDM.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới danh mục</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preInsertNSX1.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới nhà sản xuất</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preinsertimageSP.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới hình ảnh sản phẩm</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="preinsertImagefrontend.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới hình ảnh frontend</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="insertadmin.htm" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>Thêm mới quyền admin</p>
                            </a>
                        </li>
                    </ul>
                </li>

                <li class="nav-item has-treeview">
                    <a href="#" class="nav-link">
                        <i class="nav-icon fas fa-table"></i>
                        <p>
                            Thông tin 
                            <i class="fas fa-angle-left right"></i>
                        </p>
                    </a>
                    <ul class="nav nav-treeview">
                        <li class="nav-item">
                            <a href="/DuAnJAVAWeb/resourceadmin2/tables/simple.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>List sản phẩm</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/DuAnJAVAWeb/resourceadmin2/tables/data.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>DataTables</p>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a href="/DuAnJAVAWeb/resourceadmin2/tables/jsgrid.html" class="nav-link">
                                <i class="far fa-circle nav-icon"></i>
                                <p>jsGrid</p>
                            </a>
                        </li>
                    </ul>
                </li><!--
      
                  </ul>
                </li>
                <li class="nav-item has-treeview">
                  <a href="#" class="nav-link">
                    <i class="nav-icon fas fa-table"></i>
                    <p>
                      Thông tin 
                      <i class="fas fa-angle-left right"></i>
                    </p>
                  </a>
                  <ul class="nav nav-treeview">
                    <li class="nav-item">
                      <a href="/DuAnJAVAWeb/resourceadmin2/tables/simple.html" class="nav-link">
                        <i class="far fa-circle nav-icon"></i>
                        <p>List sản phẩm</p>
                      </a>
                    </li>
                    <li class="nav-item">
                      <a href="/DuAnJAVAWeb/resourceadmin2/tables/data.html" class="nav-link">
                        <i class="far fa-circle nav-icon"></i>
                        <p>DataTables</p>
                      </a>
                    </li>
                    <li class="nav-item">
                      <a href="/DuAnJAVAWeb/resourceadmin2/tables/jsgrid.html" class="nav-link">
                        <i class="far fa-circle nav-icon"></i>
                        <p>jsGrid</p>
                      </a>
                    </li>
                  </ul>
                </li>
                <!--          <li class="nav-header">EXAMPLES</li>
                          <li class="nav-item">
                            <a href="/NewAdmin/resources/calendar.html" class="nav-link">
                              <i class="nav-icon far fa-calendar-alt"></i>
                              <p>
                                Calendar
                                <span class="badge badge-info right">2</span>
                              </p>
                            </a>
                          </li>
                          <li class="nav-item">
                            <a href="/NewAdmin/resources/gallery.html" class="nav-link">
                              <i class="nav-icon far fa-image"></i>
                              <p>
                                Gallery
                              </p>
                            </a>
                          </li>
                          <li class="nav-item has-treeview">
                            <a href="#" class="nav-link">
                              <i class="nav-icon far fa-envelope"></i>
                              <p>
                                Mailbox
                                <i class="fas fa-angle-left right"></i>
                              </p>
                            </a>
                            <ul class="nav nav-treeview">
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/mailbox/mailbox.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Inbox</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/mailbox/compose.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Compose</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/mailbox/read-mail.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Read</p>
                                </a>
                              </li>
                            </ul>
                          </li>
                          <li class="nav-item has-treeview">
                            <a href="#" class="nav-link">
                              <i class="nav-icon fas fa-book"></i>
                              <p>
                                Pages
                                <i class="fas fa-angle-left right"></i>
                              </p>
                            </a>
                            <ul class="nav nav-treeview">
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/invoice.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Invoice</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/profile.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Profile</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/e-commerce.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>E-commerce</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/projects.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Projects</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/project-add.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Project Add</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/project-edit.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Project Edit</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/project-detail.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Project Detail</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/contacts.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Contacts</p>
                                </a>
                              </li>
                            </ul>
                          </li>-->
                <!--          <li class="nav-item has-treeview">
                            <a href="#" class="nav-link">
                              <i class="nav-icon far fa-plus-square"></i>
                              <p>
                                Extras
                                <i class="fas fa-angle-left right"></i>
                              </p>
                            </a>
                            <ul class="nav nav-treeview">
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/login.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Login</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/register.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Register</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/forgot-password.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Forgot Password</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/recover-password.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Recover Password</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/lockscreen.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Lockscreen</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/legacy-user-menu.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Legacy User Menu</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/language-menu.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Language Menu</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/404.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Error 404</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/500.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Error 500</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/pace.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Pace</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/examples/blank.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Blank Page</p>
                                </a>
                              </li>
                              <li class="nav-item">
                                <a href="/NewAdmin/resources/starter.html" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Starter Page</p>
                                </a>
                              </li>
                            </ul>
                          </li>-->
                <!--          <li class="nav-header">MISCELLANEOUS</li>
                          <li class="nav-item">
                            <a href="https://adminlte.io/docs/3.0" class="nav-link">
                              <i class="nav-icon fas fa-file"></i>
                              <p>Documentation</p>
                            </a>
                          </li>
                          <li class="nav-header">MULTI LEVEL EXAMPLE</li>
                          <li class="nav-item">
                            <a href="#" class="nav-link">
                              <i class="fas fa-circle nav-icon"></i>
                              <p>Level 1</p>
                            </a>
                          </li>
                          <li class="nav-item has-treeview">
                            <a href="#" class="nav-link">
                              <i class="nav-icon fas fa-circle"></i>
                              <p>
                                Level 1
                                <i class="right fas fa-angle-left"></i>
                              </p>
                            </a>
                            <ul class="nav nav-treeview">
                              <li class="nav-item">
                                <a href="#" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Level 2</p>
                                </a>
                              </li>
                              <li class="nav-item has-treeview">
                                <a href="#" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>
                                    Level 2
                                    <i class="right fas fa-angle-left"></i>
                                  </p>
                                </a>
                                <ul class="nav nav-treeview">
                                  <li class="nav-item">
                                    <a href="#" class="nav-link">
                                      <i class="far fa-dot-circle nav-icon"></i>
                                      <p>Level 3</p>
                                    </a>
                                  </li>
                                  <li class="nav-item">
                                    <a href="#" class="nav-link">
                                      <i class="far fa-dot-circle nav-icon"></i>
                                      <p>Level 3</p>
                                    </a>
                                  </li>
                                  <li class="nav-item">
                                    <a href="#" class="nav-link">
                                      <i class="far fa-dot-circle nav-icon"></i>
                                      <p>Level 3</p>
                                    </a>
                                  </li>
                                </ul>
                              </li>
                              <li class="nav-item">
                                <a href="#" class="nav-link">
                                  <i class="far fa-circle nav-icon"></i>
                                  <p>Level 2</p>
                                </a>
                              </li>
                            </ul>
                          </li>
                          <li class="nav-item">
                            <a href="#" class="nav-link">
                              <i class="fas fa-circle nav-icon"></i>
                              <p>Level 1</p>
                            </a>
                          </li>
                          <li class="nav-header">LABELS</li>
                          <li class="nav-item">
                            <a href="#" class="nav-link">
                              <i class="nav-icon far fa-circle text-danger"></i>
                              <p class="text">Important</p>
                            </a>
                          </li>
                          <li class="nav-item">
                            <a href="#" class="nav-link">
                              <i class="nav-icon far fa-circle text-warning"></i>
                              <p>Warning</p>
                            </a>
                          </li>
                          <li class="nav-item">
                            <a href="#" class="nav-link">
                              <i class="nav-icon far fa-circle text-info"></i>
                              <p>Informational</p>
                            </a>
                          </li>-->
            </ul>
        </nav>
        <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
</aside>
