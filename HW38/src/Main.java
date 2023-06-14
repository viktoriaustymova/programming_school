import java.util.ArrayList;
import java.util.List;

public class Main {
/*
    1
    Создать в программе 3 класса: Square{double side}, Circle{double radius},
     Rectangle{double sideA, double sideB }.
    У каждого класса реализовать метод double callcArea(),
    который считает площадь фигуры. Создать List из фигур и для каждой фигуры вывести на экран ее площадь.

    2 (на повторение)
    Написать метод, который находит в списке фигуру с самой большой площадью.*/

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3,5);
        Square square = new Square(5);


        List<Figure> figures = new ArrayList<>(List.of(circle,rectangle,square));

        System.out.println(figures);

        for (Figure figure: figures){
            figure.callcArea();
        }




    }
    public static double getMaxArea(List<Figure> figures){
        double maxArea = figures.get(0).getArea();
        for (Figure figure: figures){
            if(figure.getArea() > maxArea){
                maxArea = figure.getArea();
            }

        }
        return maxArea;

    }
}