package additiongame1;
import java.util.Scanner;

public class additiongame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Class!");
		
		//This is my master branch.
		// Outline for addition problem.

		int score = 0;
		int hardness = 10;

		// Round 1
		// Generate 2 random numbers
		int number1 = (int)(Math.random() * hardness);
		System.out.println("Number1 is :" + number1 );

		int number2 = (int)(Math.random() * hardness);
		System.out.println("Number2 is :" + number2 );

		// to keep track of the correct answer.
		int correctAnswer = number1 + number2;

		//  Ask the user to add these two numbers together
		System.out.println
		("What is " + number1 + " + " + number2 + "?");

		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//	IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score = 10;
			System.out.println("Score is: " + score);
			//			Make the next question harder
		hardness = 100;	
			System.out.println("hardness is: " + hardness);
		}
			//	IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Your Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + (number1 + number2));
			//			Do not give them points
			//			Make the next question easier
			System.out.println("What number comes after " + number1 );
			int userAnswer = input.nextInt();
			int rightAnswer = number1 + 1;
			if (userAnswer == rightAnswer){
			System.out.println("your answer is correct");
		}
		}
		     
		// Round 2
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		
		// Round 3
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		
		// Round 4
		//	Generate 2 random numbers
		//  Ask the user to add these two numbers together
		//  Read in their response
		//  Check if the answer was correct
		//		IF correct
		//			Tell them it was correct
		//			Give them points
		//			Make the next question harder
		//		IF not correct
		//			Tell them it was wrong
		// 			Tell them the correct answer
		//			Do not give them points
		//			Make the next question easier
		
				
		
	}

}
