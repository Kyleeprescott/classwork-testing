package testjava;
import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String[] args) {
	 int attempts=0;
	 
	System.out.println("Welcome to the GUESSING GAME!");
	
	int number =(int)(Math.random() * 100 );
	
	System.out.println("Enter a guess from 1-100");
	Scanner input = new Scanner(System.in);
	   int guess = input.nextInt();
	 
	while (guess!=number) {
		attempts++;
		if (guess>number) {
			System.out.println(" Guess lower");	
		}
		else{
			System.out.println("Guess higher");
		}
		if (attempts==10) {
			break;
		}
		guess= input.nextInt();
	}
	if(guess==number) {
		System.out.println("You got it correct way to go");
	}

System.out.println("it only took you " +attempts);

	}

}
