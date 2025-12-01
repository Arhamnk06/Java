import java.util.Arrays;

public class Polynomial implements Comparable<Polynomial> 
{

    private final int[] coeff;
    
    public Polynomial(int[] coefficients) 
    {
        
        int degree = coefficients.length - 1;
        
            while (degree > 0 && coefficients[degree] == 0) {
                degree--;  
            }

            if (degree == 0 && coefficients[degree]== 0){
                coeff = new int[] {0};
            }

            else {
                coeff = Arrays.copyOf(coefficients, degree + 1);
            }
    }
    
    public int getDegree() 
    {
        
        return coeff.length - 1; 
    }
    
    public int getCoefficient(int k) 
    {
       
        if (k >= 0 && k < coeff.length){
            return coeff[k];
            }
            return 0;
    }
    
    public long evaluate(int x) 
    {
        
        long result = 0;
        long pwr = 1;

        for (int i = 0; i < coeff.length; i++){
            result = result + (coeff[i] * (pwr));
            pwr *= x;
        }

        return result; 
    }
    
    public String toString() 
    {
       
        StringBuilder p = new StringBuilder();
            boolean firstTerm = true; 

            for (int i = this.coeff.length - 1; i >= 0; i--) {
                if (this.coeff[i] != 0) {  
                    if (!firstTerm) {
                        if (this.coeff[i] > 0) p.append(" + ");
                        else p.append(" - ");
                    } else {  
                        if (this.coeff[i] < 0) p.append("-");
                    }

                    p.append(Math.abs(this.coeff[i])); 

                    if (i > 1) p.append("x^").append(i);
                    else if (i == 1) p.append("x");

                    firstTerm = false;  
                }
            }

            return (p.length() == 0) ? "0" : p.toString();  
        }
    
    
    public Polynomial add(Polynomial other) 
    {
        int size = Math.max(this.coeff.length, other.coeff.length);
        int[] resultCoeffs = new int[size];
    
        for (int i = 0; i < size; i++) {
            if (i < this.coeff.length) resultCoeffs[i] += this.coeff[i];
            if (i < other.coeff.length) resultCoeffs[i] += other.coeff[i];
        }
    
        return new Polynomial(resultCoeffs);
    }
    public Polynomial multiply(Polynomial other) 
{
    int newDegree = this.getDegree() + other.getDegree();
    int[] resultCoeffs = new int[newDegree + 1];

    for (int i = 0; i < this.coeff.length; i++) {
        for (int j = 0; j < other.coeff.length; j++) {
            resultCoeffs[i + j] += this.coeff[i] * other.coeff[j];
        }
    }

    return new Polynomial(resultCoeffs);
}
    
    @Override public boolean equals(Object other) 
    {

      if (this == other) return true;
    if (!(other instanceof Polynomial)) return false;

    Polynomial p = (Polynomial) other;
    return Arrays.equals(this.coeff, p.coeff);
    }
    
    public int compareTo(Polynomial other) 
    {
      
        if (this.getDegree() > other.getDegree()) return 1;
    if (this.getDegree() < other.getDegree()) return -1;

    for (int i = this.getDegree(); i >= 0; i--) {
        if (this.coeff[i] > other.coeff[i]) return 1;
        if (this.coeff[i] < other.coeff[i]) return -1;
    }
    return 0;
    }
}