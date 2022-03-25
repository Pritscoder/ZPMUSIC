<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="java.sql.*"%>
<%@page import="helper.*"%>
<%@page import="entity.*"%>
<%@page import="helper.*"%>
<%@page import="java.util.*"%>
<%@page import="doa.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Playing </title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            i{
                color: black;
            }
            input:focus{
                outline: none;
                border:none;
            }
        </style>
    </head>
    <body style=" background-image: url('image/wallpaper.jpg'); background-size: cover;">
        <%
             Connection con = ConnectionProvider.getConnection();
                query q=new query(con);
                ArrayList<Music> li = q.music();
        String img=request.getParameter("play");
       
        String play=request.getParameter("song");
        %>
        <%@include file="navbar.jsp"%>
        <div class="container mt-5">
            <div class="row">
                <div class="col md-8">
                    <div class="card" style="background-color:rgba(0,0,0,0); border:none;">
                        <div class="card form-control " style="height: 25rem;  background-color:rgba(0,0,0,0); border: none;">
                           
                            <img src="image/music/<%=img%>" id='img' class="img-fluid" style="max-height:25rem;">    
                            <div class="text-center container cont mt-3" >
                                <div class="row  text-center" style="display:flex; justify-content: center; align-items: center;">
                                    <div class="a">
                                        <i class="fa fa-repeat mt-2" style="font-size: 2rem;" onclick="lop()"></i>
                                    </div>
                                    <div class="a"> 
                                        <i class="fa fa-step-backward mt-2" id="bwd" style="font-size: 2rem;"></i>
                                    </div>
                                    <div class="playIcon a" > 
                                        <i class="fa fa-play-circle mt-2" style="font-size: 2rem;" onclick="data('<%=play%>')"></i>
                                    </div>

                                    <div class="a"> 
                                        <i class="fa fa-step-forward mt-2" style="font-size: 2rem; " id="fwd"></i>
                                    </div>

                                    <div class="a">
                                        <i class="fa fa-volume-up mt-2" id="vlm" style="font-size:2rem;" onclick='mt()'></i>
                                    </div> 

                                    <div class="a">
                                        <a href="image/music/<%=play%>" download><i class="fa fa-download mt-2" style="font-size:2rem;"></i></a>
                                    </div> 
                                </div>
                            </div>
                            <div class="container-fluid mt-3">
                                <input type="range" id="rng" value="0" class="form-control " min="0" max="100">
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>
                                    <audio src="image/music/<%=play%>" id="sog" ></audio>
        <script>
            var a;
            let b;
            var rg;
            var sog = document.getElementById("sog");
            var rng = document.getElementById("rng");
            var im = document.getElementById("img");
           
            function data(son) {
                a = son;

            }
            $(document).ready(function () {
                $('#sog').on('ended', function () {
                  
                    nextSong();
                });
                let isPlaying = false;


                function play() {
                   
                    sog.play();

                }
                function pause() {
                    sog.pause();
                }

                $('.playIcon i').click(function () {
                    if (isPlaying == false) {
                        $(this).removeClass("fa fa-play-circle");
                        $(this).addClass("fa fa-pause-circle");
                       
                        play();


                        isPlaying = true;
                    } else {
                        $(this).removeClass("fa fa-pause-circle");
                        $(this).addClass("fa fa-play-circle");
                        pause();
                        isPlaying = false;
                    }
                });

                $('#sog').on('timeupdate', function () {
                    rg = sog.currentTime * (100 / sog.duration);
                    rng.value = rg;
                });
                $('#rng').on('change', function () {
                    sog.currentTime = rng.value * (sog.duration / 100);
                   

                });

            });
             const song = [
            <%                
                for(Music m:li){                    
            %>
                    {
                        music:"<%=m.getSong()%>",
                        img:"<%=m.getmImg()%>",
                        sname:"<%=m.getMname()%>",
                    },
                    
              <%
              }
              %>      
              ];
              let indx=0;
              function nextSong(){
                  indx=(indx+1)%song.length;
                  next(song[indx]);
                  sog.play();
                 $('.playIcon i').removeClass("fa fa-play-circle");
                        $('.playIcon i').addClass("fa fa-pause-circle");
                  
              }
              
              function next(gana){
                  im.src="image/music/"+gana.img;
                  sog.src="image/music/"+gana.music;               
              }
              document.getElementById("fwd").addEventListener("click",nextSong);
              
              function prevSong(){
                  indx=(indx-1+song.length)%song.length;
                  prev(song[indx]);
                  sog.play();
                  $('.playIcon i').removeClass("fa fa-play-circle");
                        $('.playIcon i').addClass("fa fa-pause-circle");
              }
              
              function prev(gana){
                  im.src="image/music/"+gana.img;
                  sog.src="image/music/"+gana.music;               
              }
              document.getElementById("bwd").addEventListener("click",prevSong);

           
              
              
            function lop() {
                sog.loop = true;
            }
            function mt() {
               if(sog.muted){
                    $("#vlm").removeClass("fa fa-volume-off");
                    $("#vlm").addClass("fa fa-volume-up");
                    sog.muted = false;
                    
               } else{
                    sog.muted = true;
                    $("#vlm").removeClass("fa fa-volume-up");
                    $("#vlm").addClass("fa fa-volume-off");
               }
               
                
            }
            
            


        </script>
    </body>
</html>
