package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

public abstract class Block {
    Vector position;
    public final TextColor.ANSI foregroundColor;

    public Block(Vector position, TextColor.ANSI color) {
        this.position = position;
        this.foregroundColor = color;
    }

    public abstract void rotate();

    public abstract Vector[] getRelativePositionsOfSquares();

    public void setPosition(Vector p) {
        this.position = p;
    }

    public Vector getPosition() {
        return position;
    }

    public void draw(TerminalDisplay t) {
        Vector[] relativePositionsOfSquares = getRelativePositionsOfSquares();
        t.setForegroundColor(foregroundColor);

        for (Vector relativePos : relativePositionsOfSquares) {
            Vector blockPosition = position.plus(relativePos);
            t.putCharacter(blockPosition.x, blockPosition.y, '*');
        }
    }
}
