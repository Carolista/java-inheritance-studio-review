public class LinearScale extends Question {

    private final int highestNum;

    public LinearScale(String question, int highestNum) {
        super(question);
        this.highestNum = highestNum;
    }

    public int getHighestNum() {
        return highestNum;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return newline + getQuestion() + newline +
                "Please enter a number from 1 to " + highestNum + ":" + newline;
    }

}
