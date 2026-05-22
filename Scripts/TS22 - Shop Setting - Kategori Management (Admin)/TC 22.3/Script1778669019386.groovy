import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import java.util.Arrays as Arrays
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

// ======================
// OPEN BROWSER
// ======================
WebUI.openBrowser('')

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.setText(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Login/input_Admin Panel_email'), 
    'hammad.shahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Login/input_Admin Panel_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Login/input_Admin Panel_form1'))

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/span_Shop Settings'))

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/a_Color'))

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/a_Add New'))

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/h1_Add Color'))

WebUI.setText(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/input__color_name'), 
    'Merah')

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/button_Submit'))

WebUI.click(findTestObject('Object Repository/TS22 - Shop Setting - Kategori Management (Admin)/TC 22.3/Page_Admin Panel/p_Color is added successfully'))

WebUI.closeBrowser()

