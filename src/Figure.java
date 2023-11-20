public class Figure {
    private String color;
    private  boolean visible;
    private LocationOfFigure location;



    public Figure(String color, boolean visible, LocationOfFigure location) {
        this.color = color;
        this.visible = visible;
        this.location = location;
    }

    public LocationOfFigure getLocation() {
        return location;
    }

    public void setLocation(LocationOfFigure location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String speak() {
        String visibility;
        if (visible) {
            visibility = "visible";
        } else {
            visibility = "not visible";
        }
        return "FigureOfColor:" + color + '\n' +
                " Location of figure:" + location.getX() + "," +
                location.getY() + "\n" + "Visibility:" + visibility;
                }
    }



