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
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.8/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.8/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.8/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN SHOP SETTINGS
// =====================================================

WebUI.click(
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.8/Page_Admin Panel/a_Shop Settings')
)

WebUI.delay(2)

// =====================================================
// OPEN SHIPPING COST PAGE
// =====================================================

TestObject shippingMenu = new TestObject()

shippingMenu.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//a[contains(text(),'Shipping Cost')]"
)

WebUI.click(shippingMenu)

WebUI.delay(3)

// =====================================================
// SELECT COUNTRY
// =====================================================

WebUI.click(
	xpath("(//span[contains(@class,'select2-selection__arrow')])[1]")
)

WebUI.delay(2)

// SELECT SECOND COUNTRY
WebUI.click(
	xpath("(//li[contains(@class,'select2-results__option')])[2]")
)

WebUI.delay(2)

// =====================================================
// SHIPPING COST INPUT
// =====================================================

TestObject amountInput = new TestObject()

amountInput.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//input[contains(@name,'amount')]"
)

// =====================================================
// ADD BUTTON
// =====================================================

TestObject addBtn = new TestObject()

addBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//button[contains(text(),'Add')]"
)

// =====================================================
// TEST 1 : NEGATIVE SHIPPING COST
// =====================================================

WebUI.setText(
	amountInput,
	'-23'
)

WebUI.takeScreenshot()

WebUI.click(addBtn)

WebUI.delay(3)

// =====================================================
// VERIFY SYSTEM SHOULD REJECT NEGATIVE VALUE
// =====================================================

if (WebUI.verifyTextPresent(
	'Shipping cost is added successfully',
	false,
	FailureHandling.OPTIONAL
)) {

	KeywordUtil.markFailed(
		'BUG FOUND: System accepts negative shipping cost'
	)

}

WebUI.takeScreenshot()

// =====================================================
// TEST 2 : NON NUMERIC SHIPPING COST
// =====================================================

WebUI.clearText(amountInput)

WebUI.setText(
	amountInput,
	'abc'
)

WebUI.takeScreenshot()

WebUI.click(addBtn)

WebUI.delay(3)

// =====================================================
// VERIFY SYSTEM SHOULD REJECT NON NUMERIC VALUE
// =====================================================

if (WebUI.verifyTextPresent(
	'Shipping cost is added successfully',
	false,
	FailureHandling.OPTIONAL
)) {

	KeywordUtil.markFailed(
		'BUG FOUND: System accepts non numeric shipping cost'
	)

}

WebUI.takeScreenshot()

// =====================================================
// OPTIONAL VALIDATION CHECK
// =====================================================

WebUI.verifyTextPresent(
	'error',
	false,
	FailureHandling.OPTIONAL
)

WebUI.verifyTextPresent(
	'required',
	false,
	FailureHandling.OPTIONAL
)

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()