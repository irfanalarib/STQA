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
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.7/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.7/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.7/Page_Login/input_Admin Panel_form1')
)

WebUI.waitForPageLoad(10)

// =====================================================
// OPEN SHOP SETTINGS
// =====================================================

WebUI.click(
	findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.7/Page_Admin Panel/span_Shop Settings_pull-right-container')
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

// PILIH NEGARA KE-2
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

WebUI.setText(
	amountInput,
	'25'
)

WebUI.takeScreenshot()

// =====================================================
// ADD SHIPPING COST
// =====================================================

TestObject addBtn = new TestObject()

addBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//button[contains(text(),'Add')]"
)

WebUI.click(addBtn)

WebUI.delay(3)

// =====================================================
// VERIFY ADD SUCCESS
// =====================================================

WebUI.verifyTextPresent(
	'Shipping cost is added successfully',
	false
)

WebUI.takeScreenshot()

// =====================================================
// CLICK FIRST EDIT BUTTON
// =====================================================

TestObject editBtn = new TestObject()

editBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"(//table//a[contains(text(),'Edit')])[1]"
)

WebUI.scrollToElement(editBtn, 10)

WebUI.delay(2)

WebUI.click(editBtn)

WebUI.delay(3)

// =====================================================
// UPDATE SHIPPING COST
// =====================================================

WebUI.clearText(amountInput)

WebUI.setText(
	amountInput,
	'28'
)

WebUI.takeScreenshot()

// =====================================================
// UPDATE BUTTON
// =====================================================

TestObject updateBtn = new TestObject()

updateBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//button[contains(text(),'Update')]"
)

WebUI.click(updateBtn)

WebUI.delay(3)

// =====================================================
// VERIFY UPDATE SUCCESS
// =====================================================

WebUI.verifyTextPresent(
	'Shipping Cost is updated successfully',
	false
)

WebUI.takeScreenshot()

// =====================================================
// VIEW ALL
// =====================================================

TestObject viewAllBtn = new TestObject()

viewAllBtn.addProperty(
	"xpath",
	ConditionType.EQUALS,
	"//a[contains(text(),'View All')]"
)

WebUI.click(viewAllBtn)

WebUI.delay(3)

// =====================================================
// VERIFY UPDATED DATA EXISTS
// =====================================================

WebUI.verifyTextPresent(
	'28',
	false,
	FailureHandling.CONTINUE_ON_FAILURE
)

WebUI.takeScreenshot()

// =====================================================
// CLOSE BROWSER
// =====================================================

WebUI.closeBrowser()