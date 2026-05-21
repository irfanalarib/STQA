import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// =====================================================
// OPEN BROWSER
// =====================================================

WebUI.openBrowser('')

WebUI.maximizeWindow()

// =====================================================
// OPEN LOGIN PAGE
// =====================================================

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.delay(2)

// =====================================================
// REMOVE IFRAMES
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f=>{
    f.remove();
});
""", null)

// =====================================================
// LOGIN
// =====================================================

WebUI.setText(
	findTestObject(
		'Object Repository/TS21 - Product Management (Admin)/TC21.1/Page_Login/input_Admin Panel_email'
	),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject(
		'Object Repository/TS21 - Product Management (Admin)/TC21.1/Page_Login/input_Admin Panel_password'
	),
	'4nvbrPglk7k='
)

// CLICK LOGIN
WebUI.click(
	findTestObject(
		'Object Repository/TS21 - Product Management (Admin)/TC21.1/Page_Login/div_Admin Panel_col-xs-4'
	)
)

WebUI.delay(5)

// =====================================================
// OPEN PRODUCT PAGE DIRECTLY
// =====================================================

WebUI.navigateToUrl(
	'http://fashionys.com/admin/product.php'
)

WebUI.delay(5)

// =====================================================
// REMOVE IFRAMES AGAIN
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f=>{
    f.remove();
});
""", null)

// =====================================================
// SEARCH INPUT MANUAL
// =====================================================

TestObject searchBox = new TestObject()

searchBox.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"//input[@type='search']"
)

// WAIT INPUT
WebUI.waitForElementPresent(searchBox, 20)

// SET TEXT
WebUI.setText(searchBox, 'Jeans')

WebUI.delay(3)

// =====================================================
// CLICK PRODUCT RESULT
// =====================================================

TestObject jeansRow = new TestObject()

jeansRow.addProperty(
	'xpath',
	ConditionType.EQUALS,
	"//*[contains(text(),'Jeans')]"
)

WebUI.waitForElementClickable(jeansRow, 20)

WebUI.click(jeansRow)

// =====================================================
// FINISH
// =====================================================

WebUI.delay(3)

WebUI.closeBrowser()