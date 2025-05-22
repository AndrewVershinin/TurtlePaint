import java.awt.*;

public class Triangle extends Shape {
    private int side;

    public Triangle(int x, int y, int borderWidth, Color borderColor, int side) {
        super(x, y, borderWidth, borderColor);
        this.side = side;
    }

    @Override
    public void paint(Turtle turtle) {
        turtle.penUp();
        turtle.setColor(borderColor);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(x, y);
        turtle.setHeading(0);
        turtle.penDown();

        for (int i = 0; i < 3; i++) {
            turtle.forward(side);
            turtle.turnLeft(120);
        }

        turtle.penUp();
    }
}
