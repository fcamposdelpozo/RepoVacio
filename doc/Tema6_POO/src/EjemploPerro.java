public class EjemploPerro {
  public static void main(String[] args) {
    Perro milu = null;
    int numero = 0;

    System.out.println("milu: " + milu);
    System.out.println("numero=" + numero);
    
    milu = new Perro("Milu", 94, "grand fox terrier");
    Perro lassie = new Perro("Lassie", 85, "collie");

    System.out.println("Hemos creado dos perros: " + milu.nombre
                       + " y " + lassie.nombre);
    milu.imprimeDetalles();
    lassie.imprimeDetalles();
  }
}
