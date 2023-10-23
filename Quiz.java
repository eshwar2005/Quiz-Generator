package Project;

import java.util.*;

class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz() {
        this.questions = new ArrayList<>();
        this.score = 0;
    }

    public void addQuestion(String question, String[] options, int correctAnswerIndex) {
        this.questions.add(new Question(question, options, correctAnswerIndex));
    }

    public void takeQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            String[] options = question.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();
            if (question.isCorrect(answer - 1)) {
                score += 10;
                System.out.println("Correct! Your score is now: " + score);
            } else {
                System.out.println("Incorrect. Your score remains: " + score);
            }
        }
        System.out.println("Your final score is: " + score + " out of 100");
    }
}


