package com.revature.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.revature.bank.BankDriver;
import com.revature.bank.domain.UserAccount;

class RegisterUserTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	void registerUserTest() {
		//AAA Pattern of Unit Testing
		
		//Arrange
		UserAccount expected = new UserAccount("nickj", "Nick", "Jurczak", "555-5555");
		
		//Act
		UserAccount actual = BankDriver.registerUser("nickj", "Nick", "Jurczak", "555-5555");
		
		//Assert
		assertTrue("User Account nickj should be registered to system.", expected.equals(actual));
		
	}

}
