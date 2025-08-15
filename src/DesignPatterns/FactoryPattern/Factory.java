package DesignPatterns.FactoryPattern;

public class Factory {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
