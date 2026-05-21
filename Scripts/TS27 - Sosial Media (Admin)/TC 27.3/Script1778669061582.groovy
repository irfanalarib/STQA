import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.model.FailureHandling as FailureHandling

// =====================================================
// TEST CASE
// TC 27.3
// Periksa sistem ketika URL tidak sesuai
// domain platform dan harus ditolak
//
// Contoh:
// Field Facebook diisi URL Instagram
// =====================================================

// OPEN BROWSER
WebUI.openBrowser('')

WebUI.maximizeWindow()

// =====================================================
// LOGIN ADMIN
// =====================================================
WebUI.navigateToUrl('http://fashionys.com/admin/login.php')

WebUI.setText(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Login/input_Admin Panel_email'),
	'hammad.shahir@gmail.com'
)

WebUI.setEncryptedText(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Login/input_Admin Panel_password'),
	'4nvbrPglk7k='
)

WebUI.click(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Login/input_Admin Panel_form1')
)

// =====================================================
// MASUK MENU SOCIAL MEDIA
// =====================================================
WebUI.click(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Admin Panel/a_Social Media')
)

// =====================================================
// INPUT URL SALAH DOMAIN
// Facebook field diisi URL Instagram
// =====================================================
WebUI.setText(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Admin Panel/input_Facebook_facebook'),
	'https://www.instagram.com/min9yu_k'
)

// SUBMIT
WebUI.click(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Admin Panel/button_Submit')
)

// =====================================================
// VALIDASI
// Expected:
// Sistem HARUS menolak URL yang tidak sesuai
// dengan domain platform
// =====================================================

// Verifikasi pesan sukses TIDAK muncul
boolean successMessage = WebUI.verifyElementNotPresent(
	findTestObject('Object Repository/TS27 - Sosial Media (Admin)/TC 27.3/Page_Admin Panel/p_Social Media URLs are updated successfully'),
	5,
	FailureHandling.OPTIONAL
)

// Jika pesan sukses muncul → BUG
if (!successMessage) {

	WebUI.comment('BUG FOUND: Sistem menerima URL dengan domain platform yang salah.')

	WebUI.takeScreenshot()

	assert false : 'FAILED - URL Instagram diterima pada field Facebook.'

} else {

	WebUI.comment('PASSED: Sistem berhasil menolak URL dengan domain yang tidak sesuai.')

}

// =====================================================
// CLOSE BROWSER
// =====================================================
WebUI.closeBrowser()