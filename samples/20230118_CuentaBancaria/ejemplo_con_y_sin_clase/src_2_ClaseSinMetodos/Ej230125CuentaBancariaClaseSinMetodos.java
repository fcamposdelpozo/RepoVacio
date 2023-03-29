public class Ej230125CuentaBancariaClaseSinMetodos {
  /*
  * Implementación con clases CuentaBancaria sin métodos
  */
  public static void main(String[] args) {
    System.out.println("===> EJECUTANDO Ej230125CuentaBancariaClaseSinMetodos");
    // 1. Creamos cuentaNomina
    // 3. Inicializamos sus "atributos"
    CuentaBancaria cuentaNomina = new CuentaBancaria();
    cuentaNomina.numeroCuenta = "01234567890123456789";
    cuentaNomina.titular = "Laura";
    cuentaNomina.saldo = 1500f;
    cuentaNomina.moneda = "EUR";

    // 4. Imprimimos estado cuentaNomina
    imprimeEstadoCuenta(cuentaNomina);

    // 6. Retiramos 500€ de la cuentaNomina
    Float cantidad = 500f;
    boolean resultado = retirarDinero(cuentaNomina, cantidad);
    if (resultado == true) {
      System.out.println("OK: Se han retirado " + cantidad + " de cuentaNomina");
    }
    else {
      System.out.println("ERROR: No se ha podido retirar " + cantidad 
                         + " de cuentaNomina, saldo insuficiente");
    }

    imprimeEstadoCuenta(cuentaNomina);

    System.out.println("bye, bye!");
  }

  static void imprimeEstadoCuenta(CuentaBancaria cuenta) {
    System.out.println("Cuenta " + cuenta.numeroCuenta
                      + ", titular: " + cuenta.titular
                      + ", saldo=" + cuenta.saldo
                      + " " + cuenta.moneda);
  }

  static boolean retirarDinero(CuentaBancaria cuenta, Float cantidad) {
    if (cuenta.saldo >= cantidad) {
      cuenta.saldo -= cantidad;
      return true;
    } else {
      return false;
    }
  }
}
