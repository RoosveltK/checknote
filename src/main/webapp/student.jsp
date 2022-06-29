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
        <title>Veltrix - Responsive Bootstrap 4 Admin Dashboard</title>
        <meta content="Admin Dashboard" name="description" />
        <meta content="Themesbrand" name="author" />
        <link rel="shortcut icon" href="assets/images/favicon.ico" />
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
          <div class="topbar">
            <!-- LOGO -->
          <!-- Left Sidebar End --><!-- ============================================================== --><!-- Start right Content here --><!-- ============================================================== -->
          <div class="content-page">
            <!-- Start content -->
            <div class="content">
              <div class="container-fluid">
                <div class="page-title-box">
                  <div class="row align-items-center">
                    <div class="col-sm-6">
                      <div class="float-right d-none d-md-block">
                        <div class="dropdown">
                          <button
                            class="
                              btn btn-primary
                              dropdown-toggle
                              arrow-none
                              waves-effect waves-light
                            "
                            type="button"
                            data-toggle="dropdown"
                            aria-haspopup="true"
                            aria-expanded="false"
                          >
                            <i class="mdi mdi-settings mr-2"></i> Settings
                          </button>
                          <div class="dropdown-menu dropdown-menu-right">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another action</a>
                            <a class="dropdown-item" href="#"
                              >Something else here</a
                            >
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Separated link</a>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                <!-- end row -->
                <div class="row">
                  <div class="col-sm-12">
                    <div class="card">
                      <div class="card-body">
                        <h4 class="mt-0 header-title">Jquery Steps Wizard</h4>
                        <p class="text-muted m-b-30 font-14">
                          A powerful jQuery wizard plugin that supports
                          accessibility and HTML5
                        </p>
                        <form
                          id="form-horizontal"
                          class="form-horizontal form-wizard-wrapper"
                        >
                          <h3>Seller Details</h3>
                          <fieldset>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtFirstNameBilling"
                                    class="col-lg-3 col-form-label"
                                    >Contact Person</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtFirstNameBilling"
                                      name="txtFirstNameBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtLastNameBilling"
                                    class="col-lg-3 col-form-label"
                                    >Mobile No.</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtLastNameBilling"
                                      name="txtLastNameBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtCompanyBilling"
                                    class="col-lg-3 col-form-label"
                                    >Landline No.</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtCompanyBilling"
                                      name="txtCompanyBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtEmailAddressBilling"
                                    class="col-lg-3 col-form-label"
                                    >Email Address</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtEmailAddressBilling"
                                      name="txtEmailAddressBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtAddress1Billing"
                                    class="col-lg-3 col-form-label"
                                    >Address 1</label
                                  >
                                  <div class="col-lg-9">
                                    <textarea
                                      id="txtAddress1Billing"
                                      name="txtAddress1Billing"
                                      rows="4"
                                      class="form-control"
                                    ></textarea>
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtAddress2Billing"
                                    class="col-lg-3 col-form-label"
                                    >Warehouse Address</label
                                  >
                                  <div class="col-lg-9">
                                    <textarea
                                      id="txtAddress2Billing"
                                      name="txtAddress2Billing"
                                      rows="4"
                                      class="form-control"
                                    ></textarea>
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtCityBilling"
                                    class="col-lg-3 col-form-label"
                                    >Company Type</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtCityBilling"
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
                                    >Live Market A/C</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtStateProvinceBilling"
                                      name="txtStateProvinceBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtTelephoneBilling"
                                    class="col-lg-3 col-form-label"
                                    >Product Category</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtTelephoneBilling"
                                      name="txtTelephoneBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtFaxBilling"
                                    class="col-lg-3 col-form-label"
                                    >Product Sub Category</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtFaxBilling"
                                      name="txtFaxBilling"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                          </fieldset>
                          <h3>Company Document</h3>
                          <fieldset>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtFirstNameShipping"
                                    class="col-lg-3 col-form-label"
                                    >PAN Card</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtFirstNameShipping"
                                      name="txtFirstNameShipping"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtLastNameShipping"
                                    class="col-lg-3 col-form-label"
                                    >VAT/TIN No.</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtLastNameShipping"
                                      name="txtLastNameShipping"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtCompanyShipping"
                                    class="col-lg-3 col-form-label"
                                    >CST No.</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtCompanyShipping"
                                      name="txtCompanyShipping"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtEmailAddressShipping"
                                    class="col-lg-3 col-form-label"
                                    >Service Tax No.</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtEmailAddressShipping"
                                      name="txtEmailAddressShipping"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtCityShipping"
                                    class="col-lg-3 col-form-label"
                                    >Company UIN</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtCityShipping"
                                      name="txtCityShipping"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtStateProvinceShipping"
                                    class="col-lg-3 col-form-label"
                                    >Declaration</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtStateProvinceShipping"
                                      name="txtStateProvinceShipping"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                          </fieldset>
                          <h3>Bank Details</h3>
                          <fieldset>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtNameCard"
                                    class="col-lg-3 col-form-label"
                                    >Name on Card</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtNameCard"
                                      name="txtNameCard"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="ddlCreditCardType"
                                    class="col-lg-3 col-form-label"
                                    >Credit Card Type</label
                                  >
                                  <div class="col-lg-9">
                                    <select
                                      id="ddlCreditCardType"
                                      name="ddlCreditCardType"
                                      class="form-control"
                                    >
                                      <option value="">--Please Select--</option>
                                      <option value="AE">American Express</option>
                                      <option value="VI">Visa</option>
                                      <option value="MC">MasterCard</option>
                                      <option value="DI">Discover</option>
                                    </select>
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtCreditCardNumber"
                                    class="col-lg-3 col-form-label"
                                    >Credit Card Number</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtCreditCardNumber"
                                      name="txtCreditCardNumber"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtCardVerificationNumber"
                                    class="col-lg-3 col-form-label"
                                    >Card Verification Number</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtCardVerificationNumber"
                                      name="txtCardVerificationNumber"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                            <div class="row">
                              <div class="col-md-6">
                                <div class="form-group row">
                                  <label
                                    for="txtExpirationDate"
                                    class="col-lg-3 col-form-label"
                                    >Expiration Date</label
                                  >
                                  <div class="col-lg-9">
                                    <input
                                      id="txtExpirationDate"
                                      name="txtExpirationDate"
                                      type="text"
                                      class="form-control"
                                    />
                                  </div>
                                </div>
                              </div>
                            </div>
                          </fieldset>
                          <h3>Confirm Detail</h3>
                          <fieldset>
                            <div class="p-3">
                              <div class="custom-control custom-checkbox">
                                <input
                                  type="checkbox"
                                  class="custom-control-input"
                                  id="customCheck1"
                                />
                                <label
                                  class="custom-control-label"
                                  for="customCheck1"
                                  >I agree with the Terms and Conditions.</label
                                >
                              </div>
                            </div>
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
        <script>
          $(function () {
            $("#form-horizontal").steps({
              headerTag: "h3",
              bodyTag: "fieldset",
              transitionEffect: "slide",
            });
          });
        </script>
      </body>
      <!-- Mirrored from themesbrand.com/veltrix/layouts/vertical-dark/form-wizard.html by HTTrack Website Copier/3.x [XR&CO'2008], Wed, 20 Mar 2019 15:25:15 GMT -->
    </html>
    