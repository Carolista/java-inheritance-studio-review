package quiz;

public class Checkbox extends Question {

    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nCHOOSE ONE OR MORE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }

}
