package com.test;

import com.java.Animal;
import com.java.Cat;
import com.java.Chicken;
import com.java.Duck;
import com.java.Parrot;
import com.java.Rooster;


import static org.junit.Assert.*;
import org.junit.Test;

public class TestCase {
    public TestCase() {
    }

    public static void main(String[] args) {
        String[] args2 = { TestCase.class.getName() };
        org.junit
           .runner
           .JUnitCore
           .main(args2);
    }

  
    @Test
    public void testMeth() {
        Duck duck =  new Duck();
        assertTrue(duck.walk());
        assertTrue(duck.fly());
        assertTrue(duck.sing());
        
        Chicken chicken =  new Chicken();
        assertFalse(chicken.fly());
        assertTrue(chicken.sing());
        
        Rooster rooster =  new Rooster();
        assertTrue(rooster.walk());
        assertFalse(rooster.fly());
        
        Parrot myParrotwithCats =  new Parrot();
        myParrotwithCats.livingWith(new Cat());
        assertTrue(myParrotwithCats.walk());
        assertTrue(myParrotwithCats.fly());
        assertTrue(myParrotwithCats.sing());
        
        Parrot myParrotWithRoosters =  new Parrot();
        myParrotWithRoosters.livingWith(new Rooster());
        assertTrue(myParrotWithRoosters.walk());
        assertTrue(myParrotWithRoosters.fly());
        assertTrue(myParrotWithRoosters.sing());

        Parrot myParrotWithDucks =  new Parrot();
        myParrotWithDucks.livingWith(new Duck());
        assertTrue(myParrotWithDucks.walk());
        assertTrue(myParrotWithDucks.fly());
        assertTrue(myParrotWithDucks.sing());
     
    }

   
}
