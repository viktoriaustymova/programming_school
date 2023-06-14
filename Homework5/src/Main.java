import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите объем куба: ");
        double volume = scanner.nextDouble();
        double sideLength = Math.cbrt(volume);
        double ceiledSideLength = Math.ceil(sideLength);
        System.out.println(ceiledSideLength);

    }
}