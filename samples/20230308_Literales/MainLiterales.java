public class MainLiterales {
  public static void main(String[] args) {

    boolean buleano = true;
    char letra = 'a';
    // letra = "b" // ERROR por las comillas dobles
    letra = 'b';
    int entero = 5;
    long largo = 5L;
    short corto = 5;
    float decimal = 5f;
    double decimalDouble = 5.0;
    double otroDouble = 8.0d;

    String cadena = "Hola";
    //cadena = 'b'; // ERROR por las comillas simples

    System.out.println("buleano = " + buleano);
    System.out.println("letra = " + letra);
    System.out.println("cadena = " + cadena);
    System.out.println("entero = " + entero);
    System.out.println("corto = " + corto);
    System.out.println("largo = " + largo);
    System.out.println("decimal = " + decimal);
    System.out.println("decimalDouble = " + decimalDouble);
    System.out.println("otroDouble = " + otroDouble);
  }
}
