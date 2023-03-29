public class Perro {
  // Atributos de la clase
  public String nombre;
  private int edad;
  private String raza;

  public Perro(String nombre, int edad, String raza){
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
  }

  public void imprimeDetalles(){
    String descripcion = nombre + " es de raza " + raza 
                         + " y tiene " + edad + " años";
    System.out.println(descripcion);
  }
}
