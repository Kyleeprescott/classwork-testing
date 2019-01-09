package testjava;
import java.util.Scanner;

public class GuessingMyNumberGame {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		 
		System.out.println("Welcome to the GUESSING GAME!");
		
		int number =(int)(Math.random() * 100 );
		
		System.out.println("Enter a number between 1-100 ");
		int guess = input.nextInt();
		
		for (int x=guess; number<guess; x++) {
			System.out.println("guess higher");
			break;
		}
for (int x=guess; guess<number; x++) {
	System.out.println("guess lower");
	break;
}
System.out.println("Guess a number between")
	}

}
