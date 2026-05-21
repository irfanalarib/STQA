import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.util.Arrays

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

// =====================================================
// OPEN BROWSER
// =====================================================

WebUI.openBrowser('')

WebUI.maximizeWindow()

// =====================================================
// OPEN WEBSITE
// =====================================================

WebUI.navigateToUrl('http://fashionys.com/')

// =====================================================
// REMOVE IFRAMES / POPUPS
// =====================================================

WebUI.executeJavaScript("""
document.querySelectorAll('iframe').forEach(f => {
    f.remove();
});
""", null)

WebUI.delay(2)

// =====================================================
// MULTIPACKS OBJECT
// =====================================================

TestObject multipacks = findTestObject(
    'Object Repository/TS8 - Product Browsing (Customer)/TC 8.4/Page_Fashionys.com  Online Garments Shop/a_Multipacks'
)

// =====================================================
// SCROLL TO ELEMENT
// =====================================================

WebUI.scrollToElement(multipacks, 10)

WebUI.delay(2)

// =====================================================
// JS CLICK
// =====================================================

WebUI.executeJavaScript(
    "arguments[0].click();",
    Arrays.asList(WebUiCommonHelper.findWebElement(multipacks, 10))
)

WebUI.delay(2)

// =====================================================
// VERIFY NO PRODUCT FOUND
// =====================================================

TestObject noProduct = findTestObject(
    'Object Repository/TS8 - Product Browsing (Customer)/TC 8.4/Page_Fashionys.com  Online Garments Shop/div_No Product Found'
)

WebUI.verifyElementVisible(noProduct)

// =====================================================
// FINISH
// =====================================================

WebUI.delay(2)

WebUI.closeBrowser()