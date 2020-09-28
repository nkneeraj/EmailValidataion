package com.cg.emailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to the Email validator");
		Scanner sc = new Scanner(System.in);
		Pattern pincode = Pattern.compile("^abc");
		System.out.println("Enter the email");
		String pattern = sc.nextLine();
		Matcher matcher = pincode.matcher(pattern);
		boolean isFound = matcher.find();
		if(isFound)
			System.out.println("Valid Email");
		else
			System.out.println("Not a valid Email");
		sc.close();
	}
}
