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

WebUI.navigateToUrl('http://fashionys.com/')

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/h1_Welcome to Fashionys.com'))

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/h1_Welcome to Fashionys.com'))

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/div_Welcome to Fashionys.com               _0d6b28'))

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/span_Previous_fa fa-angle-right'))

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/div_50 Discount on All Products            _93b454'))

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/a_Next'))

WebUI.click(findTestObject('Object Repository/TS11 - Slider (Customer view)/TC11.2/Page_Fashionys.com  Online Garments Shop/div_24 Hours Customer Support              _88071f'))

