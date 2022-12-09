import java.util.Scanner;

public class MainOne {
    public static void main(String[] args) {
        int number, sum = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            if (number % 2 == 1) {
                sum += number;
            }
        } while (number >= 0);

        System.out.print("The sum of the odd numbers entered: " + sum);
    }
}
