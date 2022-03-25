package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import helper.*;
import entity.*;
import java.sql.*;
import helper.*;
import java.util.*;
import doa.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <title>ZPMUSICZONE</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image:url('image/wallpaper.jpg');\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

        Connection con = ConnectionProvider.getConnection();
        query q=new query(con);
        ArrayList<String> list=q.carousel();  
       
      out.write("\n");
      out.write("        <div class='jumbotron m-0 p-0'>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html><!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"index.css\">\n");
      out.write("        <title>navbar</title>\n");
      out.write("        <style>\n");
      out.write("            li a{\n");
      out.write("                color: black;\n");
      out.write("                font-size: 1.2rem;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div style=\"position:relative;\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light \" style=\" background-color: rgba(0,0,0,0)\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"color: black;font-family: 'Satisfy',cursive; font-size: 2rem;\">ZPmusic</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"sign.jsp\">Sign Up</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\" method=\"post\" action=\"result.jsp\">\n");
      out.write("                    <input class=\"form-control mr-sm-2 sr\" type=\"search\" id=\"search\" placeholder=\"Search\" autocomplete=\"off\" aria-label=\"Search\" name =\"srch\" style=\"width:20rem;\">\n");
      out.write("                    <button class=\"btn my-2 my-sm-0 si \" type=\"submit\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                </form>\n");
      out.write("                <div style=\"position:absolute;\" class=\"list\" id=\"show\">\n");
      out.write("            <ul class=\"list-group\">\n");
      out.write(" \n");
      out.write("            </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </nav>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("           $('#search').keyup(function(){\n");
      out.write("              var srch = $('#search').val();\n");
      out.write("              if(srch!=\"\"){\n");
      out.write("              $.ajax({\n");
      out.write("                  url:\"search.jsp\",\n");
      out.write("                  method:\"post\",\n");
      out.write("                  data:\"key=\"+srch,\n");
      out.write("                  \n");
      out.write("                  success:function(data){\n");
      out.write("                      $('#show').html(data);\n");
      out.write("                     \n");
      out.write("                  }                    \n");
      out.write("              });\n");
      out.write("              $(document).on(\"click\",\"#rst\",function(){\n");
      out.write("                 $('#search').val($(this).text().trim()); \n");
      out.write("                 $('#show').html(\"\");\n");
      out.write("              });\n");
      out.write("              \n");
      out.write("          }\n");
      out.write("           });\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--        <div>\n");
      out.write("        <ul class=\"list-group\">\n");
      out.write("  <li class=\"list-group-item\">Cras justo odio</li>\n");
      out.write("  <li class=\"list-group-item\">Dapibus ac facilisis in</li>\n");
      out.write("  <li class=\"list-group-item\">Morbi leo risus</li>\n");
      out.write("  <li class=\"list-group-item\">Porta ac consectetur ac</li>\n");
      out.write("  <li class=\"list-group-item\">Vestibulum at eros</li>\n");
      out.write("</ul>\n");
      out.write("        </div>-->\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("<!--        <div class=\"mt-5 container-fluid m-2 p-2\">\n");
      out.write("            ");

                PreparedStatement pst = con.prepareStatement("select * from artist");
                ResultSet rst = pst.executeQuery();
                while(rst.next()){
                    String img = rst.getString("aimg");
                    
            
      out.write("\n");
      out.write("            <img src=\"image/artist/");
      out.print(img);
      out.write("\" class=\"art\">\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>-->\n");
      out.write("                      \n");
      out.write("                      <div class=\"container-fluid mt-5 m-2\">\n");
      out.write("                         <h3 style=\"color:black;\">Audio Songs</h3>\n");
      out.write("                          <div class=\"row\">\n");
      out.write("                              <div class=\"card-columns\">\n");
      out.write("                               ");

                         ArrayList<Music> li = q.music();
                         for(Music m:li){                                       
                         
      out.write("\n");
      out.write("                                \n");
      out.write("                              <div class=\"col md-12\">\n");
      out.write("                                  <div class=\"card mt-3\" style=\"  box-shadow: 2px 2px rgba(0,0,0,0.2)inset, 4px 4px rgba(0,0,0,0.3) \">\n");
      out.write("                                  <div class=\"row\">\n");
      out.write("                                      <div class=\"col md-2\">\n");
      out.write("                                          <a href=\"playing.jsp?play=");
      out.print(m.getmImg());
      out.write("&song=");
      out.print(m.getSong());
      out.write("\"><img style=\"height:7rem;\" class=\"form-control img-fluid  img-responsive card-img\" width=\"100%\" src=\"image/music/");
      out.print(m.getmImg());
      out.write("\"></a>\n");
      out.write("                                          \n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"col md-8 \">\n");
      out.write("                                          <p>");
      out.print(m.getMname());
      out.write("<br>");
      out.print(m.getArtist());
      out.write("</p>\n");
      out.write("                                          \n");
      out.write("                                          <div class=\"playIcon\">\n");
      out.write("                                          <i class=\"fa fa-play-circle\" style=\"font-size: 2.5rem\" onclick=\"data('");
      out.print(m.getSong());
      out.write("')\"></i>\n");
      out.write("                                          \n");
      out.write("                                          </div>\n");
      out.write("                                      </div>\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                          ");
}
      out.write(" \n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                              <div class=\"container-fluid mt-5 m-2\">\n");
      out.write("                                  <h3 style=\"color:black;\">Video Songs</h3>\n");
      out.write("                          <div class=\"row\">\n");
      out.write("                              <div class=\"card-columns\">\n");
      out.write("                               ");

                                   query vid = new query(con);
                         ArrayList<Music> lis = vid.Vmusic();
                         for(Music mm:lis){
                             
               
                         
      out.write("\n");
      out.write("                                \n");
      out.write("                              <div class=\"col md-12\">\n");
      out.write("                                  <div class=\"card mt-3\" style=\"  box-shadow: 2px 2px rgba(0,0,0,0.2)inset, 4px 4px rgba(0,0,0,0.3) \">\n");
      out.write("                                  <div class=\"row\">\n");
      out.write("                                      <div class=\"col md-2\">\n");
      out.write("                                          <a href=\"videoPlaying.jsp?vplay=");
      out.print(mm.getSong());
      out.write("\"><img style=\"height:7rem;\" class=\"form-control img-fluid  img-responsive\" width=\"100%\" src=\"image/music/");
      out.print(mm.getmImg());
      out.write("\"></a>\n");
      out.write("                                          \n");
      out.write("                                      </div>\n");
      out.write("                                      <div class=\"col md-8 \">\n");
      out.write("                                          <p>");
      out.print(mm.getMname());
      out.write("<br>");
      out.print(mm.getArtist());
      out.write("</p>\n");
      out.write("                                          \n");
      out.write("                                          <div class=\"playIcon\">\n");
      out.write("                                          <i class=\"fa fa-play-circle\" style=\"font-size: 2.5rem\" onclick=\"data('");
      out.print(mm.getSong());
      out.write("')\"></i>\n");
      out.write("                                          \n");
      out.write("                                          </div>\n");
      out.write("                                      </div>\n");
      out.write("                                  </div>\n");
      out.write("\n");
      out.write("                              </div>\n");
      out.write("                                          </div>\n");
      out.write("                          ");
}
      out.write(" \n");
      out.write("                              </div>\n");
      out.write("                          </div>\n");
      out.write("                      </div>\n");
      out.write("                              \n");
      out.write("                              <audio id=\"sog\" src=\"\"></audio>\n");
      out.write("                              <script>\n");
      out.write("                                  var a;\n");
      out.write("                                  function data(son){                                      \n");
      out.write("                                      a= son; \n");
      out.write("                                     \n");
      out.write("                                  }\n");
      out.write("                                  $(document).ready(function(){\n");
      out.write("                                      \n");
      out.write("                                      var sog= document.getElementById(\"sog\");\n");
      out.write("                                  \n");
      out.write("                                  let isPlaying = false; \n");
      out.write("                                  \n");
      out.write("                                       \n");
      out.write("                                       function play(){\n");
      out.write("                                           sog.src=\"image/music/\"+a;\n");
      out.write("                                           sog.play();\n");
      out.write("                                       }\n");
      out.write("                                       function pause(){\n");
      out.write("                                           sog.pause();\n");
      out.write("                                       }\n");
      out.write("                                       \n");
      out.write("                                       $('.playIcon i').click(function(){                                          \n");
      out.write("                                          if(isPlaying==false){\n");
      out.write("                                              $('.playIcon i').addClass('fa fa-play-circle');\n");
      out.write("                                              $(this).removeClass(\"fa fa-play-circle\");\n");
      out.write("                                              $(this).addClass(\"fa fa-pause-circle\");\n");
      out.write("                                              play();\n");
      out.write("                                              isPlaying= true;\n");
      out.write("                                          }\n");
      out.write("                                          else{  \n");
      out.write("                                              $('.playIcon i').removeClass(\"fa fa-pause-circle\");\n");
      out.write("                                              $('.playIcon i').addClass('fa fa-play-circle');\n");
      out.write("                                             $(this).removeClass(\"fa fa-pause-circle\");\n");
      out.write("                                             $(this).addClass(\"fa fa-play-circle\");\n");
      out.write("                                             pause();\n");
      out.write("                                             isPlaying=false;\n");
      out.write("                                          }\n");
      out.write("                                       });\n");
      out.write("                                      \n");
      out.write("                                     $('#sog').on(\"ended\",function(){\n");
      out.write("                                         $('.playIcon i').removeClass(\"fa fa-pause-circle\");\n");
      out.write("                                         $('.playIcon i').addClass('fa fa-play-circle');\n");
      out.write("                                     });\n");
      out.write("        \n");
      out.write("                                  });\n");
      out.write("                                  \n");
      out.write("                                  \n");
      out.write("                                  \n");
      out.write("                              </script> \n");
      out.write("        \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
