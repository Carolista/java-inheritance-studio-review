package quiz;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Question {

    private static int nextId = 1;

    private final int id;
    private final String question;
    private final ArrayList<String> choices = new ArrayList<>();

    public Question(String question, String[] choices) {
        this.id = nextId;
        this.question = question;
        Collections.addAll(this.choices, choices);
        nextId++;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    @Override
    public abstract String toString();

    String getRandomizedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
        Collections.shuffle(choices);
        for (int i=1; i <= choices.size(); i++) {
            formattedChoices.append(i).append(" - ").append(choices.get(i));
        }
        return formattedChoices.toString();
    }

}
