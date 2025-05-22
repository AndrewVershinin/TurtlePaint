import java.awt.*;

public class Square extends Shape{
    private int side;

    public Square(int x, int y, int borderWidth, Color borderColor, int side) {
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

        for (int i = 0; i < 4; i++) {
            turtle.forward(side);
            turtle.turnLeft(90);
        }

        turtle.penUp();
    }
}
