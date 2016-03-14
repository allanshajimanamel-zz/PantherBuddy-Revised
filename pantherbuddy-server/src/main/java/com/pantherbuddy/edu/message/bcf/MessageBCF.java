package com.pantherbuddy.edu.message.bcf;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.pantherbuddy.edu.message.bo.MessageBO;
import com.pantherbuddy.edu.message.service.MessageService;


@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class MessageBCF implements MessageService{

	@EJB
	MessageBO messageBO;
}
