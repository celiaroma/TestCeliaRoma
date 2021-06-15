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

WebUI.navigateToUrl('https://appsdev.iohub.pt/Apps/Login.aspx')

WebUI.setText(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Login/input_Remember Login_OutSystemsUIWeb_wt16bl_b9c494'), 
    'ines.peguicha.osqdev')

WebUI.setEncryptedText(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Login/input_Remember Login_OutSystemsUIWeb_wt16bl_dba61f'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Login/input_Forgot my password_OutSystemsUIWeb_wt_03a2be'))

WebUI.click(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/div_SalesHubApp to support sales cycles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/select_FirstSecondThirdFourth'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/input_Dashboard_Template_IOHub_wt117blockOu_0ca5f1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/select_FirstSecondThirdFourth'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/input_Dashboard_Template_IOHub_wt117blockOu_0ca5f1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/select_FirstSecondThirdFourth'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/input_Dashboard_Template_IOHub_wt117blockOu_0ca5f1'))

WebUI.setText(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/input_Dashboard_Template_IOHub_wt117blockOu_f3a936'), 
    '2020')

WebUI.click(findTestObject('Object Repository/Teste 2 Login Apps Dev Ines Peguicha/Page_Homepage/input_Dashboard_Template_IOHub_wt117blockOu_0ca5f1'))

WebUI.closeBrowser()

