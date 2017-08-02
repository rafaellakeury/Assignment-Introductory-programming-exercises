import java.util.Scanner;

public class CodeAssingment {

    public static void main(String[] args) {
        System.out.println("Enter the number of asterisks you wanna see: ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int baseSize = (2 * n) - 1;

        for (int i = 0; i < n; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (baseSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

    }
}
