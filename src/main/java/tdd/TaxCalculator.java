package tdd;

/**
 * Created by Jeka on 23/08/2016.
 */
public class TaxCalculator {

    private NDSResolver ndsResolver = new NDSResoverImpl();

    public void setNdsResolver(NDSResolver ndsResolver) {
        this.ndsResolver = ndsResolver;
    }

    public double afterNDS(double price) {
        return ndsResolver.getNDS() * price + price;
    }

    public static void main(String[] args) {
        new TaxCalculator().afterNDS(100);
    }
}








