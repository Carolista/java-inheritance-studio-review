public class Checkbox extends Question {

    public Checkbox(String question, Choice[] choiceArray) {
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + "CHOOSE ONE OR MORE:" + newline +
                getQuestion() + newline +
                getFormattedChoices();
    }

}