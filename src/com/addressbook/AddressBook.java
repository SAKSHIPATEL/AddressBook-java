package com.addressbook;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {

	public static void main(String[] args) {
		
		String firstName=null,lastName=null,mobileNum,city=null,address=null,state=null,zip=null,str=null;
		int choice;
		String pat1="^[A-Z]{1,}[a-z]{3,7}";
		String pat2="^(91){1}[1-9]{1}[0-9]{9}";
		String pat3="^[1-9]{1}[0-9]{5}";
		Scanner sc = new Scanner(System.in);
		System.out.println("1.validate first name\t2.validate last name\t3.validate mobile number\t4.validate pin\n\n\tChoice :");
		choice=sc.nextInt();
		
		if(choice == 1) {
			//first check its validation then add rules
			System.out.println("Enter the first Name :");
			firstName=sc.next();
			Pattern pattern1 = Pattern.compile(pat1);
			Matcher matcher1 = pattern1.matcher(firstName);
			if(matcher1.matches()) {
				System.out.println("Validated :"+firstName);
			}
			else {
				System.out.println("Not valid :");
			}
			
		}
		
		if(choice == 2) {
			System.out.println("Enter the last Name :");
			lastName=sc.next();
			Pattern pattern2 = Pattern.compile(pat1);
			Matcher matcher2 = pattern2.matcher(lastName);
			if(matcher2.matches()) {
				System.out.println("Validated :"+lastName);
			}
			else {
				System.out.println("Not valid :");
			}
			
		}
		
		if(choice == 3) {
			System.out.println("Enter the mobile number with 91 code :");
			mobileNum=sc.next();
			Pattern pattern3 = Pattern.compile(pat2);
			Matcher matcher3 = pattern3.matcher(mobileNum);
			if(matcher3.matches()) {
				System.out.println("Validated :"+mobileNum);
				
			}
			else {
				System.out.println("Not valid");
			}
			
		}
		
		if(choice == 4) {
			System.out.println("Enter the postal code :");
			zip=sc.next();
			Pattern pattern4 = Pattern.compile(pat3);
			Matcher matcher4 = pattern4.matcher(zip);
			if(matcher4.matches()) {
				System.out.println("Validated :"+zip);
			}
			else {
				System.out.println("Not valid");
			}
		}
		

	}

}
