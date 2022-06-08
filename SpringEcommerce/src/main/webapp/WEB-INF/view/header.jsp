<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
   <title>Fashion Way</title>
    <style type="text/css">
    header{
    background-color: rgb(129, 157, 187);
    color: white;
}
.logo{
    color: rgb(100, 2, 2);
    line-height: 10px;
    font-size: 25px;
    font-weight: 1000;
    font-style: italic;
    font-stretch: extra-expanded;
    text-shadow: #FFF 0px 0px 5px, #FFF 0px 0px 10px, #FFF 0px 0px 15px, #FF2D95 0px 0px 10px, #FF2D95 0px 0px 20px, #FF2D95 0px 0px 30px, #FF2D95 0px 0px 40px, #FF2D95 0px 0px 65px, -3px 3px 1px rgba(206,159,204,0);
}

.logo-photo{
    border-radius: 50%;
    background-size: cover;
    width: 50px;
    height: 50px;
}
.header{
    display: flex;
    flex-direction: row;
    list-style-type: none;
    justify-content: space-evenly;
}
.header-two ul li{
    display: inline;
    margin-left: 25px;
   
}
.header-three ul li input{
    border-radius: 12px;
    border: 2px solid lightblue;
    height: 24px;
    width: 200px;
}
.header-two ul li button a{
 text-decoration: none;
}
.header-three{
  
   /* padding-left: 700px; */
}
.header-three ul li{
    display: inline;
    margin-left: 25px;
}
.header-three ul li button a{
    text-decoration: none ;
}


button {
    padding: 0.6em;
    font-size: 12px;
    text-transform: uppercase;
    letter-spacing: 2.5px;
    font-weight: 500;
    color: #000;
    background-color: #fff;
    border: none;
    border-radius: 45px;
    box-shadow: 0px 8px 15px rgba(0, 0, 0, 0.1);
    transition: all 0.3s ease 0s;
    cursor: pointer;
    outline: none;
   }
   
   button:hover {
    background-color: #2EE59D;
    box-shadow: 0px 15px 20px rgba(46, 229, 157, 0.4);
    color: #fff;
    transform: translateY(-7px);
   }
   
   button:active {
    transform: translateY(-1px);
   }
    </style>
</head>
<body>
     <header>
    <div class="header">
        <div class="logo">
            <p>FASHION WAY</p>
        </div>
        <div class="header-two">
            <ul>
                <li><button id="men"><a href="/SpringEcommerce/plp/men">MEN</a></button></li>
                <li><button id="women"><a href="/SpringEcommerce/plp/women">WOMEN</a></button></li>
                <li><button id="kids"><a href="/SpringEcommerce/plp/kids">KIDS</a></button></li>
                <li><button id="beauty"><a href="#show_message">BEAUTY</a></button></li>
                
            </ul>
           </div>
          <div class="header-three">
            <ul>
                    <li><input type="text" ></li>
                    <li><button  class="forCart"><a href="/SpringEcommerce/viewcart">CART</a></button></li>
                     <li><button  class="forCart"><a href="/SpringEcommerce/order">ORDER</a></button></li>
                    <li><button class="forSignUp"><a href="/SpringEcommerce/signup">SIGNUP</a></button></li>
                    <li><button class="forLogin"><a href="/SpringEcommerce/login">LOGIN</a></button></li>
            </ul>
          </div>
    </div>
    </header><br><br>

</body>
</html>