import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        //Написать программу для подсчета периметра и площади круга.
        // Задайте значение радиуса в программе и выведите на экран значение периметра и площади.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Задайте значение радиуса круга");
        double radius = scanner.nextDouble();

        double p = 3.14;
        double perimeter = 2*p*radius;
        double perimeterRounded = Math.round(perimeter);
        System.out.println("Периметр круга = " + perimeterRounded + " м");
        double square = p*(Math.pow(radius,2));
        double squareRounded = Math.round(square);
        System.out.println("Площадь круга = " + squareRounded + " м2");



        int r = 20;
        //-------------

        double perimeter1= 2 * r *Math.PI;
        double area= r * r * Math.PI;

        //Округление результата до второго знака
        double perimeter2= (Math.round(perimeter1*100))/100.0;
        // 12566.370614359172


        //-------------
        System.out.println("Perimeter: " + perimeter1 );
        System.out.println("Perimeter: " + perimeter2 );
        System.out.println("Area: " + area );


    }
}