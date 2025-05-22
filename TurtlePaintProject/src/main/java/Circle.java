import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, int borderWidth, Color borderColor, int radius) {
        super(x, y, borderWidth, borderColor);
        this.radius = radius;
    }

    @Override
    public void paint(Turtle turtle) {
        turtle.setDelay(0);
        turtle.penUp();
        turtle.setColor(borderColor);
        turtle.setPenWidth(borderWidth);
        turtle.goTo(x + radius, y);
        turtle.setHeading(0);
        turtle.penDown();

        for (int i = 0; i < 360; i++) {
            turtle.forward(2 * Math.PI * radius / 360);
            turtle.turnLeft(1);
        }

        turtle.penUp();
    }
}
