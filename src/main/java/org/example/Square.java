package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

public class Square extends Block {

    public int rotation = 0;
    private final Vector[][] rotations = new Vector[1][4];

    public Square(Vector initialPosition) {
        super(initialPosition, TextColor.ANSI.YELLOW);
        rotations[0][0] =new Vector(0, 0);
        rotations[0][1] =new Vector(0, 1);
        rotations[0][2] =new Vector(1, 0);
        rotations[0][3] =new Vector(1, 1);
    }

    @Override
    public void rotate() {

    }

    @Override
    public Vector[] getRelativePositionsOfSquares() {
        return rotations[rotation];
    }
}
