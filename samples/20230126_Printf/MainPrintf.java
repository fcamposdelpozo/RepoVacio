import java.util.Scanner;

/*
 * OjO!! En este fichero se ignoran las reglas de la guía de estilo respecto al máximo de 100
 * caracteres por línea para facilitar la escritura y la lectura del fichero.
 */
public class MainPrintf {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("\n===> MainPrintf");
    System.out.println("");
    System.out.println("  Se recomienda consultar la documentación disponible en las siguientes webs:");
    System.out.println("   [1] https://www.it.uc3m.es/pbasanta/asng/course_notes/input_output_printf_es.html");
    System.out.println("   [2] http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-printf.html");
    System.out.println("");
    System.out.println("Vamos a jugar con las distintas opciones de printf. La especificación del formato sirve también para el método String.format()");
    System.out.println("El formato hacer referencia a las variables con el símbolo '%'' seguido de la letra correspondiente al tipo de dato que queremos imprimir.");
    System.out.println("Ejemplos:");
    System.out.println("  - Para imprimir la variable entero de tipo int utilizaremos 'printf(\"%d\", entero)'");
    System.out.println("  - Para la variable decimal de tipo float usamos 'printf(\"%f\", decimal)'");
    System.out.println("Si queremos imprimir el caracter '%' necesitaremos especificarlo 2 veces: printf(\"%%\")");
    System.out.println();
    System.out.println("Entre el símbolo '%'' y el caracter que especifica el tipo, se pueden especificar otros detalles para las variables numéricas.");
    System.out.println();
    System.out.println("%[<flags>][<ancho-mínimo>][.<precision>]<caracter-tipo>");
    System.out.println();
    System.out.println("  * caracter-tipo: en estos ejemplos se utilizará 'd' para int y 'f' para float. Para otros tipos de dato consultar la documentación del enlace [1]");
    System.out.println("  * precision: número de decimales que se imprimiran cuando el tipo sea float o double.");
    System.out.println("  * ancho-mínimo: si el número a imprimir ocupa menos caracteres que los indicados en ancho-mínimo, se rellenará hasta que ocupe ese mínimo. Si se imprime el caracter '+' o '-' para indicar el signo, se cuenta para calcular el ancho, al igual que el '.' que separa la parte entera de la parte decimal. Por defecto se rellena con espacios por la izquierda.");
    System.out.println("  * flags:");
    System.out.println("    - '+': fuerza que se imprima el signo también para números positivos. Por defecto sólo se imprime cuando son negativos.");
    System.out.println("    - '-': justifica a la izquierda, es decir, se rellena con espacios por la derecha, después de imprimir, y no antes.");
    System.out.println("    - '0': se rellena con ceros a la izquierda en vez de con espacios.");
    System.out.println("");
    System.out.println("Vamos a ver unos cuantos ejemplos...");

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    float decimalPositivo = 2.537432987f;
    float decimalNegativo = -12.1569432f;
    int enteroPositivo = 2300;
    int enteroNegativo = -157;

    System.out.println("Hemos definido las siguientes variables:");
    System.out.println();
    System.out.println("float decimalPositivo = 2.537432987f;");
    System.out.println("float decimalNegativo = -12.1569432f;");
    System.out.println("int enteroPositivo = 2300;");
    System.out.println("int enteroNegativo = -157;");

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir el float decimalPositivo con distintas opciones:");
    System.out.println("println(\"decimalPositivo=\" + decimalPositivo\")-> decimalPositivo=" + decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=%%f\", decimalPositivo\")-> decimalPositivo=%f\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=%%.3f\", decimalPositivo\")-> decimalPositivo=%.3f\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=%%.30f\", decimalPositivo\")-> decimalPositivo=%.30f\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%10f|\", decimalPositivo\")-> decimalPositivo=|%10f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%010f|\", decimalPositivo\")-> decimalPositivo=|%010f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%10.3f|\", decimalPositivo\")-> decimalPositivo=|%10.3f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%010.3f|\", decimalPositivo\")-> decimalPositivo=|%010.3f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%+10.3f|\", decimalPositivo\")-> decimalPositivo=|%+10.3f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%+010.3f|\", decimalPositivo\")-> decimalPositivo=|%+010.3f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%-10.3f|\", decimalPositivo\")-> decimalPositivo=|%-10.3f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%-+10.3f|\", decimalPositivo\")-> decimalPositivo=|%-+10.3f|\n", decimalPositivo);
    System.out.printf("printf(\"decimalPositivo=|%%+-10.3f|\", decimalPositivo\")-> decimalPositivo=|%+-10.3f|\n", decimalPositivo);

