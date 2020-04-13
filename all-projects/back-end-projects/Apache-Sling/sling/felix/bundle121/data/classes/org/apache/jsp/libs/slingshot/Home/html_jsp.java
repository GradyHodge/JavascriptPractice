package org.apache.jsp.libs.slingshot.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.request.ResponseUtil;
import org.apache.sling.sample.slingshot.SlingshotConstants;

public final class html_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.0");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;







      //  sling:defineObjects
      org.apache.sling.scripting.jsp.taglib.DefineObjectsTag _jspx_th_sling_005fdefineObjects_005f0 = (org.apache.sling.scripting.jsp.taglib.DefineObjectsTag) _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.get(org.apache.sling.scripting.jsp.taglib.DefineObjectsTag.class);
      _jspx_th_sling_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sling_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_sling_005fdefineObjects_005f0 = _jspx_th_sling_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_sling_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");


    final ValueMap attributes = resource.getValueMap();
    final String title = ResponseUtil.escapeXml(attributes.get(SlingshotConstants.PROPERTY_TITLE, resource.getName()));

      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <title>Welcome to SlingShot!</title>\n");
      out.write("    ");
      //  sling:include
      org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
      _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sling_005finclude_005f0.setParent(null);
      // /libs/slingshot/Home/html.jsp(31,4) name = resource type = org.apache.sling.api.resource.Resource reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sling_005finclude_005f0.setResource( resource );
      // /libs/slingshot/Home/html.jsp(31,4) name = replaceSelectors type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sling_005finclude_005f0.setReplaceSelectors("head");
      int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
      if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body class=\"login\">\n");
      out.write("    ");

    if ( request.getRemoteUser() != null && !request.getRemoteUser().equals("anonymous") ) {
        
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1 class=\"bg-primary\">Welcome to SlingShot</h1>\n");
      out.write("        <p class=\"bg-primary\">Welcome back, ");
      out.print( request.getRemoteUser() );
      out.write("</p>\n");
      out.write("        <p class=\"bg-warning\"><a href=\"");
      out.print( request.getContextPath() );
      out.print( SlingshotConstants.APP_ROOT_PATH );
      out.write("/users/");
      out.print( request.getRemoteUser() );
      out.write(".html\">Go to your SlingShot home page</a></p>\n");
      out.write("    </div>\n");
      out.write("        ");

    } else {
        
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("      <form class=\"form-signin\" method=\"POST\" action=\"");
      out.print( request.getContextPath() );
      out.print( resource.getPath() );
      out.write(".user.html\" enctype=\"multipart/form-data\" accept-charset=\"UTF-8\">\n");
      out.write("        <input type=\"hidden\" name=\"_charset_\" value=\"UTF-8\" />\n");
      out.write("        <input type=\"hidden\" name=\"resource\" value=\"");
      out.print( request.getContextPath() );
      out.print( resource.getPath() );
      out.write(".user.html\" />\n");
      out.write("        <p class=\"form-signin-heading bg-primary\">Welcome to SlingShot</p>\n");
      out.write("        <label for=\"j_username\" class=\"sr-only\" accesskey=\"u\">Username</label>\n");
      out.write("        <input type=\"text\" id=\"j_username\" class=\"form-control\" placeholder=\"Username\" required autofocus>\n");
      out.write("        <label for=\"j_password\" class=\"sr-only\" accesskey=\"p\">Password</label>\n");
      out.write("        <input type=\"password\" id=\"j_password\" class=\"form-control\" placeholder=\"Password\" required>\n");
      out.write("        <p>\n");
      out.write("        <button class=\"btn btn-lg btn-success btn-block\" type=\"submit\">Go</button>\n");
      out.write("        </p>\n");
      out.write("        <p>\n");
      out.write("        <button class=\"btn btn-primary btn-block form-button-new\" type=\"button\">New Account</button>\n");
      out.write("        <button class=\"btn btn-info btn-block form-button-help\" type=\"button\">Help Me</button>\n");
      out.write("        </p>\n");
      out.write("      </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("        ");

    }
    
      out.write("\n");
      out.write("</body>\n");
      out.write("    ");
      //  sling:include
      org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f1 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
      _jspx_th_sling_005finclude_005f1.setPageContext(_jspx_page_context);
      _jspx_th_sling_005finclude_005f1.setParent(null);
      // /libs/slingshot/Home/html.jsp(70,4) name = resource type = org.apache.sling.api.resource.Resource reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sling_005finclude_005f1.setResource( resource );
      // /libs/slingshot/Home/html.jsp(70,4) name = replaceSelectors type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sling_005finclude_005f1.setReplaceSelectors("bottom");
      int _jspx_eval_sling_005finclude_005f1 = _jspx_th_sling_005finclude_005f1.doStartTag();
      if (_jspx_th_sling_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.reuse(_jspx_th_sling_005finclude_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fsling_005finclude_005fresource_005freplaceSelectors_005fnobody.reuse(_jspx_th_sling_005finclude_005f1);
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
