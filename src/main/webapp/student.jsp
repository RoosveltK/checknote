<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%><!DOCTYPE html>
<html lang="en">
  <!-- Mirrored from themesbrand.com/veltrix/layouts/vertical-dark/form-wizard.html by HTTrack Website Copier/3.x [XR&CO'2008], Wed, 20 Mar 2019 15:25:14 GMT -->
  <head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta
      name="viewport"
      content="width=device-width,initial-scale=1,user-scalable=0,minimal-ui"
    />
    <title>Check Note</title>
    <meta content="Admin Dashboard" name="description" />
    <meta content="Themesbrand" name="author" />
    <!--Jquery steps CSS -->
    <link rel="stylesheet" href="plugins/jquery-steps/jquery.steps.css" />
    <link
      href="assets/css/bootstrap.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="assets/css/metismenu.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <link href="assets/css/icons.css" rel="stylesheet" type="text/css" />
    <link href="assets/css/style.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <!-- Begin page -->
    <div id="wrapper">
      <!-- Top Bar Start -->
      <!-- LOGO -->
      <!-- Left Sidebar End --><!-- ============================================================== --><!-- Start right Content here --><!-- ============================================================== -->
      <div class="content-page" style="margin-left: 0px">
        <!-- Start content -->
        <div class="content">
          <div class="container">
            <div class="row">
              <div class="col-sm-12">
                <div class="card">
                  <div class="card-body">
                    <h4 class="mt-0 header-title">Check Note</h4>
                    <p class="text-muted m-b-30 font-14">
                      Consulter vos notes ou pour un camarade à partir du
                      matricule, la personne recevra une notification par SMS
                      contenant sa note
                      <br />
                      Toutes les notes seront sur 20
                    </p>
                    <form
                      id="check_note_form"
                      class="form-horizontal form-wizard-wrapper"
                    >
                      <h3>Informations</h3>
                      <fieldset>
                        <div class="row">
                          <div class="col-md-6">
                            <div class="form-group row">
                              <label
                                for="txtCityBilling"
                                class="col-lg-3 col-form-label"
                                >Matricule</label
                              >
                              <div class="col-lg-9">
                                <input
                                  id="id_matricule"
                                  placeholder="Entrer le matricule"
                                  name="txtCityBilling"
                                  type="text"
                                  class="form-control"
                                />
                              </div>
                            </div>
                          </div>
                          <div class="col-md-6">
                            <div class="form-group row">
                              <label
                                for="txtStateProvinceBilling"
                                class="col-lg-3 col-form-label"
                                >Examen</label
                              >
                              <div class="col-lg-9">
                                <select
                                  class="form-control select2 select2-hidden-accessible"
                                  id="id_examen"
                                  tabindex="-1"
                                  aria-hidden="true"
                                >
                                  <option value="CC">
                                    CC - Controle Continu
                                  </option>
                                  <option value="TP">
                                    TP - Travaux Pratique
                                  </option>
                                  <option value="SN">
                                    SN - Session Normale
                                  </option>
                                </select>
                              </div>
                            </div>
                          </div>
                        </div>
                      </fieldset>
                      <h3>Unité d'enseignement</h3>
                      <fieldset>
                        <div class="row">
                          <label for="txtFirstNameShipping" class="col-1"
                            >UE</label
                          >
                          <div class="col-md-9">
                            <select
                              class="form-control select2 select2-hidden-accessible"
                              id="id_ue"
                              tabindex="-1"
                              aria-hidden="true"
                            >
                              <option value="licence">Licence</option>
                              <option value="master">Master</option>
                              <option value="doctorat">Doctorat</option>
                            </select>
                          </div>
                        </div>
                      </fieldset>
                      <h3>Résultat</h3>
                      <fieldset>
                        <p class="card-text" id="recpet_accuse">
                          Veillier renseigner des informations valides
                        </p>
                      </fieldset>
                    </form>
                  </div>
                </div>
              </div>
            </div>
            <!-- end row -->
          </div>
          <!-- container-fluid -->
        </div>
      </div>
      <!-- ============================================================== --><!-- End Right content here --><!-- ============================================================== -->
    </div>
    <!-- END wrapper --><!-- jQuery  -->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.bundle.min.js"></script>
    <script src="assets/js/metisMenu.min.js"></script>
    <script src="assets/js/jquery.slimscroll.js"></script>
    <script src="assets/js/waves.min.js"></script>
    <!-- form wizard -->
    <script src="plugins/jquery-steps/jquery.steps.min.js"></script>
    <!-- App js -->
    <script src="assets/js/app.js"></script>
    <script src="assets/js/app.js"></script>
    <script src="assets/js/student.js"></script>
  </body>
  <!-- Mirrored from themesbrand.com/veltrix/layouts/vertical-dark/form-wizard.html by HTTrack Website Copier/3.x [XR&CO'2008], Wed, 20 Mar 2019 15:25:15 GMT -->
</html>
