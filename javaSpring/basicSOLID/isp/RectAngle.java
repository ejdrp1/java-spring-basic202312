package isp;

public class RectAngle implements Shape{
    private double width;
    private double height;

    public double calculateArea() {
        return width * height;
    }

    public double calculateVolume() {
        throw new UnsupportedOperationException();
    }
}
