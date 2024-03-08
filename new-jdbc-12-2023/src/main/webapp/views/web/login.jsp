<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> TRANG ĐĂNG NHẬP </title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}

.form-login {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    width: 300px;
}

.form-login label {
    font-weight: bold;
    display: block;
    margin-bottom: 5px;
}

.form-login input[type="text"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
}

.form-login input[type="password"] {
    width: 100%;
    padding: 10px;
    margin-bottom: 10px;
    border-radius: 5px;
    border: 1px solid #ccc;
}

.form-login input[type="submit"] {
    background-color: #007BFF;
    color: #fff;
    border: none;
    border-radius: 5px;
    padding: 10px 15px;
    cursor: pointer;
}

.form-login input[type="submit"]:hover {
    background-color: #0056b3;
}

</style>

</head>
<body>
	<div class="form-login">
    <form action="" method="post">
        <div class="userName">
        <label for="userName" > User Name </label>
        <input type="text" name="userName" placeholder="Ten dang nhap">
        </div>
        <div class="password">
            <label for="password"> Password </label>
         <input type="password" name="password" placeholder="Mat khau">
            </div>

            <div class="submit">
                <input type="submit" name = "submit" value="Submit" >
            </div>
    </form>
	</div>
</body>
</html>




