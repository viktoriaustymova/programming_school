public class Rectangle extends Figure{
    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public void callcArea() {
        double rectangleArea = sideA*sideB;
        System.out.println("Плошадь фигуры равна " + rectangleArea );

    }
}
