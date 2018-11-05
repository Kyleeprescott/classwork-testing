package testjava;
import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
	//String message = "Welcome To Java";
	//message = message.substring(11,15);
	//System.out.println(message);
      //message.indexOf("J");
     // System.out.println(message.indexOf("J"));
      //System.out.println(message.indexOf("a",13));
      //System.out.println(message.indexOf("Wel"));
      //System.out.println(message.lastIndexOf("a"));
      
      char name = "0";
      Scanner input =new Scanner(System.in);
      System.out.println("Enter your first and last name ");
      name = input.nextLine().charAt(0);
     //int space = name.indexOf(" ");
     if (name.isDigit()) {
     int name1= Integer.parseInt(name);
     } 
     else {
    	 System.out.println("that is not a number ");
    	 
     }
     double name2 = Double.parseDouble(name);
     
      String firstName = name.substring(0,space);
      
    		  
    		  
    		 String lastName = name.substring(space+1);
    		 System.out.println(firstName);
    		 System.out.println(lastName);
    		 
      
	}

}
