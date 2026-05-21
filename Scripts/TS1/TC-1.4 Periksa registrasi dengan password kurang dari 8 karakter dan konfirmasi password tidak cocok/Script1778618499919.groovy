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

WebUI.navigateToUrl('http://fashionys.com')

WebUI.click(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/a_Register'))

WebUI.setText(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/input_cust_name'), 'Sazzad Hasan')

WebUI.setText(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/input_cust_cname'), 'ABC Company')

WebUI.setText(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/input_cust_email'), 'sazzad124@testmail.com')

WebUI.setText(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/input_cust_phone'), '081234567890')

WebUI.setText(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/textarea_cust_address'), 'Bantul, Yogyakarta')

WebUI.click(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/span_select2-cust_country-p6-container'))

WebUI.setText(findTestObject('TS1.4/Page_1 new message/input_textbox'), 'indo')

WebUI.mouseOver(findTestObject('TS1.4/Page_1 new message/li_select2-cust_country-p6-result-chi5-101'))

WebUI.click(findTestObject('TS1.4/Page_1 new message/li_select2-cust_country-p6-result-chi5-101'))

WebUI.setText(findTestObject('TS1.4/Page_1 new message/input_cust_city'), 'Yogyakarta')

WebUI.setText(findTestObject('TS1.4/Page_1 new message/input_cust_state'), 'DI Yogyakarta')

WebUI.setText(findTestObject('TS1.4/Page_Fashionys.com  Online Garments Shop/input_cust_zip'), '55111')

WebUI.setEncryptedText(findTestObject('TS1.4/Page_1 new message/input_cust_password'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('TS1.4/Page_1 new message/input_cust_re_password'), 'TwW95KtKS4Q=')

WebUI.click(findTestObject('TS1.4/Page_1 new message/input_form1'))

