import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// =====================================================
// OPEN BROWSER
// =====================================================

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://fashionys.com/')


// =====================================================
// REMOVE ALL IFRAMES / POPUPS / CHAT WIDGETS
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f => {
    f.remove();
});
""", null)

WebUI.delay(2)


// =====================================================
// CLICK SHOP WOMEN ACCESSORIES
// =====================================================

WebUI.waitForElementClickable(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Shop Women Accessories'
	),
	10
)

WebUI.click(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Shop Women Accessories'
	)
)


// =====================================================
// OPEN PRODUCT CATEGORY
// =====================================================

WebUI.newTab('')

WebUI.navigateToUrl(
	'http://fashionys.com/product-category.php?id=4&type=mid-category'
)


// REMOVE IFRAMES AGAIN
WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f => {
    f.remove();
});
""", null)

WebUI.delay(2)


// =====================================================
// SWITCH WINDOW
// =====================================================

WebUI.switchToWindowTitle('Fashionys.com | Online Garments Shop')


// =====================================================
// CLICK NEXT SLIDER
// =====================================================

WebUI.waitForElementClickable(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/span_Previous_fa fa-angle-right'
	),
	10
)

WebUI.click(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/span_Previous_fa fa-angle-right'
	)
)


// =====================================================
// REMOVE IFRAMES AGAIN
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f => {
    f.remove();
});
""", null)

WebUI.delay(1)


// =====================================================
// CLICK READ MORE
// =====================================================

WebUI.waitForElementClickable(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Read More'
	),
	10
)

WebUI.enhancedClick(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Read More'
	)
)


// =====================================================
// OPEN NEW TAB
// =====================================================

WebUI.newTab('')

WebUI.navigateToUrl('http://fashionys.com/#')


// =====================================================
// REMOVE IFRAMES AGAIN
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f => {
    f.remove();
});
""", null)

WebUI.delay(2)


// =====================================================
// SWITCH WINDOW
// =====================================================

WebUI.switchToWindowTitle('Fashionys.com | Online Garments Shop')


// =====================================================
// CLICK NEXT
// =====================================================

WebUI.waitForElementClickable(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Next'
	),
	10
)

WebUI.click(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Next'
	)
)


// =====================================================
// REMOVE IFRAMES AGAIN
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f => {
    f.remove();
});
""", null)

WebUI.delay(2)


// =====================================================
// CLICK READ MORE 1
// =====================================================

WebUI.waitForElementClickable(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Read More_1'
	),
	10
)

WebUI.enhancedClick(
	findTestObject(
		'Object Repository/TS11 - Slider (Customer view)/TC 11.3/Page_Fashionys.com  Online Garments Shop/a_Read More_1'
	)
)


// =====================================================
// FINISH
// =====================================================

WebUI.delay(3)

WebUI.closeBrowser()