<!--Chartist Chart CSS -->
<link rel="stylesheet" href="plugins/chartist/css/chartist.min.css" />
<link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/metismenu.min.css" rel="stylesheet" type="text/css" />
<link href="assets/css/icons.css" rel="stylesheet" type="text/css" />
<link href="assets/css/style.css" rel="stylesheet" type="text/css" />
<div class="container-fluid">
  <div class="page-title-box">
    <div class="row align-items-center">
      <div class="col-sm-6">
        <h4 class="page-title">Form Wizard</h4>
        <ol class="breadcrumb">
          <li class="breadcrumb-item">
            <a href="javascript:void(0);">Veltrix</a>
          </li>
          <li class="breadcrumb-item">
            <a href="javascript:void(0);">Forms</a>
          </li>
          <li class="breadcrumb-item active">Form Wizard</li>
        </ol>
      </div>
      <div class="col-sm-6">
        <div class="float-right d-none d-md-block">
          <div class="dropdown">
            <button
              class="btn btn-primary dropdown-toggle arrow-none waves-effect waves-light"
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
              <a class="dropdown-item" href="#">Something else here</a>
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
            A powerful jQuery wizard plugin that supports accessibility and
            HTML5
          </p>
          <form
            id="form-horizontal"
            class="form-horizontal form-wizard-wrapper wizard clearfix"
            role="application"
          >
            <div class="steps clearfix">
              <ul role="tablist">
                <li
                  role="tab"
                  class="first done"
                  aria-disabled="false"
                  aria-selected="false"
                >
                  <a
                    id="form-horizontal-t-0"
                    href="#form-horizontal-h-0"
                    aria-controls="form-horizontal-p-0"
                    ><span class="number">1.</span> Seller Details</a
                  >
                </li>
                <li
                  role="tab"
                  class="done"
                  aria-disabled="false"
                  aria-selected="false"
                >
                  <a
                    id="form-horizontal-t-1"
                    href="#form-horizontal-h-1"
                    aria-controls="form-horizontal-p-1"
                    ><span class="number">2.</span> Company Document</a
                  >
                </li>
                <li
                  role="tab"
                  class="current"
                  aria-disabled="false"
                  aria-selected="true"
                >
                  <a
                    id="form-horizontal-t-2"
                    href="#form-horizontal-h-2"
                    aria-controls="form-horizontal-p-2"
                    ><span class="current-info audible">current step: </span
                    ><span class="number">3.</span> Bank Details</a
                  >
                </li>
                <li role="tab" class="disabled last" aria-disabled="true">
                  <a
                    id="form-horizontal-t-3"
                    href="#form-horizontal-h-3"
                    aria-controls="form-horizontal-p-3"
                    ><span class="number">4.</span> Confirm Detail</a
                  >
                </li>
              </ul>
            </div>
            <div class="content clearfix">
              <h3 id="form-horizontal-h-0" tabindex="-1" class="title">
                Seller Details
              </h3>
              <fieldset
                id="form-horizontal-p-0"
                role="tabpanel"
                aria-labelledby="form-horizontal-h-0"
                class="body"
                aria-hidden="true"
                style="display: none"
              >
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
                      <label for="txtFaxBilling" class="col-lg-3 col-form-label"
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
              <h3 id="form-horizontal-h-1" tabindex="-1" class="title">
                Company Document
              </h3>
              <fieldset
                id="form-horizontal-p-1"
                role="tabpanel"
                aria-labelledby="form-horizontal-h-1"
                class="body"
                aria-hidden="true"
                style="display: none"
              >
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
              <h3 id="form-horizontal-h-2" tabindex="-1" class="title current">
                Bank Details
              </h3>
              <fieldset
                id="form-horizontal-p-2"
                role="tabpanel"
                aria-labelledby="form-horizontal-h-2"
                class="body current"
                aria-hidden="false"
                style=""
              >
                <div class="row">
                  <div class="col-md-6">
                    <div class="form-group row">
                      <label for="txtNameCard" class="col-lg-3 col-form-label"
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
              <h3 id="form-horizontal-h-3" tabindex="-1" class="title">
                Confirm Detail
              </h3>
              <fieldset
                id="form-horizontal-p-3"
                role="tabpanel"
                aria-labelledby="form-horizontal-h-3"
                class="body"
                aria-hidden="true"
                style="display: none"
              >
                <div class="p-3">
                  <div class="custom-control custom-checkbox">
                    <input
                      type="checkbox"
                      class="custom-control-input"
                      id="customCheck1"
                    />
                    <label class="custom-control-label" for="customCheck1"
                      >I agree with the Terms and Conditions.</label
                    >
                  </div>
                </div>
              </fieldset>
            </div>
            <div class="actions clearfix">
              <ul role="menu" aria-label="Pagination">
                <li class="" aria-disabled="false">
                  <a href="#previous" role="menuitem">Précédent</a>
                </li>
                <li aria-hidden="false" aria-disabled="false">
                  <a href="#next" role="menuitem">Suivant</a>
                </li>
                <li aria-hidden="true" style="display: none">
                  <a href="#finish" role="menuitem">Terminé</a>
                </li>
              </ul>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
  <!-- end row -->
</div>

<%@ include file="./components/footer.jsp"%>
