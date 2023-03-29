import javax.sound.sampled.BooleanControl;

public class Cliente {
  private String nombre;
  private String apellido;
  private Integer posicionVehiculoAlquilado;

  
  public Cliente(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public boolean setPosicionVehiculoAlquilado(int pos){
    if(posicionVehiculoAlquilado == null) {
      this.posicionVehiculoAlquilado = pos;
      return true;
    }
    else {
      System.out.println("El cliente " + this + " ya tiene el vehiculo de la posicion " 
                          + posicionVehiculoAlquilado + " alquilado");
      return false;
    }
  }

  public boolean tieneAlquiler() {
    if(posicionVehiculoAlquilado == null) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    String cadena = nombre + " " + apellido;

    return cadena;
  }

  
}
