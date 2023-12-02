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
import java.util.Scanner;
public class QuizDemo {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner scan = new Scanner(System.in);
        String userPrompt = "";
        String[] userQuestions = new String[4];
        String userCorrectAnswer = "";
        String userInput = "";
        int userDifficulty;

        while(!userInput.toUpperCase().equals("DONE")) {
            System.out.println("Enter a prompt: ");
            userPrompt = scan.nextLine();
            for(int i = 0; i < userQuestions.length; i++) {
                System.out.println("Enter a response: ");
                userQuestions[i] = scan.nextLine();
            }
            System.out.println("Which answer (1-4) was the correct answer: ");
            userCorrectAnswer = userQuestions[scan.nextInt() - 1];

            System.out.println("How difficult is the question (1-10): ");
            userDifficulty = scan.nextInt();

            Question question = new Question(userPrompt, userCorrectAnswer, userQuestions, userDifficulty);

            quiz.addQuestion(question);
            System.out.println("Enter 'DONE' if you want to stop entering questions: ");
            userInput = scan.next();
        }

        quiz.giveQuiz();
        scan.close();
    }

}
