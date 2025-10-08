package SMS.Sender.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import jakarta.annotation.PostConstruct;

@Service
public class SmsService {
	
	@Value("{$twilio_account_sid}")
	String account_sid;
	
	@Value("{$twilio_auth_token}")
	String auth_token;
	
	@Value("{$twilio_phone_number}")
	String phone_number;
	
	@PostConstruct
	public void setup() {
		Twilio.init(account_sid,auth_token);
	}
	
	public String smsSend(String smsNumber,String smsMessage) {
		Message message=Message.creator(
			new PhoneNumber(smsNumber),
			new PhoneNumber(phone_number),
			smsMessage).create();
				
		return message.getStatus().toString();
	}

}
