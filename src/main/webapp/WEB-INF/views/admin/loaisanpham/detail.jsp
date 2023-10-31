<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <c:url value ="/" var = "rootPath"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FShop</title>
<link rel="icon" type="image/x-icon" href="https://i.pinimg.com/originals/ea/f9/80/eaf980fa041bc7ea985af5e5e300a5bc.png">
</head>
<body>
	<h1>Chi tiết danh mục </h1>
	<table border="1">
	<tr>
		<td>Tên danh mục</td>
		<td>${lsp.tenLoai }</td>
	</tr>
	<tr>
		<td>Trạng thái</td>
		<td>${lsp.trangThai==1? "hoạt động":"" }</td>
	</tr>
	<tr>
		<td>Metakeyword</td>
		<td>${lsp.metaKeyword }</td>
	</tr>
	<tr>
		<td>Metadescription</td>
		<td>${lsp.metaDescription }</td>
	</tr>
	</table>
	<a href="${rootPath }">Trang chủ</a>
</body>
</html>