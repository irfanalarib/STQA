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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.waitForPageLoad(10)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)


WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/span_View  Add Products')
)

WebUI.waitForPageLoad(10)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/a_Edit')
)

WebUI.waitForPageLoad(10)

WebUI.clearText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/input__p_qty')
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/input__p_qty'),
	'12'
)

WebUI.clearText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/input__p_name')
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/input__p_name'),
	'Facial Wash'
)

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/button_Update')
)

WebUI.delay(3)

WebUI.verifyTextPresent(
	'Product is updated successfully',
	false
)

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/a_Hammad Hassan')
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/a_Log out')
)

WebUI.closeBrowser()
WebUI.openBrowser('')

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.setText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Login/input_Admin Panel_email'), 
    'hammad.shahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Login/input_Admin Panel_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Login/input_Admin Panel_form1'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/span_View  Add Products'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/a_Edit'))

WebUI.setText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/input__p_qty'), 
    '12')

WebUI.setText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/input__p_name'), 
    'Facial Wash')

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/button_Update'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/p_Product is updated successfully'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/a_Hammad Hassan'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC 21.6/Page_Admin Panel/a_Log out'))

