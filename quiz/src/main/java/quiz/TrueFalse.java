package quiz;

public class TrueFalse extends Question {

    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nTRUE OR FALSE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }

}
