public class Ej230125CuentaBancariaSinClase {
  public static void main(String[] args) {
    System.out.println("===> EJECUTANDO Ej230125CuentaBancariaSinClase");

    // 1. Creamos cuentaNomina
    // 3. Inicializamos sus "atributos"
    String numeroDeCuentaNomina = "01234567890123456789";
    String titularCuentaNomina = "Laura";
    Float saldoCuentaNomina = 1500f;
    String monedaCuentaNomina = "EUR";

    // 4. Imprimimos estado cuentaNomina
    imprimeEstadoCuenta(numeroDeCuentaNomina, titularCuentaNomina,
                        saldoCuentaNomina, monedaCuentaNomina);

    // 6. Retiramos 500€ de la cuentaNomina
    Float cantidad = 500f;
    boolean resultado = retirarDinero(saldoCuentaNomina, cantidad);
    if (resultado == true) {
      saldoCuentaNomina -= cantidad;
      System.out.println("OK: Se han retirado " + cantidad + " de cuentaNomina");
    }
    else {
      System.out.println("ERROR: No se ha podido retirar " + cantidad
                         + " de cuentaNomina, saldo insuficiente");
    }

    imprimeEstadoCuenta(numeroDeCuentaNomina,
                        titularCuentaNomina,
                        saldoCuentaNomina,
                        monedaCuentaNomina);

    System.out.println("bye, bye!");
  }

  static void imprimeEstadoCuenta(String numeroCuenta,
                                  String titular,
                                  Float saldo,
                                  String moneda) {
    System.out.println("Cuenta " + numeroCuenta + ", titular: " + titular
                       + ", saldo=" + saldo + " " + moneda);
  }

  static boolean retirarDinero(Float saldoCuenta, Float cantidad) {
    if (saldoCuenta >= cantidad) {
      return true;
    }
    else {
      return false;
    }
  }

}
