
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>


<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Ues</h4>

					</div>
					<div class="col-sm-6">
						<div class="float-right d-none d-md-block">
							<div class="dropdown">
								<a
									class="btn btn-primary dropdown-toggle arrow-none waves-effect waves-light"
									href="ue?page=add"
									aria-expanded="false">

									<i class="mdi mdi-account-multiple-plus mr-2"></i> Ajouter 
								</a>

							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- end row -->
			<div class="row">
				<div class="col-12">
					<div class="card">
						<div class="card-body">

							<table id="datatable"
								class="table table-bordered dt-responsive nowrap"
								style="border-collapse: collapse; border-spacing: 0; width: 100%;">
								<thead>
									<tr>
										<th>Code</th>
										<th>Intitulé</th>
										<th>Actions</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${ues}" var="ue">
										<tr>
											<td><c:out value="${ue.code}" /></td>
											<td><c:out value="${ue.intitule}" /></td>
											<td>
											
												<i onclick="deleteUe'${ue.id}')" class="mdi mdi-delete mr-2 btn-ue"></i>
		
											
												<i onclick="editUe'${ue.id}')" class="mdi mdi-square-edit-outline mr-2 btn-ue"></i>
											
											</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
			<!-- container-fluid -->
		</div>
		<!-- content -->
		<footer class="footer"> © 2022 UY1 </footer>
	</div>
	<script src="assets/js/main2.js"></script>
	<%@ include file="./components/footer.jsp"%>