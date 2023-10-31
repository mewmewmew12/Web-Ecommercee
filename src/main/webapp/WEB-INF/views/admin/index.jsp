<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
   <s:url value = "/" var = "rootPath"></s:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FShop</title>
<link rel="icon" type="image/x-icon" href="https://i.pinimg.com/originals/ea/f9/80/eaf980fa041bc7ea985af5e5e300a5bc.png">
</head>
<body>
	<h1>Quản Lý Shop Bán điện thoại</h1>
	<img alt="ảnh sản phẩm" src="${rootPath }public/">
	<hr>
	<a href="${rootPath}loaisanpham">Quản lý danh mục sản phẩm</a>
	<br>
	<a href="${rootPath}sanpham">Quản lý sản phẩm</a>
	<br>
	<a href="${rootPath}"></a>
</body>
</html>