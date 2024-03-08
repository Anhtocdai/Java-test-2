<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="vn">
  <meta charset="UTF-8">
  <head>
    <title> HOME </title>
    <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        padding: 20px;
    }
    
    .dang-ki, .dang-nhap {
        margin: 20px 0;
        padding: 20px;
        border-radius: 5px;
        background-color: #fff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    
    .dang-ki a, .dang-nhap a {
        color: #333;
        text-decoration: none;
    }
    
    .dang-ki a:hover, .dang-nhap a:hover {
        color: #007BFF;
    }
    
    h2 {
        font-size: 1.5em;
        margin-bottom: 10px;
    }
</style>
    
    </head>

    <body>
<div class = "dang-ki">
    <a href = "http://localhost:8081/new-jdbc-12-2023/dang-ki" target="_blank"> <h2> ĐĂNG KÍ TÀI KHOẢN TẠI ĐÂY </h2> </a>
    </div>
    <div class="dang-nhap">
        <a href = "http://localhost:8081/new-jdbc-12-2023/dang-nhap" target="_blank"> <h2> ĐÃ CÓ TÀI KHOẢN? ĐĂNG NHẬP TẠI ĐÂY </h2> </a>
    </div>

    </body>

    </html>
