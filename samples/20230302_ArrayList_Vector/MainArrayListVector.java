import java.util.ArrayList;
import java.util.Vector;

public class MainArrayListVector {
  public static void main(String[] args) {
    final int SIZE = 10;
/*     int[] arrayInts = new int[SIZE];

    for (int i=0; i<SIZE; i++) {
      arrayInts[i] = i*2;
    }

    System.out.print("arrayInts: ");
    for (int i=0; i<SIZE; i++) {
      System.out.printf("%2d ", arrayInts[i]);
    }
    System.out.println(); */

    ArrayList<Integer> arrayListInts = new ArrayList<Integer>();
    
    for (int i=0; i<SIZE; i++) {
      arrayListInts.add(i*3);
    }
    System.out.print("arrayListInts (" + arrayListInts.size() + "): ");
    for (int i=0; i<SIZE; i++) {
      System.out.printf("%2d ", arrayListInts.get(i));
    }
    System.out.println();

    arrayListInts.add(2,999);
    System.out.print("arrayListInts (" + arrayListInts.size() + "): ");
    for (int i=0; i<arrayListInts.size(); i++) {
      System.out.printf("%2d ", arrayListInts.get(i));
    }
    System.out.println();

    arrayListInts.remove(4);
    System.out.print("arrayListInts (" + arrayListInts.size() + "): ");
    for (int i=0; i<arrayListInts.size(); i++) {
      System.out.printf("%2d ", arrayListInts.get(i));
    }
    System.out.println();

    arrayListInts.set(2, 666);
    System.out.print("arrayListInts (" + arrayListInts.size() + "): ");
    for (int i=0; i<arrayListInts.size(); i++) {
      System.out.printf("%2d ", arrayListInts.get(i));
    }
    System.out.println();

    Vector<Integer> vectorInt = new Vector<Integer>();

    for (int i=0; i<SIZE; i++) {
      vectorInt.add(i*4);
    }
    System.out.print("vectorInt(" + vectorInt.size() + "): ");
    for (int i=0; i<vectorInt.size(); i++) {
      System.out.printf("%2d ", vectorInt.get(i));
    }
    System.out.println();

    vectorInt.add(4, 1024);
    System.out.print("vectorInt(" + vectorInt.size() + "): ");
    for (int i=0; i<vectorInt.size(); i++) {
      System.out.printf("%2d ", vectorInt.get(i));
    }
    System.out.println();

    vectorInt.remove(6);
    System.out.print("vectorInt(" + vectorInt.size() + "): ");
    for (int i=0; i<vectorInt.size(); i++) {
      System.out.printf("%2d ", vectorInt.get(i));
    }
    System.out.println();

    vectorInt.set(7, 3333);
    System.out.print("vectorInt(" + vectorInt.size() + "): ");
    for (int i=0; i<vectorInt.size(); i++) {
      System.out.printf("%2d ", vectorInt.get(i));
    }
    System.out.println();

  }
}
