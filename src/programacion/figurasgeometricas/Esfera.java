package programacion.figurasgeometricas;

public class Esfera extends FiguraRedonda {

  public Esfera() {
    System.out.println("Construyendo esfera");
  }

  public String detailsToString() {
    return String.format("Soy una esfera y mi volumen es %.2f",(4.0 / 3.0 * radio * Math.pow(Math.PI, 3)));
  }

}
