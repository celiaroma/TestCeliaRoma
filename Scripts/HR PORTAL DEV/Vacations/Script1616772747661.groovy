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

WebUI.setText(findTestObject('Object Repository/09072021 Vacations/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_6b2e3e'), 
    'celia.roma.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/09072021 Vacations/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_0204d7'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_048b02'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_HomePage/div_VacationsSchedule vacations and absences'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_MyVacations/a_Requests'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_MyVacations/span_Approved Requests'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_MyTeamVacations/a_Requests'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_MyTeamVacations/span_Pending Requests'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_AllPendingRequests/a_Management'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_AllPendingRequests/span_Vacation Days'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_Vacation Days/a_Management'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_Vacation Days/span_Holidays'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_Holidays/span_Celia Roma_fa fa-fw fa-angle-down fa-lg'))

WebUI.click(findTestObject('Object Repository/09072021 Vacations/Page_Holidays/span_Logout_fa fa-fw fa-sign-out'))

