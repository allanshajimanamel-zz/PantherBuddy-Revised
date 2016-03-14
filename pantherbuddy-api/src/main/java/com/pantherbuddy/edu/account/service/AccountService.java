package com.pantherbuddy.edu.account.service;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.ejb.Local;

import com.pantherbuddy.edu.account.to.UserTO;

@Local
public interface AccountService {

	public void registerUser(UserTO userTO);

	public void recoverPassword(String email);

	public boolean loginUser(UserTO userTO) throws InvalidKeyException,
	NoSuchAlgorithmException, NoSuchPaddingException,
	IllegalBlockSizeException, BadPaddingException;

	public UserTO getUserData(UserTO userTO);
}