    System.out.println("Fijaos en que cuando se imprime el sigo, positivo o negativo, éste se cuenta como caracter para calcular cuánto hay que rellenar. El punto que separa la parte entera de la parte decimal también se cuenta.");
    System.out.println("He añadido el caracter '|' delante y detrás del número cuando se especifica ancho mínimo para facilitar contar los caracteres de relleno y para que se vea si se ha rellenado con espacios o con ceros, justificando a la derecha o a la izquierda. Fijaos también en que se pueden utilizar los flag '+' y '-' simultáneamente, sin que afecte el orden en el que se escriban.");

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir el float decimalNegativo con las mismas opciones que antes:");
    System.out.println("println(\"decimalNegativo=\" + decimalNegativo\")-> decimalNegativo=" + decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=%%f\", decimalNegativo\")-> decimalNegativo=%f\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=%%.3f\", decimalNegativo\")-> decimalNegativo=%.3f\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=%%.30f\", decimalNegativo\")-> decimalNegativo=%.30f\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%10.3f|\", decimalNegativo\")-> decimalNegativo=|%10.3f|\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%010.3f|\", decimalNegativo\")-> decimalNegativo=|%010.3f|\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%+10.3f|\", decimalNegativo\")-> decimalNegativo=|%+10.3f|\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%+010.3f|\", decimalNegativo\")-> decimalNegativo=|%+010.3f|\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%-10.3f|\", decimalNegativo\")-> decimalNegativo=|%-10.3f|\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%-+10.3f|\", decimalNegativo\")-> decimalNegativo=|%-+10.3f|\n", decimalNegativo);
    System.out.printf("printf(\"decimalNegativo=|%%+-10.3f|\", decimalNegativo\")-> decimalNegativo=|%+-10.3f|\n", decimalNegativo);

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir la variable enteroPositivo, de tipo int:");
    System.out.println("println(\"enteroPositivo=\" + enteroPositivo\")-> enteroPositivo=" + enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=%%d\", enteroPositivo\")-> enteroPositivo=%d\n", enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=|%%10d|\", enteroPositivo\")-> enteroPositivo=|%10d|\n", enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=|%%010d|\", enteroPositivo\")-> enteroPositivo=|%010d|\n", enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=|%%+10d|\", enteroPositivo\")-> enteroPositivo=|%+10d|\n", enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=|%%-10d|\", enteroPositivo\")-> enteroPositivo=|%-10d|\n", enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=|%%-+10d|\", enteroPositivo\")-> enteroPositivo=|%-+10d|\n", enteroPositivo);
    System.out.printf("printf(\"enteroPositivo=|%%+-10d|\", enteroPositivo\")-> enteroPositivo=|%+-10d|\n", enteroPositivo);

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir la variable enteroNegativo, de tipo int. El flag + con números negativos no tiene efecto porque ya se imprime su signo siempre:");
    System.out.println("println(\"enteroNegativo=\" + enteroNegativo\")-> enteroNegativo=" + enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=%%d\", enteroNegativo\")-> enteroNegativo=%d\n", enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=|%%10d|\", enteroNegativo\")-> enteroNegativo=|%10d|\n", enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=|%%010d|\", enteroNegativo\")-> enteroNegativo=|%010d|\n", enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=|%%+10d|\", enteroNegativo\")-> enteroNegativo=|%+10d|\n", enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=|%%-10d|\", enteroNegativo\")-> enteroNegativo=|%-10d|\n", enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=|%%-+10d|\", enteroNegativo\")-> enteroNegativo=|%-+10d|\n", enteroNegativo);
    System.out.printf("printf(\"enteroNegativo=|%%+-10d|\", enteroNegativo\")-> enteroNegativo=|%+-10d|\n", enteroNegativo);

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir una hora con y sin formato:");
    System.out.println();
    System.out.println("int hora=2;");
    System.out.println("int minuto=5;");
    System.out.println("int segundo=7;");

    int hora=2;
    int minuto=5;
    int segundo=7;

    System.out.println("println(\"Hora=\" + hora + \":\" + minuto + \":\" + segundo)-> Hora=" + hora + ":" + minuto + ":" + segundo);
    System.out.printf("printf(\"Hora=%%d:%%d:%%d\", hora, minuto, segundo)-> Hora=%d:%d:%d\n", hora, minuto, segundo);
    System.out.printf("printf(\"Hora=%%02d:%%02d:%%02d\", hora, minuto, segundo)-> Hora=%02d:%02d:%02d\n", hora, minuto, segundo);

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir todos los posibles valores de un byte en decimal y hexadecimal:");
    for(int i=0;i<256;i++){
      if(i%16==0){
        System.out.println();
        System.out.printf("|");
      }
      System.out.printf("%3d->%-2X| ", i, i);
    }
    System.out.println();

    System.out.println("\nPulsa ENTER para continuar...");
    scanner.nextLine();

    System.out.println("Vamos a imprimir la tabla de multiplicar del 13,73 de 0 a 15, con 2 decimales:");

    //Tabla de multiplicar del 19.5
    float multiplicando = 13.73f;
    System.out.printf("______________________\n");
    for (int i=0; i<=15; i++){
      //System.out.println("15 x " + i + " = " + 15*i);
      System.out.printf("| %.2f x %2d = %6.2f |\n", multiplicando, i, multiplicando*i);
    }
    System.out.printf("|_____________________|\n");

    scanner.close();
    System.out.println("bye, bye!");
  }

}
