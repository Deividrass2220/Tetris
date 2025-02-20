package org.example;

import org.example.lib.Vector;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TerminalDisplay t = new TerminalDisplay();
        VerticalLine v = new VerticalLine(5, new Vector(5, 5), new Vector(3, 3));

       v.draw(t);

    }

}
