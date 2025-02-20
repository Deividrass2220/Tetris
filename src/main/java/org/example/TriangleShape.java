package org.example;

import org.example.lib.Vector;

public class TriangleShape extends Shapes {
    public double width, height;

    public TriangleShape(Vector position, Vector velocity) {
        super(position, velocity);
    }


    public double getTopY() {
        return position.y - (height / 2);
    }

    public double getBottomY() {
        return position.y + (height / 2);
    }

    @Override
    public void draw(TerminalDisplay t) {
    }
}
