import java.util.Scanner;

public class ExerciseInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int index = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int userInput = scanner.nextInt();
            if (userInput < 0) {
                break;
            }
            numbers[index] = userInput;
            index++;
        }

        System.out.print("Entered numbers: [");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        scanner.close();
    }
}