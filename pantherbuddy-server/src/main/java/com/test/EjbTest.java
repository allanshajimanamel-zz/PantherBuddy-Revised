package com.test;

import java.sql.Timestamp;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pantherbuddy.edu.account.entity.User;
import com.pantherbuddy.edu.account.util.Role;

@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class EjbTest implements EJBTestService {

	@PersistenceContext(unitName = "persistenceUnit")
	EntityManager entityManager;

	@Override
	public void createUserTest() {

		User user = new User();
		user.setActivationDate(new Timestamp(2696460000L));
		user.setEmail("test@email.com");
		user.setFname("Allan");
		user.setLname("Manamel");
		user.setPassword("password");
		user.setPhoneNumber(new Long("1"));
		user.setStatus(Boolean.TRUE);
		user.setRole(Role.ADMIN);

		entityManager.persist(user);
	}
}
