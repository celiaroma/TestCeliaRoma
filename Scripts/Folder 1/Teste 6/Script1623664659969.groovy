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

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/Page_Gmail/input_Continuar para o Gmail_identifier'), 'celia.roma@osquay.com')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Seguinte'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Gmail/input_Demasiadas tentativas falhadas_password'), 'uh+FjIs6w56CSmx2qXe4LA==')

WebUI.click(findTestObject('Object Repository/Page_Gmail/span_Seguinte'))

WebUI.click(findTestObject('Object Repository/Page_Inbox (2) - celia.romaosquay.com - iohub Mail/div_Mail_Yh akV'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox (2) - celia.romaosquay.com - iohub Mail/textarea_To_to'), 'ce')

WebUI.click(findTestObject('Object Repository/Page_Inbox (2) - celia.romaosquay.com - iohub Mail/div_Text colour_ak azp'))

WebUI.setText(findTestObject('Object Repository/Page_Inbox (2) - celia.romaosquay.com - iohub Mail/input_Celia Roma (osquay.com)_subjectbox'), 
    'teste automatizado')

WebUI.setText(findTestObject('Object Repository/Page_Inbox (2) - celia.romaosquay.com - iohub Mail/div_envioBest Regards,Clia RomaAzores Offic_e36742'), 
    'envio<br clear="all"><div><div><div dir="ltr" class="gmail_signature" data-smartmail="gmail_signature"><div dir="ltr"><div><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div style=""><font face="trebuchet ms, sans-serif" color="#000000"><b>Best Regards,</b></font></div><div style="font-family: &quot;trebuchet ms&quot;, sans-serif; color: rgb(68, 68, 68);"><br></div><div><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr"><div dir="ltr" style=""><blockquote style="font-size:12.8px;margin:0px 0px 0px 40px;border:none;padding:0px"><div style="font-size:small"><div><div style=""><font face="trebuchet ms, sans-serif"><b><i>Célia Roma</i></b></font></div></div></div></blockquote><blockquote style="margin:0px 0px 0px 40px;border:none;padding:0px"><div><b style="font-size:12.8px;color:rgb(61,133,198);font-family:&quot;trebuchet ms&quot;,sans-serif"><i>Azores Office Manager</i></b></div></blockquote><blockquote style="margin:0px 0px 0px 40px;border:none;padding:0px"><div><b style="font-size:12.8px;color:rgb(61,133,198);font-family:&quot;trebuchet ms&quot;,sans-serif"><i style="">OutSystems Junior Developer</i></b></div></blockquote><blockquote style="margin:0px 0px 0px 40px;border:none;padding:0px"><div style=""><br></div></blockquote><blockquote style="margin:0px 0px 0px 40px;border:none;padding:0px"><div><blockquote style="font-size:small;font-family:Arial,Helvetica,sans-serif;margin:0px 0px 0px 40px;border:none;padding:0px"><div style="font-family:Roboto,RobotoDraft,Helvetica,Arial,sans-serif;font-size:12.8px"></div></blockquote></div><font style="font-size: 12.8px;" face="Roboto, RobotoDraft, Helvetica, Arial, sans-serif"><img src="https://ci4.googleusercontent.com/proxy/JO9i-r0cA96dogUIFpr8kjEMNuc3KWY6C-mTndvkIB_07pqxYjLCsio5_aKzv6j7E5mGDxhJNYxgsVPC8FwMgYfPYchY0QbyG2ZCXRPr3zH51pH5u1qquWcRUKKchJHShuiM=s0-d-e1-ft#https://drive.google.com/uc?export=download&amp;id=1izXir1W881mUvVzM7v72sXgvnI597dpv" style="" width="420" height="84"></font><br><div style="font-size: 12.8px; font-family: Roboto, RobotoDraft, Helvetica, Arial, sans-serif;"><font size="2" face="trebuchet ms, sans-serif"><br></font></div><div style="font-size:small;font-family:Arial,Helvetica,sans-serif"><font style="font-size:x-small" face="trebuchet ms, sans-serif"><b>M.</b>&nbsp;</font><span style="font-size:x-small;font-family:&quot;trebuchet ms&quot;,sans-serif"><a href="tel:+351963249711" style="color:rgb(17,85,204)" target="_blank">+351&nbsp;96 324 97 11</a></span></div><div style=""><span style="font-family:&quot;trebuchet ms&quot;,sans-serif;font-size:x-small"><b><font color="#000000">W.&nbsp;</font></b><font color="#500050"><a href="http://www.osquay.com/" style="color:rgb(17,85,204)" target="_blank">www.osquay.com</a>&nbsp;|&nbsp;</font></span><b style="font-family:&quot;trebuchet ms&quot;,sans-serif;font-size:x-small">E.</b><span style="font-family:&quot;trebuchet ms&quot;,sans-serif;font-size:x-small">&nbsp;</span><a href="mailto:celia.roma@osquay.com" style="font-family:&quot;trebuchet ms&quot;,sans-serif;font-size:x-small;color:rgb(17,85,204)" target="_blank">celia.roma@osquay.com</a><span style="font-family:&quot;trebuchet ms&quot;,sans-serif;font-size:x-small">&nbsp;</span><br><div style="font-family:Arial,Helvetica,sans-serif;font-size:small"><div style="font-family: Roboto, RobotoDraft, Helvetica, Arial, sans-serif;"><font size="1"><span style="font-family:&quot;trebuchet ms&quot;,sans-serif"><br></span></font></div></div></div><div style="font-size:small;font-family:Arial,Helvetica,sans-serif"><div style="font-family:Roboto,RobotoDraft,Helvetica,Arial,sans-serif"><font size="1"><a href="https://www.facebook.com/osquay/" style="color:rgb(17,85,204)" target="_blank"><img src="https://ci4.googleusercontent.com/proxy/zwSMVw8j_enGQAw48JV0tYjfb82w5XHBinNXuVKOnTRH74VEHaPYqPfGfBkM5HopiGVP6kp81vzIvsd_tjtNhZXhefENnToVn_CANPq7oOOGGzcOGyiSvpbwjs_M9XjqX2Uz=s0-d-e1-ft#https://drive.google.com/uc?export=download&amp;id=1Uhn7dJvavXkUSRpg8jXPHxKqVX9eql-Y"></a>&nbsp;<a href="https://www.linkedin.com/company/osquay/" style="color:rgb(17,85,204)" target="_blank"><img src="https://ci4.googleusercontent.com/proxy/ebvtBZjPJ2TG9N2u3alHl0niFEkjCSL4fNhes4IMqVUCVHUuu9Kkdnc-Qv0lMYhrpnlTdpx5LXimZPsWVkzP33xaV3YPkv92PWD0BEZl-yC_J-WqfgM18TsgMElQGA_y3SpW=s0-d-e1-ft#https://drive.google.com/uc?export=download&amp;id=1yo0SA0pj2wbSztVP-ZWhXJYvAtNRxcF5"><br></a></font></div></div></blockquote><div style="font-family: &quot;trebuchet ms&quot;, sans-serif; color: rgb(68, 68, 68);"><br></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div></div>')

WebUI.click(findTestObject('Object Repository/Page_Inbox (2) - celia.romaosquay.com - iohub Mail/div_Send'))

