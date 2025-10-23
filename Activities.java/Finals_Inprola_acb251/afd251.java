package Finals_Inprola_acb251;
import java.util.*;

interface FareCalculator {
    double calculateFare(String from, String to);
}

abstract class Commute {
    protected String from;
    protected String to;
    protected double fare;

    public Commute(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public abstract void displayFareDetails();
}

class Bus extends Commute implements FareCalculator {
    public Bus(String from, String to) {
        super(from, to);
        this.fare = calculateFare(from, to);
    }
    public double calculateFare(String from, String to) {
        if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Taft")) return 25;
        else if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Katipunan")) return 15;
        else return 20;
    }
    public void displayFareDetails() {
        System.out.println("Commute Type: Bus");
        System.out.println("From: " + from + " To: " + to);
        System.out.println("Fare: ₱" + fare);
    }
}

class Jeep extends Commute implements FareCalculator {
    public Jeep(String from, String to) {
        super(from, to);
        this.fare = calculateFare(from, to);
    }
    public double calculateFare(String from, String to) {
        if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Anonas")) return 13;
        else if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Marikina")) return 18;
        else return 15;
    }
    public void displayFareDetails() {
        System.out.println("Commute Type: Jeep");
        System.out.println("From: " + from + " To: " + to);
        System.out.println("Fare: ₱" + fare);
    }
}

class LRT_MRT extends Commute implements FareCalculator {
    public LRT_MRT(String from, String to) {
        super(from, to);
        this.fare = calculateFare(from, to);
    }
    public double calculateFare(String from, String to) {
        if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Recto")) return 20;
        else if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Santolan")) return 15;
        else return 18;
    }
    public void displayFareDetails() {
        System.out.println("Commute Type: LRT/MRT");
        System.out.println("From: " + from + " To: " + to);
        System.out.println("Fare: ₱" + fare);
    }
}

class Grab extends Commute implements FareCalculator {
    public Grab(String from, String to) {
        super(from, to);
        this.fare = calculateFare(from, to);
    }
    public double calculateFare(String from, String to) {
        if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("BGC")) return 200;
        else if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Taft")) return 150;
        else return 180;
    }
    public void displayFareDetails() {
        System.out.println("Commute Type: Grab");
        System.out.println("From: " + from + " To: " + to);
        System.out.println("Fare: ₱" + fare);
    }
}

class Tricycle extends Commute implements FareCalculator {
    public Tricycle(String from, String to) {
        super(from, to);
        this.fare = calculateFare(from, to);
    }
    public double calculateFare(String from, String to) {
        if (from.equalsIgnoreCase("Barangay Hall") && to.equalsIgnoreCase("Market")) return 20;
        else if (from.equalsIgnoreCase("Barangay Hall") && to.equalsIgnoreCase("School")) return 15;
        else return 18;
    }
    public void displayFareDetails() {
        System.out.println("Commute Type: Tricycle");
        System.out.println("From: " + from + " To: " + to);
        System.out.println("Fare: ₱" + fare);
    }
}

class Angkas extends Commute implements FareCalculator {
    public Angkas(String from, String to) {
        super(from, to);
        this.fare = calculateFare(from, to);
    }
    public double calculateFare(String from, String to) {
        if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Makati")) return 120;
        else if (from.equalsIgnoreCase("Cubao") && to.equalsIgnoreCase("Ortigas")) return 90;
        else return 100;
    }
    public void displayFareDetails() {
        System.out.println("Commute Type: Angkas");
        System.out.println("From: " + from + " To: " + to);
        System.out.println("Fare: ₱" + fare);
    }
}

public class afd251 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            System.out.println("\n=== COMMUTER APP ===");
            System.out.print("Enter commute type (Bus/Jeep/LRT/MRT/Grab/Tricycle/Angkas): ");
            String type = sc.nextLine();
            System.out.print("Enter your starting location: ");
            String from = sc.nextLine();
            System.out.print("Enter your destination: ");
            String to = sc.nextLine();

            Commute commute = null;
            switch (type.toLowerCase()) {
                case "bus": commute = new Bus(from, to); break;
                case "jeep": commute = new Jeep(from, to); break;
                case "lrt":
                case "lrt/mrt":
                case "mrt": commute = new LRT_MRT(from, to); break;
                case "grab": commute = new Grab(from, to); break;
                case "tricycle": commute = new Tricycle(from, to); break;
                case "angkas": commute = new Angkas(from, to); break;
                default:
                    System.out.println("Invalid commute type."); continue;
            }

            commute.displayFareDetails();
            System.out.print("Enter payment amount: ₱");
            double payment = sc.nextDouble();
            sc.nextLine();

            if (payment < commute.fare) {
                System.out.println("Insufficient payment. You need ₱" + (commute.fare - payment) + " more.");
            } else {
                System.out.println("Change: ₱" + (payment - commute.fare));
            }

            System.out.print("Do you want to commute again? (yes/no): ");
            String choice = sc.nextLine();
            repeat = choice.equalsIgnoreCase("yes");
        }
        sc.close();
    }
}
