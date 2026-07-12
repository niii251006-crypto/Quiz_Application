import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList<Question> questions = new ArrayList<>();

    public Quiz() {

        questions.add(new Question(
                "Which language is platform independent?",
                "Python",
                "Java",
                "C",
                "C++",
                2));

        questions.add(new Question(
                "Which keyword is used for inheritance?",
                "this",
                "extends",
                "implements",
                "super",
                2));

        questions.add(new Question(
                "Which company developed Java?",
                "Microsoft",
                "Apple",
                "Sun Microsystems",
                "Google",
                3));

        questions.add(new Question(
                "Size of int in Java?",
                "2 bytes",
                "4 bytes",
                "8 bytes",
                "16 bytes",
                2));

        questions.add(new Question(
                "Which method starts a thread?",
                "run()",
                "start()",
                "begin()",
                "execute()",
                2));
    }

    public void startQuiz() {

        Scanner sc = new Scanner(System.in);

        int score = 0;

        for (Question q : questions) {

            System.out.println("\n" + q.question);

            System.out.println("1. " + q.option1);
            System.out.println("2. " + q.option2);
            System.out.println("3. " + q.option3);
            System.out.println("4. " + q.option4);

            System.out.print("Enter your answer: ");

            int ans = sc.nextInt();

            if (ans == q.answer) {
                score++;
            }
        }

        System.out.println("\nQuiz Completed!");

        System.out.println("Your Score: " + score + "/" + questions.size());

        double percentage = (score * 100.0) / questions.size();

        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}
