package com.pantherbuddy.web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "logout")
@SessionScoped
public class LogoutBean {

	public String logoutAction(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login.jsf?faces-redirect=true";
	}
}
