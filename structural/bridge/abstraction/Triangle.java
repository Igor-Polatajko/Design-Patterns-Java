package structural.bridge.abstraction;

import structural.bridge.realization.DrawAPI;

public class Triangle extends Shape {

    public Triangle(DrawAPI drawApi) {
        super(drawApi);
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");

        drawApi.draw();
    }
}
