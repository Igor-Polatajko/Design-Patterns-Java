package structural.bridge;

import structural.bridge.abstraction.Circle;
import structural.bridge.abstraction.Shape;
import structural.bridge.abstraction.Triangle;
import structural.bridge.realization.GreenFigure;
import structural.bridge.realization.RedFigure;

public class Client {

    public static void main(String[] args) {
        Shape greenCircle = new Circle(new GreenFigure());
        Shape redTriangle = new Triangle(new RedFigure());

        greenCircle.draw();
        redTriangle.draw();
    }
}
