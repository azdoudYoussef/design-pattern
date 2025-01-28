package com.design.pattern.factoryPattern.factory;

import com.design.pattern.factoryPattern.model.*;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

    public Shape createShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }
}

