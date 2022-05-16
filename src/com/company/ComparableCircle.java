package com.company;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle() {

    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
    @Override
    public int compareTo(ComparableCircle comparableCircle){
        if (getRadius()>comparableCircle.getRadius()) return  1;
        else  if (getRadius() < comparableCircle.getRadius()) return  -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "ComparableCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
