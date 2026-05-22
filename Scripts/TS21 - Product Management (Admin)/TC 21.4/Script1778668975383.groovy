import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
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
// HELPER XPATH
// =====================================================
WebUI.openBrowser('')

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.setText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Login/input_Admin Panel_email'), 
    'hammad.shahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Login/input_Admin Panel_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Login/input_Admin Panel_form1'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/span_View  Add Products'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/h1_View Products'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/a_Edit'))

WebUI.setText(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/input_(In USD)_p_current_price'), 
    '-11')

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/button_Update'))

WebUI.click(findTestObject('Object Repository/TS21 - Product Management (Admin)/TC21.4/Page_Admin Panel/p_Product is updated successfully'))

WebUI.closeBrowser()

