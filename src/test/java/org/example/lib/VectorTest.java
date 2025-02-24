package org.example.lib;

import static org.junit.Assert.*;
import org.example.Block;
import org.example.Field;
import org.example.LShape;
import org.example.Line;
import org.junit.Test;

public class VectorTest {


    @Test
    public void times_scales_the_vector_by_some_number() {
        Vector a = new Vector(1, 1);
        Vector expected = new Vector(6, 6);

        Vector actual = a.times(6);

        assertEquals(expected, actual);
    }

    @Test
    public void getAbsoluteShapePosition_adding_relative_positions_and_block_position() {
        Block lShape = new LShape(new Vector(3, 5));
        Field field = new Field(10, 10);
        Block line = new Line(new Vector(9, 16));


        // First Rotation
        Vector absresult = field.getAbsoluteShapePosition(lShape);
        Vector lineabsresult = field.getAbsoluteShapePosition(line);


        Vector expected = new Vector(4, 10);
        Vector lineexpected = new Vector(9, 18);
        assertEquals(absresult, expected);
        assertEquals(lineabsresult, lineexpected);

    }
}
