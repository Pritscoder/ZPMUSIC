

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html><!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="index.css">
        <title>navbar</title>
        <style>
            li a{
                color: black;
                font-size: 1.2rem;
            }
            </style>
    </head>
    <body>
        <div style="position:relative;">
        <nav class="navbar navbar-expand-lg navbar-light " style=" background-color: rgba(0,0,0,0)">
            <a class="navbar-brand" href="#" style="color: black;font-family: 'Satisfy',cursive; font-size: 2rem;">ZPmusic</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="sign.jsp">Sign Up</a>
                    </li>
                    

                </ul>
                <form class="form-inline my-2 my-lg-0" method="post" action="result.jsp">
                    <input class="form-control mr-sm-2 sr" type="search" id="search" placeholder="Search" autocomplete="off" aria-label="Search" name ="srch" style="width:20rem;">
                    <button class="btn my-2 my-sm-0 si " type="submit"><i class="fa fa-search"></i></button>
                </form>
                <div style="position:absolute;" class="list" id="show">
            <ul class="list-group">
 
            </ul>
                </div>
            </div>
            
        </nav>
        </div>
        

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script>
        $(document).ready(function(){
           $('#search').keyup(function(){
              var srch = $('#search').val();
              if(srch!=""){
              $.ajax({
                  url:"search.jsp",
                  method:"post",
                  data:"key="+srch,
                  
                  success:function(data){
                      $('#show').html(data);
                     
                  }                    
              });
              $(document).on("click","#rst",function(){
                 $('#search').val($(this).text().trim()); 
                 $('#show').html("");
              });
              
          }
           });
        });
        </script>
    </body>
    
</html>
