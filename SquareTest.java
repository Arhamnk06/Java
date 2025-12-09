import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SquareTest 
{
    /***** Test calculateArea() *****/
    @Test public void testCalculateAreaInherited() {
        Square s = new Square(0, 0, 4);
        assertEquals(16, s.calculateArea()); // 4 * 4
    }

    /***** Test calculatePerimeter() *****/
    @Test public void testCalculatePerimeterInherited() {
        Square s = new Square(0, 0, 3);
        assertEquals(12, s.calculatePerimeter()); // 4 * 3
    }

    /***** Test equals() *****/
    @Test public void testEquals_1() {
        Square s1 = new Square(0, 0, 4);    // Area = 16
        Square s2 = new Square(1, 1, 4);    // Area = 16
        assertTrue(s1.equals(s2));    // Same area squares
        assertTrue(s2.equals(s1));    // Same area squares
    }
    @Test public void testEquals_2() {
        Square s1 = new Square(0, 0, 4);    // Area = 16
        Rectangle r1 = new Rectangle(0, 0, 8, 2); // Area = 16
        assertTrue(s1.equals(r1));    // Square equals Rectangle with same area
    }
    @Test public void testEquals_3() {
        Square s1 = new Square(0, 0, 4);    // Area = 16
        Square s3 = new Square(0, 0, 5);    // Area = 25
        assertFalse(s1.equals(s3));   // Different areas
        assertFalse(s3.equals(s1));   // Different areas
    }
    @Test public void testEquals_4() {
        Square s1 = new Square(0, 0, 4);    // Area = 16
        assertFalse(s1.equals(null));
    }
    @Test public void testEquals_5() {
        Square s1 = new Square(0, 0, 4);    // Area = 16
        assertFalse(s1.equals("not a square"));
    }

    /***** Test compareTo() *****/
    @Test public void testCompareToInherited() {
        Square s1 = new Square(0, 0, 2);    // Area = 4, Perimeter = 8
        Square s2 = new Square(0, 0, 3);    // Area = 9, Perimeter = 12
        Square s3 = new Square(1, 1, 2);    // Area = 4, Perimeter = 8
        Rectangle r1 = new Rectangle(0, 0, 4, 1); // Area = 4, Perimeter = 10
        assertTrue(s1.compareTo(s2) < 0);   // 4 < 9
        assertTrue(s2.compareTo(s1) > 0);   // 9 > 4
        assertEquals(0, s1.compareTo(s3));  // Same area, same perimeter
        assertTrue(s1.compareTo(r1) < 0);   // Same area, 8 < 10
    }

    /***** Test toString() *****/
    @Test public void testToString_1() {
        Square s1 = new Square(0, 0, 6);
        assertEquals("Square: 6x6", s1.toString());
    }
    @Test public void testToString_2() {
        Square s2 = new Square(1, 2, 1);
        assertEquals("Square: 1x1", s2.toString());
    }
}
