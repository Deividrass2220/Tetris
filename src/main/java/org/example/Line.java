package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

public class Line extends Block {
    public int rotation = 0;
    private final Vector[][] rotations = new Vector[2][4];

    public Line(Vector initialPosition) {
        super(initialPosition, TextColor.ANSI.BLUE);
        rotations[0][0] = new Vector(0, -1);
        rotations[0][1] = new Vector(0, 0);
        rotations[0][2] = new Vector(0, 1);
        rotations[0][3] = new Vector(0, 2);

        rotations[1][0] = new Vector(-1, 0);
        rotations[1][1] = new Vector(0, 0);
        rotations[1][2] = new Vector(1, 0);
        rotations[1][3] = new Vector(2, 0);
    }

    @Override
    public void rotate() {
        rotation = (rotation + 1) % 2; // 0 1 2 3 0 1 2 3 0 1 2 3
    }

    @Override
    public Vector[] getRelativePositionsOfSquares() {
        return rotations[rotation];
    }
}

