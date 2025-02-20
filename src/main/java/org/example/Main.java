package org.example;

import org.example.lib.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TerminalDisplay t = new TerminalDisplay();

        Block square = new Square(new Vector(3, 4));
        Block lShape = new LShape(new Vector(6, 2));
        Block tShape = new TShape(new Vector(7, 8));
        Block line = new Line(new Vector(10, 5));

        square.draw(t);
        lShape.draw(t);
        tShape.draw(t);
        line.draw(t);



    }

}
