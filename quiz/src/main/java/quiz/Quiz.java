package quiz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Quiz {

    private final ArrayList<Question> questions = new ArrayList<>();
    private int numCorrect = 0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getNumCorrect() {
        return numCorrect;
    }

    public void addQuestions(Question[] questionArray) {
        Collections.addAll(questions, questionArray);
    }

    public void updateScore() {
        numCorrect++;
    }

    public void runQuiz() {
        Scanner input = new Scanner(System.in);
        Collections.shuffle(questions);
        for (Question question : questions) {
            // Print question and choices for user
            System.out.println(question);

            // Determine correct response(s)
            ArrayList<Integer> correctResponses = new ArrayList<>();
            for (int choiceNum : question.getChoiceMap().keySet()) {
                if (question.getChoiceMap().get(choiceNum).isCorrect()) {
                    correctResponses.add(choiceNum);
                }
            }

            // Get actual response(s) from user & evaluate
            ArrayList<Integer> userResponses = new ArrayList<>();
            int i = 0;
            while (i < correctResponses.size()) {
                System.out.println("Please enter a number: ");
                int userResponse = input.nextInt();
                if (userResponses.contains(userResponse)) {
                    System.out.println("You already got that one!");
                } else if (!correctResponses.contains(userResponse)) {
                    System.out.println("Sorry, the correct answer was: ");
                    for (int resp : correctResponses) {
                        System.out.println(question.getChoiceMap().get(resp).getContent());
                    }
                    break;
                } else {
                    System.out.println("Correct!");
                    userResponses.add(userResponse);
                    if (i == correctResponses.size() - 1) {
                        updateScore();
                    }
                    i++;
                }
            }
        }
        input.close();
    }

}
