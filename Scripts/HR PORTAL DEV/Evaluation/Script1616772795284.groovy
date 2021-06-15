import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hrportaldev.iohub.pt/HRPortal_TH/Login.aspx')

WebUI.setText(findTestObject('Object Repository/HRPORTALDEV/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_6b2e3e'), 
    'celia.roma.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/HRPORTALDEV/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_0204d7'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_048b02'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_HomePage/div_EvaluationParticipate in the evaluation_0f9c39'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_HomePage/a_My Evaluation'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/a_360 Evaluation'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/input_DEV_HRPortal_TH_wt50blockOutSystemsUI_e0a77c'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/input_This is a Client feedback_HRPortal_TH_3db7ab'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/input_DEV_HRPortal_TH_wt50blockOutSystemsUI_958a09'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/input_Sample File OSQuay_HRPortal_TH_wt50bl_0d02fe'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/span_Management_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/a_Manager Evaluation'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/input_Manager Evaluation_HRPortal_TH_wt28bl_c79025'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/input_Lisete Medeiros_HRPortal_TH_wt28block_a0f221'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/span_Management_Menu_DropDownArrow_1'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluations/a_All Eval - Behaviors'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_All Eval-Behaviors/span_Configurations_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_All Eval-Behaviors/a_Evaluation Periods'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluation Periods/input_Evaluation Periods_HRPortal_TH_wt22bl_83e66d'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_New Period/input_Setting as active will turn all other_cc0e70'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluation Periods/span_Configurations_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Evaluation Periods/a_Behaviors'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Behaviors/input_Behaviors_HRPortal_TH_wt50blockOutSys_337910'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_New Behavior/input_X Beyond Challenge_HRPortal_TH_wt63bl_123690'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Behaviors/span_Configurations_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Behaviors/a_KPI Types'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Type KPIS/input_Type KPIS_HRPortal_TH_wt27blockOutSys_13a560'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_New Type KPI/input_Is Negotiable_HRPortal_TH_wt3blockOut_94928c'))

