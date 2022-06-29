
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>


<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Ajout note</h4>

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
											<label>Examen</label>
											<div>
												<select class="form-control" id="examen" name="examen">
													<option value="">Sélectionnez l'examen</option>
													<option value="CC">CC</option>
													<option value="SN">SN</option>
													<option value="TP">TP</option>
												</select>
											</div>
										</div>
										<div class="form-group col">
											<label>Ue</label>
											<div>
												<select class="form-control" id="ue" name="ue">
													<option value="">Sélectionnez l'ue</option>
													<c:forEach items="${ues}" var="ue">
														<option value="${ue.id}">
															<c:out value="${ue.code}" /> -
															<c:out value="${ue.intitule}" />
														</option>
													</c:forEach>
												</select>
											</div>
										</div>
									</div>
									<div class="row">
										<div class="form-group col">
											<label>Note</label>
											<div>
												<input type="number" name="note" id="note"
													class="form-control" required placeholder="Entrer la note" />
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
	<script src="assets/js/mainNote.js"></script>
	<%@ include file="./components/footer.jsp"%>