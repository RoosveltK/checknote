
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>


<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Ajout Ues</h4>

					</div>

				</div>
			</div>
			<!-- end row -->
			<div class="row">
				<div class="col-12">
					<div class="card">
						<div class="card-body">

							<div class="mb-0">

								<div class="row">
									<div class="form-group col">
										<label>Code</label>
										<div>
											<input type="text" name="code" id="code" class="form-control"
												required placeholder="Entrer le code" />
										</div>
									</div>
									<div class="form-group col">
										<label>Intitulé</label>
										<div>
											<input type="text" name="intitule" id="intitule"
												class="form-control" required
												placeholder="Entrer l'intitulé" />
										</div>
									</div>
								</div>
								<div class="row">
									<div class="form-group col">
										<label>Classe</label>
										<div>
											<select class="form-control" id="classe" name="classe">
												<option value="">Sélectionnez la classe de
													l'étudiant</option>
												<c:forEach items="${classes}" var="classe">
													<option value="${classe.id}">
														<c:out value="${classe.cycle}" />
														<c:out value="${classe.level}" /> -
														<c:out value="${classe.departement}" />
													</option>
												</c:forEach>
											</select>
										</div>
									</div>
								</div>
								<div class="row">
									<div class="col" id="info"></div>
								</div>
								<div class="row">
									<div class="col">
										<button
											class="btn btn-primary dropdown-toggle arrow-none waves-effect waves-light"
											type="submit" onclick="addNote()">Ajouter</button>
									</div>
								</div>


							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- container-fluid -->
		</div>
		<!-- content -->
		<footer class="footer"> © 2022 UY1 </footer>
	</div>
	<script src="assets/js/mainUe.js"></script>
	<%@ include file="./components/footer.jsp"%>