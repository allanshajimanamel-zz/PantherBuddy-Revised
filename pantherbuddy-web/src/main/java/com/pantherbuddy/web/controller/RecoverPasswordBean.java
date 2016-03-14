package com.pantherbuddy.web.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author ALLAN
 *
 */
@ManagedBean(name = "recoverPass")
@ViewScoped
public class RecoverPasswordBean implements Serializable {

	private static final long serialVersionUID = 2135298482198584714L;

	private String email;

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String recoverPassAction() {
		return "/login.jsf?faces-redirect=true";
	}

	public String navigateToLogin() {
		return "/login.jsf?faces-redirect=true";
	}
}
