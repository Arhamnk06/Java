public class LabTwo 
{
    public static int[] everyOther(int[] a) 
    {
     int value = 0;
    if (a.length%2 == 0 ){
        value = a.length/2;
    }
    else{
        value = (a.length/2)+1;
    }
    int[] arr = new int[value];
    int index = 0;
    for(int i = 0;i<a.length;i=i+2){
        arr[index] = a[i];
        index++;
    
    }

        return arr;

    }
    public static int[][] createZigZag(int rows, int cols, int start) 
    {
        int val = start;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++){
            if (i%2==0) {
                for(int j=0; j<cols;j++){
                    result[i][j] = val;
                    val++;
                }
            }
            else{
                for(int j=cols-1; j>=0;j--){
                    result[i][j] = val;
                    val++;
                }
            }
        }
        return result;
    }
    
    
    
        public static void reverseAscendingSubarrays(int[] items) 
        {
            int start = 0;
            for(int i = 1; i <= items.length; i++){
                if (i == items.length || items[i] <= items[i-1]) {
                    int end = i-1;
                    while (start < end) {
                        int temp = items[start];
                        items[start] = items[end];
                        items[end] = temp;
                        start++;
                        end--;
                    }
                    start = i;
                }
            }
        }
        
    
        public static String pancakeScramble(String text) 
        {
            StringBuilder sb = new StringBuilder(text);
            for(int i=0;i<=text.length();i++){
                String toBeReversed = new StringBuilder(sb.substring(0,i)).reverse().toString();
                sb.replace(0, i, toBeReversed);
            }
            return sb.toString();
        }

    }