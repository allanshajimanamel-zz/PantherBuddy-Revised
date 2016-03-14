package com.pantherbuddy.web.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author ALLAN
 *
 */
@ManagedBean(name = "register")
@ViewScoped
public class RegisterationBean implements Serializable {
	private static final long serialVersionUID = 7202229792633243885L;

	private String fname;
	private String lname;
	private String email;
	private Integer phNumber;

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname
	 *            the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname
	 *            the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

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
	 * @return the phNumber
	 */
	public Integer getPhNumber() {
		return phNumber;
	}

	/**
	 * @param phNumber
	 *            the phNumber to set
	 */
	public void setPhNumber(Integer phNumber) {
		this.phNumber = phNumber;
	}

	public String navigateToLogin(){
		return "/login.jsf?faces-redirect=true";
	}

	public String registerAction(){
		return "/login.jsf?faces-redirect=true";
	}
}
