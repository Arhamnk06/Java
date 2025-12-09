import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem2Test 
{
    
    @Test public void testDR_01() { assertEquals(0, Problem2.digitRoot(0)); }
    @Test public void testDR_02() { assertEquals(0, Problem2.digitRoot(7)); }
    @Test public void testDR_03() { assertEquals(1, Problem2.digitRoot(16)); }
    @Test public void testDR_04() { assertEquals(2, Problem2.digitRoot(942)); }
    @Test public void testDR_05() { assertEquals(2, Problem2.digitRoot(132189)); }
    @Test public void testDR_06() { assertEquals(3, Problem2.digitRoot(493193)); }
    @Test public void testDR_07() { assertEquals(2, Problem2.digitRoot(9999)); }
    @Test public void testDR_08() { assertEquals(1, Problem2.digitRoot(10000)); }
    @Test public void testDR_09() { assertEquals(1, Problem2.digitRoot(111111)); }
    @Test public void testDR_10() { assertEquals(0, Problem2.digitRoot(8)); }

    @Test public void testSD_1() { assertEquals(29, Problem2.sumDigits(493193)); }
    @Test public void testSD_2() { assertEquals(7, Problem2.sumDigits(7)); }
    @Test public void testSD_3() { assertEquals(0, Problem2.sumDigits(0)); }
    @Test public void testSD_4() { assertEquals(9, Problem2.sumDigits(45)); }
    @Test public void testSD_5() { assertEquals(21, Problem2.sumDigits(123456)); }

}

