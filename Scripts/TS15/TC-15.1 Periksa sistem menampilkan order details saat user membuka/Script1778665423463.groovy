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

WebUI.navigateToUrl('http://fashionys.com/')

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/li_Login'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/a_Login'))

WebUI.setText(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/input_cust_email'), 'sazzad123@testmail.com')

WebUI.setEncryptedText(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/input_cust_password'), 'R2dZ4hvJ2ujoDGjQ2cClHw==')

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/input_form1'))

WebUI.mouseOver(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/div_Jeans for Women - Denim'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/div_overlay'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/a_Jeans for Women - Denim'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/input_form_add_to_cart'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/a_View Cart (249)'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/a_Proceed to Checkout'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/span_select2-advFieldsStatus-container'))

WebUI.mouseOver(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/li_select2-advFieldsStatus-result-zevh-Bank Depo'))

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/li_select2-advFieldsStatus-result-zevh-Bank Depo'))

WebUI.setText(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/textarea_transaction_info'), 'test')

WebUI.click(findTestObject('TS15.1/Page_Fashionys.com  Online Garments Shop/input_form3'))

