package com.company;

public class MainPolymorphism {
    public static void main(String[] args) {
        Figure figure1 = new Triangle();
        figure1.draw();
        Figure figure2 = new Circle();
        figure2.draw();
        Figure figure3 = new Ellipse();
        figure3.draw();
        System.out.print("\n");
        Figure[] figure = new Figure[]{new Circle(), new Ellipse(), new Triangle()};
        for(int i = 0; i < figure.length; i++){
            figure[i].draw();
        }
    }
}
