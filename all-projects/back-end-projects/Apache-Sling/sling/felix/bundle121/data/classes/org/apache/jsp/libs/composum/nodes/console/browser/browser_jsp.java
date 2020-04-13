package org.apache.jsp.libs.composum.nodes.console.browser;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class browser_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("tld:http://sling.apache.org/taglibs/sling/1.2");
    _jspx_dependants.add("tld:http://sling.composum.com/cpnl/1.0");
    _jspx_dependants.add("tld:http://java.sun.com/jsp/jstl/core");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.release();
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.release();
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write('\n');
      //  cpn:component
      com.composum.sling.cpnl.ComponentTag _jspx_th_cpn_005fcomponent_005f0 = (com.composum.sling.cpnl.ComponentTag) _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.get(com.composum.sling.cpnl.ComponentTag.class);
      _jspx_th_cpn_005fcomponent_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cpn_005fcomponent_005f0.setParent(null);
      // /libs/composum/nodes/console/browser/browser.jsp(6,0) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setId("browser");
      // /libs/composum/nodes/console/browser/browser.jsp(6,0) name = type type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setType("com.composum.sling.nodes.browser.Browser");
      // /libs/composum/nodes/console/browser/browser.jsp(6,0) name = scope type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_cpn_005fcomponent_005f0.setScope("request");
      int _jspx_eval_cpn_005fcomponent_005f0 = _jspx_th_cpn_005fcomponent_005f0.doStartTag();
      if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        com.composum.sling.nodes.browser.Browser browser = null;
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_cpn_005fcomponent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_cpn_005fcomponent_005f0.doInitBody();
        }
        browser = (com.composum.sling.nodes.browser.Browser) _jspx_page_context.findAttribute("browser");
        do {
          out.write("\n");
          out.write("    <html data-context-path=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${slingRequest.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("    ");
          if (_jspx_meth_sling_005fcall_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    <body id=\"browser\" class=\"console left-open top-open\">\n");
          out.write("    <div id=\"ui\">\n");
          out.write("        ");
          if (_jspx_meth_sling_005fcall_005f1(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        ");
          if (_jspx_meth_sling_005finclude_005f0(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("        <div id=\"content-wrapper\">\n");
          out.write("            <div id=\"split-view-horizontal-split\" class=\"split-pane horizontal-split fixed-left\">\n");
          out.write("                <div class=\"split-pane-component left-pane\">\n");
          out.write("                    <div id=\"browser-nav-split\" class=\"split-pane vertical-split fixed-bottom favorites-closed\">\n");
          out.write("                        <div class=\"split-pane-component top-pane\">\n");
          out.write("                            ");
          if (_jspx_meth_sling_005finclude_005f1(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"split-pane-divider\"></div>\n");
          out.write("                        <div class=\"split-pane-component bottom-pane\">\n");
          out.write("                            <div>\n");
          out.write("                                <div class=\"tree-panel\">\n");
          out.write("                                    <div id=\"browser-tree\" data-selected=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${browser.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div id=\"browser-tree-actions\" class=\"tree-actions action-bar btn-toolbar\"\n");
          out.write("                                     role=\"toolbar\">\n");
          out.write("                                    <div class=\"align-left\">\n");
          out.write("                                        <div class=\"menu btn-group btn-group-sm dropup\" role=\"group\">\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"glyphicon-menu-hamburger glyphicon btn btn-default dropdown-toggle\"\n");
          out.write("                                                    data-toggle=\"dropdown\" title=\"More actions...\"><span class=\"label\">More...</span>\n");
          out.write("                                            </button>\n");
          out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
          out.write("                                                <li><a href=\"#\" class=\"checkout\"\n");
          out.write("                                                       title=\"Checkout/Checkin the selected node\">Checkout</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"lock\"\n");
          out.write("                                                       title=\"Lock/Unlock the selected node\">Lock</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"mixins\"\n");
          out.write("                                                       title=\"View/Change the nodes mixin types\">Mixin Types...</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"move\" title=\"Move the selected node\">Move\n");
          out.write("                                                    Node</a></li>\n");
          out.write("                                                <li><a href=\"#\" class=\"rename\"\n");
          out.write("                                                       title=\"Rename the selected node\">Rename</a></li>\n");
          out.write("                                            </ul>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"create glyphicon-plus glyphicon btn btn-default\"\n");
          out.write("                                                    title=\"Create a new node\"><span class=\"label\">Create</span></button>\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"delete glyphicon-minus glyphicon btn btn-default\"\n");
          out.write("                                                    title=\"Delete selected node\"><span class=\"label\">Delete</span>\n");
          out.write("                                            </button>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\" class=\"copy fa fa-copy btn btn-default\"\n");
          out.write("                                                    title=\"Copy selected node to clipboard\"><span\n");
          out.write("                                                    class=\"label\">Copy</span></button>\n");
          out.write("                                            <button type=\"button\" class=\"paste fa fa-paste btn btn-default\"\n");
          out.write("                                                    title=\"Paste node from clipboard into the selected node\"><span\n");
          out.write("                                                    class=\"label\">Paste</span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"refresh glyphicon-refresh glyphicon btn btn-default\"\n");
          out.write("                                                    title=\"Refresh the selected tree node\"><span\n");
          out.write("                                                    class=\"label\">Refresh</span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"align-right\">\n");
          out.write("                                        <div class=\"filter btn-group btn-group-sm dropup\" role=\"group\">\n");
          out.write("                                            <label class=\"filter\"><span>default</span></label>\n");
          out.write("                                            <button type=\"button\"\n");
          out.write("                                                    class=\"glyphicon-filter glyphicon btn btn-default dropdown-toggle\"\n");
          out.write("                                                    data-toggle=\"dropdown\" aria-expanded=\"false\"\n");
          out.write("                                                    title=\"Filter for the tree\"><span class=\"label\">Filter</span>\n");
          out.write("                                            </button>\n");
          out.write("                                            <ul class=\"dropdown-menu\" role=\"menu\">\n");
          out.write("                                            </ul>\n");
          out.write("                                        </div>\n");
          out.write("                                        <div class=\"btn-group btn-group-sm\" role=\"group\">\n");
          out.write("                                            <button type=\"button\" class=\"favorites fa btn btn-default\"\n");
          out.write("                                                    title=\"Toogle favorites view on/off\"><span\n");
          out.write("                                                    class=\"label\">Favorites</span></button>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"split-pane-divider split-pane-divider-main-horizontal\"></div>\n");
          out.write("                <div class=\"split-pane-component right-pane\">\n");
          out.write("                    <div id=\"split-view-vertical-split\" class=\"split-pane vertical-split fixed-top\">\n");
          out.write("                        <div class=\"split-pane-component top-pane query-split-pane\">\n");
          out.write("                            <div id=\"browser-query\">\n");
          out.write("                                ");
          if (_jspx_meth_sling_005fcall_005f2(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"split-pane-divider split-pane-divider-main-vertical\"></div>\n");
          out.write("                        <div class=\"split-pane-component bottom-pane\">\n");
          out.write("                            <div id=\"browser-view\">\n");
          out.write("                                ");
          if (_jspx_meth_sling_005fcall_005f3(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("                            </div>\n");
          out.write("                            <div class=\"close-top\"><a href=\"#\" class=\"fa fa-angle-double-up\"\n");
          out.write("                                                      title=\"Collapse top panel\"></a></div>\n");
          out.write("                        </div>\n");
          out.write("                        <div class=\"open-top\"><a href=\"#\" class=\"fa fa-angle-double-down\" title=\"Restore top panel\"></a>\n");
          out.write("                        </div>\n");
          out.write("                    </div>\n");
          out.write("                    <div class=\"close-left\"><a href=\"#\" class=\"fa fa-angle-double-left\" title=\"Collapse left panel\"></a>\n");
          out.write("                    </div>\n");
          out.write("                </div>\n");
          out.write("                <div class=\"open-left\"><a href=\"#\" class=\"fa fa-angle-double-right\" title=\"Restore left panel\"></a>\n");
          out.write("                </div>\n");
          out.write("            </div>\n");
          out.write("        </div>\n");
          out.write("    </div>\n");
          out.write("    ");
          if (_jspx_meth_sling_005fcall_005f4(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    ");
          if (_jspx_meth_sling_005finclude_005f2(_jspx_th_cpn_005fcomponent_005f0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("    </body>\n");
          out.write("    </html>\n");
          int evalDoAfterBody = _jspx_th_cpn_005fcomponent_005f0.doAfterBody();
          browser = (com.composum.sling.nodes.browser.Browser) _jspx_page_context.findAttribute("browser");
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_cpn_005fcomponent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_cpn_005fcomponent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.reuse(_jspx_th_cpn_005fcomponent_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcpn_005fcomponent_005ftype_005fscope_005fid.reuse(_jspx_th_cpn_005fcomponent_005f0);
      out.write('\n');
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

  private boolean _jspx_meth_sling_005fcall_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f0 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(8,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f0.setScript("head.jsp");
    int _jspx_eval_sling_005fcall_005f0 = _jspx_th_sling_005fcall_005f0.doStartTag();
    if (_jspx_th_sling_005fcall_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f1 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(11,8) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f1.setScript("dialogs.jsp");
    int _jspx_eval_sling_005fcall_005f1 = _jspx_th_sling_005fcall_005f1.doStartTag();
    if (_jspx_th_sling_005fcall_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f1);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(12,8) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f0.setResourceType("composum/nodes/console/components/navbar");
    int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
    if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f1 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(18,28) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f1.setResourceType("composum/nodes/console/browser/components/favorites");
    int _jspx_eval_sling_005finclude_005f1 = _jspx_th_sling_005finclude_005f1.doStartTag();
    if (_jspx_th_sling_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f1);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f2 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(99,32) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f2.setScript("query.jsp");
    int _jspx_eval_sling_005fcall_005f2 = _jspx_th_sling_005fcall_005f2.doStartTag();
    if (_jspx_th_sling_005fcall_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f2);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f3 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(105,32) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f3.setScript("view.jsp");
    int _jspx_eval_sling_005fcall_005f3 = _jspx_th_sling_005fcall_005f3.doStartTag();
    if (_jspx_th_sling_005fcall_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f3);
    return false;
  }

  private boolean _jspx_meth_sling_005fcall_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:call
    org.apache.sling.scripting.jsp.taglib.CallTag _jspx_th_sling_005fcall_005f4 = (org.apache.sling.scripting.jsp.taglib.CallTag) _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.get(org.apache.sling.scripting.jsp.taglib.CallTag.class);
    _jspx_th_sling_005fcall_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sling_005fcall_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(121,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005fcall_005f4.setScript("script.jsp");
    int _jspx_eval_sling_005fcall_005f4 = _jspx_th_sling_005fcall_005f4.doStartTag();
    if (_jspx_th_sling_005fcall_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005fcall_005fscript_005fnobody.reuse(_jspx_th_sling_005fcall_005f4);
    return false;
  }

  private boolean _jspx_meth_sling_005finclude_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cpn_005fcomponent_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f2 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cpn_005fcomponent_005f0);
    // /libs/composum/nodes/console/browser/browser.jsp(122,4) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f2.setResourceType("composum/nodes/console/components/tryLogin");
    int _jspx_eval_sling_005finclude_005f2 = _jspx_th_sling_005finclude_005f2.doStartTag();
    if (_jspx_th_sling_005finclude_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fresourceType_005fnobody.reuse(_jspx_th_sling_005finclude_005f2);
    return false;
  }
}
