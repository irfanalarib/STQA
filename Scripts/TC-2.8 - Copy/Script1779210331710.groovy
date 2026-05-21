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

WebUI.click(findTestObject('TC-LOGIN (EMAIL DAN PASS SALAH)/Page_Fashionys.com  Online Garments Shop/a_Login'))

if (username != 'none') {
    WebUI.setText(findTestObject('TC-LOGIN (EMAIL DAN PASS BENAR)/Page_Fashionys.com  Online Garments Shop/input_cust_email'), username )
}

if (password != 'none') {
    WebUI.setText(findTestObject('TC-LOGIN (EMAIL DAN PASS BENAR)/Page_Fashionys.com  Online Garments Shop/input_cust_password'), password)
}

WebUI.click(findTestObject('TC-LOGIN (EMAIL DAN PASS BENAR)/Page_Fashionys.com  Online Garments Shop/input_form1'))

if (testType == 'P') {
	WebUI.waitForElementVisible(findTestObject('TC-LOGIN (EMAIL DAN PASS BENAR)/Page_Dashboard - Fashionys.com  Online Garments Shop/div_Dashboard        Update Profile        _feade9'),
		0)
} else {
	WebUI.verifyElementText(findTestObject('warningMsgContainer'), expectedWarningMassage)
}




