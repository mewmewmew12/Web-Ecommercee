<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <c:url value = "/" var = "rootPath">
   </c:url>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FShop</title>
<link rel="icon" type="image/x-icon" href="https://i.pinimg.com/originals/ea/f9/80/eaf980fa041bc7ea985af5e5e300a5bc.png">
<style type="text/css">
	.middle{
		text-align:center;
	}
</style>
</head>
<body>
	<h1 class="middle">Quản lý danh mục</h1>
	<hr>
	<a align ="center" href = "${rootPath }loaisanpham/initInsert">Thêm mới danh mục</a>
	<hr>
	<form class ="middle" action="${rootPath }loaisanpham/search" method="get">
		<input type = "text" name="search" maxlength="50" placeholder="Tên danh mục" value = "${search }"> <input type = "submit" value = "tìm kiếm">
	</form>
	<table border="1" align = "center">
	<tr>
		<th>Mã_lsp</th>
		<th>Tên_loại</th>
		<th>trạng thái</th>
		<th>meta_keyword</th>
		<th>meta_description</th>
		<th>Cập nhật</th>
		<th>Xóa</th>
	</tr>
	<c:forEach items ="${lstlsp}" var = "lsp">
		<tr>
			<td><a href="${rootPath }loaisanpham/detail?idlsp=${lsp.id}">${lsp.id }</a> </td>
			<td>${lsp.tenLoai }</td>
			<td>${lsp.trangThai }</td>
			<td>${lsp.metaKeyword }</td>
			<td>${lsp.metaDescription }</td>
			<th align = "center"> 
				<a href ="${rootPath }loaisanpham/initUpdate?idlsp=${lsp.id}">
					<img alt="" src="${rootPath }public/images/update.png">
				</a>
			</th>
			<th align = "center"> 
				<a href ="${rootPath }loaisanpham/delete?idlsp=${lsp.id}">
					<img alt="" src="${rootPath }public/images/delete.png">
				</a>
			</th>
		</tr>
		
	</c:forEach>
	</table>
</body>
</html>