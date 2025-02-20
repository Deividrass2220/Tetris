package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

import java.util.Arrays;

public class Field {
    public TextColor.ANSI[][] field;

    public Field(int width, int height) {
        this.field = new TextColor.ANSI[width][height];
        for (TextColor.ANSI[] row : field)
            Arrays.fill(row, TextColor.ANSI.BLACK);
    }

    public void fillBlock(Block b) {
        Vector[] relativePositions = b.getRelativePositionsOfSquares();
        Vector position = b.getPosition();
        TextColor.ANSI color = b.foregroundColor;

        for (Vector relativePosition : relativePositions) {
            Vector absPosition = position.plus(relativePosition);
            field[absPosition.getRoundedX()][absPosition.getRoundedY()] = color;
        }
    }
}
