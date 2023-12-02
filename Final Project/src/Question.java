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

	public class Question {
		
		//Attributes
		private String prompt;
		private String[] answers;
		private String correctAnswer;
		private int difficulty;

		
		//Constructor
		public Question(String promptIn, String correctAnswerIn, String[] answersIn, int difficultyIn) {
			prompt = promptIn;
			correctAnswer = correctAnswerIn.toUpperCase();
			answers = answersIn;
			difficulty = difficultyIn;
			}
		
		//Getter Methods
		public String getPrompt() {
			return prompt;
		}
		
		public String[] getAnswers() {
			return answers;
			}
		
		public String getCorrectAnswer() {
			return correctAnswer;
		}

		
		
		//Method to convert String answer to index
		public static int letterToIndex(String correctAnswer) {
			int indexAnswer;
			correctAnswer = correctAnswer.toUpperCase();
			switch(correctAnswer) {
				case "A":
					indexAnswer = 0;
					break;
				case "B":
					indexAnswer = 1;
					break;
				case "C":
					indexAnswer = 2;
					break;
				case "D":
					indexAnswer = 3;
					break;
				default:
					indexAnswer = -1;
					break;
			}
			return indexAnswer;
		}
		
		//
		public void printQuestion(String[] answersIn , int questionNumber){
			String output = questionNumber + "). " + prompt;
			output += "\n\ta. " + this.answers[0];
			output += "\n\tb. " + this.answers[1];
			output += "\n\tc. " + this.answers[2];
			output += "\n\td. " + this.answers[3];
			output += "\nDifficulty: " + difficulty + "/10";
			output += "\n";
			 System.out.println(output);
			
		}
		

	}

