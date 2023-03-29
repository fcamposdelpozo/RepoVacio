import java.util.Arrays;

public class AgenciaAlquilerVehiculos {
  private String nombre;
  private Cliente clientes[];
  private Vehiculo vehiculos[];
  int numClientes;
  int numVehiculos;
  private static int numAlquileres = 2;

  public AgenciaAlquilerVehiculos(String nombre, int maxClientes, int maxVehiculos) {
    this.nombre = nombre;
    this.clientes = new Cliente[maxClientes];
    this.vehiculos = new Vehiculo[maxVehiculos];
  }

  @Override
  public String toString() {
    String cadena = "Agencia '" + nombre + "' (maxClientes=" + clientes.length 
                    + ", maxVehiculos=" + vehiculos.length + ")\n";
    
    cadena += numClientes + " clientes:\n";
    for(int i=0; i<numClientes; i++) {
      cadena += "\t" + i + ") " + clientes[i] + "\n";
    }
    
    cadena += numVehiculos + " vehiculos:\n";
    for(int i=0; i<numVehiculos; i++) {
      cadena += "\t" + i + ") " + vehiculos[i] + "\n";
    }
    return cadena;
  }

  public boolean addCliente(String nombre, String apellido){
    if(numClientes >= clientes.length) {
      System.out.println("ERROR: No hay espacio para más clientes");
      return false;
    }
    clientes[numClientes] = new Cliente(nombre, apellido);
    numClientes++;
    return true;
  }

  public boolean addVehiculo(String marca, String modelo){
    if(numVehiculos >= vehiculos.length) {
      System.out.println("ERROR: No hay espacio para más vehiculos");
      return false;
    }

    vehiculos[numVehiculos] = new Vehiculo(marca, modelo);
    numVehiculos++;
    return true;
  }

  public boolean alquilar(int posCliente, int posVehiculo){
    numAlquileres++;
  }
  
}
