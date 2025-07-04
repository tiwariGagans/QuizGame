public class Question {
    String question;
    String[] options;
    char correctOption;

    public Question(String question, String[] options, char correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = Character.toUpperCase(correctOption);
    }

    public void displayQuestion() {
        System.out.println(question);
        char optionName = 'A';
        for (String option : options) {
            System.out.println(optionName + ". " + option);
            optionName++;
        }
    }

    public boolean checkAnswer(char answer) {
        return Character.toUpperCase(answer) == correctOption;
    }
}
