package testjava;
import java.util.Scanner;

public class GuessingNumberberGame {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int guess = 0;
		int Number =(int) (Math.random() *100);
		
		System.out.println("enter a Number between 1-100");
		guess = input.nextInt();

		while (guess != Number) {
		if (guess < Number) {
		System.out.println("guess higher");
		}
		else {
		System.out.println("guess lower");
		}
		guess = input.nextInt();
		}
		System.out.println("you got it!");

		guess = 0;
		Number = (int) (Math.random()* 100);
		do { 
		if (guess < Number) {
		System.out.println("guess higher");
		}
		else {
		System.out.println("guess lower");
		}
		guess = input.nextInt();

		} while (guess != Number);
		System.out.println("you got it!");
		for (guess = 0; guess != Number; guess = input.nextInt()) {
		if (guess < Number) {
		System.out.println("guess higher");
		}
		else {
		System.out.println("guess lower");
		}
		}
		}
	}
	

	

