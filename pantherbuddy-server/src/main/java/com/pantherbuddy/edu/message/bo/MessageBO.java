package com.pantherbuddy.edu.message.bo;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.pantherbuddy.edu.message.dao.MessageDAO;

@LocalBean
@Stateless
public class MessageBO {

	@EJB
	MessageDAO messageDAO;
}
