package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

public abstract class Block {
    Vector position ;

    public Block(Vector position) {
        this.position = position;
    }

    public abstract void rotate();
    public abstract Vector[] getSquares();

    public void setPosition(Vector p) {
        this.position = p;
    }

    public Vector getPosition() {
        return position;
    }

    public void draw(TerminalDisplay t) {
        Vector[] shape = getSquares();

        for(Vector v : shape) {
            Vector blockPosition = position.plus(v);
            t.putCharacter(blockPosition.getRoundedX(), blockPosition.getRoundedY(), '*');
            t.setForegroundColor(TextColor.ANSI.RED);
        }
    }

}
