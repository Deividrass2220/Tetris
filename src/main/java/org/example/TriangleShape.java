package org.example;

import org.example.lib.Vector;

public class TriangleShape extends Shapes {
    private HorizontalLine width;
    private VerticalLine height;

    public TriangleShape(Vector position, Vector velocity, HorizontalLine width, VerticalLine height) {
        super(position, velocity);
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw(TerminalDisplay t) {
        width.draw(t);
        height.draw(t);
    }
}
