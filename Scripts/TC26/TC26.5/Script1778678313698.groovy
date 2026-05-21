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

WebUI.setText(findTestObject('TC26/TC26.5/Page_Login/input_Email address'), 'hammad.shahir@gmail.com')

WebUI.setEncryptedText(findTestObject('TC26/TC26.5/Page_Login/input_Password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('TC26/TC26.5/Page_Login/input_form1'))

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/a_Page'))

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/b_Fashionys.com'))

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/p_All our transactions are Verified by Norton an'))

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/span_All our transactions are Verified by Norton'))

WebUI.setText(findTestObject('TC26/TC26.5/Page_Admin Panel/div_Fashionys.com has made you shine on your spe'), '.')

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/p_'))

WebUI.setText(findTestObject('TC26/TC26.5/Page_Admin Panel/div_Fashionys.com has made you shine on your spe'), '')

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/button_form_about'))

WebUI.click(findTestObject('TC26/TC26.5/Page_Admin Panel/div_About Page Information is updated successful'))

