public class Circle extends Figure{
    private double radius;

    public Circle (double radius){
        super();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public void callcArea() {
        double circleArea = Math.PI * Math.pow(radius,2);
        System.out.println("Плошадь фигуры равна " + circleArea);
    }
}
