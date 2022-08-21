<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">


				<h1 class="text-center mb-3">Welcome To Product App</h1>

				<table class="table table-dark">
					<thead>
						<tr>
							<th scope="col">Sl no</th>
							<th scope="col">Product Name</th>
							<th scope="col">Description</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>

						</tr>
					</thead>
					<tbody>

						<c:forEach items="${prods}" var="p">
							<tr>
								<th scope="row">${ p.pid }</th>
								<td>${p.pname}</td>
								<td>${ p.pDecspt}</td>
								<td>${ p.price}</td>
								<td><a href="delete/${p.pid}"><i
										class="fas fa-trash-alt"></i> </a> <a href="update/${p.pid }">
										<i class="far fa-edit"></i>
								</a></td>

							</tr>

						</c:forEach>

					</tbody>
				</table>

				<div class="container text-center">

					<a href="addprod" class="btn btn-outline-success">Add Product</a>

				</div>



			</div>
		</div>
	</div>













</body>
</html>
