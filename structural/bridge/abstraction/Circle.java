package structural.bridge.abstraction;

import structural.bridge.realization.DrawAPI;

public class Circle extends Shape {

    public Circle(DrawAPI drawApi) {
        super(drawApi);
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");

        drawApi.draw();
    }
}
