<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
    <c:url value = "/" var = "rootPath"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FShop</title>
<style type="text/css">
	.box-err{
		color:red;
	}
	.box-ok{
	color : blue;
	}
</style>
<link rel="icon" type="image/x-icon" href="https://i.pinimg.com/originals/ea/f9/80/eaf980fa041bc7ea985af5e5e300a5bc.png">
</head>
<body>
	<h1 align ="center" >Cập nhật Danh Mục </h1>
	<span class ="box-ok">${msg}</span> <span class ="box-err">${msgErr }</span>
	<sf:form action="${rootPath }loaisanpham/update" method="POST" modelAttribute="lsp" enctype = "multipart/form-data">
		<table align ="center" border="1">
		<tr>
			<td>Mã loại</td>
			<td> <sf:input type ="number" path="id" readonly="true"/>
			 </td>
		</tr>
			<tr>
			<td>Tên loại</td>
			<td> <sf:input type ="text" path="tenLoai"/>
				<sf:errors path ="tenLoai" cssClass="box-err"></sf:errors>
			 </td>
		</tr>
				<tr>
			<td>Image</td>
			<td> 
				<input type ="file" name = "imageName">
			 </td>
		</tr>
		<tr>
			<td>Trạng thái</td>
			<td> <sf:checkbox path = "trangThai" value ="1"/>
			<sf:errors path ="trangThai" cssClass="box-err"></sf:errors> </td>
		</tr><tr>
			<td>Meta keyword</td>
			<td> <sf:input type ="text" path="metaKeyword"/> 
			<sf:errors path ="metaKeyword" cssClass="box-err"></sf:errors></td>
		</tr>
		<tr>
			<td>Meta Description</td>
			<td> <sf:input type ="text" path="metaDescription"/> 
			<sf:errors path ="metaDescription" cssClass="box-err"></sf:errors></td>
		</tr>
		<tr>
			<td> <input type ="submit" value = "Insert">
				<input type ="reset" value ="clear">
			</td>
		</tr>
		</table>
	</sf:form>
</body>
</html>