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

WebUI.click(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/a_Register'))

// Full Name
if (Full_Name != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_name'), Full_Name)
}

// Company Name
if (Company_Name != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_cname'), Company_Name)
}

// Email
if (Email != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_email'), Email)
}

// Phone Number
if (Phone_Number != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_phone'), Phone_Number)
}

// Address
if (Address != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/textarea_cust_address'), Address)
}

// Country
if (Country != '') {

	WebUI.click(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/span_select2-cust_country-lm-container'))

	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_textbox'), Country)

	WebUI.sendKeys(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_textbox'),
		Keys.chord(Keys.ENTER))
}

// City
if (City != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_city'), City)
}

// State
if (State != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_state'), State)
}

// Zip Code
if (Zip_Code != '') {
	WebUI.setText(findTestObject('TS1/Page_1 new message/input_cust_zip'), Zip_Code)
}

// Password
if (Password != '') {
	WebUI.setText(findTestObject('TS1/Page_1 new message/input_cust_password'), Password)
}

// Retype Password
if (Retype_Password != '') {
	WebUI.setText(findTestObject('TS1/Page_Fashionys.com  Online Garments Shop/input_cust_re_password'), Retype_Password)
}

// Click Register
WebUI.click(findTestObject('TS1/Page_1 new message/input_form1'))

// Wait a bit after submission
WebUI.delay(3)

// Close Browser
WebUI.closeBrowser()