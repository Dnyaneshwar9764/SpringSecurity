package ProjectSpringSecurity.GmailOtp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ProjectSpringSecurity.GmailOtp.Service.GmailService;
import ch.qos.logback.core.status.Status;

@Controller
public class GmailController {
	
	@Autowired
	private GmailService gmailService;
	
	@GetMapping("/sent_otp")		
		public ResponseEntity<String> sendOtp(){
			
			try {
				gmailService.sendOtpAdmin();
				return ResponseEntity.ok("otp sended.....");
			}
			catch(Exception ex) {
				return ResponseEntity.status(500).body(ex.getMessage());
			}
		  }
		 
		
	}


