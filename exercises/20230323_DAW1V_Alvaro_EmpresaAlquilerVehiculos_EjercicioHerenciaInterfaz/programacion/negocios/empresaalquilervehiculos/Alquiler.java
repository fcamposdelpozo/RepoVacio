package programacion.negocios.empresaalquilervehiculos;

import java.util.Date;

public class Alquiler extends AbstractAlquiler {


  
  public Alquiler(AbstractCliente cliente, AbstractVehiculoAlquiler vehiculo) {
    super(cliente, vehiculo);
  }

  void comenzarAlquiler() {

    inicioAlquiler = new Date();
  }

  void terminarAlquiler() {

    finAlquiler = new Date();
  }

  @Override
  public String toString() {
    return this.vehiculo.matricula + "/" + this.vehiculo.fabricante + "-"
        + this.vehiculo.modelo + " -> " + this.cliente.nif + "/" + this.cliente.nombre
        + " (" + (finAlquiler == null ? "EN CURSO" : "FINALIZADO") + ")";
  }

}
