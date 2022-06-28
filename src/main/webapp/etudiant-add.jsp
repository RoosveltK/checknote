
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
									role="tab"><span
										class="d-block d-sm-none"><i
											class="fas fa-home"></i></span> <span class="d-none d-sm-block">Ajout Simple</a>
								</li>
								<li class="nav-item waves-effect waves-light"><a
									class="nav-link" data-toggle="tab" href="#profile-1" role="tab"><span
										class="d-block d-sm-none"><i
											class="far fa-user"></i></span> <span class="d-none d-sm-block">Ajout par fichier Excel</span></a>
								</li>

							</ul>
							<!-- Tab panes -->
							<div class="tab-content">
								<div class="tab-pane active p-3" id="home-1" role="tabpanel">
									<p class="mb-0">
									
									</p>
								</div>
								<div class="tab-pane p-3" id="profile-1" role="tabpanel">
									<p class="mb-0">Food truck fixie locavore, accusamus
										mcsweeney's marfa nulla single-origin coffee squid.
										Exercitation +1 labore velit, blog sartorial PBR leggings next
										level wes anderson artisan four loko farm-to-table craft beer
										twee. Qui photo booth letterpress, commodo enim craft beer
										mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo
										nostrud organic, assumenda labore aesthetic magna delectus
										mollit. Keytar helvetica VHS salvia yr, vero magna velit
										sapiente labore stumptown. Vegan fanny pack odio cillum wes
										anderson 8-bit.</p>
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

	<%@ include file="./components/footer.jsp"%>