import java.awt.*;

public class Rectangle extends Figure {
    private  double height;
    private  double width;
    private static int rectangleCount = 0;
    private  static int squareCount = 0;



    public static int getRectangleCount() {
        return rectangleCount;
    }

    public static void setRectangleCount(int rectangleCount) {
        Rectangle.rectangleCount = rectangleCount;
    }

    public static int getSquareCount() {
        return squareCount;
    }

    public static void setSquareCount(int squareCount) {
        Rectangle.squareCount = squareCount;
    }

    public Rectangle(LocationOfFigure location, String color, boolean visible, int width, int height) {
        super(color, visible, location);
        this.width = width;
        this.height = height;
        rectangleCount++;
        if (width == height) {
            squareCount++;
        }
    }


    public Rectangle(String color, boolean visible, LocationOfFigure location, int sideLength) {
        super(color, visible, location);
        this.width = sideLength;
        this.height = sideLength;
    }

    @Override
    public String speak() {
        String visibility = super.speak().contains("visible") ? "visible" : "not visible";
        if (width == height) {

            return "Square:" + getColor() + "\n" +
                    "Side:" + width + "\n" +
                    "Location:" + getLocation().getX() + "," + getLocation().getY()  + "\n" +
                    "Visibility:" + visibility;
        } else {

            return "Rectangle:" + "\n" +
                    "color:" + getColor() + "\n" +
                    "Visibility:" + visibility+ "\n" +
                    "Location of figure:" + getLocation().getX() + "," + getLocation().getY() + "\n" +
                    "Height: " + height + "\n" +
                    "Width:" + width;
        }
    }

}
