package programacion.negocios.empresaalquilervehiculos;

public class ClienteParticular extends AbstractCliente {
  String telefono;
  String correoElectronico;

  @Override
  public String toString() {
    String cadena = "";
    cadena += nif + " " + nombre + " (" + telefono + ", " + correoElectronico + ")";
    return cadena;
  }

}
