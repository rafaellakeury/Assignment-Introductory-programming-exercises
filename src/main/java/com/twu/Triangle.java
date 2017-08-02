package main.java.com.twu;

public class Triangle {

    public void printOneAsterisk() {
        System.out.println("Print one asterisk to the console:");
        System.out.println("*");
    }

    public void drawHorizontalLine(int asterisksNumber) {
        System.out.println("Given a number n, print n asterisks on one line:");
        for (int i = 0; i < asterisksNumber; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void drawVerticalLine(int asterisksNumber) {
        System.out.println("Given a number n, print n lines, each with one asterisks:");
        for (int i = 0; i < asterisksNumber; i++) {
            System.out.println("*");
        }
    }

    public void drawRightTriangle(int asterisksNumber) {
        System.out.println("Given a number n, print n lines, each with one more asterisk than the last");
        String asterisk = "";
        for (int i = 0; i < asterisksNumber; i++) {
            asterisk = asterisk + "*";
            System.out.println(asterisk);
        }
    }
}
