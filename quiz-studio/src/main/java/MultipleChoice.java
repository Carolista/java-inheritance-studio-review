public class MultipleChoice extends Question {

    public MultipleChoice(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

}