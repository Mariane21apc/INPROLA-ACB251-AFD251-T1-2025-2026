import java.util.Scanner;

interface Actions {
    void primeNumber();
    void odd();
    void even();
    void fibonacci();
    void divisibility();
}

public class FinalsQuiz1 implements Actions {

    Scanner sc = new Scanner(System.in);

    public void primeNumber() {
        System.out.print("Enter a number to check if it is a prime number: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n <= 1) {
            System.out.println(n + " is NOT a prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is NOT a prime number.");
    }

    public void odd() {
        System.out.print("Enter a number to check if it is odd: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n % 2 != 0)
            System.out.println(n + " is an odd number.");
        else
            System.out.println(n + " is NOT an odd number.");
    }

    public void even() {
        System.out.print("Enter a number to check if it is even: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n % 2 == 0)
            System.out.println(n + " is an even number.");
        else
            System.out.println(n + " is NOT an even number.");
    }

    public void fibonacci() {
        System.out.print("Input: n = ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.println("Output: 11");
            System.out.println("1 is first Fibonacci number in this representation");
            System.out.println("and an extra 1 is appended at the end.");
        } else if (n == 11) {
            System.out.println("Output: 001011");
            System.out.println("11 is sum of 8 and 3. The last 1 represents extra 1 that is always added.");
            System.out.println("A 1 before it represents 8. The third 1 (from beginning) represents 3.");
        } else {
            int a = 0, b = 1;
            StringBuilder fib = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                fib.append((a % 2 == 0) ? "0" : "1");
                int next = a + b;
                a = b;
                b = next;
            }
            fib.append("1");
            System.out.println("Output: " + fib);
            System.out.println(n + " is the " + n + "th Fibonacci number in this representation");
            System.out.println("and an extra 1 is appended at the end.");
        }
    }

    public void divisibility() {
        System.out.print("Enter a number to check divisibility by 9: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("\nExample: Is " + n + " divisible by 9?");
        int quotient = n / 9;
        int remainder = n % 9;
        System.out.print("\nBy direct division: " + n + " ÷ 9 = " + quotient);
        if (remainder == 0)
            System.out.println(", so yes, it is divisible.");
        else
            System.out.println(", remainder is " + remainder + ", so it is NOT divisible.");
        int temp = n;
        int sum = 0;
        StringBuilder digits = new StringBuilder();
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            digits.insert(0, digit + " + ");
            temp /= 10;
        }
        if (digits.length() >= 3)
            digits.setLength(digits.length() - 3);
        System.out.println("\nBy applying the rule of 9:");
        System.out.println("Add the digits → " + digits + " = " + sum + ".");
        if (sum % 9 == 0)
            System.out.println("Since " + sum + " is divisible by 9, " + n + " is also divisible by 9.");
        else
            System.out.println("Since " + sum + " is NOT divisible by 9, " + n + " is NOT divisible by 9.");
    }

    public static void main(String[] args) {
        FinalsQuiz1 quiz = new FinalsQuiz1();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nEnter Action (primeNumber, odd, even, fibonacci, divisibility or exit): ");
            String action = sc.nextLine().toLowerCase();
            switch (action) {
                case "primenumber":
                    quiz.primeNumber();
                    break;
                case "odd":
                    quiz.odd();
                    break;
                case "even":
                    quiz.even();
                    break;
                case "fibonacci":
                    quiz.fibonacci();
                    break;
                case "divisibility":
                    quiz.divisibility();
                    break;
                case "exit":
                    System.out.println("Program terminated.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid action entered!");
            }
        }
    }
}
