#Addition Game
# Introduction
  How to make an addition game. The user will be asked a simple math problem in the first round. For example, to add two single digit numbers. If the user gets this correct, they will be given points and asked a more difficult math problem in round 2, such as adding a pair of two digit numbers. They will receive more points and be asked more difficult questions in the following round for every correct answer. Every incorrect answer will be followed by a simpler question. There are a total of 4 rounds. 
  
## Outline
```
// Outline for addition problem.
// Round 1
//	Generate 2 random numbers
//  to keep track of the correct answer
//  Ask the user to add these two numbers together
//  Read in their response
//  Check if the answer was correct
//  IF correct
//	Tell them it was correct
//	Give them points
//	Make the next question harder
//	IF not correct
//	Tell them it was wrong
// 	Tell them the correct answer
//	Do not give them points
//	Make the next question easier
// end of round 1
```
## Code
```java
package additiongame1;
import java.util.Scanner;
public class additiongame1 {
	public static void main(String[] args) {
		/* No longer needed debug statement
		 * System.out.println("Hello Class!");
		 */
		// This is my master branch.
		// Outline for addition problem.
		
		int score = 0;
		int hardnessOfQuestion = 10;
		
		// Round 1
		//	Generate 2 random numbers
		int number1 = (int)(Math.random() * hardnessOfQuestion);
		 System.out.println("Number1 is :" + number1 );
		 
		
		int number2 = (int)(Math.random() * hardnessOfQuestion);
		
		 System.out.println("Number2 is :" + number2 );
		 
		
		// to keep track of the correct answer.
		int correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		Scanner input = new Scanner(System.in);
		int studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			
			}
		}
		System.out.println("End of round 1");
		// end of round 1
		
		// Round 2 (note: additional comments in round 1)
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		number2 = (int)(Math.random() * hardnessOfQuestion);

		
		// to keep track of the correct answer.
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		// end of round 2
		System.out.println("End of round 2");
		// Round 3 (note: additional comments in round 1)
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		number2 = (int)(Math.random() * hardnessOfQuestion);

		
		// to keep track of the correct answer.
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		// end of round 3
		System.out.println("End of round 3");
		// Round 4 (note: additional comments in round 1)
		//	Generate 2 random numbers
		number1 = (int)(Math.random() * hardnessOfQuestion);
		number2 = (int)(Math.random() * hardnessOfQuestion);

		
		// to keep track of the correct answer.
		correctAnswer = number1 + number2;
		
		//  Ask the user to add these two numbers together
		System.out.println
		("What integer is " + number1 + " + " + number2 + "?");
		System.out.println("Please answer in integers only.");
		
		//  Read in their response
		//Scanner input = new Scanner(System.in);
		studentAnswer = input.nextInt();
		//  Check if the answer was correct
		//		IF correct
		if (studentAnswer == correctAnswer){
			//			Tell them it was correct
			System.out.println("Answer was correct");
			//			Give them points
			score += hardnessOfQuestion;
			System.out.println("Score is: " + score);
			//			Make the next question harder
			hardnessOfQuestion *= 10;	
			System.out.println("hardness is: " + hardnessOfQuestion);
		}
		//		IF not correct
		else{
			//			Tell them it was wrong
			System.out.println("Answer was not correct");
			// 			Tell them the correct answer
			System.out.println("The correct answer was: " + correctAnswer);
			//			Do not give them points
			score += 0;
			//			Make the next question easier
			if(hardnessOfQuestion>10){
				hardnessOfQuestion /= 10;	
			}
		}
		// end of round 4
		System.out.println("End of round 4 and the end of the game");
	}
}

```
## Console
```
Number1 is :1
Number2 is :7
What integer is 1 + 7?
Please answer in integers only.
8
Answer was correct
Score is: 10
hardness is: 100
End of round 1
What integer is 75 + 21?
Please answer in integers only.
96
Answer was correct
Score is: 110
hardness is: 1000
End of round 2
What integer is 84 + 876?
Please answer in integers only.
960
Answer was correct
Score is: 1110
hardness is: 10000
End of round 3
What integer is 161 + 8612?
Please answer in integers only.
8773
Answer was correct
Score is: 11110
hardness is: 100000
End of round 4 and the end of the game
```
## Summary
I learned a lot lessons from writing this addition game program. I learn that I have to change my variables each time I start a new statement in code and it so helpful. I also learn how to generate random numbers when writing a code. I learned how to write the IF statement and determine when it is true and when it is false. The greatest part I learned and enjoyed is how to make a question harder the farther you go and how to score a question. I also learn to write a program in different branch using git. The fun part was when I was one writing my code and had to merge my branches together. Git is so interesting though its some quality time to understand the commands. 

