/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.43
 * Generated at: 2019-12-19 13:29:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/WEB-INF/jsp/user/../common/link.jsp", Long.valueOf(1574778172000L));
    _jspx_dependants.put("jar:file:/C:/Tools/apache-tomcat-8.5.43/webapps/ROOT/WEB-INF/lib/standard-1.1.2.jar!/META-INF/fn.tld", Long.valueOf(1098682290000L));
    _jspx_dependants.put("/WEB-INF/jsp/user/../common/header.jsp", Long.valueOf(1576330684000L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1574084526000L));
    _jspx_dependants.put("jar:file:/C:/Tools/apache-tomcat-8.5.43/webapps/ROOT/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098682290000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fn_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fn_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fn_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>注册</title>\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <meta name=\"keywords\" content=\"fly,layui,前端社区\">\r\n");
      out.write("  <meta name=\"description\" content=\"Fly社区是模块化前端UI框架Layui的官网社区，致力于为web开发提供强劲动力\">\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- fly基础样式 -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/layui/css/layui.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/css/global.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"fly-header layui-bg-black\">\r\n");
      out.write("  <div class=\"layui-container\">\r\n");
      out.write("    <a class=\"fly-logo\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">\r\n");
      out.write("      <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/images/logo.png\" alt=\"layui\">\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"layui-nav fly-nav layui-hide-xs\">\r\n");
      out.write("\r\n");
      out.write("    </ul>\r\n");
      out.write("    \r\n");
      out.write("    <ul class=\"layui-nav fly-nav-user\">\r\n");
      out.write("      \r\n");
      out.write("      <!-- 未登入的状态 -->\r\n");
      out.write("\t\t");
      if (_jspx_meth_n_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      <!-- 登入后的状态 -->\r\n");
      out.write("\t   ");
      if (_jspx_meth_n_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </ul>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-container fly-marginTop\">\r\n");
      out.write("  <div class=\"fly-panel fly-panel-user\" pad20>\r\n");
      out.write("    <div class=\"layui-tab layui-tab-brief\" lay-filter=\"user\">\r\n");
      out.write("      <ul class=\"layui-tab-title\">\r\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\">登入</a></li>\r\n");
      out.write("        <li class=\"layui-this\">注册</li>\r\n");
      out.write("      </ul>\r\n");
      out.write("      <div class=\"layui-form layui-tab-content\" id=\"LAY_ucm\" style=\"padding: 20px 0;\">\r\n");
      out.write("        <div class=\"layui-tab-item layui-show\">\r\n");
      out.write("          <div class=\"layui-form layui-form-pane\">\r\n");
      out.write("            <form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reg\" onsubmit=\"return regist()\">\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_username\" class=\"layui-form-label\">账号</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_username\" name=\"username\" required  autocomplete=\"off\" class=\"layui-input\" onblur=\"testusername()\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid layui-word-aux\" id=\"usernameresultdiv\">将会成为您的登入名</div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_email\" class=\"layui-form-label\">邮箱</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_email\" name=\"email\"  required lay-verify=\"email\" autocomplete=\"off\" class=\"layui-input\" onblur=\"testemail()\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 添加邮箱验证 -->\r\n");
      out.write("                <div class=\"layui-form-mid layui-word-aux\" id=\"resultdiv\">例：daniu@163.com</div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_username\" class=\"layui-form-label\">昵称</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_nick_name\" name=\"nick_name\" required lay-verify=\"required\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_pass\" class=\"layui-form-label\">密码</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"password\" id=\"L_pass\" name=\"pass\"  lay-verify=\"required\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid layui-word-aux\">6到16个字符</div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_repass\" class=\"layui-form-label\">确认密码</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"password\" id=\"L_repass\" name=\"repass\" required lay-verify=\"required\" autocomplete=\"off\" class=\"layui-input\" onblur=\"testpassword()\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid layui-word-aux\" id=\"passwordresultdiv\">密码状态</div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("                <label for=\"L_vercode\" class=\"layui-form-label\">人类验证</label>\r\n");
      out.write("                <div class=\"layui-input-inline\">\r\n");
      out.write("                  <input type=\"text\" id=\"L_vercode\" name=\"vercode\" required lay-verify=\"required\" placeholder=\"请回答后面的问题\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"layui-form-mid\">\r\n");
      out.write("         \r\n");
      out.write("                   <span style=\"color: #c00;\">验证码</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item\">\r\n");
      out.write("              <button type=\"submit\" class=\"layui-btn\" onclick=\"addcustomer()\">立即注册</button>\r\n");
      out.write("                <!-- <input type=\"button\" class=\"layui-btn\" lay-filter=\"*\"  onclick=\"addcustomer()\" value=\"立即注册\" /> -->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"layui-form-item fly-form-app\">\r\n");
      out.write("                <span>或者直接使用社交账号快捷注册</span>\r\n");
      out.write("                <a href=\"\" onclick=\"layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})\" class=\"iconfont icon-qq\" title=\"QQ登入\"></a>\r\n");
      out.write("                <a href=\"\" onclick=\"layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})\" class=\"iconfont icon-weibo\" title=\"微博登入\"></a>\r\n");
      out.write("              </div>\r\n");
      out.write("              <input type=\"hidden\" name=\"action\" value=\"regist\">\r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"fly-footer\">\r\n");
      out.write("  <p><a href=\"http://fly.layui.com/\" target=\"_blank\">Fly社区</a> 2017 &copy; <a href=\"http://www.layui.com/\" target=\"_blank\">layui.com 出品</a></p>\r\n");
      out.write("  <p>\r\n");
      out.write("    <a href=\"http://fly.layui.com/jie/3147/\" target=\"_blank\">付费计划</a>\r\n");
      out.write("    <a href=\"http://www.layui.com/template/fly/\" target=\"_blank\">获取Fly社区模版</a>\r\n");
      out.write("    <a href=\"http://fly.layui.com/jie/2461/\" target=\"_blank\">微信公众号</a>\r\n");
      out.write("  </p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/layui/layui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("layui.cache.page = 'user';\r\n");
      out.write("layui.cache.user = {\r\n");
      out.write("  username: '游客'\r\n");
      out.write("  ,uid: -1\r\n");
      out.write("  ,avatar: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/images/avatar/00.jpg'\r\n");
      out.write("  ,experience: 83\r\n");
      out.write("  ,sex: '男'\r\n");
      out.write("};\r\n");
      out.write("layui.config({\r\n");
      out.write("  version: \"3.0.0\"\r\n");
      out.write("  ,base: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/mods/'\r\n");
      out.write("}).extend({\r\n");
      out.write("  fly: 'index'\r\n");
      out.write("}).use('fly');\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/res/js/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t/* 验证用户名 */\r\n");
      out.write("\tfunction testusername(){\r\n");
      out.write("\t\tvar username = $(\"#L_username\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/testusername\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\tusername:username\r\n");
      out.write("\t\t\t},success:function(result){\r\n");
      out.write("\t\t\t\tif(result == \"OK\"){\r\n");
      out.write("\t\t\t\t\tmsg = \"OK\".fontcolor(\"green\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t}else if(result == \"NO\"){\r\n");
      out.write("\t\t\t\t\tmsg = \"用户名已被占用\".fontcolor(\"red\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t$(\"#usernameresultdiv\").html(msg);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* 验证邮箱格式 */\r\n");
      out.write("\tfunction testemail(){\r\n");
      out.write("\t\tvar email = $(\"#L_email\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/testemail\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\temail:email\r\n");
      out.write("\t\t\t\t},success:function(result){\r\n");
      out.write("\t\t\t\t\tif(result == \"NO\"){\r\n");
      out.write("\t\t\t\t\t\tmsg = \"邮箱不可用，已被注册\".fontcolor(\"red\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t\t}else if(result == \"NO@\"){\r\n");
      out.write("\t\t\t\t\t\tmsg = \"邮箱格式不正确\".fontcolor(\"red\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t\t}else if(result == \"more@\"){\r\n");
      out.write("\t\t\t\t\t\tmsg = \"邮箱格式不正确\".fontcolor(\"red\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t\t}else if(result == \"typeerror\"){\r\n");
      out.write("\t\t\t\t\t\tmsg = \"邮箱格式不正确\".fontcolor(\"red\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t\t}else if(result == \"error\"){\r\n");
      out.write("\t\t\t\t\t\tmsg = \"邮箱地址包含敏感字符\".fontcolor(\"red\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t\t}else {\r\n");
      out.write("\t\t\t\t\t\tmsg = \"OK\".fontcolor(\"green\").fontsize(\"1px\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t$(\"#resultdiv\").html(msg);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t/* 验证两次密码是否一致 */\r\n");
      out.write("\tfunction testpassword(){\r\n");
      out.write("\t\tvar password = $(\"#L_pass\").val(); \r\n");
      out.write("\t\tvar password2 = $(\"#L_repass\").val();\r\n");
      out.write("\t\tif(password != \"\" && password2 != \"\" && password == password2){\r\n");
      out.write("\t\t\tmsg = \"OK\".fontcolor(\"green\").fontsize(\"1px\");\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\tmsg = \"两次密码不一致\".fontcolor(\"red\").fontsize(\"1px\"); \r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(\"#passwordresultdiv\").html(msg);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction addcustomer(){\r\n");
      out.write("\t\tvar username = $(\"#L_username\").val();\r\n");
      out.write("\t\tvar nick_name = $(\"#L_nick_name\").val();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar email = $(\"#L_email\").val();\r\n");
      out.write("\t\t/* var password = $(\"pass\").val(); */\r\n");
      out.write("\t\tvar password = $(\"#L_repass\").val();\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/reg2\",\r\n");
      out.write("\t\t\ttype:\"post\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\tusername:username,\r\n");
      out.write("\t\t\t\temail:email,\r\n");
      out.write("\t\t\t\tpassword:password,\r\n");
      out.write("\t\t\t\tnick_name:nick_name\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t/* 验证重复性 */\r\n");
      out.write("\tfunction regist(){\r\n");
      out.write("\t\tvar resultdiv = $(\"#resultdiv\");\r\n");
      out.write("\t\tvar usernameresultdiv = $(\"#usernameresultdiv\");\r\n");
      out.write("\t\tif(usernameresultdiv.test() != \"OK\"){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(passwordresultdiv.ext() != \"OK\"){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}else if(resultdiv.text() != \"OK\"){\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t}\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_n_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  n:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_n_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fn_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_n_005fif_005f0_reused = false;
    try {
      _jspx_th_n_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_n_005fif_005f0.setParent(null);
      // /WEB-INF/jsp/user/../common/header.jsp(26,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_n_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer2 == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_n_005fif_005f0 = _jspx_th_n_005fif_005f0.doStartTag();
      if (_jspx_eval_n_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t      <li class=\"layui-nav-item\">\r\n");
          out.write("\t        <a class=\"iconfont icon-touxiang layui-hide-xs\" href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/login\"></a>\r\n");
          out.write("\t      </li>\r\n");
          out.write("\t      <li class=\"layui-nav-item\">\r\n");
          out.write("\t        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/login\">登入</a>\r\n");
          out.write("\t      </li>\r\n");
          out.write("\t      <li class=\"layui-nav-item\">\r\n");
          out.write("\t        <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/reg\">注册</a>\r\n");
          out.write("\t      </li>\r\n");
          out.write("\t      <li class=\"layui-nav-item layui-hide-xs\">\r\n");
          out.write("\t        <a href=\"\" onclick=\"layer.msg('正在通过QQ登入', {icon:16, shade: 0.1, time:0})\" title=\"QQ登入\" class=\"iconfont icon-qq\"></a>\r\n");
          out.write("\t      </li>\r\n");
          out.write("\t      <li class=\"layui-nav-item layui-hide-xs\">\r\n");
          out.write("\t        <a href=\"\" onclick=\"layer.msg('正在通过微博登入', {icon:16, shade: 0.1, time:0})\" title=\"微博登入\" class=\"iconfont icon-weibo\"></a>\r\n");
          out.write("\t      </li>\r\n");
          out.write("\t   ");
          int evalDoAfterBody = _jspx_th_n_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_n_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fn_005fif_0026_005ftest.reuse(_jspx_th_n_005fif_005f0);
      _jspx_th_n_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_n_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_n_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_n_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  n:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_n_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fn_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_n_005fif_005f1_reused = false;
    try {
      _jspx_th_n_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_n_005fif_005f1.setParent(null);
      // /WEB-INF/jsp/user/../common/header.jsp(44,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_n_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer2 != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_n_005fif_005f1 = _jspx_th_n_005fif_005f1.doStartTag();
      if (_jspx_eval_n_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t      <li class=\"layui-nav-item\">\r\n");
          out.write("\t        <a class=\"fly-nav-avatar\" href=\"javascript:;\">\r\n");
          out.write("\t          <cite class=\"layui-hide-xs\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer2.nick_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</cite>\r\n");
          out.write("\t          <i class=\"iconfont icon-renzheng layui-hide-xs\" title=\"认证信息：layui 作者\"></i>\r\n");
          out.write("\t          <i class=\"layui-badge fly-badge-vip layui-hide-xs\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.level.level_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</i>\r\n");
          out.write("\t             <!-- 头像 Start -->   \r\n");
          out.write("\t                ");
          if (_jspx_meth_fx_005fif_005f0(_jspx_th_n_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t                ");
          if (_jspx_meth_fx_005fif_005f1(_jspx_th_n_005fif_005f1, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t              <!-- 头像 End -->   \r\n");
          out.write("\t        </a>\r\n");
          out.write("\t        <dl class=\"layui-nav-child\">\r\n");
          out.write("\t          <dd><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/set\"><i class=\"layui-icon\">&#xe620;</i>基本设置</a></dd>\r\n");
          out.write("\t          <dd><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/message\"><i class=\"iconfont icon-tongzhi\" style=\"top: 4px;\"></i>我的消息</a></dd>\r\n");
          out.write("\t          <dd><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/home\"><i class=\"layui-icon\" style=\"margin-left: 2px; font-size: 22px;\">&#xe68e;</i>我的主页</a></dd>\r\n");
          out.write("\t          <hr style=\"margin: 5px 0;\">\r\n");
          out.write("\t          <dd><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/logout\" style=\"text-align: center;\">退出</a></dd>\r\n");
          out.write("\t        </dl>\r\n");
          out.write("\t      </li>\r\n");
          out.write("\t    ");
          int evalDoAfterBody = _jspx_th_n_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_n_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fn_005fif_0026_005ftest.reuse(_jspx_th_n_005fif_005f1);
      _jspx_th_n_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_n_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_n_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fx_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_n_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fx:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fx_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_fx_005fif_005f0_reused = false;
    try {
      _jspx_th_fx_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fx_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_n_005fif_005f1);
      // /WEB-INF/jsp/user/../common/header.jsp(51,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fx_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgpath == ''|| imgpath == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_fx_005fif_005f0 = _jspx_th_fx_005fif_005f0.doStartTag();
      if (_jspx_eval_fx_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                \t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/res/avatar/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${customer2.avatar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t                ");
          int evalDoAfterBody = _jspx_th_fx_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_fx_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest.reuse(_jspx_th_fx_005fif_005f0);
      _jspx_th_fx_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fx_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_fx_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_fx_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_n_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fx:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_fx_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_fx_005fif_005f1_reused = false;
    try {
      _jspx_th_fx_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_fx_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_n_005fif_005f1);
      // /WEB-INF/jsp/user/../common/header.jsp(54,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fx_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgpath == customer2.avatar}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_fx_005fif_005f1 = _jspx_th_fx_005fif_005f1.doStartTag();
      if (_jspx_eval_fx_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                \t<img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/res/avatar/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${imgpath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("\t                ");
          int evalDoAfterBody = _jspx_th_fx_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_fx_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffx_005fif_0026_005ftest.reuse(_jspx_th_fx_005fif_005f1);
      _jspx_th_fx_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fx_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_fx_005fif_005f1_reused);
    }
    return false;
  }
}
