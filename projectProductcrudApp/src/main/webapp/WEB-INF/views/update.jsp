
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6  offset-md-3">


				<h1 class="text-center mb-3">Change Product Details</h1>
				<form action="${pageContext.request.contextPath}/handle-product" method="post">

					<input type="hidden" value="${product.pid }" name="pid">
					
					<div class="form-group">
						<label>Product Name</label> <input type="text"
							class="form-control" name="pname" value="${ product.pname}">
					</div>

					<div class="form-group">
						<label>Description</label>
						<textarea rows="5" name="pDecspt" class="form-control">"${product.pDecspt}" </textarea>
					</div>


					<div class="form-group">
						<label>Price</label> <input type="text" class="form-control"
							name="price" value="${product.price }">
					</div>


					<div></div>

					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Update</button>

				</form>














			</div>






		</div>








	</div>










</body>
</html>