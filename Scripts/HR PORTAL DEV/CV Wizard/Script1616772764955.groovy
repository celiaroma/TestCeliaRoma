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

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_HomePage/div_CV WizardBuild your CV'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_CVInfo/a_Unassigned CVs'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Employee Info/a_Employees CVs'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Employees/span_Backoffice'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Employees/a_Skills'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Skills/span_Backoffice_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Skills/a_Titles'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Titles/input_Titles_HRPortal_TH_wt39blockOutSystem_0eb459'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Titles/input_Name_HRPortal_TH_wt39blockOutSystemsU_d5395c'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Titles/span_Backoffice_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Titles/a_Skills'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Skills/input_Skills_HRPortal_TH_wt41blockOutSystem_fd710f'))

WebUI.click(findTestObject('Object Repository/HRPORTALDEV/Page_Skills/input_Is Default_HRPortal_TH_wt41blockOutSy_6b7d46'))

