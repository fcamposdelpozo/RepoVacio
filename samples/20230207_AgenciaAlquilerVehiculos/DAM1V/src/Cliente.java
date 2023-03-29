public class Cliente {
  private String nombre;
  private String apellido;
  private Integer posicionVehiculoAlquilado;

  public Cliente(String nombre, String apellido){
    this.nombre = nombre;
    this.apellido = apellido;
  }

  @Override
  public String toString() {
    return String.format("%-10s", nombre) + " " + String.format("%-10s", apellido);
  }  
}
