import java.util.Scanner;
 
public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
 
        // Input minutes and seconds
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = input.nextInt();
 
        // Store time in 2D array [ [minutes, seconds] ]
        int[][] timer = { { minutes, seconds } };
 
        System.out.println("\nCountdown Timer:");
 
        // Countdown loop
        while (timer[0][0] >= 0) {
            // Display current time
            System.out.printf("%02d:%02d\n", timer[0][0], timer[0][1]);
 
            // If reached 0:0 → stop
            if (timer[0][0] == 0 && timer[0][1] == 0) {
                break;
            }
 
            // Sleep for 1 second to simulate real timer
            Thread.sleep(1000);
 
            // Decrease time
            timer[0][1]--;
 
            // Adjust when seconds < 0
            if (timer[0][1] < 0) {
                timer[0][0]--;
                timer[0][1] = 59;
            }
        }
 
        input.close();
    }
}