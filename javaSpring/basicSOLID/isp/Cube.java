package isp;

public class Cube implements Area, Volume {
    private double width;
    private double height;
    private double depth;

    public double calculateArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public double calculateVolume() {
        return width * height * depth;
    }
}
