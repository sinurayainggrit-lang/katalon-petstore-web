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

WebUI.navigateToUrl(GlobalVariable.baseUrl)

WebUI.click(findTestObject('JPetStore/Login-Page/btn_sign_in'))

WebUI.setText(findTestObject('JPetStore/Login-Page/username_field'), username)

WebUI.clearText(findTestObject('JPetStore/Login-Page/password_field'))

WebUI.setText(findTestObject('JPetStore/Login-Page/password_field'), password)

WebUI.click(findTestObject('JPetStore/Login-Page/btn_login'))



// jika user input valid credential maka login berhasil
// jika user input salah satu invalid credential maka gagal login
if (testType == 'P') {
    WebUI.verifyElementPresent(findTestObject('JPetStore/home_page/signout_btn'), 0)
} else {
    WebUI.verifyTextPresent('Invalid username or password. Signon failed.', false)
}

WebUI.closeBrowser()

