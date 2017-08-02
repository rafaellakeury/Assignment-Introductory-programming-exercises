package main.java.com.twu;

public class Diamond {

    public void drawIsoscelesTriangle(int linesNumber) {
        System.out.println("Given a number n, print a centered triangle:");
        int baseSize = (2 * linesNumber) - 1;

        for (int i = 0; i < linesNumber; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (baseSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void drawCenteredDiamond(int linesNumber) {
        System.out.println("Given a number n, print a centered diamond:");
        int centreSize = (2 * linesNumber) - 1;

        for (int i = 0; i < linesNumber; i++) {
            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = linesNumber - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

    }

    public void drawDiamondWithName(int lineNumbers) {
        System.out.println("Given a number n, print a centered diamond with your name in place of the middle line:");
        int centreSize = (2 * lineNumbers) - 1;

        for (int i = 0; i < lineNumbers; i++) {
            if (i == lineNumbers - 1) {
                System.out.println("Rafa");
                break;
            }

            int asteriskCount = (2 * i) + 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }

        int iterations = lineNumbers - 1;

        for (int i = iterations; i > 0; i--) {
            int asteriskCount = (2 * i) - 1;
            int whiteSpace = (centreSize - asteriskCount) / 2;

            for (int j = 0; j < whiteSpace; j++)
                System.out.print(" ");

            for (int k = 0; k < asteriskCount; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
