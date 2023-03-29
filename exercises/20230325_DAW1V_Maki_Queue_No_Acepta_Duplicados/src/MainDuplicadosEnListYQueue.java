import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MainDuplicadosEnListYQueue {
  static final int MAX_VALUE = 5;
  static final int NUM_REPETICIONES = 2;

  public static void main(String[] args) {

    // Explicación de porqué no hace falta pasar el tipo contenido en la LinkedList
    // llamando al constructor con 'new LinkedList<Integer>();' y porqué 'new
    // LinkedList<>();' es suficiente:
    //
    // Inferencia de tipo con operador diamante <>:
    // https://www.arquitecturajava.com/java-var-keyword-y-su-uso-con-jdk10/
    // https://javadesdecero.es/avanzado/inferencia-tipo-operador-diamante-java/
    // https://docs.oracle.com/javase/tutorial/java/generics/types.html#diamond

    List<Integer> listaIntegers = new LinkedList<>();
    Queue<Integer> colaIntegers = new LinkedList<>();

    // Repetimos NUM_REPETICIONES veces el bucle que inserta los números del 1 al
    // MAX_VALUE en la lista y en la cola.
    // Si alguna de las colecciones no permitiese duplicados, debería dar error al
    // insertar:
    // * List.add(e) siempre devuelve true. En caso de error lanza una excepción.
    // * Queue.offer(e) devuelve true si ha podido insertar el elemento, false si no
    // puede.
    for (int repeticion = 1; repeticion <= NUM_REPETICIONES; repeticion++) {
      for (int i = 1; i <= MAX_VALUE; i++) {
        listaIntegers.add(i);
        if (colaIntegers.offer(i) == false) {
          System.out.println("[repeticion=" + repeticion + "] Error al insertar " + i + " en colaIntegers");
        }
      }
    }

    // Utilizamos el patrón de diseño "iterator" para recorrer las colecciones lista
    // y cola:
    // https://es.wikipedia.org/wiki/Iterador
    // https://www.w3schools.com/java/java_iterator.asp

    System.out.println("Iteramos sobre los elementos de la lista:");
    Iterator<Integer> itLista = listaIntegers.iterator();
    int posicionElemento = 0;
    while (itLista.hasNext()) {
      // Ejemplo de uso de *var* como especificador de tipo:
      //
      // https://www.arquitecturajava.com/java-var-keyword-y-su-uso-con-jdk10/
      // https://docs.oracle.com/en/java/javase/18/language/local-variable-type-inference.html
      // https://www.geeksforgeeks.org/var-keyword-in-java/

      // En la siguiente línea, Java deduce que la variable numero es de tipo Integer
      // porque es el tipo que devuelve la operación itLista.next()
      var numero = itLista.next();
      System.out.println("[listaIntegers, posicion " + posicionElemento++ + "]: " + itLista.next());
    }

    System.out.println("Iteramos sobre los elementos de la cola:");
    Iterator<Integer> itCola = colaIntegers.iterator();
    posicionElemento = 0;
    while (itCola.hasNext()) {
      System.out.println("[colaIntegers, posicion " + posicionElemento++ + "]: " + itCola.next());
    }
  }
}