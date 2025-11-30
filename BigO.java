public class BigO extends Polynomial {
    private String category;

    public BigO(int[] coefficients) {
        super(coefficients);
        int degree = getDegree();
        switch (degree) {
            case 0: category = "constant"; break;
            case 1: category = "linear"; break;
            case 2: category = "quadratic"; break;
            case 3: category = "cubic"; break;
            default: category = "polynomial";
        }
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        int degree = getDegree();
        if (degree == 0) return "O(1)";
        if (degree == 1) return "O(n)";
        return "O(n^" + degree + ")";
    }
}
