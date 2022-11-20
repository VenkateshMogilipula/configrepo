<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Management</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">  
<style>  
html {   
    height: 100%;   
}  
body {   
    height: 100%;   
}  
.global-container {  
    height: 100%;  
    display: flex;  
    align-items: center;  
    justify-content: center;  
    background-color: #f5f5f5;  
}  
form {  
    padding-top: 10px;  
    font-size: 14px;  
    margin-top: 30px;  
}  
.card-title {   
font-weight: 300;  
 }  
.btn {  
    font-size: 14px;  
    margin-top: 20px;  
}  
.login-form {   
    width: 330px;  
    margin: 20px;  
}  
.sign-up {  
    text-align: center;  
    padding: 20px 0 0;  
}  
.alert {  
    margin-bottom: -30px;  
    font-size: 13px;  
    margin-top: 20px;  
}  
</style>  
</head>
<body>
<div class="pt-5">  
  <div class="global-container">  
    <div class="card login-form">  
    <div class="card-body">  
        <h3 class="card-title text-center">Add to Contact</h3>  
        <div class="card-text">  
            <form action="Login" method="post">  
                <div class="form-group">  
                    <label for="username"> Contact Name</label>  
                    <input type="text" class="form-control form-control-sm" id="contactname" name="contactName">  
                </div>  
                <div class="form-group">  
                    <label for="userpass">Phone Number</label>   
                    <input type="text" class="form-control form-control-sm" id="contactNumber" name="contactNumber">  
                </div>  
                <button type="submit" class="btn btn-primary btn-block"> ADD </button>  
            </form>  
        </div>  
    </div>  
</div>  
</div>  
</body>
</html> 

