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

CustomKeywords.'jPetStore.login.loginsteps'()

WebUI.verifyElementPresent(findTestObject('JPetStore/home_page/search_field'), 0)

WebUI.setText(findTestObject('JPetStore/home_page/search_field'), GlobalVariable.pet)

WebUI.click(findTestObject('JPetStore/home_page/btn_search'))

WebUI.verifyTextPresent('Fresh Water fish from China', false)

WebUI.click(findTestObject('JPetStore/home_page/fish_img'))

WebUI.verifyElementPresent(findTestObject('JPetStore/Shopping Cart/Add to Cart - Adult Male Goldfish'), 0)

WebUI.click(findTestObject('JPetStore/Shopping Cart/Add to Cart - Adult Male Goldfish'))

WebUI.verifyTextPresent('Shopping Cart', false)

WebUI.verifyElementPresent(findTestObject('JPetStore/Shopping Cart/remove_btn'), 0)

WebUI.click(findTestObject('JPetStore/Shopping Cart/remove_btn'))

WebUI.verifyTextPresent('Your cart is empty.', false)

