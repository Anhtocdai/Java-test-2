<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .login-container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .login-container h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        .form-group {
            margin-bottom: 20px;
        }
        .form-group label {
            display: block;
            font-weight: bold;
        }
        .form-group input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }
        .form-group button {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 3px;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<div class = 'login-container'>
	<h1> ĐĂNG KÍ THÔNG TIN </h1>
		<form action="thanh-cong" method='post' class='form-group'>
			<label for='account'>Account Name</label> <input type='text'
				id='account' name='account' placeholder='Nhap vao ten tai khoan'>
			<br> <label for='pass'> Password </label> <input type='password'
rd' name='password' placeholder='Nhap vao mat khau'>
			<br> <label for='account'>Account Name</label> <input
				type='text' id='name' name='name' placeholder='Nhap vao ten'>
			<br> <label for='bob'>Day of birth</label> <input type='date'
				id='bob' name='bob'> <br> <label for='addess'>Address</label>
			<input type='text' id='addess' name='Address'
				placeholder='Nhap vao dia chi'> <br>

			<fieldset>
				<legend> Gender </legend>
				<label for='male'> Male </label> <input type='radio' id='male'
					name='Gender' value=0> <br> <label for='female'>
					Female </label> <input type='radio' id='female' name='Gender' value=1>
				<br> <label for='nonbi'> Non binary </label> <input
					type='radio' id='nonbi' name='Gender' value=2>

			</fieldset>
			<br> <input type="submit" value="Submit">
		</form>
	</div>
</body>
</html>