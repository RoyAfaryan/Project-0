//Roy Afaryan
//CS1400
//Assignment 5
//11-13-2020
//First commit

import java.util.Scanner;

public class TriviaGame
{
	public static void main(String[] args)
	{
		//create scanner
		Scanner keyboard = new Scanner(System.in);
		
		//variables to determine the score of the player
		int user1Score = 0;
		int user2Score = 0;
		
		//list of questions + possible answers
		Question[] allQuestions = new Question[10];
		allQuestions[0] = new Question("Who was the first president of the United States of America?", "George Washington", "Abraham Lincoln", "Thomas Jefferson", "John Adams", 1);
		allQuestions[1] = new Question("What is the capital of California?", "Los Angeles", "San Diego", "Sacramento", "San Francisco", 3);
		allQuestions[2] = new Question("How far away is the moon from eath?", "154,000 mi", "136,850 mi", "201,050 mi", "238,900 mi", 4);
		allQuestions[3] = new Question("What was the first spaceflight that landed humans on the moon?", "Apollo 11", "Apollo 9", "Apollo 8", "Apollo 13", 1);
		allQuestions[4] = new Question("What is America's favorite pastime?", "Football", "Baseball", "Basketball", "Soccer", 2);
		allQuestions[5] = new Question("In what year was the first iPhone released?", "2004", "2005", "2006", "2007", 4);
		allQuestions[6] = new Question("Which planet contains the highest amount of gravity?", "Earth", "Venus", "Mars", "Jupiter", 4);
		allQuestions[7] = new Question("Which actor played the role of Wolverine?", "Hugh Jackman", "Nicholas Cage", "Johnny Depp", "Robert Downey Jr.", 1);
		allQuestions[8] = new Question("Whose face is on the $20 bill?", "George Washington", "Ben Franklin", "Andrew Jackson", "Alexander Hamilton", 3);
		allQuestions[9] = new Question("On what basketball team did Michael Jordan win his championships?", "Chicago Bulls", "Los Angeles Lakers", "Boston Celtics", "Utah Jazz", 1);
		
		System.out.println("Welcome to the Trivia Game!");
		
		
		//display questions and possible answers as well as taking in each player's input
		for(int i = 1; i <= 10; i++)
		{
			if(i <= 5)
			{
				System.out.println("This question is for Player 1: ");
			}
			else
			{
				System.out.println("This question is for Player 2: ");
			}
			
			allQuestions[i - 1].Display();
			System.out.print("Please enter your answer: ");
			int userInput = keyboard.nextInt();
			
			if(userInput == allQuestions[i - 1].getCorrect())
			{
				System.out.println("Correct! You have earned 1 point!\n\n");
				if(i <= 5)
				{
					user1Score++;
				}
				else
				{
					user2Score++;
				}
			}
			else
			{
				System.out.println("Wrong! You have not earned a point.\n\n");
			}
		}
		
		//display both scores
		System.out.println("Player 1 has earned " + user1Score + " points!");
		System.out.println("Player 2 has earned " + user2Score + " points!\n");
		
		//if statement to determine the winner of the game
		if(user1Score > user2Score)
		{
			System.out.println("Congratulations Player 1! You win the game!");
		}
		else if(user2Score > user1Score)
		{
			System.out.println("Congratulations Player 2! You win the game!");
		}
		else
		{
			System.out.println("This game ended in a draw!");
		}
		
		
		
		
		
		
	}
}