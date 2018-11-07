package testjava;

import java.util.Scanner;

public class hexDigit2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Hex Digit 0-9 and A-F");
		String hexString = input.nextLine();
		
		int value1=0;
		int value2 =0;
		int value3=0;
		
		if (hexString.length() !=3) {
			System.out.println("You must enter exactly one characters");
			System.exit(3);
		}
		char ch1= Character.toUpperCase(hexString.charAt(0));
		char ch2= Character.toUpperCase(hexString.charAt(1));
		char ch3= Character.toUpperCase(hexString.charAt(2));
		
		if (ch1<= 'F'&& ch1>='A') {
			value1=ch1-'A'+10;
		}
		else if (Character.isDigit(ch1)) {
			value1=ch1;
		}
		if (ch2<='F'&&ch2>='A') {
			value2=ch2-'A'+10;
		}
		else if (Character.isDigit(ch2)){
			value2=ch2;
			
		}
		if (ch3<='F'&& ch3>='A') {
			value3 = ch3-'A'+10;
		}
		else if (Character.isDigit(ch3)) {
			value3= ch3;
		}
		else {
			System.out.println("")
		}
		System.out.println(char1);
		System.out.println();
		System.out.println("")
		
		}

	}





