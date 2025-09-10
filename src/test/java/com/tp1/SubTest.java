package com.tp1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;  
public class SubTest {


    @Test
    public void testSub(){
        int a = 4;
        int b = 2;
        int soustraction = a - b;
        Sub sub = new Sub();
        assertEquals(soustraction, sub.sub(a, b));
    }

}