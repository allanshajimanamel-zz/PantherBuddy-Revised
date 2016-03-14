package com.test;

import junit.framework.TestCase;

import org.mockito.Mockito;

import com.pantherbuddy.edu.account.util.EmailService;

public class MailTest extends TestCase {

	//	private Context context;

	@Override
	protected void setUp() throws Exception {
		//		context = EJBContainer.createEJBContainer().getContext();
		//		Properties properties = new Properties();
		//		properties.setProperty(EJBContainer.MODULES, "pantherbuddy-server");
		//		properties.put(EJBContainer.PROVIDER, "tomee-embedded");
		//		context = EJBContainer.createEJBContainer().getContext();
	}

	public void testBlue() throws Exception {
		EmailService emailService = Mockito.mock(EmailService.class);
		Mockito.when(emailService.sendMail("testpass")).thenReturn(true);
		//when(test.getUniqueId()).thenReturn(43);

		assertEquals(true, true);
	}
}
