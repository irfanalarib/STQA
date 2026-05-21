import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.setText(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Login/input_Admin Panel_email'), 'hammad.shahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Login/input_Admin Panel_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Login/input_Admin Panel_form1'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/a_Slider'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/h1_View Sliders'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Photo'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Heading'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Content'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Button Text'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Button URL'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Position'))

WebUI.click(findTestObject('Object Repository/TS25 - Slider (Admin)/TC 25.1/Page_Admin Panel/th_Action'))

WebUI.closeBrowser()

