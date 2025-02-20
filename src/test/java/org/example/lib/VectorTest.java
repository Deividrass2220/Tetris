package org.example.lib;

import static org.junit.Assert.*;
import org.junit.Test;

public class VectorTest {

    @Test
    public void isCellFill_return_true_when_a_shape_hits_the_bottom() {
        Field f = new Field

    }

    @Test
    public void times_scales_the_vector_by_some_number() {
        Vector a = new Vector(1, 1);
        Vector expected = new Vector(6, 6);

        Vector actual = a.times(6);

        assertEquals(expected, actual);
    }
}
