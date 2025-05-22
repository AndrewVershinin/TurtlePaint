import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args)
    {
//        // This starter code to get you familiar with how
//        // the TurtleLogo application works
//
//        // The world is your canvas
//        World world = new World(200, 200);
//        Turtle turtle = new Turtle(world,-100, -100);
//
//        int width = 200;
//        int height = 200;
//
//        // calculate the hypotenuse (diagonal)
//        // a2 + b2 = c2
//        double widthSquared = Math.pow(width, 2);
//        double heightSquared = Math.pow(height, 2);
//        double hypotenuse = Math.sqrt(widthSquared + heightSquared);
//
//
//        turtle.setPenWidth(3);
//        turtle.setColor(Color.GREEN);
//
//        turtle.turnRight(45);
//        turtle.forward(hypotenuse);
//
//        turtle.penUp();
//        turtle.goTo(100, 100);
//        turtle.turnRight(90);
//
//        turtle.penDown();
//        turtle.forward(hypotenuse);
        Scanner input = new Scanner(System.in);

        System.out.print("Enter canvas width: ");
        int width = input.nextInt();
        System.out.print("Enter canvas height: ");
        int height = input.nextInt();

        World world = new World(width, height);
        Turtle turtle = new Turtle(world, -width / 2, -height / 2);

        List<Shape> shapes = new ArrayList<>();

        while (true) {
            System.out.println("\nHome Screen:");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("0) Exit");
            System.out.print("Choice: ");
            int choice = input.nextInt();

            if (choice == 0) break;

            if (choice == 1) {
                System.out.println("Choose shape (1: Circle, 2: Square, 3: Triangle): ");
                int type = input.nextInt();

                int radius = 0, side = 0;

                if (type == 1) {
                    System.out.print("Radius: ");
                    radius = input.nextInt();
                } else {
                    System.out.print("Side length: ");
                    side = input.nextInt();
                }

                System.out.print("Border width: ");
                int borderWidth = input.nextInt();

                System.out.print("Border color (R G B): ");
                int r = input.nextInt(), g = input.nextInt(), b = input.nextInt();
                Color color = new Color(r, g, b);

                System.out.print("X location: ");
                int x = input.nextInt();
                System.out.print("Y location: ");
                int y = input.nextInt();

                Shape shape = null;
                if (type == 1) {
                    shape = new Circle(x, y, borderWidth, color, radius);
                } else if (type == 2) {
                    shape = new Square(x, y, borderWidth, color, side);
                } else if (type == 3) {
                    shape = new Triangle(x, y, borderWidth, color, side);
                }

                if (shape != null) {
                    shape.paint(turtle);
                    shapes.add(shape);
                }
            }

            if (choice == 2) {
                world.saveAs("canvas.png");
                System.out.println("Image saved as canvas.png");
            }
        }
        input.close();
    }
}
