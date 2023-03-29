import programacion.figurasgeometricas.*;


public class MainFigurasRedondas {
  public static void main(String[] args) {
    Circulo circulo = new Circulo();
    Esfera esfera = new Esfera();

    circulo.setRadio(1);
    esfera.setRadio(2);

    System.out.println(circulo);
    System.out.println(esfera);
  }
}