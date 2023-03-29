package programacion.utils;

public class Mates {
  public static int factorial(int value) {
    if (value == 0) {
      return 1;
    }
    int factorialMinus1 = factorial(value - 1);
    int result = value * factorialMinus1;
    return result;
  }

  public static long factorial(long value) {
    if (value == 0) {
      return 1;
    }
    long factorialMinus1 = factorial(value - 1);
    long result = value * factorialMinus1;
    return result;
  }
}
