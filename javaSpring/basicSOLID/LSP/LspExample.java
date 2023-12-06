package LSP;

public class LspExample {
    public static void main(String[] args) {
        RectAngle rectAngle = new RectAngle();
        rectAngle.setWidth(5);
        rectAngle.setHeight(10);
        System.out.println(rectAngle.calculateArea()); // 50

        Square square = new Square();
        square.setWidth(5);
        square.setHeight(10);
        System.out.println(square.calculateArea()); // 100

    }
}

