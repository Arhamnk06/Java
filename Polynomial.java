import java.util.Arrays;

public class Polynomial 
{
    private final int[] coefficients;
    
        public Polynomial(int[] coefficients) {
            int lastNonZero = -1;
            for (int i = 0; i < coefficients.length; i++) {
                if (coefficients[i] != 0) {
                    lastNonZero = i; // keep updating until we hit the last non-zero
                }
            }
    
            // If all values were 0, set to {0}
            if (lastNonZero == -1) {
                this.coefficients = new int[]{0};
            } else {
                this.coefficients = new int[lastNonZero + 1];
                for (int i = 0; i <= lastNonZero; i++) {
                    this.coefficients[i] = coefficients[i];
                }
            }
        }
            
        
    public int getDegree() 
    {
        
        return this.coefficients.length - 1;
    }
    
    public int getCoefficient(int k) 
    {
       
        if (k < 0 || k >= coefficients.length) {
            return 0;
        } else {
            return coefficients[k];
        }
    }
    
}