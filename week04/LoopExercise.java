import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for start and end numbers
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Even numbers between " + start + " and " + end + ":");

        // For loop to find even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
