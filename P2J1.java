public class P2J1 {

    public static long fallingPower(int n, int k) {
        long result = 1;
        for (int i = 0; i < k; i++) {
            result = result * n;
            n--;
        }
        return result;
    }

    public static int countInversions(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) { 
            for (int j = i + 1; j < a.length; j++) { 
                if (a[i] > a[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}