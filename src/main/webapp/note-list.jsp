
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>


<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Notes</h4>

					</div>
					<div class="col-sm-6">
						<div class="float-right d-none d-md-block">
							<div class="dropdown">
								<a
									class="btn btn-primary dropdown-toggle arrow-none waves-effect waves-light"
									href="note?page=add" aria-expanded="false"> <i
									class="mdi mdi-account-multiple-plus mr-2"></i> Ajouter
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
										<th>Code Ue</th>
										<th>Matricule etudiant</th>
										<th>Nom etudiant</th>
										<th>Examen</th>
										<th>Note /20</th>
										<th>Actions</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${notes}" var="note">
										<tr>
											<td><c:out value="${note.ue.code}" /></td>
											<td><c:out value="${note.user.matricule}" /></td>
											<td><c:out value="${note.user.first_name}" /></td>
											<td><c:out value="${note.examen}" /></td>
											<td><c:out value="${note.value}" /></td>
											<td><i onclick="deleteUe(${note.id})"
												class="mdi mdi-delete mr-2 btn-ue"></i> <i
												onclick="editUe(${note.id})"
												class="mdi mdi-square-edit-outline mr-2 btn-ue"></i></td>
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