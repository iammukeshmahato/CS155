
public class GeometricObject {

    private String color = "white";
    private boolean filled;

    // No-arg constructor
    public GeometricObject() {
    }

    // Constructor with specified color and filled status
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Accessor and mutator methods for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Accessor and mutator methods for filled
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

}
