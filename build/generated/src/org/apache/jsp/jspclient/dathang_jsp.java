package org.apache.jsp.jspclient;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dathang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_modelAttribute_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_placeholder_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_rows_path_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_modelAttribute_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_placeholder_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_rows_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_form_form_modelAttribute_action.release();
    _jspx_tagPool_form_input_path_class_nobody.release();
    _jspx_tagPool_form_input_placeholder_path_class_nobody.release();
    _jspx_tagPool_form_textarea_rows_path_class_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Free Smart Store Website Template | Preview :: w3layouts</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "css.jsp", out, true);
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrap\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"header_top\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"list.htm\"><img src=\"/DuAnJAVAWeb/resourceclient/images/logo.png\" alt=\"\" /></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"header_top_right\">\n");
      out.write("                        <div class=\"search_box\">\n");
      out.write("                            <form>\n");
      out.write("                                <input type=\"text\" value=\"Search for Products\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search for Products'; }\"><input type=\"submit\" value=\"SEARCH\">\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"shopping_cart\">\n");
      out.write("                            <div class=\"cart\">\n");
      out.write("                                <a href=\"viewgiohang.htm\" title=\"View my shopping cart\" rel=\"nofollow\">\n");
      out.write("                                    <strong class=\"opencart\"> </strong>\n");
      out.write("                                    <span class=\"cart_title\">Giỏ Hàng</span>\n");
      out.write("                                    <span class=\"no_product\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"login\">\n");
      out.write("                            <span><a href=\"prelogin.htm\"><img src=\"/DuAnJAVAWeb/resourceclient/images/login.png\" alt=\"\" title=\"login\"/></a></span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clear\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"></div>\n");
      out.write("                </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, true);
      out.write("                            \n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <!---728x90--->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${result}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    <div class=\"section group\">\n");
      out.write("                        <div class=\"cont-desc span_1_of_2\">\t\n");
      out.write("\n");
      out.write("                            <h4>Thông tin người nhân hàng</h4>\n");
      out.write("                            ");
      if (_jspx_meth_form_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"rightsidebar span_3_of_1\">\n");
      out.write("                            <h2>Sản phẩm khác</h2>\n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"iphone.htm\">Iphone</a></li>\n");
      out.write("                                <li><a href=\"xiaomi.htm\">Xiaomi</a></li>\n");
      out.write("                                <li><a href=\"samsung.htm\">Samsung</a></li>\t\t\t\t\t\n");
      out.write("                                <li><a href=\"google.htm\">Google</a></li>\n");
      out.write("                                <li><a href=\"huawei.htm\">Huawei</a></li>\n");
      out.write("                                <li><a href=\"sony.htm\">Sony</a></li>\n");
      out.write("                            </ul>\n");
      out.write("<!--                            <div class=\"subscribe\">\n");
      out.write("                                <h2>Newsletters Signup</h2>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod.......</p>\n");
      out.write("                                <div class=\"signup\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <input type=\"text\" value=\"E-mail address\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'E-mail address';\"><input type=\"submit\" value=\"Sign up\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"community-poll\">\n");
      out.write("                                <h2>Community POll</h2>\n");
      out.write("                                <div class=\"poll\">\n");
      out.write("                                    <form>\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li>\n");
      out.write("                                                <input type=\"radio\" name=\"vote\" class=\"radio\" value=\"1\">\n");
      out.write("                                                <span class=\"label\"><label>More convenient shipping and delivery </label></span>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <input type=\"radio\" name=\"vote\" class=\"radio\" value=\"2\">\n");
      out.write("                                                <span class=\"label\"><label for=\"vote_2\">Lower price</label></span>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <input type=\"radio\" name=\"vote\" class=\"radio\"  value=\"3\">\n");
      out.write("                                                <span class=\"label\"><label for=\"vote_3\">Bigger choice</label></span>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <input type=\"radio\" name=\"vote\" class=\"radio\"  value=\"5\">\n");
      out.write("                                                <span class=\"label\"><label for=\"vote_5\">Payments security </label></span>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <input type=\"radio\" name=\"vote\" class=\"radio\" value=\"6\">\n");
      out.write("                                                <span class=\"label\"><label for=\"vote_6\">30-day Money Back Guarantee </label></span>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <input type=\"radio\" name=\"vote\" class=\"radio\" value=\"7\">\n");
      out.write("                                                <span class=\"label\"><label for=\"vote_7\">Other.</label></span>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!---728x90--->\n");
      out.write("        \n");
      out.write("    <script>\n");
      out.write("            var giaban = document.getElementsByClassName(\"dinhdang2\");\n");
      out.write("            var soluong = document.getElementsByClassName(\"dinhdang3\");\n");
      out.write("            for(var i=0;i< giaban.length;i++){\n");
      out.write("                var output = giaban[i].innerHTML;\n");
      out.write("                var output1 = soluong[i].innerHTML;\n");
      out.write("                var outputs = output * output1 ;\n");
      out.write("                var re = \"\";\n");
      out.write("                var d = 0;\n");
      out.write("                for (var j = 0 ; j <= outputs.length -1 ; j++) {\n");
      out.write("                    \n");
      out.write("                    d++;\n");
      out.write("                    re = re + outputs[j];\n");
      out.write("                    if(d%3==0&&j!=(outputs.length -1)){\n");
      out.write("                        re = re +\".\";\n");
      out.write("                    }\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("               \n");
      out.write("                giaban[i].innerHTML =  outputs +\"0 đ\";                           \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("    </script>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jsfooter.jsp", out, true);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_modelAttribute_action.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_0.setPageContext(_jspx_page_context);
    _jspx_th_form_form_0.setParent(null);
    _jspx_th_form_form_0.setAction("ghidonhang.htm");
    _jspx_th_form_form_0.setModelAttribute("dathang");
    int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
      if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("                                <div class=\"row\">\n");
          out.write("                                    <div class=\"col-sm-5 \">                                 \n");
          out.write("                                        <div class=\"form-group\">\n");
          out.write("                                            <label>Họ tên<abbr class=\"required\" title=\"bắt buộc\"> *</abbr></label>\n");
          out.write("                                            ");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                        </div>  \n");
          out.write("                                        <div class=\"form-group\">\n");
          out.write("                                            <label>Địa chỉ giao hàng</label><abbr class=\"required\" title=\"bắt buộc\"> *</abbr>\n");
          out.write("                                            ");
          if (_jspx_meth_form_input_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                        </div>  \n");
          out.write("                                    </div>\n");
          out.write("\n");
          out.write("                                    <div class=\"col-sm-5 \">                                 \n");
          out.write("                                        <div class=\"form-group\">\n");
          out.write("                                            <label>Số điện thoại</label><abbr class=\"required\" title=\"bắt buộc\"> *</abbr>\n");
          out.write("                                            ");
          if (_jspx_meth_form_input_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                        </div>  \n");
          out.write("                                        <div class=\"form-group\">\n");
          out.write("                                            <label>Email</label><abbr class=\"required\" title=\"bắt buộc\"> *</abbr>\n");
          out.write("                                            ");
          if (_jspx_meth_form_input_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("           \n");
          out.write("                                        </div>  \n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                        <div class=\"form-group\">\n");
          out.write("                                            <label for=\"comment\">Ghi chú đơn đặt hàng</label>\n");
          out.write("                                            ");
          if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("                                        </div>        \n");
          out.write("                                <h4>Đơn hàng của bạn</h4>\n");
          out.write("                                <table class=\"table\">\n");
          out.write("\n");
          out.write("                                    <tr>                 \n");
          out.write("                                        <th>STT</th>    \n");
          out.write("                                        <th>&nbsp;</th>\n");
          out.write("                                        <th>Sản phẩm</th>    \n");
          out.write("                                        <th>Số lượng</th>\n");
          out.write("                                        \n");
          out.write("\n");
          out.write("                                    </tr>\n");
          out.write("\n");
          out.write("                                    ");
          if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                                </table>  \n");
          out.write("                                <input class=\"btn btn-primary\" type=\"submit\" value=\"Đặt hàng\"/>\n");
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_0.doFinally();
      _jspx_tagPool_form_form_modelAttribute_action.reuse(_jspx_th_form_form_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_0.setPath("hoTen");
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_path_class_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_1(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_1 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_placeholder_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_1.setPageContext(_jspx_page_context);
    _jspx_th_form_input_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_1.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_1.setDynamicAttribute(null, "placeholder", new String("Address"));
    _jspx_th_form_input_1.setPath("diachigiaohang");
    int[] _jspx_push_body_count_form_input_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_1 = _jspx_th_form_input_1.doStartTag();
      if (_jspx_th_form_input_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_1.doFinally();
      _jspx_tagPool_form_input_placeholder_path_class_nobody.reuse(_jspx_th_form_input_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_2(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_2 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_2.setPageContext(_jspx_page_context);
    _jspx_th_form_input_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_2.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_2.setPath("sdt");
    int[] _jspx_push_body_count_form_input_2 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_2 = _jspx_th_form_input_2.doStartTag();
      if (_jspx_th_form_input_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_2.doFinally();
      _jspx_tagPool_form_input_path_class_nobody.reuse(_jspx_th_form_input_2);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_3(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_3 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_path_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_3.setPageContext(_jspx_page_context);
    _jspx_th_form_input_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_input_3.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_3.setPath("email");
    int[] _jspx_push_body_count_form_input_3 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_3 = _jspx_th_form_input_3.doStartTag();
      if (_jspx_th_form_input_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_3.doFinally();
      _jspx_tagPool_form_input_path_class_nobody.reuse(_jspx_th_form_input_3);
    }
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_rows_path_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_textarea_0.setRows("5");
    _jspx_th_form_textarea_0.setPath("ghiChu");
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_rows_path_class_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("giohang");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        <tr class=\"woocommerce-cart-form__cart-item cart_item\">    \n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m1.count}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            <td>\n");
          out.write("                                                <img src=\"/DuAnJAVAWeb/jspadmin/resources/images/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giohang.maSPCT.imageSP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"20\" height=\"20\"/>\n");
          out.write("                                            </td>\n");
          out.write("                                            <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giohang.maSPCT.maSP.tenSP}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>   \n");
          out.write("                                            <td class=\"dinhdang3\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${giohang.soluong}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                            \n");
          out.write("\n");
          out.write("                                        </tr>\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
