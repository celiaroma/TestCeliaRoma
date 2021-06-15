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

WebUI.navigateToUrl('https://hrportal.iohub.pt:2210/HRPortal_TH/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Teste 3 HR Portal PROD/Page_Login/input_Remember login_OutSystemsUIWeb_wt27bl_8fa030'), 
    'celia.roma@osquay.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Teste 3 HR Portal PROD/Page_Login/input_Remember login_OutSystemsUIWeb_wt27bl_9aad42'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Object Repository/Teste 3 HR Portal PROD/Page_Login/input_Remember login_OutSystemsUIWeb_wt27bl_a0b239'))

WebUI.click(findTestObject('Object Repository/Teste 3 HR Portal PROD/Page_HomePage/div_CV WizardBuild your CV'))

WebUI.click(findTestObject('Object Repository/Teste 3 HR Portal PROD/Page_CVInfo/div_CV Wizard'))

