public class MainArgs {
  public static void main(String[] args) {
    System.out.println("Estoy ejecutando el método main");
    System.out.println("He recibido " + args.length + " argumentos");

    for (int i = 0; i < args.length; i++) {
      System.out.println("argumento en la posicion " + i + ": " + args[i]);
    }

    int posicionFibonacci = 0;
    if (args.length > 0) {
      posicionFibonacci = Integer.parseInt(args[0]);
    }
    System.out.println("posicionFibonacci es " + posicionFibonacci);
    if (posicionFibonacci == 10) {
      System.out.println("55");
    }
  }
}