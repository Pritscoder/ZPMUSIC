
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="helper.*"%>
<%@page import="entity.*"%>
<%@page import="java.sql.*"%>
<%@page import="helper.*"%>
<%@page import="java.util.*"%>
<%@page import="doa.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>ZPMUSICZONE</title>
        <style>
            body{
                background-image:url('image/wallpaper.jpg');
                overflow-x: hidden;
                background-size: cover;
            }
            
        </style>
    </head>
    <body>
       <%
        Connection con = ConnectionProvider.getConnection();
        query q=new query(con);
        ArrayList<String> list=q.carousel();  
       %>
        <div class='jumbotron m-0 p-0'>
        <%@include file="navbar.jsp"%>
<!--        <div>
        <ul class="list-group">
  <li class="list-group-item">Cras justo odio</li>
  <li class="list-group-item">Dapibus ac facilisis in</li>
  <li class="list-group-item">Morbi leo risus</li>
  <li class="list-group-item">Porta ac consectetur ac</li>
  <li class="list-group-item">Vestibulum at eros</li>
</ul>
        </div>-->
        </div>
        
<!--        <div class="mt-5 container-fluid m-2 p-2">
            <%
                PreparedStatement pst = con.prepareStatement("select * from artist");
                ResultSet rst = pst.executeQuery();
                while(rst.next()){
                    String img = rst.getString("aimg");
                    
            %>
            <img src="image/artist/<%=img%>" class="art">
            <%}%>
        </div>-->
                      
                      <div class="container-fluid mt-5 m-2">
                         <h3 style="color:black;">Audio Songs</h3>
                          <div class="row">
                              <div class="card-columns">
                               <%
                         ArrayList<Music> li = q.music();
                         for(Music m:li){                                       
                         %>
                                
                              <div class="col md-12">
                                  <div class="card mt-3" style="  box-shadow: 2px 2px rgba(0,0,0,0.2)inset, 4px 4px rgba(0,0,0,0.3) ">
                                  <div class="row">
                                      <div class="col md-2">
                                          <a href="playing.jsp?play=<%=m.getmImg()%>&song=<%=m.getSong()%>"><img style="height:7rem;" class="form-control img-fluid  img-responsive card-img" width="100%" src="image/music/<%=m.getmImg()%>"></a>
                                          
                                      </div>
                                      <div class="col md-8 ">
                                          <p><%=m.getMname()%><br><%=m.getArtist()%></p>
                                          
                                          <div class="playIcon">
                                          <i class="fa fa-play-circle" style="font-size: 2.5rem" onclick="data('<%=m.getSong()%>')"></i>
                                          
                                          </div>
                                      </div>
                                  </div>

                              </div>
                                          </div>
                          <%}%> 
                              </div>
                          </div>
                      </div>
                              <div class="container-fluid mt-5 m-2">
                                  <h3 style="color:black;">Video Songs</h3>
                          <div class="row">
                              <div class="card-columns">
                               <%
                                   query vid = new query(con);
                         ArrayList<Music> lis = vid.Vmusic();
                         for(Music mm:lis){
                             
               
                         %>
                                
                              <div class="col md-12">
                                  <div class="card mt-3" style="  box-shadow: 2px 2px rgba(0,0,0,0.2)inset, 4px 4px rgba(0,0,0,0.3) ">
                                  <div class="row">
                                      <div class="col md-2">
                                          <a href="videoPlaying.jsp?vplay=<%=mm.getSong()%>"><img style="height:7rem;" class="form-control img-fluid  img-responsive" width="100%" src="image/music/<%=mm.getmImg()%>"></a>
                                          
                                      </div>
                                      <div class="col md-8 ">
                                          <p><%=mm.getMname()%><br><%=mm.getArtist()%></p>
                                          
                                          <div class="playIcon">
                                          <i class="fa fa-play-circle" style="font-size: 2.5rem" onclick="data('<%=mm.getSong()%>')"></i>
                                          
                                          </div>
                                      </div>
                                  </div>

                              </div>
                                          </div>
                          <%}%> 
                              </div>
                          </div>
                      </div>
                              
                              <audio id="sog" src=""></audio>
                              <script>
                                  var a;
                                  function data(son){                                      
                                      a= son; 
                                     
                                  }
                                  $(document).ready(function(){
                                      
                                      var sog= document.getElementById("sog");
                                  
                                  let isPlaying = false; 
                                  
                                       
                                       function play(){
                                           sog.src="image/music/"+a;
                                           sog.play();
                                       }
                                       function pause(){
                                           sog.pause();
                                       }
                                       
                                       $('.playIcon i').click(function(){                                          
                                          if(isPlaying==false){
                                              $('.playIcon i').addClass('fa fa-play-circle');
                                              $(this).removeClass("fa fa-play-circle");
                                              $(this).addClass("fa fa-pause-circle");
                                              play();
                                              isPlaying= true;
                                          }
                                          else{  
                                              $('.playIcon i').removeClass("fa fa-pause-circle");
                                              $('.playIcon i').addClass('fa fa-play-circle');
                                             $(this).removeClass("fa fa-pause-circle");
                                             $(this).addClass("fa fa-play-circle");
                                             pause();
                                             isPlaying=false;
                                          }
                                       });
                                      
                                     $('#sog').on("ended",function(){
                                         $('.playIcon i').removeClass("fa fa-pause-circle");
                                         $('.playIcon i').addClass('fa fa-play-circle');
                                     });
        
                                  });
                                  
                                  
                                  
                              </script> 
        

    </body>
</html>
