import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.model.FailureHandling

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

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN ADD PRODUCT PAGE
// =====================================================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/span_View  Add Products')
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/a_Add Product')
)

WebUI.waitForPageLoad(10)

// =====================================================
// DYNAMIC OBJECTS
// =====================================================

TestObject dropdown1 = new TestObject()

dropdown1.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//span[contains(@class,'select2-selection__arrow')])[1]"
)

TestObject dropdown2 = new TestObject()

dropdown2.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//span[contains(@class,'select2-selection__arrow')])[2]"
)

TestObject dropdown3 = new TestObject()

dropdown3.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//span[contains(@class,'select2-selection__arrow')])[3]"
)

TestObject secondOption = new TestObject()

secondOption.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//li[contains(@class,'select2-results__option')])[2]"
)

// =====================================================
// CATEGORY
// =====================================================

// TOP CATEGORY
WebUI.click(dropdown1)

WebUI.waitForElementVisible(secondOption, 20)

WebUI.click(secondOption)

// MID CATEGORY
WebUI.delay(2)

WebUI.click(dropdown2)

WebUI.waitForElementVisible(secondOption, 20)

WebUI.click(secondOption)

// END CATEGORY
WebUI.delay(2)

WebUI.click(dropdown3)

WebUI.waitForElementVisible(secondOption, 20)

WebUI.click(secondOption)

// =====================================================
// INPUT PRODUCT
// =====================================================

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input__p_name'),
	'Sepatu Testing'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input__p_qty'),
	'10'
)

// =====================================================
// TEST 1 - NEGATIVE PRICE
// =====================================================

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_old_price'),
	'-100'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_current_price'),
	'100'
)

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/button_Submit')
)

WebUI.delay(3)

// =====================================================
// VERIFY SYSTEM SHOULD REJECT NEGATIVE PRICE
// =====================================================

if (WebUI.verifyTextPresent(
	'Product is added successfully!',
	false,
	FailureHandling.OPTIONAL
)) {

	KeywordUtil.markFailed(
		'BUG FOUND: System accepts negative product price'
	)

}

WebUI.takeScreenshot()

// =====================================================
// TEST 2 - NON NUMERIC PRICE
// =====================================================

WebUI.clearText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_old_price')
)

WebUI.clearText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_current_price')
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_old_price'),
	'100'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/input_(In USD)_p_current_price'),
	'abc'
)

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.3/Page_Admin Panel/button_Submit')
)

WebUI.delay(3)

// =====================================================
// VERIFY SYSTEM SHOULD REJECT NON NUMERIC PRICE
// =====================================================

if (WebUI.verifyTextPresent(
	'Product is added successfully!',
	false,
	FailureHandling.OPTIONAL
)) {

	KeywordUtil.markFailed(
		'BUG FOUND: System accepts non numeric product price'
	)

}

WebUI.takeScreenshot()

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()
