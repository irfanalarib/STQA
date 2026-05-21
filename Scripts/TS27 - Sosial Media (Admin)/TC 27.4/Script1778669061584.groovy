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

// =====================================================
// TEST CASE
// TC 27.4
// Periksa sistem ketika panjang URL
// melebihi batas 255 karakter dan harus ditolak
// =====================================================

// OPEN BROWSER
WebUI.openBrowser('')

WebUI.maximizeWindow()

// =====================================================
// LOGIN ADMIN
// =====================================================
WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.setText(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Login/input_Admin Panel_form1')
)

// =====================================================
// MASUK MENU SOCIAL MEDIA
// =====================================================
WebUI.click(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Admin Panel/a_Social Media')
)

// =====================================================
// INPUT URL > 255 KARAKTER
// =====================================================
String longUrl = 'https://www.instagram.com/min9yu_k?utm_source=fashionys&utm_medium=social&utm_campaign=summer_collection_2026&utm_content=instagram_profile_link_for_marketing_purposes_and_tracking_user_engagement_statistics_on_fashionys_website_slider_banner_promotion_extra_parameters_1234567890abcdefghijklmnopqrstuvwxyz'

WebUI.setText(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Admin Panel/input_Instagram_instagram'),
	longUrl
)

// SUBMIT
WebUI.click(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Admin Panel/button_Submit')
)

// =====================================================
// VALIDASI
// Expected:
// Sistem HARUS menolak URL
// dengan panjang melebihi 255 karakter
// =====================================================

// Verifikasi pesan sukses TIDAK muncul
boolean successMessage = WebUI.verifyElementNotPresent(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.4/Page_Admin Panel/p_Social Media URLs are updated successfully'),
	5,
	FailureHandling.OPTIONAL
)

// Jika pesan sukses muncul → BUG
if (!successMessage) {

	WebUI.comment('BUG FOUND: Sistem menerima URL lebih dari 255 karakter.')

	WebUI.takeScreenshot()

	assert false : 'FAILED - URL melebihi 255 karakter diterima oleh sistem.'

} else {

	WebUI.comment('PASSED: Sistem berhasil menolak URL melebihi batas karakter.')

}

// =====================================================
// CLOSE BROWSER
// =====================================================
WebUI.closeBrowser()

