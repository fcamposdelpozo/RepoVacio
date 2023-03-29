package programacion.negocios.banca;

public class CuentaBancaria {
  private String numeroCuenta;
  private String titular;
  private Float saldo;
  private String moneda;

  public CuentaBancaria(String numeroCuenta, String titular, Float saldo, String moneda) {
    this.numeroCuenta = numeroCuenta;
    this.titular = titular;
    this.saldo = saldo;
    this.moneda = moneda;
  }

  public void imprimeEstadoCuenta() {
    System.out.println("Cuenta " + numeroCuenta + ", titular: " + titular
        + ", saldo=" + saldo + " " + moneda);
  }

  public boolean retirarDinero(Float cantidad) {
    if (saldo >= cantidad) {
      saldo -= cantidad;
      return true;
    } else {
      return false;
    }
  }
}
