package com.gmail.valeriipiliaiev;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(Point other) {
        double distanceX = other.x - this.x;
        double distanceY = other.y - this.y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    public static double calculateDistanceBetween(Point firstPoint, Point secondPoint) {
        double distanceX = secondPoint.x - firstPoint.x;
        double distanceY = secondPoint.y - firstPoint.y;
        return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
    }

    public boolean isEqualTo(Point other) {
        return this.x == other.getX() && this.y == other.getY();
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public Point clone() {
        return new Point(this.x, this.y);
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }
}