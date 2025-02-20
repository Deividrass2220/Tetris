package org.example;

import org.example.lib.Vector;

public class VerticalLine extends Shapes {
    public double height;
    char c = 'X';

    public VerticalLine(int height, Vector position, Vector velocity) {
        super(position, velocity);
        this.height = height;
    }

    public double getTopY() {
        return position.y - (height / 2);
    }

    public double getBottomY() {
        return position.y + (height / 2);
    }

    @Override
    public void draw(TerminalDisplay t) {
        for (int i = (int) getTopY(); i < getBottomY(); i++)
            t.putCharacter((int) Math.round(position.x), i, c);
        t.flush();
    }
}

