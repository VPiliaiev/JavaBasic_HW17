package com.gmail.valeriipiliaiev;

import java.util.Objects;

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
        return firstPoint.calculateDistance(secondPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Point other = (Point) obj;
        return this.x == other.getX() && this.y == other.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
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