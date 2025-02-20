package org.example;

import org.example.lib.Vector;

import java.util.Objects;

public abstract class Shapes {
    public Vector position, velocity;

    public Shapes(Vector position, Vector velocity) {
        this.position = position;
        this.velocity = velocity;
    }

    public abstract void draw(TerminalDisplay t);

    @Override
    public String toString() {
        return "Shapes{" +
                "position=" + position +
                ", velocity=" + velocity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shapes shapes = (Shapes) o;
        return Objects.equals(position, shapes.position) && Objects.equals(velocity, shapes.velocity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, velocity);
    }
}
