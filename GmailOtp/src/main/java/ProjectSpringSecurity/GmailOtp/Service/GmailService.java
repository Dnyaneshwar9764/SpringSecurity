package ProjectSpringSecurity.GmailOtp.Service;

import java.time.Instant;
import java.util.Random;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class GmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	
	private final String Admin_mail="sarodednyan@gmail.com";
	
	private String last_otp;
	
	private Instant otpTimeStamp;
	
	public void sendOtpAdmin() {
		
		String otp=String.format("%05d",new Random().nextInt(100000));
		
		this.last_otp=otp;
		this.otpTimeStamp=Instant.now();
		
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom(Admin_mail);
		message.setTo(Admin_mail);		
		message.setSubject("OTP Varification Code");
		message.setText("varification code "+otp);
		
		mailSender.send(message);
	}
	
	

}
