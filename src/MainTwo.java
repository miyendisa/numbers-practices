import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number % 4 == 0) {
                sum += number;
            }
        } while (number % 2 == 0);
        System.out.print("The sum of the numbers entered even and divisible by 4: " + sum);
    }
}
