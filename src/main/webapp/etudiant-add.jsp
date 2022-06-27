
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>


<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Ajout etudiants</h4>

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

							<ul class="nav nav-pills nav-justified" role="tablist">
								<li class="nav-item waves-effect waves-light"><a
									class="nav-link active" data-toggle="tab" href="#home-1"
									role="tab"><span class="d-block d-sm-none"><i
											class="fas fa-home"></i></span> <span class="d-none d-sm-block">Ajout
											Simple</a></li>
								<li class="nav-item waves-effect waves-light"><a
									class="nav-link" data-toggle="tab" href="#profile-1" role="tab"><span
										class="d-block d-sm-none"><i class="far fa-user"></i></span> <span
										class="d-none d-sm-block">Ajout par fichier Excel</span></a></li>

							</ul>
							<!-- Tab panes -->
							<div class="tab-content">
								<div class="tab-pane active p-3" id="home-1" role="tabpanel">
									<p class="mb-0">
									<div class="row">
										<div class="form-group col">
											<label>Nom</label>
											<div>
												<input type="text" name="nom" id="nom" class="form-control"
													required placeholder="Entrer le nom de l'étudiant" />
											</div>
										</div>
										<div class="form-group col">
											<label>Prénom</label>
											<div>
												<input type="text" name="prenom" id="prenom"
													class="form-control" required
													placeholder="Entrer le prénom de l'étudiant" />
											</div>
										</div>
									</div>
									<div class="row">
										<div class="form-group col">
											<label>Téléphone</label>
											<div>
												<input type="text" name="telephone" id="telephone"
													class="form-control" required
													placeholder="Entrer le numéro de l'étudiant" />
											</div>
										</div>
										<div class="form-group col">
											<label>Matricule</label>
											<div>
												<input type="text" name="matricule" id="matricule"
													class="form-control" required
													placeholder="Entrer le matricule de l'étudiant" />
											</div>
										</div>
									</div>
									<div class="row">
										<div class="form-group col">
											<label>Classe</label>
											<div>
												<select class="form-control" id="classe" name="classe">
													<option value="">Sélectionnez la classe de l'étudiant</option>
														<c:forEach items="${classes}" var="classe">
														<option value="${classe.id}">
															<c:out value="${classe.cycle}" />
															<c:out value="${classe.level}" />
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
												type="submit" onclick="addStudent()">Ajouter</button>
										</div>
									</div>

									</p>
								</div>
								<div class="tab-pane p-3" id="profile-1" role="tabpanel">

									<div class="text-center m-t-15">
										<button type="button"
											class="btn btn-primary waves-effect waves-light">
											Send Files</button>
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
	<script src="assets/js/main1.js"></script>
	<%@ include file="./components/footer.jsp"%>