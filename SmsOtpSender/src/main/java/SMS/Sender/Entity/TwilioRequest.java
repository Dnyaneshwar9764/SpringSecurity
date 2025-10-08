package SMS.Sender.Entity;


public class TwilioRequest {

	private final String toPhoneNumber;
	private final String message;
	
	public TwilioRequest(String toPhoneNumber, String message) {
		super();
		this.toPhoneNumber = toPhoneNumber;
		this.message = message;
	}

	public String getToPhoneNumber() {
		return toPhoneNumber;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "TwilioRequest [toPhoneNumber=" + toPhoneNumber + ", message=" + message + ", getToPhoneNumber()="
				+ getToPhoneNumber() + ", getMessage()=" + getMessage() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
