package vn.edu.cybersoft.pkg;

import static java.lang.Math.*;

public class utils {
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isNegative(double number) {
        return number < 0;
    }

    public static boolean isZero(double number) {
        return number == 0;
    }

    public static boolean isPrime(int number){
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
