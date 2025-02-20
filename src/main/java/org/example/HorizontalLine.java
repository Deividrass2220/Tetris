package org.example;

import org.example.lib.Vector;

public class HorizontalLine extends Shapes {
    public double width;
    char c = 'X';

    public HorizontalLine(int width, Vector position, Vector velocity) {
        super(position, velocity);
        this.width = width;
    }

    public double Getleftx() {
        return position.x - (width / 2);
    }

    public double GetRightx() {
        return position.x + (width / 2);
    }

    @Override
    public void draw(TerminalDisplay t) {
        for (int x = (int) Getleftx(); x < GetRightx(); x++)
            t.putCharacter(x, (int) Math.round(position.y), c);
        t.flush();
    }
}

