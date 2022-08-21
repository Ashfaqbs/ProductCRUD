
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


				<h1 class="text-center mb-3">Fill The Product Details</h1>
				<form action="handle-product" method="post">


					<div class="form-group">
						<label>Product Name</label> <input type="text"
							class="form-control" name="pname">
					</div>

					<div class="form-group">
						<label>Description</label>
						<textarea rows="5" name="pDecspt" class="form-control"> </textarea>
					</div>


					<div class="form-group">
						<label>Price</label> <input type="text" class="form-control"
							name="price">
					</div>


					<div></div>

					<a href="${pageContext.request.contextPath }/"
						class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-primary">Add</button>

				</form>














			</div>






		</div>








	</div>










</body>
</html>