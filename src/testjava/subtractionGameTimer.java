package testjava;
/*
 * Kylee Prescott
 * 11/27
 * subtraction game timed 
 */

import java.util.Scanner;

public class subtractionGameTimer {

	public static void main(String[] args) {
		
	final int NUMBER_OF_QUESTIONS=5;//number of questions
	int correctcount= 0;// count the number of questions were correct
	int count= 0;//count the number of questions
	
	
	String output = " ";Scanner input= new Scanner(System.in);
	long startTime = System.currentTimeMillis();
	
	while(count < NUMBER_OF_QUESTIONS) {
		//1.generate two random single-digit integers
		int number1 =(int)(Math.random() * 100 );
		int number2 =(int)(Math.random() * 100 );
		//2. if number1< number2, swap number1 with number2
		if (number1<number2) {
			int temp= number1;
			 number1= number2;
			 number2= temp;
		
		}
		//3. Prompt the student to answer the"What is number1-number2
		System.out.println(" What is "+number1+" -" +number2+"?");
		int answer = input.nextInt();
		//4.Grade the answer and display the results
		if(number1-number2 == answer) {
			System.out.println("You are correct");
			//5.increase the question count 
			correctcount++;
		}
		else {
			System.out.println("Your answer is wrong.\n"+number1+"-"+number2+ " should be " +(number1-number2));
		}
		count++;
		output+="\n" +number1+"-"+number2+"="+answer+
				((number1-number2==answer)?" correct" : " wrong");
		
	}
	long endTime= System.currentTimeMillis();
	long testTime = endTime - startTime;
	System.out.println("Correct count is"+correctcount+"\n Test time is " +
	                        testTime/100+ " seconds\n"+output);
	
	
	
	

	}

}
