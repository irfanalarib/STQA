import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
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
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.2/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.2/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.2/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN ADD PRODUCT PAGE
// =====================================================

WebUI.navigateToUrl(
	'http://fashionys.com/admin/product-add.php'
)

WebUI.waitForPageLoad(10)

// =====================================================
// SUBMIT EMPTY FORM
// =====================================================

WebUI.takeScreenshot()

WebUI.click(
	findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.2/Page_Admin Panel/button_Submit')
)

WebUI.delay(3)

// =====================================================
// VERIFY VALIDATION ERROR
// =====================================================

// PRODUCT SHOULD NOT SUCCESSFULLY ADDED
WebUI.verifyTextNotPresent(
	'Product is added successfully!',
	false,
	FailureHandling.CONTINUE_ON_FAILURE
)

// OPTIONAL VALIDATION CHECK
WebUI.verifyTextPresent(
	'required',
	false,
	FailureHandling.OPTIONAL
)

WebUI.verifyTextPresent(
	'error',
	false,
	FailureHandling.OPTIONAL
)

WebUI.takeScreenshot()

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()