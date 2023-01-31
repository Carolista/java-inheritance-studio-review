package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {

    private final String question;
    private HashMap<Integer, Choice> choiceMap;

    public Question(String question, Choice[] choiceArray) {
        this.question = question;
        createRandomizedChoiceMap(choiceArray);
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    @Override
    public abstract String toString();

    void createRandomizedChoiceMap(Choice[] choiceArray) {
        choiceMap = new HashMap<>();
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray);
        Collections.shuffle(choiceList);
        for (int i=0; i < choiceList.size(); i++) {
            choiceMap.put(i+1, choiceList.get(i));
        }
    }

    String getFormattedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + "\n";
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }
}
