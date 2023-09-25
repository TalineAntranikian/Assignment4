import java.util.LinkedList;

public class Polynomial {
    private LinkedList<Term> terms;

    public Polynomial() {
        terms = new LinkedList<>();
    }

    public String addPolynomials(String polynomial1, String polynomial2) {
        parsePolynomial(polynomial1);
        parsePolynomial(polynomial2);
        return getPolynomialString();
    }

    private void parsePolynomial(String polynomial) {
       
    }

    private void addTerm(int coefficient, int exponent) {
       
    }

    public String getPolynomialString() {
        return toString();
    }

}