import java.util.Scanner;

public class MainScannerTests {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int entero = 0;
    String cadena = "";

    System.out.println("=".repeat(10) + " nextInt + next " + "=".repeat(10));
    System.out.print("Introduce un entero > ");
    entero = scanner.nextInt();
    System.out.println("scanner.nextInt(); entero=" + entero);

    System.out.print("Introduce una cadena (sin espacios) > ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");

    System.out.println("=".repeat(10) + " nextInt + nextLine + nextLine  " + "=".repeat(10));
    System.out.print("Introduce un entero > ");
    entero = scanner.nextInt();
    System.out.println("scanner.nextInt(); entero=" + entero);

    System.out.print("Introduce una cadena (con espacios))> ");
    cadena = scanner.nextLine();
    System.out.println("scanner.nextLine(); cadena='" + cadena + "'");

    System.out.print("Introduce una cadena (con espacios)> ");
    cadena = scanner.nextLine();
    System.out.println("scanner.nextLine(); cadena='" + cadena + "'");

    System.out.println("=".repeat(10) + " nextInt + nextLine + nextInt + next " + "=".repeat(10));
    System.out.print("Introduce un entero > ");
    entero = scanner.nextInt();
    System.out.println("scanner.nextInt(); entero=" + entero);

    System.out.print("Introduce una cadena (con espacios)> ");
    cadena = scanner.nextLine();
    System.out.println("scanner.nextLine(); cadena='" + cadena + "'");

    System.out.print("Introduce un entero > ");
    entero = scanner.nextInt();
    System.out.println("scanner.nextInt(); entero=" + entero);

    System.out.print("Introduce una cadena (sin espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");

    System.out.println("=".repeat(10) + " nextInt + next + nextInt + next " + "=".repeat(10));
    System.out.print("Introduce un entero > ");
    entero = scanner.nextInt();
    System.out.println("scanner.nextInt(); entero=" + entero);

    System.out.print("Introduce una cadena (sin espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");

    System.out.print("Introduce un entero > ");
    entero = scanner.nextInt();
    System.out.println("scanner.nextInt(); entero=" + entero);

    System.out.print("Introduce una cadena (sin espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");

    System.out.println("=".repeat(10) + " next + next + next + next " + "=".repeat(10));

    System.out.print("Introduce una cadena (con espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");

    System.out.print("Introduce una cadena (sin espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");
    
    System.out.print("Introduce una cadena (sin espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");

    System.out.print("Introduce una cadena (sin espacios)> ");
    cadena = scanner.next();
    System.out.println("scanner.next(); cadena='" + cadena + "'");
    scanner.close();

  }
}
