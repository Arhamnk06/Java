import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem1Test 
{

    @Test public void testRLE_01() { assertEquals("", Problem1.compressRLE("")); }
    @Test public void testRLE_02() { assertEquals("1a", Problem1.compressRLE("a")); }
    @Test public void testRLE_03() { assertEquals("3a", Problem1.compressRLE("aaa")); }
    @Test public void testRLE_04() { assertEquals("2a3b2c", Problem1.compressRLE("aabbbcc")); }
    @Test public void testRLE_05() { assertEquals("1a1b1c", Problem1.compressRLE("abc")); }
    @Test public void testRLE_06() { assertEquals("5x2y10z", Problem1.compressRLE("xxxxxyyzzzzzzzzzz")); }
    @Test public void testRLE_07() { assertEquals("2#3@", Problem1.compressRLE("##@@@")); }
    @Test public void testRLE_08() { assertEquals("100a", Problem1.compressRLE("a".repeat(100))); }
    @Test public void testRLE_09() { assertEquals("50a50b", Problem1.compressRLE("a".repeat(50) + "b".repeat(50))); }
    @Test public void testRLE_10() { assertEquals("4a3b4c5d20x3y3z", Problem1.compressRLE("aaaabbbccccddddd" + "x".repeat(20) + "yyyzzz")); }

}

