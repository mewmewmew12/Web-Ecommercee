<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
    <%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <c:url value="/" var = "rootPath"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FShop</title>
<link rel="icon" type="image/x-icon" href="https://i.pinimg.com/originals/ea/f9/80/eaf980fa041bc7ea985af5e5e300a5bc.png">
<style type="text/css">
	.box-ok{
		color : blue;
	}
	.box-err{
		color : red;
	}
</style>
</head>
<body>
	<h1>Thêm danh mục </h1>
	<span class="box-ok">${msg }</span> 
	<span class= "box-err">${msgErr }</span>
	<sf:form action="${rootPath }loaisanpham/insert" method="POST" modelAttribute="lsp" enctype = "multipart/form-data">
	<table border="1">	
		<tr>
			<td>Tên loại</td>
			<td> <sf:input type ="text" path="tenLoai"/> </td>
		</tr>
		<tr>
			<td>Image</td>
			<td> <input type ="file" name = "imageName"> </td>
		</tr>
		<tr>
			<td>Trạng thái</td>
			<td> <sf:checkbox path = "trangThai" value ="1"/> </td>
		</tr><tr>
			<td>Meta keyword</td>
			<td> <sf:input type ="text" path="metaKeyword"/> </td>
		</tr>
		<tr>
			<td>Meta Description</td>
			<td> <sf:input type ="text" path="metaDescription"/> </td>
		</tr>
		<tr>
			<td> <input type ="submit" value = "Insert">
				<input type ="reset" value ="clear">
			</td>
		</tr>
	</table>
	</sf:form>
	<hr>
	<a href="${rootPath}">Trang chủ</a>
</body>
</html>