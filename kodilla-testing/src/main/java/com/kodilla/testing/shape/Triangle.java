package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private String name;
    private int a;
    private int h;

    public Triangle(String name, int a, int h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    public String getName() {
        return name;
    }

    public int getA() {
        return a;
    }

    public int getH() {
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (a != triangle.a) return false;
        if (h != triangle.h) return false;
        return name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + a;
        result = 31 * result + h;
        return result;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name='" + name + '\'' +
                ", a=" + a +
                ", h=" + h +
                '}';
    }

    @Override
    public void getShapeName() {
        System.out.println(name);
    }

    @Override
    public void getField() {
        int areaOfTriangle = (a * h) /2;
    }
}
