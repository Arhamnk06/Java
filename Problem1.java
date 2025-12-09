public class Problem1 
{
    /*
     * NAME: <your name here>
     * CSID: <your csid here>
     */

    /**
     * @param input
     * @return
     */
    public static String compressRLE(String input)
    {
        /* This method compresses a string using run-length encoding. Runs of 
         * identical characters (ie. sequences of the same character) are 
         * compressed into two parts: the count, and the character. The output
         * String should should show all the compressed runs, in the order they
         * appear. For example, given input "AAABBBBBC", the output
         * should be "3A5B1C".
         * 
         * This method is worth 10 marks.
         */
        if(input == ""){
            return "";
        }
        String str = "";
        int count = 1;
        for(int i = 1;i<input.length();i++){
            char a = input.charAt(i-1);
            char b = input.charAt(i);
            if(a==b){
                count++;
                
            }
            else{
                str+=count+""+a;
                count = 1;
                
            }
        }
        str += count + "" + input.charAt(input.length() - 1);

        return str;

    }
}
