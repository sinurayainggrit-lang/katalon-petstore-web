package jPetStore

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {
	@Keyword
	def loginsteps () {
		def usernameObject = findTestObject('JPetStore/Login-Page/username_field')                  
		def passwordObject = findTestObject('JPetStore/Login-Page/password_field')
		
		String username = 'Inggrit15'
		
		String password = 'Test123'
		
		WebUI.openBrowser(GlobalVariable.baseUrl)
		
		WebUI.maximizeWindow()
		
		WebUI.click(findTestObject('JPetStore/Login-Page/btn_sign_in'))
		
		WebUI.setText(findTestObject('JPetStore/Login-Page/username_field'), username)
		
		WebUI.clearText(findTestObject('JPetStore/Login-Page/password_field'))
		
		WebUI.setText(findTestObject('JPetStore/Login-Page/password_field'), password)
		
		WebUI.click(findTestObject('JPetStore/Login-Page/btn_login'))

		
	}
}
