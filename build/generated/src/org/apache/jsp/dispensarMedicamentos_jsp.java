package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dispensarMedicamentos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      if (_jspx_meth_t_page_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_t_page_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:page
    org.apache.jsp.tag.web.page_tag _jspx_th_t_page_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.page_tag.class) : new org.apache.jsp.tag.web.page_tag();
    _jspx_th_t_page_0.setJspContext(_jspx_page_context);
    String _jspx_temp0 = "Farmácia APPP";
    _jspx_th_t_page_0.setTitle(_jspx_temp0);
    _jspx_th_t_page_0.setJspBody(new dispensarMedicamentos_jspHelper( 0, _jspx_page_context, _jspx_th_t_page_0, null));
    _jspx_th_t_page_0.doTag();
    return false;
  }

  private class dispensarMedicamentos_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public dispensarMedicamentos_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\n");
      out.write("        <div class=\"main w-100\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"panel panel-default col-sm pt-4\">\n");
      out.write("                    <div class=\"panel-heading text-center\">\n");
      out.write("                        <h2>Dispensar Medicamentos</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body m-3\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                    <div class=\"card border-info\">\n");
      out.write("                        <div class=\"card-body p-5\">\n");
      out.write("                            <form action=\"DispensarMedicamentoController\" method=\"POST\">\n");
      out.write("                            <table class=\"table table-hover table-responsive-sm\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\">#</th>\n");
      out.write("                                        <th scope=\"col\">Paciente</th>\n");
      out.write("                                        <th scope=\"col\">Retirante</th>\n");
      out.write("                                        <th scope=\"col\">Medicamento</th>\n");
      out.write("                                        <th scope=\"col\">Quantidade</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">1</th>\n");
      out.write("                                        <td>Mark Jacob</td>\n");
      out.write("                                        <td>Otto Thornton</td>\n");
      out.write("                                        <td>remedio 1</td>\n");
      out.write("                                        <td>3</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">2</th>\n");
      out.write("                                        <td>Mark Jacob</td>\n");
      out.write("                                        <td>Otto Thornton</td>\n");
      out.write("                                        <td>remedio 2</td>\n");
      out.write("                                        <td>2</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">3</th>\n");
      out.write("                                        <td>Larry the Bird</td>\n");
      out.write("                                        <td>Larry the Bird</td>\n");
      out.write("                                        <td>remedio 1</td>\n");
      out.write("                                        <td>4</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                            <div class=\"col-sm-1 offset-10 row\">\n");
      out.write("                            <a>\n");
      out.write("                                <button type=\"submit\" class=\"btn offset-1 btn-primary\">Dispensar</button>\n");
      out.write("                            </a>\n");
      out.write("                            </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    ");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}