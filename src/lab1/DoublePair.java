package lab1;

/**
 * Created by MacBook on 9/7/16.
 */
public class DoublePair {
    public double P;
    public double S;
    public DoublePair(double x, double y) {
        P = x;
        S = y;

    }


    @Override
    public boolean equals(Object other){
        DoublePair dp = (DoublePair)other;
        return (Math.abs(P-dp.P)<0.001 && Math.abs(S-dp.S)<0.001);
    }

}
