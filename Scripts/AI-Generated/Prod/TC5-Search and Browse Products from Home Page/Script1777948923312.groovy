import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 963)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on div innerWrapper"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/div_innerWrapper'))

"Step 3: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_home/input_search'), input_search)

"Step 4: Click on div shopByCategory -> Navigate to page '/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/div_shopByCategory'))

"Step 5: Click on main productDetails -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_home/main_productDetails'))

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Search and Browse Products from Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}