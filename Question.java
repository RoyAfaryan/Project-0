//Roy Afaryan
//CS1400
//Assignment 5
//11-13-2020
//First Commit

public class Question
{
	//Variables
	private String question;
	private String answer1;
	private String answer2;
	private String answer3;
	private String answer4;
	private int correctAnswer;
	
	//Constructor
	public Question(String inputQuestion, String inputAnswer1, String inputAnswer2, String inputAnswer3, String inputAnswer4, int inputCorrectAnswer)
	{
		question = inputQuestion;
		answer1 = inputAnswer1;
		answer2 = inputAnswer2;
		answer3 = inputAnswer3;
		answer4 = inputAnswer4;
		correctAnswer = inputCorrectAnswer;
	}
	
	//Method to print set values
	public void Display()
	{
		System.out.println(question);
		System.out.println();
		System.out.println("1 - " + answer1);
		System.out.println("2 - " + answer2);
		System.out.println("3 - " + answer3);
		System.out.println("4 - " + answer4);
		System.out.print("\n\n");
	}
	
	//Set question
	public void setQuestion(String inputQuestion)
	{
		question = inputQuestion;
	}
	
	//Set answer 1
	public void setAnswer1(String inputAnswer1)
	{
		answer1 = inputAnswer1;
	}
	
	//Set answer 2
	public void setAnswer2(String inputAnswer2)
	{
		answer2 = inputAnswer2;
	}
	
	//Set answer 3
	public void setAnswer3(String inputAnswer3)
	{
		answer3 = inputAnswer3;
	}
	
	//Set answer 4
	public void setAnswer4(String inputAnswer4)
	{
		answer4 = inputAnswer4;
	}
	
	//Set correctAnswer
	public void setCorrect(int inputCorrectAnswer)
	{
		correctAnswer = inputCorrectAnswer;
	}
	
	//Return question
	public String getQuestion()
	{
		return question;
	}
	
	//Return answer 1
	public String getAnswer1()
	{
		return answer1;
	}
	
	//Return answer 2
	public String getAnswer2()
	{
		return answer2;
	}
	
	//Return answer 3
	public String getAnswer3()
	{
		return answer3;
	}
	
	//Return answer 4
	public String getAnswer4()
	{
		return answer4;
	}
	
	//Return correct answer
	public int getCorrect()
	{
		return correctAnswer;
	}
}