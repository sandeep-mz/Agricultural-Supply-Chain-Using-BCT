package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserPage1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>SCM Using BCT</title>\n");
      out.write("        <!-- for-mobile-apps -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Election Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- //for-mobile-apps -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel='stylesheet' type='text/css' />\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Raleway:400,100,200,300,500,600,700,800,900' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("        <!---strat-slider---->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <!---//-slider---->\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                background:url(../images/banner.jpg) no-repeat 0px 0px;\n");
      out.write("                background-size: cover;\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                -moz-background-size: cover;\n");
      out.write("                -o-background-size: cover;\n");
      out.write("                -ms-background-size: cover;\n");
      out.write("                min-height: 800px;\n");
      out.write("            }\n");
      out.write("            table {\n");
      out.write("\n");
      out.write("                table-layout:fixed;\n");
      out.write("                margin: 0em 0em 12em 0em !important;\n");
      out.write("            }\n");
      out.write("            th, td {\n");
      out.write("                padding:10px 10px;\n");
      out.write("                border:1px solid;\n");
      out.write("                text-align: center;\n");
      out.write("                border-color: #080808;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            tbody {\n");
      out.write("                overflow:auto;\n");
      out.write("                overflow-x:hidden;\n");
      out.write("                display:block;\n");
      out.write("                width:100%;\n");
      out.write("            }\n");
      out.write("            tbody tr {\n");
      out.write("                display:table;\n");
      out.write("                width:100%;\n");
      out.write("                table-layout:fixed;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function validation()\n");
      out.write("            {\n");
      out.write("                var filename = document.share1.photoname.value;\n");
      out.write("                if (filename == 0)\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter image name\");\n");
      out.write("                    document.share1.photoname.focus();\n");
      out.write("                    return  false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    ");

        HttpSession user = request.getSession();
        String student_id = user.getAttribute("PRN").toString();
       
       
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <div class=\"header_bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!-----start-header----->\n");
      out.write("                <div class=\"header\">\t\t\t\t\n");
      out.write("                    <nav class=\"navbar navbar-default\">\n");
      out.write("                        <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                        <div class=\"collapse navbar-collapse\">\n");
      out.write("                            <ul class=\"nav navbar-nav\">\n");
      out.write("                                \n");
      out.write("                            </ul>\n");
      out.write("                        </div><!-- /.navbar-collapse -->\t\n");
      out.write("\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"header_bottom\">\n");
      out.write("        </div>\n");
      out.write("        <!-- //end-header -->\n");
      out.write("        ");


        
      out.write("\n");
      out.write("        <!-- banner -->\n");
      out.write("        <div class=\"\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <section class=\"slider\">\n");
      out.write("                    <div class=\"flexslider\">\n");
      out.write("                        <center><br><br><br><br>\n");
      out.write("                            <h2>Upload Share</h2><br><br><br>\n");
      out.write("                            <form name=\"share1\" action=\"./UploadShare\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                                upload the image share to get the password <br><br>\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Select File : </td>\n");
      out.write("                                        <td><input  name=\"file\" type=\"file\"/> </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                  \n");
      out.write("                                </table>\n");
      out.write("                                 <br><br>\n");
      out.write("                                <input type=\"submit\" value=\"Upload File\"/>\n");
      out.write("                            </form>\n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <!-- FlexSlider -->\n");
      out.write("            <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    start: function (slider) {\n");
      out.write("                        $('body').removeClass('loading');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("            </script>\n");
      out.write("            <!-- //FlexSlider -->\n");
      out.write("        </div>\n");
      out.write("        <!-- //banner -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <div style=\"text-align: center;\">\n");
      out.write("                <p></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //footer -->\n");
      out.write("        <!-- scroll_top_btn -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("\n");
      out.write("                var defaults = {\n");
      out.write("                    containerID: 'toTop', // fading element id\n");
      out.write("                    containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                    scrollSpeed: 1200,\n");
      out.write("                    easingType: 'linear'\n");
      out.write("                };\n");
      out.write("\n");
      out.write("\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <a href=\"#\" id=\"toTop\" style=\"display: block;\"><span id=\"toTopHover\" style=\"opacity: 1;\"></span></a>\n");
      out.write("        <!--end scroll_top_btn -->\n");
      out.write("        <!-- for bootstrap working -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("        <!-- //for bootstrap working -->\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
}
