package quiz;

public class MultipleChoice extends Question {

    public MultipleChoice(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        return "\nMULTIPLE CHOICE:\n" +
                super.getQuestion() + "\n" +
                super.getFormattedChoices();
    }

}
