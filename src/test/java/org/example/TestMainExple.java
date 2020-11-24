package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestMainExple {

    @Test
    public void checkAccum() {
        assertEquals("A-Bb-Ccc-Dddd", MainExple.accum("abcd"));
        //assertTrue("abcd".equals("A-Bb-Ccc-Dddd"));
        assertEquals("R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy", MainExple.accum("RqaEzty"));
        assertEquals("C-Ww-Aaa-Tttt", MainExple.accum("cwAt"));
    }
}
