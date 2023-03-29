public class MainFactorial {
  public static void main(String[] args) {
    //int numero;
   
    System.out.println("args.length = " + args.length);
    for(String value: args){
      System.out.println("He recibido: " + value);
    }
    //numero = 400;
    //System.out.println("factorial("+numero+")="+ factorial(numero));
  }
  
  public static int factorial(int number) {
    if(number <= 1) {
      return 1;
    }
    return number*factorial(number-1);
  }
}
