package com.pantherbuddy.web.controller;

import java.io.Serializable;
import java.util.Properties;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.naming.Context;
import javax.naming.InitialContext;

import com.test.EJBTestService;

@ManagedBean(name = "login")
@ViewScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 6803719669391278662L;

	private String username;

	private String password;

	@PostConstruct
	public void init() {
		this.username = new String();
		this.password = new String();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String loginAction() {
		try {

			if(getUsername().equalsIgnoreCase("pantherbuddy")&&getPassword().equalsIgnoreCase("pantherbuddy")){
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("username", getUsername());
			}
			else {
				return "/login.jsf?faces-redirect=true";
			}

//						EmailService emailService = (EmailService) new InitialContext().lookup("java:module/EmailService");
//						boolean isSent = emailService.sendMail();
//						System.out.println(isSent);

						Properties prop = new Properties();
						prop.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
						Context context = new InitialContext(prop);
						EJBTestService ejbTest = (EJBTestService)context.lookup("java:app/pantherbuddy-server-0.0.1-SNAPSHOT/EjbTest!com.test.EJBTestService");
						ejbTest.createUserTest();

			//			java:global/pantherbuddy-ear/pantherbuddy-server-0.0.1-SNAPSHOT/EmailService!com.test.EmailService
			//			StatelessEJBLocator<EJBTestService> locator = new StatelessEJBLocator<EJBTestService>(EJBTestService.class, "pantherbuddy-ear", "pantherbuddy-server-0.0.1-SNAPSHOT", "EjbTest", "");
			//			EJBTestService ejbTestService = EJBClient.createProxy(locator);
			//			ejbTestService.createUserTest();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "pages/homepage.jsf?faces-redirect=true";
	}

	public String registerAction() {
		return "pages/register.jsf?faces-redirect=true";
	}

	public String recoverPassAction() {
		return "pages/recoverpassword.jsf?faces-redirect=true";
	}
}
