// Ricky Schafer [email address:tschafer0109@gmail.com ]
/**
 * Overview: User creates a quiz by inputting questions and adding th correct answer and then the user takes the quiz and the program grade the quiz
 * Input: User inputs questions and answers
 * Output: Text Display * Variables: userAnswer and endString
 * Plan:
 * 1. User runs the program
 * 2. User inputs questions to add to the quiz and the correct multiple choice answer
 * 3. Program compiles the array of questions and answers
 * 4. The progrm then gives the quiz to the user
 * 5. The user then answers the questions
 * 6. The program then prints out the score on the quiz
 * @version: 1.0 May 14, 2023
 * @author: Ricky / Schafer
 */
import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Quiz {

	//Attributes
	private String quizName = "";
	private int numberOfAnwsersCorrect;
	private int totalPoint ;
	private Question[] listOfQuestions;
	private int questionsInQuiz;
	private int randomQuizNumber;
	

	//Constructor
	public Quiz() {
		listOfQuestions = new Question[5];
		quizName = "Quiz " + randomQuizNumber;
		numberOfAnwsersCorrect = 0;
		questionsInQuiz = 0;



	}

	//Random numbers method
	public int newRandomQuizNumber() {
		Random generator = new Random();

		int randomQuizNumber = generator.nextInt(899) + 100;
		return randomQuizNumber;
	}

	//Calculate Score method
	public double calculateQuizScore(int numberOfAnwsersCorrect , int totalPoint) {
		double quizScore = Math.ceil(numberOfAnwsersCorrect / totalPoint) * 100;
		return quizScore;
	}

	//Method for adding questions into the quiz
	public void addQuestion(Question question) {
		if(questionsInQuiz >= listOfQuestions.length) {
			Question[] newListOfQuestions = new Question[listOfQuestions.length + 5];
			for(int i = 0; i < listOfQuestions.length; i++ ){
				listOfQuestions[i]  = newListOfQuestions[i];
			}
			listOfQuestions = newListOfQuestions;
		}
		listOfQuestions[questionsInQuiz] = question;
		questionsInQuiz++;
	}

	public static String[] randomizeArray(String[] arrayIn) {
		Random random = new Random();
		for (int i = 0; i < arrayIn.length; i++) {
			int randomIndex = random.nextInt(arrayIn.length);
			String temp = arrayIn[randomIndex];
			arrayIn[randomIndex] = arrayIn[i];
			arrayIn[i] = temp;
		}
		return arrayIn;
	}


	public void giveQuiz(){
		int totalPoint = questionsInQuiz;
		int correctAnswers = 0;
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		int userNumber;
		boolean isCorrect = false;
		for (int i = 0; i < questionsInQuiz; i++ ) {
			Question question = listOfQuestions[i];
			String[] randomAnswers = question.getAnswers();
			randomAnswers = randomizeArray(randomAnswers);

			while(Question.letterToIndex(userInput) == -1) { // While the answer is invalid
				System.out.println("Quiz Started");
				question.printQuestion(randomAnswers, i + 1);
				userInput = scan.next().substring(0,1);
				userNumber = Question.letterToIndex(userInput);
				for(int j = 0; j < randomAnswers.length; j++) {
					if(randomAnswers[j].equals(question.getCorrectAnswer())) {
						isCorrect = true;
						break;
					}
				}
			}
			if(isCorrect) {
				correctAnswers++;
			}
		}
		System.out.println("\nYour score was: " + calculateQuizScore(correctAnswers, totalPoint) + "%");

scan.close();
	}




}
