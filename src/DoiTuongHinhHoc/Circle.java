package DoiTuongHinhHoc;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    public double getPerimeter(){
        double peri = Math.PI*2*radius;
        return peri;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.radius + " which is a subclass of " + super.toString();
    }
}
