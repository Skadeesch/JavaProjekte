import java.util.Scanner;

public class sumstwo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the first number in");
        
        double num1 = scanner.nextDouble();

        System.out.println("Put second number in");

        double num2 = scanner.nextDouble();

        double sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

        scanner.close();
    }
}
