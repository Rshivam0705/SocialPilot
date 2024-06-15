package sanity.SocialPilot;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import page.Socialpilot.SocialPilotLogin;
/**
 * This class will contain all Sanity tests related to Launch the URL and login with valid credentials.
 * @author RShivam
 * @lastmodifiedby RShivam
 */
@Listeners({ listeners.ScriptExecutionListener.class })
public class SanitySocialPilotLogin {
	/**
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	@Test(testName = "Hamleys verify Github Actions")
	@Description("This Test is used to Verify Launch the URL and Login With valid email address and password")
	public void testSocialPilotLogin() {
		SocialPilotLogin.login("AdminUserName", "AdminPassword");
	}
}

