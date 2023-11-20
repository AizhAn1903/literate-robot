// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MainRectangle {
    public static void main(String[] args) {
         Figure figure = new Figure("red",true,new LocationOfFigure(7,8));
         Rectangle rectangle = new Rectangle("blue",true,new LocationOfFigure(5,6),6);
        System.out.println(figure.speak());
        System.out.println(rectangle.speak());
        Rectangle square1 = new Rectangle("green",true,new LocationOfFigure(5,5),7);
        System.out.println(square1.speak());

        System.out.println(Rectangle.getRectangleCount());
        System.out.println(Rectangle.getSquareCount());


    }
}