import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest 
{
    /***** Test calculateArea() *****/
    @Test public void testArea_1() { 
        Rectangle r1 = new Rectangle(0, 0, 5, 3);
        assertEquals(15, r1.calculateArea()); 
    }
    @Test public void testArea_2() { 
        Rectangle r2 = new Rectangle(1, 1, 10, 10);
        assertEquals(100, r2.calculateArea()); 
    }

    /***** Test calculatePerimeter() *****/
    @Test public void testPerimeter_1() { 
        Rectangle r1 = new Rectangle(0, 0, 5, 3);
        assertEquals(16, r1.calculatePerimeter()); // 2*(5+3)
    } 
    @Test public void testPerimeter_2() { 
        Rectangle r2 = new Rectangle(1, 1, 10, 10);
        assertEquals(40, r2.calculatePerimeter()); // 2*(10+10)
    } 

    /***** Test translate() *****/
    @Test public void testTranslatePositiveValues() {
        Rectangle original = new Rectangle(3, 5, 10, 20); // x=3, y=5, width=10, height=20
        Rectangle translated = original.translate(2, 3);
        assertEquals(5, translated.getX());    // 3 + 2
        assertEquals(8, translated.getY());    // 5 + 3
        assertEquals(10, translated.getWidth());  // width unchanged
        assertEquals(20, translated.getHeight()); // height unchanged
        assertNotSame(original, translated);      // should be a new instance
    }
    @Test public void testTranslateNegativeValues() {
        Rectangle original = new Rectangle(3, 5, 10, 20);
        Rectangle translated = original.translate(-8, 4);
        assertEquals(-5, translated.getX());    // 3 + (-8)
        assertEquals(9, translated.getY());     // 5 + 4
        assertEquals(10, translated.getWidth());   // width unchanged
        assertEquals(20, translated.getHeight());  // height unchanged
        assertNotSame(original, translated);       // should be a new instance
    }
    @Test public void testTranslateZeroValues() {
        Rectangle original = new Rectangle(3, 5, 10, 20);
        Rectangle translated = original.translate(0, 0);
        assertEquals(3, translated.getX());     // 3 + 0
        assertEquals(5, translated.getY());     // 5 + 0
        assertEquals(10, translated.getWidth());   // width unchanged
        assertEquals(20, translated.getHeight());  // height unchanged
        assertNotSame(original, translated);       // should be a new instance
    }
    @Test public void testOriginalRectangleUnchanged() {
        Rectangle original = new Rectangle(3, 5, 10, 20);
        Rectangle before = new Rectangle(3, 5, 10, 20);
        original.translate(5, 5);
        assertEquals(before.getX(), original.getX());
        assertEquals(before.getY(), original.getY());
        assertEquals(before.getWidth(), original.getWidth());
        assertEquals(before.getHeight(), original.getHeight());
    }

    /***** Test equals() *****/
    @Test public void testEquals_1() {
        Rectangle r1 = new Rectangle(0, 0, 5, 4);  // Area = 20
        Rectangle r2 = new Rectangle(1, 1, 10, 2); // Area = 20
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1)); 
    }
    @Test public void testEquals_2() {
        Rectangle r1 = new Rectangle(0, 0, 5, 4);  // Area = 20
        Rectangle r3 = new Rectangle(0, 0, 6, 3);  // Area = 18
        assertFalse(r1.equals(r3));
        assertFalse(r3.equals(r1)); 
    }
    @Test public void testEquals_3() {
        Rectangle r1 = new Rectangle(0, 0, 5, 4);  // Area = 20
        assertFalse(r1.equals("not a rectangle")); 
    }
    @Test public void testEquals_4() {
        Rectangle r1 = new Rectangle(0, 0, 12, 3);  // Area = 36
        Rectangle r2 = new Square(1, 1, 6); // Area = 36
        assertTrue(r1.equals(r2));
    }
    @Test public void testEquals_5() {
        Rectangle r1 = new Rectangle(0, 0, 1, 4);  // Area = 4
        Rectangle r2 = new Square(1, 1, 2); // Area = 4
        assertTrue(r1.equals(r2));
        Rectangle r3 = new Square(1, 1, 3); // Area = 9
        assertFalse(r1.equals(r3));
    }

    /***** Test compareTo() *****/
    @Test public void testCompareTo_1() {
        Rectangle r1 = new Rectangle(0, 0, 2, 3);  // Area = 6, Perimeter = 10
        Rectangle r2 = new Rectangle(0, 0, 3, 4);  // Area = 12, Perimeter = 14
        assertTrue(r1.compareTo(r2) < 0); // 6 < 12
    } 
    @Test public void testCompareTo_2() {
        Rectangle r1 = new Rectangle(0, 0, 2, 3);  // Area = 6, Perimeter = 10
        Rectangle r2 = new Rectangle(0, 0, 3, 4);  // Area = 12, Perimeter = 14
        assertTrue(r2.compareTo(r1) > 0); // 12 > 6
    } 
    @Test public void testCompareTo_3() {
        Rectangle r1 = new Rectangle(0, 0, 2, 3);  // Area = 6, Perimeter = 10
        Rectangle r3 = new Rectangle(0, 0, 3, 2);  // Area = 6, Perimeter = 10
        assertEquals(0, r1.compareTo(r3)); // Same area, same perimeter
        assertEquals(0, r3.compareTo(r1)); // Same area, same perimeter
    } 
    @Test public void testCompareTo_4() {
        Rectangle r1 = new Rectangle(0, 0, 2, 3);  // Area = 6, Perimeter = 10
        Rectangle r4 = new Rectangle(0, 0, 1, 6);  // Area = 6, Perimeter = 14
        assertTrue(r1.compareTo(r4) < 0); // Same area, 10 < 14
        assertTrue(r4.compareTo(r1) > 0); // Same area, 14 < 10
    } 

    /***** Test toString() *****/
    @Test public void testToString_1() { 
        Rectangle r1 = new Rectangle(0, 0, 8, 4);
        assertEquals("Rectangle: 4x8", r1.toString()); 
    }
    @Test public void testToString_2() { 
        Rectangle r2 = new Rectangle(1, 1, 3, 5);
        assertEquals("Rectangle: 3x5", r2.toString()); 
    }
    @Test public void testToString_3() { 
        Rectangle r3 = new Rectangle(2, 2, 6, 6);
        assertEquals("Rectangle: 6x6", r3.toString()); 
    }

}
