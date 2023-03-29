public class Ej230125CuentaBancariaConClase {
  /*
  * Implementación con clase CuentaBancaria
  */
  public static void main(String[] args) {
    System.out.println("===> EJECUTANDO Ej230125CuentaBancariaConClase");
    // 1. Creamos cuentaNomina
    // 3. Inicializamos sus "atributos"
    CuentaBancaria cuentaNomina = new CuentaBancaria("01234567890123456789",
                                                     "Laura", 1500f, "EUR");

    // 4. Imprimimos estado cuentaNomina
    cuentaNomina.imprimeEstadoCuenta();

    // 6. Retiramos 500€ de la cuentaNomina
    Float cantidad = 500f;
    boolean resultado = cuentaNomina.retirarDinero(cantidad);
    if (resultado == true) {
      System.out.println("OK: Se han retirado " + cantidad + " de cuentaNomina");
    }
    else {
      System.out.println("ERROR: No se ha podido retirar " + cantidad
                         + " de cuentaNomina, saldo insuficiente");
    }

    cuentaNomina.imprimeEstadoCuenta();

    System.out.println("bye, bye!");
  }
}
