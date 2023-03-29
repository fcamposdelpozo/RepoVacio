package programacion.figurasgeometricas;
public class Circulo extends FiguraRedonda {


  public Circulo() {
    System.out.println("Construyendo circulo");
  }

  @Override
  public String detailsToString() {
    return String.format("Soy un círculo y mi superficie es %.2f", (radio * Math.pow(Math.PI,2)));
  }
  
}
