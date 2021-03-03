<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login Page</title>
<link rel="icon" href="images/favicon.ico">
     <link rel="shortcut icon" href="images/favicon.ico" />
     <link rel="stylesheet" href="css/style.css">
     <link rel="stylesheet" href="css/form.css">
     <link rel="stylesheet" href="css/login.css">
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
     <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>
     <script src="js/jquery.js"></script>
     <script src="js/forms.js"></script>
     <script src="js/jquery-migrate-1.1.1.js"></script>
     <script src="js/superfish.js"></script>     
     <script src="js/jquery.equalheights.js"></script>
     <script src="js/jquery.easing.1.3.js"></script>
          <script src="js/jquery.ui.totop.js"></script>

     <script>
    
    jQuery(document).ready(function() {
    $().UItoTop({ easingType: 'easeOutQuart' });
    });
     </script>
</head>
<body>


 <header> 
  <div class="container_12">
    <div class="grid_12"> 
    <h1><a href="index.html"><img src="images/logo.png" alt="Gerald Harris attorney at law"></a> </h1>
         <div class="menu_block">
           <nav  class="" >
            <ul class="sf-menu">
                   <li><a href="index.html">Home</a></li>
                   <li><a href="rendez-vous.html"> Prend Rendez-vous</a></li>
                   <li><a href="register.html">Register</a></li>
                   <li class="current"><a href="login.html">Login </a></li>
                 </ul>
              </nav>
           <div class="clear"></div>
           </div>
           <div class="clear"></div>
      </div>
    </div>
</header>


<div class="content pt1"><div class="ic">!</div>
  <div class="container_12">
     <div class="grid_6">
      <section class="get-in-touch">
        <h1 class="title">Login</h1>
        <form class="contact-form row" action="/Veterine-Jee/login" method="post">
           <div class="form-field col-lg-12 ">
              <input name="username" class="input-text js-input" type="text" required>
              <label class="label" for="email">Username</label>
           </div>
           <br>
           <div class="form-field col-lg-12 ">
              <input name="password" class="input-text js-input" type="password" required>
              <label class="label" for="company">Password</label>
           </div>
           <div class="form-field">
                <button class="btn btn-primary" type="submit">Login</button>
          </div>
        </form>
     </section>
   </div>
  </div>
<!--=======content================================-->



<!--==============================footer=================================-->

<footer>    
  <div class="container_12">
    <div class="grid_12">
      <div class="socials">
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
        <a href="#"></a>
      </div>
     
    </div>
    <div class="clear"></div>
  </div>
</footer>

</body>
</html>