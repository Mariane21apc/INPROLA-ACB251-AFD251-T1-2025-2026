import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter two integers");

    // Numerical input
    int Name = myObj.nextInt();
    int Age = myObj.nextInt();

    // Numerical input
    int Name = myObj.nextInt();
    int Age = myObj.nextInt();

    // Output input by user
    System.out.println("Name: " + Name); 
    System.out.println("Age: " + Age);
    
    // declare variables
    int a = Name, b = Age;

    // addition operator
    System.out.println("a + b = " + (a + b));

    // subtraction operator
    System.out.println("a - b = " + (a - b));

    // multiplication operator
    System.out.println("a * b = " + (a * b));

    // division operator
    System.out.println("a / b = " + (a / b));

    // modulo operator
    System.out.println("a % b = " + (a % b));
  }
}