public class Vehiculo {
  private String marca;
  private String modelo;
  private Integer posicionClienteAlquiler;

  public Vehiculo(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
  }

  @Override
  public String toString() {
    return String.format("%-6s | %-6s",marca, modelo);
  }
}
