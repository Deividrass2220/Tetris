package org.example;

import com.googlecode.lanterna.TextColor;
import org.example.lib.Vector;

import java.util.Arrays;

public class Field {
    public final int width, height;
    public TextColor.ANSI[][] cells;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.cells = new TextColor.ANSI[width][height];
        for (TextColor.ANSI[] row : cells)
            Arrays.fill(row, TextColor.ANSI.BLACK);
    }

    public void draw(TerminalDisplay t) {
        for (int x = 0; x < width; x++)
            for (int y = 0; y < height; y++)
                if (cells[x][y] != TextColor.ANSI.BLACK) {
                    t.setForegroundColor(cells[x][y]);
                    t.putCharacter(x, y, '*');
                }
    }

    public boolean hasLanded(Block b) {
        Vector[] relativePositions = b.getRelativePositionsOfSquares();
        Vector position = b.getPosition();

        for (Vector relativePosition : relativePositions) {
            Vector absPosition = position.plus(relativePosition);
            if (cells[absPosition.x][absPosition.y + 1] != TextColor.ANSI.BLACK)
                return true;
        }

        return false;
    }

    public void fillBlock(Block b) {
        Vector[] relativePositions = b.getRelativePositionsOfSquares();
        Vector position = b.getPosition();
        TextColor.ANSI color = b.foregroundColor;

        for (Vector relativePosition : relativePositions) {
            Vector absPosition = position.plus(relativePosition);
            cells[absPosition.x][absPosition.y] = color;
        }
    }
}
