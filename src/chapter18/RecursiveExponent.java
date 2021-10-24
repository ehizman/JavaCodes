package chapter18;

import java.math.BigInteger;

public class RecursiveExponent {

    public BigInteger calculateExponent(int base, int exponent) {
        BigInteger baseAsBigInteger = BigInteger.valueOf(base);
        BigInteger exponentAsBigInteger = BigInteger.valueOf(exponent);
        if(exponentAsBigInteger.compareTo(BigInteger.ONE) == 0){
            return baseAsBigInteger;
        }
        return baseAsBigInteger.multiply(calculateExponent(base, exponent-1));
    }
}
