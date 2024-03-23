package oop1.ex;

public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.width = 8;
        rectangle.height = 8;

        int area = rectangle.calculateArea();
        System.out.println("넒이: " + area);

        int perimeter = rectangle.calculatePerimeter();
        System.out.println("둘레: " + perimeter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각 여부: " + square);
    }
}
