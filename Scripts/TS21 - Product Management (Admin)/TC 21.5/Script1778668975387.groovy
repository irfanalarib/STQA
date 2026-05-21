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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.model.FailureHandling

// =====================================================
// HELPER XPATH
// =====================================================

TestObject xpath(String xp) {
	TestObject to = new TestObject()
	to.addProperty("xpath", ConditionType.EQUALS, xp)
	return to
}

// =====================================================
// OPEN BROWSER
// =====================================================

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.waitForPageLoad(10)

// =====================================================
// LOGIN
// =====================================================

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN ADD PRODUCT PAGE
// =====================================================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/span_View  Add Products')
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/a_Add Product')
)

WebUI.waitForPageLoad(10)

// =====================================================
// TOP CATEGORY
// =====================================================

WebUI.click(
	xpath("(//span[contains(@class,'select2-selection__arrow')])[1]")
)

WebUI.waitForElementVisible(
	xpath("(//li[contains(@class,'select2-results__option')])[2]"),
	20
)

WebUI.click(
	xpath("(//li[contains(@class,'select2-results__option')])[2]")
)

// =====================================================
// MID CATEGORY
// =====================================================

WebUI.delay(2)

WebUI.click(
	xpath("(//span[contains(@class,'select2-selection__arrow')])[2]")
)

WebUI.waitForElementVisible(
	xpath("(//li[contains(@class,'select2-results__option')])[2]"),
	20
)

WebUI.click(
	xpath("(//li[contains(@class,'select2-results__option')])[2]")
)

// =====================================================
// END CATEGORY
// =====================================================

WebUI.delay(2)

WebUI.click(
	xpath("(//span[contains(@class,'select2-selection__arrow')])[3]")
)

WebUI.waitForElementVisible(
	xpath("(//li[contains(@class,'select2-results__option')])[2]"),
	20
)

WebUI.click(
	xpath("(//li[contains(@class,'select2-results__option')])[2]")
)

// =====================================================
// INPUT PRODUCT DATA
// =====================================================

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/input__p_name'),
	'Sunscreen'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/input_(In USD)_p_old_price'),
	'100'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/input_(In USD)_p_current_price'),
	'100'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/input__p_qty'),
	'10'
)

// =====================================================
// UPLOAD INVALID FILE
// =====================================================

TestObject uploadField = new TestObject()

uploadField.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//input[@type='file'])[1]"
)

WebUI.uploadFile(
	uploadField,
	'C:\\Users\\Asus\\Documents\\invalid.txt'
)

// =====================================================
// SCREENSHOT BEFORE SUBMIT
// =====================================================

WebUI.takeScreenshot()

// =====================================================
// SUBMIT
// =====================================================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.5/Page_Admin Panel/button_Submit')
)

WebUI.delay(3)

// =====================================================
// VERIFY INVALID IMAGE REJECTED
// =====================================================

// PRODUCT SHOULD NOT SUCCESSFULLY ADDED
WebUI.verifyTextNotPresent(
	'Product is added successfully!',
	false,
	FailureHandling.CONTINUE_ON_FAILURE
)

// OPTIONAL ERROR VALIDATION
WebUI.verifyTextPresent(
	'jpg',
	false,
	FailureHandling.OPTIONAL
)

WebUI.verifyTextPresent(
	'png',
	false,
	FailureHandling.OPTIONAL
)

WebUI.takeScreenshot()

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()