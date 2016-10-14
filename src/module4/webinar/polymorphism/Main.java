package module4.webinar.polymorphism;


import module4.webinar.polymorphism.Circle;
import module4.webinar.polymorphism.Figure;
import module4.webinar.polymorphism.Square;

public class Main {

    static void draw(Figure figure) {
        figure.drawFigure();

    }

    public static void main(String[] args) {
        //
        Figure circle;
        circle = new Circle();
        //

        Figure square = new Square();

        draw(circle);
        draw(square);

    }

}
