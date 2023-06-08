package com.gmail.valeriipiliaiev;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(5, 2);
        int x1 = point1.getX();
        int y1 = point1.getY();
        System.out.println("Координати точки 1: (" + x1 + ", " + y1 + ")");

        point1.setX(5);
        point1.setY(7);
        System.out.println("Змінені координати точки 1: (" + point1.getX() + ", " + point1.getY() + ")");

        Point point2 = new Point(10, 12);
        double distance = point1.calculateDistance(point2);
        System.out.println("Відстань від точки 1 до точки 2: " + distance);

        double distanceBetween = Point.calculateDistanceBetween(point1, point2);
        System.out.println("Відстань між точкою 1 та точкою 2: " + distanceBetween);

        boolean equal = point1.equals(point2);
        System.out.println("Точка 1 дорівнює точці 2? " + equal);

        Point point1Copy = point1.clone();
        System.out.println("Копія точки 1: " + point1Copy);

        System.out.println("Точка 2: " + point2);
    }
}