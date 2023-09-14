import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// For use with ShortAnswer, Paragraph, and LinearScale

public class Survey {

    private final ArrayList<Question> questions = new ArrayList<>();
    private final ArrayList<String> userResponses = new ArrayList<>();

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    ArrayList<String> getUserResponses() {
        return userResponses;
    }

    public void addQuestions(Question[] questionArray) {
        Collections.addAll(questions, questionArray);
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question);
            String userResponse = input.nextLine();
            // would be good to add user input validation here for LinearScale numbers
            userResponses.add(userResponse);

        }
        input.close();
    }
}
