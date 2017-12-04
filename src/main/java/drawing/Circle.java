package drawing;

class Circle extends Shape {

    private double radius;

    public Circle() {
        radius = 235;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
