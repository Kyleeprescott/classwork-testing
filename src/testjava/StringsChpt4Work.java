package testjava;

import java.util.Scanner;

public class StringsChpt4Work {

	public static void main(String[] args) {
		
		String message= "welcome To Java";
		String message2 ="java is fun";
		System.out.println(message.length());
		System.out.println("Welcome To Java".length());
		System.out.println(message.charAt(8));
		
		//System.out.println(message +message2);
		//System.out.println(message.concat(message));
		//message+="And java is fun";
		//message+=message2;
		//message = message+message2;
		//Scanner input = new Scanner(System.in);
	    // String x= input.next();
		//String x= input.nextLine();
		
		
		if (message.equalsIgnoreCase("Welcome To Java")) {
			System.out.println("you're in ");
		}
		
		else {
			System.out.println("you're not in ");
		}
			
		

	}

}
