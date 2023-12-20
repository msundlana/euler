package nl.entelect;

import java.math.BigInteger;

public class PowerDigitSum {

    public static BigInteger getExponentValue(int num, int exponent){

        BigInteger a = BigInteger.valueOf(num);
        return a.pow(exponent);
    }

    public static BigInteger getPowerDigitSum(String [] powerDigit){
        long sum = 0;
        for (String digit:powerDigit
        ) {
            sum += new Long(digit);
        }
        return BigInteger.valueOf(sum);
    }

    public static void main(String[] args) {
        System.out.println( getPowerDigitSum(getExponentValue(2,1000).toString().split("")));
    }


}

