public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    /**
     * Scales the rectangle
     *
     * @param factor: the factor by which width and heigth will be scaled by
     */
    public void scale(double factor) {
        width = width * factor;
        height = height * factor;
    }

    public boolean isLargerThan(Rectangle other) {
        return (area() > other.area());
    }
}
