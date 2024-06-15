package page.Socialpilot;

import common.UtilitiesCommon;
import enums.login.LoginPageEnum;
import enums.socialpilot.SocialPilotLoginEnum;

public class SocialPilotLogin {
	/**
	 * This method is used to Access the Account information after login to the Systems.
	 * @author RShivam
	 * @lastmodifiedby RShivam
	 */
	public static void login(String usernameKey, String passwordKey) {		
		UtilitiesCommon.launchApplication();
		String username = UtilitiesCommon.getEnvironmentData(usernameKey);
		String password = UtilitiesCommon.getEnvironmentData(passwordKey);
		UtilitiesCommon.log("Logging in with User name : " + username);
		UtilitiesCommon.enterValue(SocialPilotLoginEnum.SOCIALPILPILOT_EMAIL_XPATH, username);
		UtilitiesCommon.enterValue(SocialPilotLoginEnum.SOCIALPILOT_PASSWORD_XPATH,
		UtilitiesCommon.getDecryptedPassword(password));
		UtilitiesCommon.click(SocialPilotLoginEnum.SOCIALPILOT_SIGNIN_XPATH);
		
	}
}
