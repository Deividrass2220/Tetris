package org.example;

import com.googlecode.lanterna.input.KeyStroke;
import org.example.lib.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TerminalDisplay t = new TerminalDisplay();
        Field field = new Field(10, 20);
        Block square = new Square(new Vector(0, 18));
        Block lShape = new LShape(new Vector(3, 16));
        Block tShape = new TShape(new Vector(7, 16));
        Block line = new Line(new Vector(9, 16));

        field.fillBlock(square);
        field.fillBlock(lShape);
        field.fillBlock(tShape);
        field.fillBlock(line);

        Block shape = new Square(new Vector(5, 0));
        KeyStroke k;

        for (int y = 0; y < 18; y++) {
            t.clear();
            field.draw(t);
            k = t.getNextKeypress();
            if (k != null) {
                switch (k.getCharacter()) {
                    case 'h':
                        shape.moveLeft(t);
                    case 'k':
                        shape.moveRight(t);
                }

            }
            shape.position.y = y;
            if (!field.hasLanded(shape))
                shape.draw(t);
            else {
                field.fillBlock(shape);
                y = 0;
                shape = new Line(new Vector(5, 2));
            }
            t.flush();
            Thread.sleep(1000);
        }
    }

}
