package main.java.com.twu;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.printOneAsterisk();
        triangle.drawHorizontalLine(8);
        triangle.drawVerticalLine(3);
        triangle.drawRightTriangle(3);

        Diamond diamond = new Diamond();
        diamond.drawIsoscelesTriangle(3);
        diamond.drawCenteredDiamond(3);
        diamond.drawDiamondWithName(3);

        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.printFrizzBuzzNumbers();
    }
}
