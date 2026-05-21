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

WebUI.click(findTestObject('TC-CONTACT US (FIELD KOSONG)/Page_Fashionys.com  Online Garments Shop/a_Contact Us'))

WebUI.switchToWindowTitle('Fashionys.com - Contact')

WebUI.click(findTestObject('TC-CONTACT US (EMAIL TIDAK VALID)/Page_Fashionys.com - Contact/a_Contact Us'))

WebUI.setText(findTestObject('TC-CONTACT US (EMAIL TIDAK VALID)/Page_Fashionys.com - Contact/input_Enter name'), 'IRFAN')

WebUI.setText(findTestObject('TC-CONTACT US (EMAIL TIDAK VALID)/Page_Fashionys.com - Contact/input_Enter email address'), 
    'irfan__gmail.com')

WebUI.setText(findTestObject('TC-CONTACT US (EMAIL TIDAK VALID)/Page_Fashionys.com - Contact/input_Enter phone number'), 
    '08777878765')

WebUI.setText(findTestObject('TC-CONTACT US (EMAIL TIDAK VALID)/Page_Fashionys.com - Contact/textarea_Enter message'), 'tes')

WebUI.click(findTestObject('TC-CONTACT US (EMAIL TIDAK VALID)/Page_1 new message/input_form_contact'))

