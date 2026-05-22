import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// =====================================================
// OPEN BROWSER
// =====================================================
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

// LOGIN
WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Login/input_Admin Panel_form1')
)

WebUI.delay(2)

// MENU PRODUCT
WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/span_View  Add Products')
)

WebUI.delay(1)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/a_Add Product')
)

WebUI.delay(2)

// =========================
// TOP CATEGORY
// =========================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/span_Select Top Level Category')
)

WebUI.delay(1)

TestObject topCategory = new TestObject()

topCategory.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"(//li[@role='treeitem'])[1]"
)

WebUI.click(topCategory)

WebUI.delay(1)

// =========================
// MID CATEGORY
// =========================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/span_Select Mid Level Category')
)

WebUI.delay(1)

TestObject midCategory = new TestObject()

midCategory.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"(//li[@role='treeitem'])[1]"
)

WebUI.click(midCategory)

WebUI.delay(1)

// =========================
// END CATEGORY
// =========================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/span_Select End Level Category')
)

WebUI.delay(1)

TestObject endCategory = new TestObject()

endCategory.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"(//li[@role='treeitem'])[1]"
)

WebUI.click(endCategory)

WebUI.delay(2)

// =========================
// PRODUCT INFO
// =========================

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input__p_name'),
	'Flat Shoes'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_old_price'),
	'10'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_current_price'),
	'8'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input__p_qty'),
	'100'
)

WebUI.delay(1)

// =========================
// SIZE
// =========================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/ul_Select Size_select2-selection__rendered')
)

WebUI.delay(1)

TestObject sizeOption = new TestObject()

sizeOption.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"(//li[@role='treeitem'])[1]"
)

WebUI.click(sizeOption)

WebUI.delay(1)

// =========================
// COLOR
// =========================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/ul_Select Color_select2-selection__rendered')
)

WebUI.delay(1)

TestObject colorOption = new TestObject()

colorOption.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"(//li[@role='treeitem'])[1]"
)

WebUI.click(colorOption)

WebUI.delay(2)

// =========================
// SUBMIT
// =========================

WebUI.scrollToElement(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/button_Submit'),
	5
)

WebUI.delay(1)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/button_Submit')
)

WebUI.delay(5)

// OPTIONAL VERIFY
WebUI.verifyTextPresent(
	'Product',
	false,
	FailureHandling.OPTIONAL
)

WebUI.delay(3)

WebUI.closeBrowser()