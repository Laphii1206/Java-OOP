package w11;

import java.util.*;

public class W11_ExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sales = {1000, 2000, 3000, 4000, 5000, 6000, 7000};
        int index;
        while (true) {
            try {
                System.out.print("Enter the day number  (1 to 5): ");
                index = scanner.nextInt();
                System.out.println("The sales of day " + index + " is " + sales[index - 1]);
                System.out.println("The end");
                break;
            } catch (Exception err) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            } catch (Throwable err) {
                System.out.println("catch" + err);
                scanner.nextLine();
            }
            finally {
                System.out.println("This is a finish line");
            }
        }
    }
}
