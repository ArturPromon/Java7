package com.company;

public class MainAbstract {
    public static void main(String[] args) {
        FigureAbstract object = new EllipseAbstract();
        object.draw();
        FigureAbstract object2 = new CircleAbstract();
        object2.draw();
        FigureAbstract object3 = new TriangleAbstract();
        object3.draw();
    }
}
