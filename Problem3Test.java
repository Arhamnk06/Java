import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Problem3Test 
{

    @Test public void testRowSum_01() { int[][] rows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(2, Problem3.countRowSumBigger(rows, 8)); }
    @Test public void testRowSum_02() { int[][] rows = {{3, 2}, {2, 3}, {5, 2}};
        assertEquals(3, Problem3.countRowSumBigger(rows, 4)); }
    @Test public void testRowSum_03() { int[][] rows = {};
        assertEquals(0, Problem3.countRowSumBigger(rows, 5)); }
    @Test public void testRowSum_04() { int[][] rows = {{1}, {2}, {3}, {4}};
        assertEquals(2, Problem3.countRowSumBigger(rows, 2)); }
    @Test public void testRowSum_05() { int[][] rows = {{-1, -2}, {1, 2}, {-5, 10}};
        assertEquals(2, Problem3.countRowSumBigger(rows, 0)); }
    @Test public void testRowSum_06() { int[][] rows = {{1}, {1, 2, 3}, {1, 2}, {5}};
        assertEquals(2, Problem3.countRowSumBigger(rows, 3)); }
    @Test public void testRowSum_07() { int[][] rows = {{1, 2, 3}, {4, 91, 6}};
        assertEquals(1, Problem3.countRowSumBigger(rows, 100)); }
    @Test public void testRowSum_08() { int[][] rows = {{}, {}, {}};
        assertEquals(0, Problem3.countRowSumBigger(rows, 0)); }
    @Test public void testRowSum_09() { int[][] rows = {{-1, -2}, {-3, -4}, {-5, -6}};
        assertEquals(2, Problem3.countRowSumBigger(rows, -10)); }
    @Test public void testRowSum_10() { int[][] rows = {{-1, -2}, {-3, -4}, {-5, -6}};
        assertEquals(1, Problem3.countRowSumBigger(rows, -4)); }

}

