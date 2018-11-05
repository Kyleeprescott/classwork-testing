package testjava;
import java.util.Scanner;
public class ThreeStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = "welcome To Java";
		String s2 = "Programmimg Is Fun";
		String s3 = " Welcome To Java";
		System.out.println(s1 == s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareTo(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.indexOf("to"));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf("o",15));
		System.out.println(s1.length());
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,11));
		System.out.println(s1.startsWith("Wel"));
		System.out.println(s1.endsWith("Java"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains(s2));
		System.out.println("\t Wel \t".trim());
		

	}

}
