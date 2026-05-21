import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil

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
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN ADD PRODUCT PAGE
// =====================================================

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/span_View  Add Products')
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/a_Add Product')
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
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input__p_name'),
	'Flat Shoes'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input_(In USD)_p_old_price'),
	'100'
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input_(In USD)_p_current_price'),
	'160'
)

// =====================================================
// TEST 1 : STOCK NOT NUMBER
// =====================================================

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input__p_qty'),
	'abc'
)

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/button_Submit')
)

WebUI.delay(3)

// =====================================================
// VERIFY SYSTEM SHOULD REJECT NON NUMERIC STOCK
// =====================================================

if (WebUI.verifyTextPresent(
	'Product is added successfully!',
	false,
	FailureHandling.OPTIONAL
)) {

	KeywordUtil.markFailed(
		'BUG FOUND: System accepts non numeric stock'
	)

}

WebUI.takeScreenshot()

// =====================================================
// TEST 2 : NEGATIVE STOCK
// =====================================================

WebUI.clearText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input__p_qty')
)

WebUI.setText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input__p_qty'),
	'-5'
)

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/button_Submit')
)

WebUI.delay(3)

// =====================================================
// VERIFY SYSTEM SHOULD REJECT NEGATIVE STOCK
// =====================================================

if (WebUI.verifyTextPresent(
	'Product is added successfully!',
	false,
	FailureHandling.OPTIONAL
)) {

	KeywordUtil.markFailed(
		'BUG FOUND: System accepts negative stock'
	)

}

WebUI.takeScreenshot()

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()