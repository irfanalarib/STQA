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
// LOGIN ADMIN
// =====================================================

WebUI.setText(
	findTestObject('Object Repository/TS23 - Order Management (Admin)/TC 23.2/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS23 - Order Management (Admin)/TC 23.2/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS23 - Order Management (Admin)/TC 23.2/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN ORDER MANAGEMENT PAGE DIRECTLY
// =====================================================

WebUI.navigateToUrl(
	'http://fashionys.com/admin/order.php'
)

WebUI.delay(3)

// =====================================================
// VERIFY ORDER PAGE
// =====================================================

WebUI.verifyTextPresent(
	'View Orders',
	false
)

WebUI.takeScreenshot()

// =====================================================
// PAYMENT STATUS BUTTON
// =====================================================

TestObject paymentBtn = new TestObject()

paymentBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//a[contains(text(),'Make Completed')])[1]"
)

WebUI.scrollToElement(paymentBtn, 10)

WebUI.waitForElementClickable(paymentBtn, 20)

WebUI.click(paymentBtn)

WebUI.delay(3)

// =====================================================
// VERIFY PAYMENT STATUS UPDATED
// =====================================================

WebUI.verifyTextPresent(
	'Completed',
	false,
	FailureHandling.OPTIONAL
)

WebUI.takeScreenshot()

// =====================================================
// SHIPPING STATUS BUTTON
// =====================================================

TestObject shippingBtn = new TestObject()

shippingBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//a[contains(text(),'Make Completed')])[2]"
)

WebUI.scrollToElement(shippingBtn, 10)

WebUI.waitForElementClickable(shippingBtn, 20)

WebUI.click(shippingBtn)

WebUI.delay(3)

// =====================================================
// VERIFY SHIPPING STATUS UPDATED
// =====================================================

WebUI.verifyTextPresent(
	'Completed',
	false,
	FailureHandling.OPTIONAL
)

WebUI.takeScreenshot()

// =====================================================
// VERIFY DATA SAVED
// =====================================================

WebUI.refresh()

WebUI.delay(3)

WebUI.verifyTextPresent(
	'Completed',
	false
)

WebUI.takeScreenshot()

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()