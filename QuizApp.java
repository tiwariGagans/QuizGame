import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question("What is the capital of India?", 
                new String[]{"Mumbai", "New Delhi", "Kolkata", "Chennai"}, 'B'));
        questions.add(new Question("Who invented Java?", 
                new String[]{"Dennis Ritchie", "James Gosling", "Bjarne Stroustrup", "Guido van Rossum"}, 'B'));
        questions.add(new Question("Which data structure uses LIFO?", 
                new String[]{"Queue", "Stack", "Array", "LinkedList"}, 'B'));
        questions.add(new Question("Which keyword is used to inherit a class in Java?", 
                new String[]{"this", "import", "extends", "implement"}, 'C'));
        
        questions.add(new Question("Which of the following is NOT an operating system?", 
                new String[]{"Windows\", \"Linux\", \"Oracle\", \"macOS"}, 'C'));

        questions.add(new Question("Which of the following is a programming language ?", 
                new String[]{"HTTP", "HTML", "Python", "URL"}, 'C'));

        
        questions.add(new Question("What does CPU stand for ?", 
                new String[]{"Central Process Unit", "Central Processing Unit", "Computer Personal Unit", "Central Performance Unit"}, 'C'));
                

                
        int score = 0;

        System.out.println("=== Welcome to the Java Quiz App ===\n");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Q" + (i + 1) + ":");
            questions.get(i).displayQuestion();

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);

            if (questions.get(i).checkAnswer(userAnswer)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect! The correct answer was: " + questions.get(i).correctOption + "\n");
            }
        }

        System.out.println("🎉 Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.size());
        
        if (score == questions.size()) {
            System.out.println("🏆 Excellent! You're a Java master!");
        } else if (score >= questions.size() / 2) {
            System.out.println("👍 Good job! Keep practicing.");
        } else {
            System.out.println("📘 Try again! Study more and come back stronger.");
        }

        scanner.close();
    }
}
