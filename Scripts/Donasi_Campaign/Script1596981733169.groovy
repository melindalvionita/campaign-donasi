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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kitabisa.com/')

WebUI.scrollToElement(findTestObject('Object Repository/span_AYO BAHAGIAKAN ANAK MASAMBA KORBAN BAN_eb0e0a'))

WebUI.click(findTestObject('Object Repository/span_AYO BAHAGIAKAN ANAK MASAMBA KORBAN BAN_eb0e0a'))

WebUI.click(findTestObject('Object Repository/button_DONASI SEKARANG'))

WebUI.click(findTestObject('Object Repository/div_Rp 10000Nominal minimal donasi'))

WebUI.scrollToElement(findTestObject('Object Repository/div_Transfer BCA'))

WebUI.click(findTestObject('Object Repository/div_Transfer BCA'))

WebUI.setText(findTestObject('Object Repository/input_atau lengkapi data di bawah ini_fullname'), 'Melinda Alvionita')

WebUI.setText(findTestObject('Object Repository/input_atau lengkapi data di bawah ini_username'), '085155440609')

WebUI.click(findTestObject('Object Repository/button_LANJUTKAN PEMBAYARAN'))

WebUI.scrollToElement(findTestObject('Object Repository/button_KEMBALI KE PENGGALANGAN'))

WebUI.click(findTestObject('Object Repository/button_KEMBALI KE PENGGALANGAN'))

WebUI.click(findTestObject('Object Repository/svg_AYO BAHAGIAKAN ANAK MASAMBA KORBAN BANJ_e00a26'))

WebUI.closeBrowser()

