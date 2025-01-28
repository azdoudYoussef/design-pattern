package com.design.pattern.factoryPattern.service;

import com.design.pattern.factoryPattern.factory.ShapeFactory;
import com.design.pattern.factoryPattern.factory.ShapeType;
import com.design.pattern.factoryPattern.model.Shape;
import org.springframework.stereotype.Service;

@Service
public class ShapeService {

    private final ShapeFactory shapeFactory;

    public ShapeService(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public String getShapeDrawing(ShapeType shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        return shape.draw();
    }
}

