package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

public class LShape extends Block {
    public int rotation = 0;
    private final Vector[][] rotations = new Vector[4][4];

    public LShape(Vector initialPosition) {
        super(initialPosition, TextColor.ANSI.RED);
        rotations[0][0] = new Vector(0, 0);
        rotations[0][1] = new Vector(0, 1);
        rotations[0][2] = new Vector(0, 2);
        rotations[0][3] = new Vector(1, 2);

        rotations[1][0] = new Vector(0, 0);
        rotations[1][1] = new Vector(1, 0);
        rotations[1][2] = new Vector(2, 0);
        rotations[1][3] = new Vector(0, 1);

        rotations[2][0] = new Vector(0, 0);
        rotations[2][1] = new Vector(1, 0);
        rotations[2][2] = new Vector(1, 1);
        rotations[2][3] = new Vector(1, 2);

        rotations[3][0] = new Vector(0, 0);
        rotations[3][1] = new Vector(1, 0);
        rotations[3][2] = new Vector(2, 0);
        rotations[3][3] = new Vector(2, -1);
    }

    @Override
    public void rotate() {
        rotation = (rotation + 1) % 4;
    }

    @Override
    public Vector[] getRelativePositionsOfSquares() {
        return rotations[rotation];
    }
}
