public abstract class Transport implements FlyingVehicle {
    private double height;
    private double passedDistance;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDistance() {
        return passedDistance;
    }

    public void setDistance(double passedDistance) {
        this.passedDistance = passedDistance;
    }

    @Override
    public void land() {
        height = 0;
        passedDistance = 0;
    }
}
