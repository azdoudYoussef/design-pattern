package com.design.pattern.factoryPattern.controller;

import com.design.pattern.factoryPattern.factory.ShapeType;
import com.design.pattern.factoryPattern.service.ShapeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shapes")
public class ShapeController {

    private final ShapeService shapeService;

    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @GetMapping("/{shapeType}")
    public String drawShape(@PathVariable String shapeType) {
        try {
            ShapeType type = ShapeType.valueOf(shapeType.toUpperCase());
            return shapeService.getShapeDrawing(type);
        } catch (IllegalArgumentException e) {
            return "Invalid shape type: " + shapeType;
        }
    }
}
