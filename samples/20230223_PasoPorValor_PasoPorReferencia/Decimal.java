public class Decimal {
  private float decimal;

  public Decimal() {
    System.out.println("[Decimal]: " + this);
  }

  public float getDecimal() {
    return decimal;
  }
  public void setDecimal(float decimal) {
    this.decimal = decimal;
  }
  
  @Override
  public String toString() {
    return "["+super.toString()+"] decimal=" + decimal;
  }
}
