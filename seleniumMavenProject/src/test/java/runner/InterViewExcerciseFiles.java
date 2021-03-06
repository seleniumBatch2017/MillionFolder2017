package runner;

import org.common.WebDriverHelper;
import org.testng.annotations.Test;

import interviewExcerciseFilesPages.AllLinksPage;
import interviewExcerciseFilesPages.JavaScriptAlertClickOnAssertion;

public class InterViewExcerciseFiles extends WebDriverHelper {

	AllLinksPage allLinksPage = new AllLinksPage();
	JavaScriptAlertClickOnAssertion  popUpHandling = new JavaScriptAlertClickOnAssertion();

	// @Test
	public void uploadAfile() {
		allLinksPage.navigateToUpload();
		allLinksPage.uploadAfile();
		allLinksPage.clickOnUpload();
		allLinksPage.verifyUploadDocument();

	}

	// @Test
	public void testAlerts()  {
		allLinksPage.clickOnJavaScriptAlerts();
		// popUpHandling.ClickForJSAlert();
		// popUpHandling.ClickForJSConfirm();
		// popUpHandling.ClickForJSPrompt();
		
		
	}


	@Test
	public void takeScreenShootTest() {

		allLinksPage.takeScreenShootTest("picture1");
	}
}
