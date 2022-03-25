package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import helper.*;
import entity.*;
import helper.*;
import java.util.*;
import doa.*;

public final class playing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Playing </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <style>\n");
      out.write("            i{\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            input:focus{\n");
      out.write("                outline: none;\n");
      out.write("                border:none;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\" background-image: url('image/wallpaper.jpg'); background-size: cover;\">\n");
      out.write("        ");

             Connection con = ConnectionProvider.getConnection();
                query q=new query(con);
                ArrayList<Music> li = q.music();
        String img=request.getParameter("play");
        String vd=request.getParameter("vplay");
        String play=request.getParameter("song");
        
      out.write("\n");
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
      out.write("\n");
      out.write("        <title>Hello, world!</title>\n");
      out.write("        <style>\n");
      out.write("            li a{\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg \" style=\" background-color: rgba(0,0,0,0)\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"color: black\">Navbar</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"sign.jsp\">Sign Up</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                    <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                    <button class=\"btn btn-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col md-8\">\n");
      out.write("                    <div class=\"card\" style=\"background-color:rgba(0,0,0,0); border:none;\">\n");
      out.write("                        <div class=\"card form-control \" style=\"height: 25rem;  background-color:rgba(0,0,0,0); border: none;\">\n");
      out.write("                            ");

                            if(vd==null)
                            {
                            
      out.write("\n");
      out.write("                            <img src=\"image/music/");
      out.print(img);
      out.write("\" id='img' class=\"img-fluid\" style=\"max-height:25rem;\">\n");
      out.write("                            ");
}else{
      out.write("\n");
      out.write("                            <video src=\"image/music/");
      out.print(vd);
      out.write("\" controls></video>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            <div class=\"text-center container\" >\n");
      out.write("                                <div class=\"row  text-center\" style=\"display:flex; justify-content: center; align-items: center;\">\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-repeat mt-3\" style=\"font-size: 2rem; padding-right: 2rem;\" onclick=\"lop()\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div> \n");
      out.write("                                        <i class=\"fa fa-step-backward mt-3\" style=\"font-size: 2rem; padding-right: 2rem;\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"playIcon\"> \n");
      out.write("                                        <i class=\"fa fa-play-circle mt-3\" style=\"font-size: 2rem;\" onclick=\"data('");
      out.print(play);
      out.write("')\"></i>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div> \n");
      out.write("                                        <i class=\"fa fa-step-forward mt-3\" style=\"font-size: 2rem; padding-left: 2rem;\"></i>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <i class=\"fa fa-volume-up mt-3\" style=\"font-size:2rem; padding-left: 2rem;\" onclick='mt()'></i>\n");
      out.write("                                    </div> \n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"image/music/");
      out.print(play);
      out.write("\" download><i class=\"fa fa-download mt-3\" style=\"font-size:2rem; padding-left: 2rem;\"></i></a>\n");
      out.write("                                    </div> \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"container-fluid\">\n");
      out.write("                                <input type=\"range\" id=\"rng\" value=\"0\" class=\"form-control \" min=\"0\" max=\"100\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <audio id=\"sog\" src=\"\"></audio>\n");
      out.write("        <script>\n");
      out.write("            var a;\n");
      out.write("            let b;\n");
      out.write("            var rg;\n");
      out.write("            var sog = document.getElementById(\"sog\");\n");
      out.write("            var rng = document.getElementById(\"rng\");\n");
      out.write("            var im = document.getElementById(\"img\");\n");
      out.write("           \n");
      out.write("            function data(son) {\n");
      out.write("                a = son;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#sog').on('ended', function () {\n");
      out.write("                    $('.playIcon i').removeClass(\"fa fa-pause-circle\");\n");
      out.write("                    $('.playIcon i').addClass('fa fa-play-circle');\n");
      out.write("                });\n");
      out.write("                let isPlaying = false;\n");
      out.write("\n");
      out.write("\n");
      out.write("                function play() {\n");
      out.write("                    sog.src = \"image/music/\" + a;\n");
      out.write("                    sog.play();\n");
      out.write("\n");
      out.write("                }\n");
      out.write("                function pause() {\n");
      out.write("                    sog.pause();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                $('.playIcon i').click(function () {\n");
      out.write("                    if (isPlaying == false) {\n");
      out.write("                        $(this).removeClass(\"fa fa-play-circle\");\n");
      out.write("                        $(this).addClass(\"fa fa-pause-circle\");\n");
      out.write("                        play();\n");
      out.write("\n");
      out.write("\n");
      out.write("                        isPlaying = true;\n");
      out.write("                    } else {\n");
      out.write("                        $(this).removeClass(\"fa fa-pause-circle\");\n");
      out.write("                        $(this).addClass(\"fa fa-play-circle\");\n");
      out.write("                        pause();\n");
      out.write("                        isPlaying = false;\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                $('#sog').on('timeupdate', function () {\n");
      out.write("                    rg = sog.currentTime * (100 / sog.duration);\n");
      out.write("                    rng.value = rg;\n");
      out.write("                });\n");
      out.write("                $('#rng').on('click', function () {\n");
      out.write("                    sog.currentTime = rng.value * (sog.duration / 100);\n");
      out.write("                    console.log(sog.currentTime);\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            const song = [\n");
      out.write("            ");
                
                for(Music m:li){                    
            
      out.write("\n");
      out.write("                    {\n");
      out.write("                        music:\"");
      out.print(m.getSong());
      out.write("\",\n");
      out.write("                    },\n");
      out.write("                    \n");
      out.write("              ");

              }
              
      out.write("      \n");
      out.write("              ];\n");
      out.write("              let indx=0;\n");
      out.write("              function next(gana){\n");
      out.write("                  im.src=gana.img;\n");
      out.write("              }\n");
      out.write("              \n");
      out.write("            function lop() {\n");
      out.write("                sog.loop = true;\n");
      out.write("            }\n");
      out.write("            function mt() {\n");
      out.write("                sog.muted = true;\n");
      out.write("                alert(\"ok\");\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
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
