import programacion.utils.Mates;

public class MainFactorial {
  public static void main(String[] args) {
    final int MAX_FACTORIAL = 100;
    long l = 0;
    int factorialInt;
    long factorialLong;
    for (int i = 0; i < MAX_FACTORIAL; i++) {
      l = i;
      factorialInt = Mates.factorial(i);
      factorialLong = Mates.factorial(l);

      System.out.println("factorial(" + String.format("%2d", i) + "): "
          + String.format("%11d", factorialInt)
          + " " + String.format("%32s", Integer.toBinaryString(factorialInt))
          + String.format("| %20d", factorialLong)
          + " " + String.format("%64s", Long.toBinaryString(factorialLong)));
      if (factorialInt == 0 && factorialLong == 0) {
        break;
      }
    }
  }
}
