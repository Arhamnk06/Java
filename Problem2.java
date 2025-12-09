public class Problem2 
{
    /*
     * NAME: <your name here>
     * CSID: <your csid here>
     */

     public static int sumDigits(int number)
     {
         /*
          * This method is intended to be used as a helper method for the digitRoot 
          * problem below. It takes in a non-negative integer and calculates
          * the sum of the digits in the number.
          * For example, if the input is 493193, then the output should be 
          * 29 since 29 = 4 + 9 + 3 + 1 + 9 + 3.
          *
          * This method is worth 5 marks.
          */
        int sum = 0;
        String str = number+"";
        for(int i =0;i<str.length();i++){
          char a = str.charAt(i);
          int num = a-'0';
          sum += num;
        }
        return sum;
     }

    public static int digitRoot(int number)
    {
        /* This method calculates the number of steps required to reduce a positive 
         * integer to its "digital root". The digital root is found by repeatedly 
         * summing all of the digits of the current number until a single digit 
         * number is reached.
         * This method should return the number of steps to do so. For example:
         * Input 16:  1 + 6 = 7 (1 step)
         * Input 942: 9 + 4 + 2 = 15, then 1 + 5 = 6 (2 steps)
         * Input 132189: 1 + 3 + 2 + 1 + 8 + 9 = 24, then 2 + 4 = 6 (2 steps)
         * Input 493193: 4 + 9 + 3 + 1 + 9 + 3 = 29, then 2 + 9 = 11, then 1 + 1 = 2 (3 steps)
         * 
         * This method is worth 10 marks.
         */
        int sum = 0;
        String str = number+"";
        if(str.length() == 1){
          return 0;
        }
        String x = "";
        int count = 1;
          for(int i =0;i<str.length();i++){
            char a = str.charAt(i);
            int num = a-'0';
            sum += num;
          }
          x = sum +"";
          if(x.length()>1){
            count++;
            sum=0;

            
          }


        
        return count;
        
        
        
    }

    
}
