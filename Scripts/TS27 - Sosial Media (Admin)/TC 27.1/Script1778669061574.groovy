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

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Login/input_Admin Panel_email'), 
    'hammad.shahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Login/input_Admin Panel_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Login/input_Admin Panel_form1'))

WebUI.click(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/a_Social Media'))

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Facebook_facebook'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Twitter_twitter'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_LinkedIn_linkedin'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Google Plus_googleplus'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Pinterest_pinterest'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_YouTube_youtube'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Instagram_instagram'), 
    '')

WebUI.click(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/div_If you do not want to show a social med_f3c311'))

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Tumblr_tumblr'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Flickr_flickr'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Reddit_reddit'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Snapchat_snapchat'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_WhatsApp_whatsapp'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Quora_quora'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_StumbleUpon_stumbleupon'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Delicious_delicious'), 
    '')

WebUI.setText(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/input_Digg_digg'), 
    '')

WebUI.click(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/button_Submit'))

WebUI.click(findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.1/Page_Admin Panel/p_Social Media URLs are updated successfully'))

