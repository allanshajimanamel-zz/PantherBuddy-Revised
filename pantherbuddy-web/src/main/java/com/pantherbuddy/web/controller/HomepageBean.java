package com.pantherbuddy.web.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "home")
@ViewScoped
public class HomepageBean {

	private String user;

	@PostConstruct
	public void init() {
		setUser((String) FacesContext.getCurrentInstance().getExternalContext()
				.getSessionMap().get("username"));
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
}
