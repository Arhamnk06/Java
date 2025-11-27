import org.junit.Test;
import java.util.Random;
import java.util.zip.CRC32;

import static org.junit.Assert.assertEquals;

public class P2J1Test { 

    private static final int SEED = 12345;
   
    @Test public void testFallingPower() {
        // Explicit test cases
        assertEquals(720, P2J1.fallingPower(10, 3));
        assertEquals(5040, P2J1.fallingPower(7, 7));
        assertEquals(75030638981760L, P2J1.fallingPower(99, 7));
        assertEquals(3024, P2J1.fallingPower(-6, 4));
        assertEquals(0, P2J1.fallingPower(3, 6));
        assertEquals(1, P2J1.fallingPower(42, 0));
        assertEquals(1, P2J1.fallingPower(-98765432, 0));
        assertEquals(-990, P2J1.fallingPower(-9, 3));

        // Mass tester
        CRC32 check = new CRC32();
        for(int b = -10; b < 20; b++) {
            for(int e = 0; e < 10; e++) {
                long p = P2J1.fallingPower(b, e);
                check.update((int)(p & 0xFFFF));
                check.update((int)((p >> 31) & 0xFFFF));
            }
        }
        assertEquals(2652223294L, check.getValue());
        // Test was a success!
    }

    @Test public void testCountInversions() {
        // Explicit test cases
        int[] a1 = {42, 17, 99, 5};
        assertEquals(4, P2J1.countInversions(a1));

        int[] a2 = {999};
        assertEquals(0, P2J1.countInversions(a2));

        int[] a3 = {77, 44, 33, 22, 0, -11, -12345678};
        assertEquals(21, P2J1.countInversions(a3));

        int[] a4 = {-12345678, -11, 0, 22, 33, 44, 77};
        assertEquals(0, P2J1.countInversions(a4));

        int[] a5 = {3, 5, 1, 7, 0, 9};
        assertEquals(6, P2J1.countInversions(a5));

        // Pseudorandom fuzz tester
        Random rng = new Random(SEED);
        CRC32 check = new CRC32();
        for(int i = 0; i < 1000; i++) {
            int[] a = new int[i];
            for(int j = 0; j < i; j++) {
                a[j] = rng.nextInt(100000);
            }
            check.update(P2J1.countInversions(a));
        }
        assertEquals(1579619806L, check.getValue());
    }
}