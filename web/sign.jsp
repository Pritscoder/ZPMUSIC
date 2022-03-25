<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign Up</title>
    </head>
   <body style="background-image: url('image/wallpaper.jpg'); background-size: cover">
        <%@include file="navbar.jsp"%>
        <div class="container mt-5 card " style="background-color: rgba(255,255,255,0.5); border-radius: 1rem; box-shadow: 2px 2px rgba(0,0,0,0.2), 4px 4px rgba(0,0,0,0.3);">
            <form class='mt-4 mb-4' method="post" action="signUp">
  
  <div class="form-group">
    <label for="uname">Username</label>
    <input type="text" class="form-control" name="uname" placeholder="Enter Username">
  </div> 
  <div class="form-group">
    <label for="pass">Password</label>
    <input type="password" class="form-control" name="pass" placeholder="Enter Password">
    <div class="text-center mt-5">
        <span style="font-size: 1.5rem; "><a href="#" style="text-decoration: none; color: red;">forget</a></span>
        <span style="font-size: 1.5rem;"><a href="register.jsp" class="ml-5" style="text-decoration: none;">Register</a></span>
     </div>
  </div>  
                   
                <div class='mt-4'><button type="submit" class="btn btn-primary" style='font-size: 1.3rem; width: 10rem; float:right; box-shadow: 2px 2px rgba(0,0,0,0.2), 4px 4px rgba(0,0,0,0.3)'>Sign Up</button></div>
</form>
        </div>
    </body>
</html>
