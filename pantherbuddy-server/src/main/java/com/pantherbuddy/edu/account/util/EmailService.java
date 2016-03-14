package com.pantherbuddy.edu.account.util;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@LocalBean
@Stateless
public class EmailService {
	public static final String EMAIL_SESSION_JNDI_PATH = "java:/Mail";

	@Resource(lookup="java:jboss/mail/Gmail")
	private Session mailSession;

	public boolean sendMail(String password){
		try{
			MimeMessage m = new MimeMessage(mailSession);
			InternetAddress[] to = new InternetAddress[] {
					new InternetAddress("ashah044@fiu.edu")
			};
			m.setRecipients(Message.RecipientType.TO, to);
			m.setSubject("Test mail");
			m.setSentDate(new java.util.Date());
			m.setText("This is a test mail", "utf-8", "html");
			//
			Transport.send(m);
			//
			return true;
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	//	private Session getEmailSession() throws Exception{
	//		InitialContext context = new InitialContext();
	//		return (Session) context.lookup(EMAIL_SESSION_JNDI_PATH);
	//	}
}
