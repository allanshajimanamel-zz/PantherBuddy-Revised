package com.pantherbuddy.edu.account.bcf;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.pantherbuddy.edu.account.bo.AccountBO;
import com.pantherbuddy.edu.account.service.AccountService;
import com.pantherbuddy.edu.account.to.UserTO;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class AccountBCF implements AccountService {

	@EJB
	private AccountBO accountBO;

	@Override
	public void registerUser(UserTO userTO) {
		// TODO need to implement.
		accountBO.registerUser(userTO);
	}

	@Override
	public void recoverPassword(String email) {
		// TODO Auto-generated method stub
		accountBO.recoverPassword(email);
	}

	@Override
	public boolean loginUser(UserTO userTO) throws InvalidKeyException,
	NoSuchAlgorithmException, NoSuchPaddingException,
	IllegalBlockSizeException, BadPaddingException {
		// TODO Auto-generated method stub
		accountBO.loginUser(userTO);
		return false;
	}

	@Override
	public UserTO getUserData(UserTO userTO) {
		// TODO Auto-generated method stub
		accountBO.getUserData(userTO);
		return null;
	}
}
