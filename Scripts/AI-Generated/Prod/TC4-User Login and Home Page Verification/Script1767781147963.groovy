import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Prod.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 963)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /login"

TrueTestScripts.navigate("login")

"Step 2: Click on input email"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/input_email'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on input email.png')

"Step 3: Enter input value in input email"

WebUI.setText(findTestObject('AI-Generated/Prod/Page_login/input_email'), input_email)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Enter input value in input email.png')

"Step 4: Click on div innerWrapper -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Prod/Page_login/div_innerWrapper'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on div innerWrapper - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-User Login and Home Page Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}