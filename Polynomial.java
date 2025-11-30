import java.util.Arrays;

public class Polynomial {
    private final int[] coeff;

    public Polynomial(int[] coefficients) {
        int lastNonZero = coefficients.length - 1;
        while (lastNonZero > 0 && coefficients[lastNonZero] == 0) {
            lastNonZero--;
        }
        coeff = Arrays.copyOf(coefficients, lastNonZero + 1);
    }

    public int getDegree() {
        return coeff.length - 1;
    }

    public int getCoefficient(int k) {
        if (k >= 0 && k < coeff.length) return coeff[k];
        return 0;
    }

    public long evaluate(int x) {
        long result = 0;
        long power = 1;
        for (int k = 0; k < coeff.length; k++) {
            result += coeff[k] * power;
            power *= x;
        }
        return result;
    }

    public Polynomial add(Polynomial other) {
        int maxDegree = Math.max(this.getDegree(), other.getDegree());
        int[] newCoeffs = new int[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            newCoeffs[i] = this.getCoefficient(i) + other.getCoefficient(i);
        }

        return new Polynomial(newCoeffs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeff.length - 1; i >= 0; i--) {
            if (coeff[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(coeff[i] > 0 ? " + " : " - ");
                } else if (coeff[i] < 0) {
                    sb.append("-");
                }

                int absCoeff = Math.abs(coeff[i]);
                if (i == 0 || absCoeff != 1) {
                    sb.append(absCoeff);
                } else {
                    sb.append("1");
                }
                
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) sb.append("^").append(i);
                }
            }
        }
        return sb.length() == 0 ? "0" : sb.toString().replace("+ -", "- ");
    }
}
