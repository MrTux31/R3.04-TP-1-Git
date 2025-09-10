package com.tp1;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;  
public class AddTest {


    @Test
    public void testAdd(){
        int a = 2;
        int b = 2;
        int addition = a + b;
        Add add = new Add();
        assertEquals(addition, add.add(a, b));
    }

}
