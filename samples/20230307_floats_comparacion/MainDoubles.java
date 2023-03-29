public class MainDoubles {
  public static void main(String[] args) {
    double a = 0.1;
    double b = 0.2;
    double suma = a + b;
    final double EXPECTED_RESULT = 0.3;
    /*
     * El valor 0.3 realmente se almacena en un double como
     * 0.299999999999999988897769753748434595763683319091796875.
     * 
     * Puedes comprobarlo y jugar con las conversiones
     * en https://www.h-schmidt.net/FloatConverter/IEEE754.html
     * y en https://baseconvert.com/ieee-754-floating-point
     */

    // EPSILON representa el máximo error de precisión aceptado.
    // Por ejemplo, si comparamos 1.0 con 1.0009, la diferencia entre esos números
    // es 0.0009 (Math.abs(1.0-1.0009)). Al ser menor que EPSILON (0.001),
    // consideramos que 1 y 1.0009 son iguales.
    final double EPSILON = 0.001;

    System.out.println("=========> MainDoubles");
    System.out.println("a=" + a + ", b=" + b + ", suma=a+b, "
        + "EXPECTED_RESULT=" + EXPECTED_RESULT + ", suma=" + suma);
    System.out.println();

    System.out.println("## Comparamos con '==':");
    if (suma == EXPECTED_RESULT) {
      System.out.println("suma == EXPECTED_RESULT -> true");
    } else {
      System.out.println("suma == EXPECTED_RESULT -> FALSE!!!");
      System.out.println("==> OJO CON LA COMPARACIÓN DE LOS DOUBLES!!");
    }
    System.out.println();

    System.out.println("## Comparamos con el método Double.compare():");
    // Double.compare() compara igual que el operador ==, no tiene en cuenta un
    // posible error de precisión
    if (Double.compare(EXPECTED_RESULT, suma) == 0) {
      System.out.println("Double.compare(EXPECTED_RESULT, suma) == 0 -> true");
    } else {
      System.out.println("Double.compare(EXPECTED_RESULT, suma) == 0 -> FALSE!!!");
      System.out.println("==> OJO CON LA COMPARACIÓN CON EL MÉTODO Compare()!!!");
    }
    System.out.println();

    // Usando EPSILON
    System.out.println("## Comparamos contemplando un error máximo de precisión (EPSILON=" + EPSILON + "):");
    System.out.println("Math.abs(suma-EXPECTED_RESULT) < EPSILON -> "
        + Boolean.toString(Math.abs(suma - EXPECTED_RESULT) < EPSILON).toUpperCase() + "!!!");
    System.out.println("\t- Math.abs(" + suma + "-" + EXPECTED_RESULT + ") = " + Math.abs(suma - EXPECTED_RESULT));
    System.out.println("\t- EPSILON = " + EPSILON);
    System.out
        .println("==> PARA COMPROBAR SI DOS doubles SON IGUALES HAY QUE CONSIDERAR EL ERROR DE PRECISIÓN EPSILON!!!");
    System.out.println();
  }
}
