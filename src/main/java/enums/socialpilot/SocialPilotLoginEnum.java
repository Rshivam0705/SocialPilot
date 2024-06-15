package enums.socialpilot;

public enum SocialPilotLoginEnum {
	SOCIALPILPILOT_EMAIL_XPATH("//input[@id='email']"),
	SOCIALPILOT_PASSWORD_XPATH("//input[@id='password']"),
	SOCIALPILOT_SIGNIN_XPATH("//button[@type='submit']");

	private final String label;

	SocialPilotLoginEnum(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return this.label;
	}
}
