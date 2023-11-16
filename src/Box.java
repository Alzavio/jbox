public class Box {
    private double length = 0;
    private double width = 0;
    private double height = 0;

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }


    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public String getVolume() {
        return Double.toString(length * width * height);
    }

    public String getSurfaceArea() {
        return Double.toString(length * width);
    }

    public String toString() {
        return " Length: " + Double.toString(length) + "\n Width: " + Double.toString(width) + "\n Height: " + Double.toString(height);
    }
}
