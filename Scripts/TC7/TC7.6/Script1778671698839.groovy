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

WebUI.navigateToUrl('http://fashionys.com/index.php')

WebUI.click(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/a_Login'))

WebUI.setText(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/input_cust_email'), 'ademahardika81@gmail.com')

WebUI.setEncryptedText(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/input_cust_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/input_form1'))

WebUI.click(findTestObject('TC7/TC7.6/Page_Dashboard - Fashionys.com  New/img_logo image'))

WebUI.click(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/a_Men'))

WebUI.click(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/span_Women'))

WebUI.click(findTestObject('TC7/TC7.6/Page_Fashionys.com  New/a_Kids'))

