public class Orange {
    private int diameter;

    public Orange() {
        this.diameter = (int)(7+Math.random() * (15 - 7 +1));
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }





    @Override
    public String toString() {
        return "Orange{" +
                "diameter=" + diameter +
                '}';
    }
}
