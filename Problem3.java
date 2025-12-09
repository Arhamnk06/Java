public class Problem3 
{
    /*
     * NAME: <your name here>
     * CSID: <your csid here>
     */
    
    public static int countRowSumBigger(int [][] rows, int value) 
    {
        /* This method takes in a 2D array of integers, and finds how many of the
         * rows have a sum that is bigger than the given value.
         * For example:
         * Input: rows = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, value = 8
         *    then the returned value should be 2, since 4 + 5 + 6 > 8,
         *    and 7 + 8 + 9 > 8,
         * Note that the sum must be strictly bigger than input value for
         * the row to be counted. For example, if value = 6 above, the answer
         * is still 2 since 1 + 2 + 3 <= 6.
         * 
         * This method is worth 10 marks.
         */
        int count = 0;
        for(int i = 0;i<rows.length;i++){
            int sum = 0;
            for(int j = 0;j<rows[i].length;j++){
                sum+=rows[i][j];
            
            }
            if (sum>value){
                count++;
                
                
                
            }
        }
        return count;
    }
}
