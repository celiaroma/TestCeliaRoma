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

WebUI.setText(findTestObject('Object Repository/09072021 Allocations/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_6b2e3e'), 
    'celia.roma.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/09072021 Allocations/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_0204d7'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_048b02'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_HomePage/div_EvaluationParticipate in the evaluation_0f9c39'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_HomePage/img_Skip to Content (Press Enter)_max-width_5443df'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_HomePage/div_AllocationsManage projects and resources'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_AllocationCalendar/a_List Of Employees'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_List Of Employees/a_Projects'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_Projects/a_Management'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_Projects/span_Grant Roles'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_Grant Roles/span_Celia Roma_fa fa-fw fa-angle-down fa-lg'))

WebUI.click(findTestObject('Object Repository/09072021 Allocations/Page_Grant Roles/span_Logout_fa fa-fw fa-sign-out'))

