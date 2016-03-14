package com.pantherbuddy.edu.account.bo;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.pantherbuddy.edu.account.dao.UserDAO;
import com.pantherbuddy.edu.account.entity.User;
import com.pantherbuddy.edu.account.to.UserTO;
import com.pantherbuddy.edu.account.util.AESEncryption;
import com.pantherbuddy.edu.account.util.EmailService;
import com.pantherbuddy.edu.account.util.PasswordGenerator;

@LocalBean
@Stateless
public class AccountBO {
	@EJB
	private UserDAO userDAO;

	@EJB
	private EmailService emailService;

	public void registerUser(UserTO userTO) {
		checkUserExists(userTO);
		PasswordGenerator.generatePassword();
		User user = populateUser(userTO);
		userDAO.saveUser(user);
		emailService.sendMail(userTO.getPassword());
	}

	private boolean checkUserExists(UserTO userTO) {
		// TODO need to implement.
		userDAO.getUserByEMail(userTO.getEmail());
		return false;
	}

	private User populateUser(UserTO userTO) {
		// TODO need to implement.
		return null;
	}

	public void recoverPassword(String email) {
		// TODO need to implement.
		User user = userDAO.getUserByEMail(email);
		emailService.sendMail(user.getPassword());
	}

	public boolean loginUser(UserTO userTO) throws InvalidKeyException,
	NoSuchAlgorithmException, NoSuchPaddingException,
	IllegalBlockSizeException, BadPaddingException {
		// TODO need to implement
		User user = userDAO.getUserByEMail(userTO.getEmail());
		String storedPassword = AESEncryption.decrypt(user.getPassword());
		activateUser(user);
		return false;
	}

	private void activateUser(User user) {
		userDAO.saveUser(user);
	}

	public UserTO getUserData(UserTO userTO) {
		User user = userDAO.getUserById(userTO.getUserId());
		return getUserTO(user);
	}

	private UserTO getUserTO(User user) {
		return null;
	}
}
