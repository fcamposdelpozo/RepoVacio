import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class MainStack {
  public static void main(String[] args) {
    try {
      String cadena = args[0];
      Stack<Character> pilaCadena = new Stack<>();
      Queue<Character> colaCadena = new LinkedList<>();

      for (int i = 0; i < cadena.length(); i++) {
        pilaCadena.push(cadena.charAt(i));
        colaCadena.add(cadena.charAt(i));
      }

      System.out.println(cadena);
      System.out.print("cadena invertida: ");

      while (!pilaCadena.isEmpty()) {
        System.out.print(pilaCadena.pop());
      }
      System.out.println();

      System.out.print("cadena sin invertir: ");

      try {
        while (true) {
          System.out.print(colaCadena.remove());
        }
        // Si capturásemos ArithmeticException, este manejador de excepción (handler) no
        // capturaría la excepción que se lanza al llamar a colaCadena.remove() cuando
        // está vacía, que es una excepción de tipo NoSuchElementException
        // } catch (ArithmeticException a) {
      } catch (NoSuchElementException nseExc) {
        System.out.println("\nPila Vacia");
        System.out.println("|==> EXCEPCION CAPTURADA: " + nseExc);
        System.out.println("|==> nseExc.printStackTrace():");
        nseExc.printStackTrace();
      }
      System.out.println();

      // Si capturásemos Exception, capturaríamos cualquier excepción,
      // independientemente del tipo que fuera
      // } catch (Exception e) {
    } catch (ArrayIndexOutOfBoundsException aioobExc) {
      System.out.println("|==> EXCEPCION CAPTURADA: " + aioobExc);
      System.out.println("|==> aioobExc.printStackTrace():");
      aioobExc.printStackTrace();
    }
  }
}