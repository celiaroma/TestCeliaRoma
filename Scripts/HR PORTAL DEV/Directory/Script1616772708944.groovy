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

WebUI.setText(findTestObject('Object Repository/New Folder directory 09072021/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_6b2e3e'), 
    'celia.roma.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder directory 09072021/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_0204d7'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Login/input_Remember login_OutSystemsUIWeb_wt29bl_048b02'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_HomePage/div_Directory Find your company colleagues'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employees/div_P'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employees/a_Employee Profile'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employee ProfileEdit Celia Roma/div_Financial Information'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employee ProfileEdit Celia Roma/div_KPIs'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employee ProfileEdit Celia Roma/a_Management'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employee ProfileEdit Celia Roma/span_Add Employee'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employee ProfileNew Employee/a_Management'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Employee ProfileNew Employee/span_Job Titles'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Job Titles/a_Management'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Job Titles/span_Organizations'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Organizations/a_Management'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Directory - Organizations/span_Office Locations'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Office Locations/span_Celia Roma_fa fa-fw fa-angle-down fa-lg'))

WebUI.click(findTestObject('Object Repository/New Folder directory 09072021/Page_Office Locations/div_Logout'))

