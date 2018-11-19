package testjava;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

	public static void main(String[] args) {
		int attempts=0;
		int low=0;
		 int high=100;
		 
		 
		System.out.println("Welcome to the GUESSING GAME!");
		
		int number =(int)(Math.random() * 100 );
		
		System.out.println("Enter a guess from 1-100");
		Scanner input = new Scanner(System.in);
		int random = ThreadLocalRandom.current().nextInt(low,high);
		attempts++;
		   //int guess = input.nextInt();
		 
		while (random!=number) {
			System.out.println("I guess "+random);
			attempts++;
			if (random>number) {
				
				System.out.println(" Guess lower");	
				high= random;
			}
			else{
				System.out.println("Guess higher");
				low = random;
				
			}
			if (attempts==10) {
				break;
			}
			random = ThreadLocalRandom.current().nextInt(low,high);
		}
		if(random==number) {
			System.out.println("You got it correct way to go");
		}

	System.out.println("it only took you " +attempts);

		}

	}