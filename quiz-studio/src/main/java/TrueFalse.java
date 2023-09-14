public class TrueFalse extends Question {

    public TrueFalse(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "TRUE OR FALSE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

}