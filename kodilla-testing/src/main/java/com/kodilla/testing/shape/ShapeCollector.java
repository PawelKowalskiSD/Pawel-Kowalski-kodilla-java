package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollection = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            result = true;
        }
    return result;
    }

    public Shape getFigure(int n) {
        if(n >= 0 && n < shapeCollection.size()) {
            return shapeCollection.get(n);
        }
        return null;
    }

    public void showFigure() {
        System.out.println(shapeCollection);
    }


}
