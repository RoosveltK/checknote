
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>


<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Etudiants</h4>

					</div>
					<div class="col-sm-6">
						<div class="float-right d-none d-md-block">
							<div class="dropdown">
								<button
									class="btn btn-primary dropdown-toggle arrow-none waves-effect waves-light"
									type="button" data-toggle="dropdown" aria-haspopup="true"
									aria-expanded="false">

									<i class="mdi mdi-account-multiple-plus mr-2"></i> Ajouter 
								</button>

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
										<th>Matricule</th>
										<th>Nom</th>
										<th>Prénom</th>
										<th>Numéro téléphone</th>
										<th>Actions</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${etudiants}" var="etudiant">
										<tr>
											<td><c:out value="${etudiant.matricule}" /></td>
											<td><c:out value="${etudiant.first_name}" /></td>
											<td><c:out value="${etudiant.last_name}" /></td>
											<td><c:out value="${etudiant.telephone}" /></td>
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

	<%@ include file="./components/footer.jsp"%>