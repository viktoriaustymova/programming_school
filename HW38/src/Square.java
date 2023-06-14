public class Square extends Figure{
    private double side;

    public Square( double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void callcArea() {
        double squareArea = Math.pow(side,2);
        System.out.println("Плошадь фигуры равна " + squareArea);
    }
}
