package org.example.lib;

import java.util.Objects;

public class Vector {
    public int x, y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Double.compare(x, vector.x) == 0 && Double.compare(y, vector.y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Vector plus(Vector b) {
        return new Vector(this.x + b.x, this.y + b.y);
    }

    public Vector times(int n) {
        return new Vector(this.x * n, this.y * n);
    }

    @Override
    public String toString() {
        return "<" + x + ", " + y + ">";
    }
}
