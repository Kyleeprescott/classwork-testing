package testjava;

public class Test {

	public static void main(String[] args) {
		char ch='p';
		
		if (ch>='\u0041' && ch<='\u005A') {
			System.out.println(ch+" is an uppercase letter");
			
		}
		else if (ch >='a' && ch <='z') {
			System.out.println(ch+" is a lowecase letter");
		}
		else if (ch >='0' && ch<'9') {
			System.out.println(ch+" is a number");
		}
		else {
			System.out.println("unknown");
			
		}
System.out.println("isDigit('a') is" + Character.isDigit('a'));
System.out.println("isLetter('a') is" + Character.isLetter('a'));
		
	}

}
