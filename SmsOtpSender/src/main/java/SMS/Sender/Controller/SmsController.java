package SMS.Sender.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import SMS.Sender.Entity.TwilioRequest;
import SMS.Sender.Service.SmsService;

@RestController
public class SmsController {
	
	@Autowired
	SmsService smsService;
	
	@PostMapping("/sms")
	 public ResponseEntity<String> sendMessage(@RequestBody TwilioRequest twilioRequest){
		 
		if(twilioRequest.getToPhoneNumber()==null || twilioRequest.getMessage()==null) {
			return ResponseEntity.badRequest().body("Invalid Request");
		
		}
		
        smsService.smsSend("+919764329454", " hi...........");
     return ResponseEntity.ok(" OTP SMS has been send...");
}
}
