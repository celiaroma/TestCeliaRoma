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

WebUI.setText(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Login/input_Remember Login_OutSystemsUIWeb_wt16bl_b9c494'), 
    'celia.roma')

WebUI.setEncryptedText(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Login/input_Remember Login_OutSystemsUIWeb_wt16bl_dba61f'), 
    'DnLwFQa6uFjqYhR9046/Wg==')

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Login/input_Forgot my password_OutSystemsUIWeb_wt_03a2be'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Homepage/div_TrackHub'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Projects/input_Show Only Open Projects_TrackHub_Them_1c1e11'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Projects/input_Show Only Templates Projects_TrackHub_7cd0c5'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_Projects/span_IATDEV'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_IATDEV/span_Project Details_fa fa-fw fa-angle-down'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_IATDEV/span_Team Members_fa fa-fw fa-angle-down'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_IATDEV/div_- Priority -                Remove item'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_IATDEV/input_Review_TrackHub_Theme_wt191blockTempl_4a3ecb'))

WebUI.click(findTestObject('Teste 1 Login Apps Dev Celia Roma/Page_IATDEV/input_Review_TrackHub_Theme_wt191blockTempl_2c1d74'))

