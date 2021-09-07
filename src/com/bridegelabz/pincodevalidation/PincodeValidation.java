package com.bridegelabz.pincodevalidation;

import java.util.Scanner;
import java.util.regex.*;
public class PincodeValidation {
	
	public static boolean pincodeValidation(String pincode) {
		String pincodeRegex = "^[0-9]{6}$";
		return Pattern.matches(pincodeRegex, pincode);
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter pincode");
		String pincode=scanner.nextLine();
		while(!pincodeValidation(pincode)) {
			System.out.println("Invalid pincode.Enter again");
			pincode=scanner.nextLine();
		}

	}

}
