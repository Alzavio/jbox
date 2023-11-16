public class Box {
    private double length = 0;
    private double width = 0;
    private double height = 0;

    public Box(double length, double width, double height) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    /**
     * @param length Update the length of the box
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * @param width Update the width of the box
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @param height Update the height of the box
     */
    public void setHeight(double height) {
        this.height = height;
    }


    /**
     * @return Returns numerical value of the volume (length * width * height) as a string
     */
    public String getVolume() {
        return Double.toString(length * width * height);
    }

    /**
     * @return Returns numerical value of the surface area (length * width) as a string
     */
    public String getSurfaceArea() {
        return Double.toString(length * width);
    }

    /**
     * @return Returns a string with the height, width, and height of the box
     */
    public String toString() {
        return " Length: " + Double.toString(length) + "\n Width: " + Double.toString(width) + "\n Height: " + Double.toString(height);
    }
}
