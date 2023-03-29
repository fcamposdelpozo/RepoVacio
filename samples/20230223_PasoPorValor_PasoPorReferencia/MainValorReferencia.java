public class MainValorReferencia {
  public static void main(String[] args) {

    float numeroPrimitivo;
    Decimal numeroObjeto = new Decimal();

    numeroPrimitivo = 3;
    numeroObjeto.setDecimal(3);

    System.out.println("numeroPrimitivo:     " + numeroPrimitivo);
    System.out.println("numeroObjeto:        " + numeroObjeto);

    duplica(numeroPrimitivo);
    duplicaDecimal(numeroObjeto);

    System.out.println("numeroPrimitivo:     " + numeroPrimitivo);
    System.out.println("numeroObjeto:        " + numeroObjeto);

  }

  public static void duplica(float decimalPrimitivo) {
    System.out.println("[duplica(float)] decimalPrimitivo = " + decimalPrimitivo);
    decimalPrimitivo = decimalPrimitivo * 2;
    System.out.println("[duplica(float)] decimalPrimitivo = " + decimalPrimitivo);
  }

  public static void duplicaDecimal (Decimal decimalReferencia) {
    System.out.println("[duplicaDecimal(Decimal)] decimalReferencia = " + decimalReferencia);
    
    decimalReferencia.setDecimal(decimalReferencia.getDecimal()*2);

    // float auxiliar = decimalReferencia.getDecimal();
    // auxiliar = 2*auxiliar;
    // decimalReferencia.setDecimal(auxiliar);
    
    System.out.println("[duplicaDecimal(Decimal)] decimalReferencia = " + decimalReferencia);
  }
}
