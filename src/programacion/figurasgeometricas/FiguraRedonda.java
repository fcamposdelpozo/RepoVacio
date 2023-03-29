package programacion.figurasgeometricas;

public abstract class FiguraRedonda {
  float radio;

  public FiguraRedonda(){
    System.out.println("Construyendo figuraRedonda");
  }

  public void setRadio(float radio) {
    this.radio=radio;
  }
  
  public abstract String detailsToString();

  @Override
  public String toString() {
    return detailsToString();
  }

  
}
