package com.kodilla.testing.shape;

public class Square implements Shape {

    private String name;
    private int a;

    public Square(String name, int a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public int getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (a != square.a) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + a;
        return result;
    }

    @Override
    public String toString() {
        return "Square{" +
                "name='" + name + '\'' +
                ", a=" + a +
                '}';
    }

    @Override
    public void getShapeName() {
        System.out.println(name);
    }

    @Override
    public void getField() {
        int areaOfSquare = a * a;
    }
}
