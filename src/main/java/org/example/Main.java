package org.example;

import com.googlecode.lanterna.input.KeyStroke;
import org.example.lib.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TerminalDisplay t = new TerminalDisplay();
        Field field = new Field(10, 20);

        Block shape = new Square(new Vector(5, 0));
        KeyStroke k;

        long fps = 30;
        long timeDelta = 1000 / fps;

        long start = System.currentTimeMillis();

        do {
            t.clear();
            field.draw(t);
            Vector absolutePosition = field.getAbsoluteShapePosition(shape);

            k = t.getNextKeypress();
            if (k != null) {
                switch (k.getCharacter()) {
                    case 'h': {
                        if (absolutePosition.x > 1)
                            shape.position.x--;
                        break;
                    }
                    case 'k': {
                        if (absolutePosition.x < field.width - 1)
                            shape.position.x++;
                        break;
                    }
                }
            }

            long current = System.currentTimeMillis();

            if (current - start > timeDelta) {
                if (absolutePosition.y < field.height - 2 && !field.hasLanded(shape)) {
                    shape.draw(t);
                    shape.position.y++;
                } else {
                    field.fillBlock(shape);
                    shape = field.shapeFactoring(t);
                    shape.position.y = 0;
                }
                start = current;
            }

            long timeToRender = System.currentTimeMillis() - start;
            Thread.sleep(timeDelta - timeToRender);

        }
        while (k == null || k.getCharacter() != 'q');
        System.exit(1);
    }

}
