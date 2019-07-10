package structural.bridge.abstraction;

import structural.bridge.realization.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawApi;

    public Shape(DrawAPI drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
