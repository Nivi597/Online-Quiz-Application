import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "Which keyword is used to create a class in Java?",
            "Which method is the starting point of a Java program?",
            "Which data type is used to store whole numbers?",
            "Which symbol is used for a single-line comment?",
            "Which keyword is used to inherit a class?"
        };

        String[] answers = {
            "class",
            "main",
            "int",
            "//",
            "extends"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i]);

            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answers[i])) {
                score++;
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        if (score >= 4) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good job!");
        } else {
            System.out.println("Keep practicing!");
        }

        scanner.close();
    }
}
