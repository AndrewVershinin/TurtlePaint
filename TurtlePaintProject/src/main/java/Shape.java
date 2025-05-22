import java.awt.*;

public abstract class Shape {
    protected int x, y;
    protected int borderWidth;
    protected Color borderColor;

    public Shape(int x, int y, int borderWidth, Color borderColor) {
        this.x = x;
        this.y = y;
        this.borderWidth = borderWidth;
        this.borderColor = borderColor;
    }

    public abstract void paint(Turtle turtle);
}
