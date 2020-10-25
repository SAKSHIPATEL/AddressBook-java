package com.addressbook;

import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
public class AddressBook {

	public static void main(String[] args) throws IOException {
		int end=1;
		int corrfirst=1,corrlast=1,corrmob=1,corrdist=1,corrstate=1,corrpin=1,corremail=1;
		int firstParam=1,secondParam=1,thirdParam=1,fourthParam=1,fifthParam=1,sixthParam=1,seventhParam=1;
		while (end==1) {
			String firstName=null,lastName=null,mobileNo=null,dist=null,state=null,pinCode=null,emailId=null;
			String name="^[a-z]{3,}";
			String pin="^[0-9]{6}";
			String mobile="^[0-9]{10}";
			String email="^[a-zA-Z0-9]{3,}[@][a-z]{2,}[.][a-z]{2,3}";
			Scanner sc = new Scanner(System.in);
			System.out.println("============Welcome to AddressBook=========== ");
			System.out.println("Choose from the following options - 1)create 2)search 3)edit 4)delete \n");
			int choice=sc.nextInt();
			if (choice==1) {
				while (corrfirst==1) {
				System.out.println("enter the first name\n");
				firstName=sc.next();
				Pattern p1=Pattern.compile(name);
				Matcher m1=p1.matcher(firstName);
				if(m1.matches()) {
					System.out.println("Valid "+firstName);
				     corrfirst++;}
				else
					System.out.println("invalid "+firstName);
				}
				while (corrlast==1) {
					System.out.println("enter the last name");
					lastName=sc.next();
					Pattern p2=Pattern.compile(name);
					Matcher m2=p2.matcher(lastName);
					if(m2.matches()) {
						System.out.println("valid"+lastName);
						corrlast++;}
					else
						System.out.println("invalid"+lastName);
				}
				while (corrdist==1) {
					System.out.println("enter the district name");
					dist=sc.next();
					Pattern p3=Pattern.compile(name);
					Matcher m3=p3.matcher(dist);
					if (m3.matches()) {
						System.out.println("valid"+dist);
						corrdist++;}
					else
						System.out.println("invalid"+dist);
				}
				while (corrstate==1) {
					System.out.println("enter the  state");
					state=sc.next();
					Pattern p4=Pattern.compile(name);
					Matcher m4=p4.matcher(state);
					if (m4.matches()) {
						System.out.println("valid"+state);
						corrstate++;}
					else
						System.out.println("invalid"+state);
				}
				while (corrmob==1) {
					System.out.println("enter the  mobile number");
					mobile=sc.next();
					Pattern p5=Pattern.compile(mobile);
					Matcher m5=p5.matcher(mobile);
					if (m5.matches()) {
						System.out.println("valid"+mobile);
						corrmob++;}
					else
						System.out.println("invalid"+mobile);
				}
				while (corremail==1) {
					System.out.println("enter the  email");
					emailId=sc.next();
					Pattern p6=Pattern.compile(email);
					Matcher m6=p6.matcher(emailId);
					if (m6.matches()) {
						System.out.println("valid"+emailId);
						corremail++;}
					else
						System.out.println("invalid"+emailId);
				}
				while (corrpin==1) {
					System.out.println("enter the  pincode");
					pinCode=sc.next();
					Pattern p7=Pattern.compile(pin);
					Matcher m7=p7.matcher(pinCode);
					if (m7.matches()) {
						System.out.println("valid"+pinCode);
						corrpin++;}
					else
						System.out.println("invalid"+pinCode);
				}
					File f1=new File("D:/Program/"+firstName+".txt");
					f1.createNewFile();
					FileWriter fw=new FileWriter("D:/Program/"+firstName+".txt");
					BufferedWriter bw=new BufferedWriter(fw);
					bw.write("first name is "+firstName+"\nlastname is "+lastName+"\ndistrict is "+dist+"\nstate is "+state+"\npincode is "+pinCode+"\nmobile no is "+mobile+"\nemail id is "+emailId);
					bw.close();
			
			
				}
			if (choice==2) {
				System.out.println("enter the name you choice to search. *note:only enter the first name");
				String search=sc.next();
				File f2=new File("D:/Program/"+search+".txt");
				boolean bool=f2.exists();
				if (bool == true) {
					FileReader fr=new FileReader("D:/Program/"+search+".txt");
					BufferedReader br =new BufferedReader(fr);
					String s1;
					while((s1=br.readLine())!=null) {
						System.out.println(s1);
					}
					br.close();
				}
				else System.out.println("name you choice to search do not exist");
				}
			if (choice==4) {
				System.out.println("enter the name you choice to delete. *note:only enter the first name");
				String del=sc.next();
				File f4=new File("D:/Program/"+del+".txt");
				boolean delete=f4.exists();
				if(delete==true) {
					f4.delete();
					System.out.println("the file is deleted sucessfully");
				}
				else System.out.println("name of the file with "+del+"is not found please provide correct name");
			}
			if (choice == 3) {
				System.out.println("enter the name you choice to edit");
				String edit=sc.next();
				File f3=new File("D:/Program/"+edit+".txt");
				boolean e=f3.exists();
				if (e==true) {

					while (firstParam==1) {
						System.out.println("enter the first name");
						firstName=sc.next();
						Pattern e1=Pattern.compile(name);
						Matcher ma1=e1.matcher(firstName);
						if(ma1.matches()) {
							System.out.println("Valid "+firstName);
						     firstParam++;}
						else
							System.out.println("inValid "+firstName);
						}
					while (secondParam==1) {
						System.out.println("enter the last name");
						lastName=sc.next();
						Pattern e2=Pattern.compile(name);
						Matcher ma2=e2.matcher(firstName);
						if(ma2.matches()) {
							System.out.println("Valid "+firstName);
						     secondParam++;}
						else
							System.out.println("inValid "+firstName);
						}
					while (thirdParam==1) {
						System.out.println("enter the district name");
						dist=sc.next();
						Pattern e3=Pattern.compile(name);
						Matcher ma3=e3.matcher(dist);
						if(ma3.matches()) {
							System.out.println("Valid "+dist);
						     thirdParam++;}
						else
							System.out.println("inValid "+dist);
						}
					while (fourthParam==1) {
						System.out.println("enter the state name");
						state=sc.next();
						Pattern e4=Pattern.compile(name);
						Matcher ma4=e4.matcher(state);
						if(ma4.matches()) {
							System.out.println("Valid "+state);
						     fourthParam++;}
						else
							System.out.println("inValid "+state);
						}
					while (fifthParam==1) {
						System.out.println("enter the  mobile");
						mobile=sc.next();
						Pattern e5=Pattern.compile(mobile);
						Matcher ma5=e5.matcher(mobile);
						if (ma5.matches()) {
							System.out.println("valid"+mobile);
							fifthParam++;}
						else
							System.out.println("invalid"+mobile);
					}
					while (sixthParam==1) {
						System.out.println("enter the  email");
						emailId=sc.next();
						Pattern e6=Pattern.compile(email);
						Matcher ma6=e6.matcher(emailId);
						if (ma6.matches()) {
							System.out.println("valid"+emailId);
							sixthParam++;}
						else
							System.out.println("invalid"+emailId);
					}
					while (seventhParam==1) {
						System.out.println("enter the  pincode");
						pinCode=sc.next();
						Pattern e7=Pattern.compile(pin);
						Matcher ma7=e7.matcher(pinCode);
						if (ma7.matches()) {
							System.out.println("valid"+pinCode);
							seventhParam++;}
						else
							System.out.println("invalid"+pinCode);
					}
					FileWriter fw1=new FileWriter("D:/Program/"+firstName+".txt");
					BufferedWriter bw=new BufferedWriter(fw1);
					bw.write("first name is"+firstName+"\nlastname is "+lastName+"\ndistrict is"+dist+"\nstate is "+state+"\npincode is"+pinCode+"\nmobilr no is"+mobile+"\nemail id is"+emailId);
					bw.close();	
				}
				else System.out.println("name you want to edit is not available;please provide the first name of the user");
				
			}
			System.out.println("1)continue 2)end");
			int process=sc.nextInt();
			if (process==2) {end++;
			System.out.println("Closing the Address Book :D");
			}
			else {System.out.println("Let's Continue");
			 corrfirst=1;corrlast=1;corrmob=1;corrdist=1;corrstate=1;corrpin=1;corremail=1;
			 firstParam=1;secondParam=1;thirdParam=1;fourthParam=1;fifthParam=1;sixthParam=1;seventhParam=1;}
		
		}
		
		}
	}