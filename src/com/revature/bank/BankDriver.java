package com.revature.bank;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.revature.bank.domain.UserAccount;

public class BankDriver {

	/*
	 * Register Functionality - create account - set username - set personal info
	 * (fname, lname, phone#) - set funds - display all registered users
	 */
	public static void main(String[] args) {

		List<UserAccount> userList = new LinkedList<UserAccount>();

		Scanner scan = new Scanner(System.in);

		userList.add(registerUserMenu(scan));

		boolean cont = true;

		while (cont) {

			System.out.println("Do you want to register, view accounts, or exit?");

			String response = scan.nextLine();

			switch (response) {

			case "register":

				userList.add(registerUserMenu(scan));
				break;

			case "view accounts":
				System.out.println("All users: " + userList);
				break;

			case "exit":
				System.out.println("Thank you for comming to our bank");
				cont = false;
				break;

			default:
				System.out.println("Sorry, I didn't catch that");
				break;

			}
		}

	}
	
	private static UserAccount registerUserMenu(Scanner scan) {
		
		System.out.println("What do you want your username to be?");

		String username = scan.nextLine();

		System.out.println("Your username is: " + username);

		System.out.println("What is your first name?");

		String fname = scan.nextLine();

		System.out.println("Your firstname is: " + fname);

		System.out.println("What is your lastname?");

		String lname = scan.nextLine();

		System.out.println("Your lastname is: " + lname);

		System.out.println("What is your phone number?");

		String phoneNumber = scan.nextLine();

		System.out.println("Your phoneNumber is: " + phoneNumber);

		return registerUser(username, fname, lname, phoneNumber);
	}
	
	public static UserAccount registerUser(String username, String fname, String lname, String phoneNumber) {
		
		UserAccount userAccount = new UserAccount(username, fname, lname, phoneNumber);

		System.out.println("Your new account is: " + userAccount);

		return userAccount;
		
	}

}

