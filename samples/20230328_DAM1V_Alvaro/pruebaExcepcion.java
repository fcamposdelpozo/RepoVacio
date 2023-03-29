import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class pruebaExcepcion {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Alumno alvaro = new Alumno();
    String auxiliar = "";

    do{
      try{
        System.out.print("Introduce nombre alumno: ");
        auxiliar = in.nextLine();
      }catch(NoSuchElementException exc){
        System.out.println(exc);
      }
    }while(auxiliar.isEmpty() == true);
    
    alvaro.setNombre(auxiliar);
    
    
    Integer edad=null;

    do{
      try{
        System.out.print("Introduce la edad del alumno: ");
        edad = in.nextInt();
        alvaro.setEdad(edad);
      }catch(InputMismatchException exc){
        System.out.println(exc);
        in.nextLine();
      }
    }while(edad == null || edad < 0);

    alvaro.setEdad(edad);
    System.out.println("alvaro: " + alvaro);


  }
    /*
    Scanner in = new Scanner(System.in);
    int num;
    String newArray[] = new String[2];
    ArrayList<String> newArrayList = new ArrayList<String>();
    String nombre;

    do {
      try {
        System.out.println("Introduce un numero");
        num = in.nextInt();
        break;
      } catch (java.util.InputMismatchException exception) {
        System.out.println("ERROR! No has introducido un numero.");
        in.nextLine();
      }
    }while (num<5);

    in.nextLine();
    try {
      for (int i = 0; i < 5; i++) {
        System.out.println("Introduce un nombre de empleado");
        nombre = in.nextLine();
        newArrayList.add(nombre);
      }
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("No puedes ingresar mas empleados.");
    }

    System.out.println("**************************");
    for (int i = 0; i < newArrayList.size(); i++) {
      System.out.println(newArrayList.get(i));
    }

    System.out.println("*******************");
    System.out.println("El numero ingresado es " + num);
  }
   */
}
