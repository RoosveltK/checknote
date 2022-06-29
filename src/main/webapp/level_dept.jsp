
<%@ include file="./components/header.jsp"%>
<%@ include file="./components/side-menu.jsp"%>



<div class="content-page">
	<!-- Start content -->
	<div class="content">
		<div class="container-fluid">
			<div class="page-title-box">
				<div class="row align-items-center">
					<div class="col-sm-6">
						<h4 class="page-title">Classe</h4>

					</div>
					<div class="col-sm-6">
						<div class="float-right d-none d-md-block">
							<div class="dropdown">
								<button type="button" class="btn btn-primary waves-effect waves-light" data-toggle="modal" data-target=".bs-example-modal-lg">
                            		Ajouter
                          		</button>
								
						<div class="modal fade bs-example-modal-lg" tabindex="-1" id="create_modal_id" role="dialog" aria-labelledby=myModal style="display: none;" aria-hidden="true">
                          <div class="modal-dialog modal-lg">
                            <div class="modal-content">
                              <div class="modal-header">
                                <h5 class="modal-title mt-0" id="myLargeModalLabel">
                                  Ajouter des salles
                                </h5>
                                <button type="button" class="close" id = "close_modal_id" data-dismiss="modal" aria-hidden="true">
                                  �
                                </button>
                              </div>
                              <div class="modal-body">
                              
                              		<form>
                                            <div class="form-group">
                                                <label class="control-label"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Departement</font></font></label>
                                                <select class="form-control select2 select2-hidden-accessible" id="departement_id"  tabindex="-1" aria-hidden="true">
                                                    	<option value="informatique"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">informatique</font></font></option>
                                                    	<option value="mathematique"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">mathematique</font></font></option>
                                                    	<option value="bios"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">bios</font></font></option>
                                                    	<option value="chimie"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">chimie</font></font></option>
                                                    	<option value="physique"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">physique</font></font></option>
                                                </select>
                                             </div>
                                            <div class="form-group">
                                                <label class="control-label"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Cycle</font></font></label>
                                                <select class="form-control select2 select2-hidden-accessible" id="cycle_id"  tabindex="-1" aria-hidden="true">
                                                    	<option value="licence"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">licence</font></font></option>
                                                    	<option value="master"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">master</font></font></option>
                                                    	<option value="doctorat"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">doctorat</font></font></option>
                                                </select>
                                             </div>
                                             
                                      	<div class="form-group row">
                                            <label for="example-number-input" class="col-sm-2 col-form-label"><font style="vertical-align: inherit;"><font style="vertical-align: inherit;">Niveau</font></font></label>
                                            <div class="col-sm-10"><input class="form-control" type="number" value="1" id="level_id"></div>
                                        </div>
                                        </form>
                            	</div>
                              	
	                              <div class="modal-footer">
		                            <button type="button" class="btn btn-primary" onclick="createClasse()">
		                              Enregistrer
		                            </button>
		                            <button type="button" class="btn btn-secondary" data-dismiss="modal">
		                              Annuler
		                            </button>
	                          	</div>
                              
                              </div>
                            </div>
                            <!-- /.modal-content -->
                          </div>
                          <!-- /.modal-dialog -->
                        </div>
								
							

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
										<th>Departement</th>
										<th>Cycle</th>
										<th>Niveau</th>
									</tr>
								</thead>
								<tbody id="table_id">
									<c:forEach items="${classes}" var="classe">
										<tr>
											<td> <c:out value="${classe.departement}"/></td>
											<td> <c:out value="${classe.cycle}"/></td>
											<td> <c:out value="${classe.level}"/></td>
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
		<footer class="footer"> � 2022 UY1 </footer>
	</div>
	
	
  <!-- Ajax to Java File Upload Logic -->
  <script>	
   async function createClasse() {

	    
	    await fetch('classe', {
	      method: "POST", 
	      body: JSON.stringify({
	    	  level: level_id.value,
	    	  departement:  departement_id.value,
	          cycle: cycle_id.value,
	      }),
	      /* headers: {
	          'Content-type': 'application/json'
	      } */
	    }).then((value) => {
            console.log(value);
        }).catch((value) => {
            console.log(value);
        })
	    
       	let close_modal = document.getElementById("close_modal_id");
	    close_modal.click();
      
	  }
  </script>

<%@ include file="./components/footer.jsp"%>