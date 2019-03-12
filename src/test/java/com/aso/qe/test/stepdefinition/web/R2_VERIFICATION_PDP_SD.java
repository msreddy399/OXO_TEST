/*
 * package com.aso.qe.test.stepdefinition.web;
 * 
 * import static org.junit.Assert.assertTrue;
 * 
 * import java.util.List;
 * 
 * import org.apache.log4j.Logger; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * import com.aso.qe.framework.common.CommonActionHelper; import
 * com.aso.qe.test.pageobject.R2_Cart_PO; import
 * com.aso.qe.test.pageobject.R2_PDP_PO;
 * 
 * import cucumber.api.DataTable; import cucumber.api.java.en.Then; import
 * freemarker.template.utility.NullArgumentException;
 * 
 * public class R2_VERIFICATION_PDP_SD extends CommonActionHelper {
 * 
 * private static final Logger logger =
 * Logger.getLogger(R2_VERIFICATION_MYACCOUNT_SD.class);
 * 
 * @Then("^Verify below Sub/Main Module of PDP$") public void
 * Verify_below_Sub_Main_Module_of_My_Account(DataTable arg1) throws Throwable {
 * 
 * try { List<List<String>> elements = arg1.raw(); for (int i = 1; i <
 * elements.size(); i++) { String currentElement = elements.get(i).get(0); //
 * =============================================================================
 * == //// PDP //
 * =============================================================================
 * == if (currentElement.equalsIgnoreCase("EnableBuyNow_btn"))
 * assertTrue(isDisplayed(r2PdpPo.EnableBuyNow_btn)); else if
 * (currentElement.equalsIgnoreCase("Shipping_First_Name_txt"))
 * assertTrue(isDisplayed(r2PdpPo.Shipping_First_Name_txt)); else {
 * logger.error("Element <" + currentElement +
 * "> is not found in the SD list."); throw new
 * NullArgumentException("Element <" + currentElement +
 * "> is not found in the SD list."); }
 * 
 * } } catch (NullPointerException e) {
 * logger.error("This test-step has been failed"); }
 * 
 * } }
 */