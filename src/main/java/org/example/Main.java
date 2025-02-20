package org.example;

import org.example.lib.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TerminalDisplay t = new TerminalDisplay();
        VerticalLine vLine = new VerticalLine(5, new Vector(5, 5), new Vector(3, 3));
        HorizontalLine hLine = new HorizontalLine(5, new Vector(10, 10), new Vector(8, 3));
        vLine.draw(t);
        hLine.draw(t);

    }

}
