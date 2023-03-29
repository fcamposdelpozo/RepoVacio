package programacion.negocios.empresaalquilervehiculos;

public class Turismo extends AbstractVehiculoAlquiler {
  int numeroPuertas;
  boolean cambioAutomatico;


  @Override
  public String toString() {
    return String.format("%8s %-15s %.2f€/día (%d puertas, cambio %s) ",
        matricula, (fabricante + "-" + modelo), tarifaDiaria, numeroPuertas,
        (cambioAutomatico ? "automático" : "manual"));
  }
}