Programación Orientada a Objetos (POO)
===

## Conceptos Principales POO
La programación orientada a objetos (POO) es un paradigma de programación que se basa en el concepto de "objetos", los cuales pueden ser vistos como instancias de una "clase". Una clase es una plantilla para crear objetos, y define las propiedades (_atributos_) y comportamientos (_métodos_) que tendrán estos objetos.

## Glosario de términos comunes de POO:
* Clase: Una plantilla para crear objetos.
* Objeto: Una instancia de una clase.
* Atributo: Una propiedad o característica de un objeto.
* Método: Un comportamiento o acción que puede realizar un objeto.
* Encapsulamiento: La idea de ocultar los detalles internos de un objeto y sólo proporcionar una interfaz pública para interactuar con él.
* Herencia: La posibilidad de crear una clase a partir de otra clase existente, heredando sus propiedades y comportamientos.
* Polimorfismo: La capacidad de un objeto para ser tratado como una instancia de su clase o de cualquiera de sus clases base.

También se puede pensar en una clase como la definición de un nuevo tipo de dato que contiene a su vez otras variables y objetos.


### Ejemplos
* Clase Perro
  ```java
  public class Perro {
    // Atributos de la clase
    public String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza){
      this.nombre = nombre;
      this.edad = edad;
      this.raza = raza;
    }

    public void imprimeDetalles(){
      String descripcion = nombre + " es de raza " + raza
                          + " y tiene " + edad + " años";
      System.out.println(descripcion);
    }
  }
  ```
  Perro es un nuevo tipo de dato que agrupa un objeto de tipo String llamado _nombre_, una variable de tipo int llamada _edad_ y otro objeto de tipo String llamado _raza_.

  Cada vez que se cree un nuevo objeto de tipo Perro, una instancia de la clase Perro, estaremos creando 2 referencias de tipo String y 1 variable int, encapsuladas dentro del nombre o identificador de ese objeto.

* Objeto/Instancia de Perro
  ```java
  public class EjemploPerro {
    public static void main(String[] args) {
      Perro milu;
      milu = new Perro("Milu", 94, "grand fox terrier");
      Perro lassie = new Perro("Lassie", 85, "collie");

      System.out.println("Hemos creado dos perros: " + milu.nombre
                        + " y " + lassie.nombre);
      milu.imprimeDetalles();
      lassie.imprimeDetalles();
    }
  }
  ```

  En el ejemplo anterior se crean 2 objetos de tipo Perro, uno llamado milu y otro llamado lassie, y se llama al método imprimeDetalles() para cada uno de los perros.

* Compilación ficheros java, generación ficheros class, ejecución EjemploPerro:  
  ```bash
  $ javac Perro.java
  $ javac EjemploPerro.java
  $ ls
  EjemploPerro.class  EjemploPerro.java  Perro.class  Perro.java
  $ java EjemploPerro
  Hemos creado dos perros: Milu y Lassie
  Milu es de raza grand fox terrier y tiene 94 años
  Lassie es de raza collie y tiene 85 años
  ```

## Declaración vs Creación/Instanciación de un objeto
La **declaración** de un objeto implica la creación de una variable o identificador del tipo de la clase usada. Este tipo de variables también se llaman **referencias**, en otros lenguajes se llaman punteros. En el ejemplo anterior hemos declarado la variable milu, que es una referencia a un objeto de tipo Perro, mediante la línea:
 ```java
Perro milu;
```
Y posteriormente hemos creado/instanciado el objeto llamando al constructor con *new*. 
```java
milu = new Perro("Milu", 94, "grand fox terrier");
```
Hasta ese momento, *milu* era una referencia a un objeto de tipo Perro, pero su valor no estaba inicializado. En Java no se puede acceder a una variable sin inicializar, ya sea de tipo primitivo o de alguna clase. Si lo intentamos se produce un error de compilación:
```java
Perro milu;
int numero;

System.out.println("milu: " + milu);
System.out.println("numero=" + numero);
```
El código anterior produce estos errores de compilación:
```
$ javac EjemploPerro.java 
EjemploPerro.java:6: error: variable milu might not have been initialized
    System.out.println("milu: " + milu);
                                  ^
EjemploPerro.java:7: error: variable numero might not have been initialized
    System.out.println("numero=" + numero);
                                   ^
2 errors
```

Cuando una referencia a un objeto es un atributo de una clase, el constructor por defecto lo inicializa por defecto a *null*. De igual manera el constructor por defecto inicializa las variables numéricas a 0 y las boolean a false. Siguiendo con el ejemplo anterior, podríamos haber inicializado la referencia *milu* y la variable *numero* a sus valores por defecto:
```java
Perro milu=null;
int numero=0;

System.out.println("milu: " + milu);
System.out.println("numero=" + numero);
```
La ejecución de este código produciría esta salida:
```
milu: null
numero=0
```

Para ver un ejemplo del *constructor por defecto*, podemos considerar la siguiente clase *Gato*:
```java
public class Gato{
  String nombre;
  String color;
  int numeroPatas;

  public void imprimeDetalles(){
    System.out.println("El gato " + nombre + " es de color " 
                       + color + " y tiene " + numeroPatas + " patas");
  }
}
```
Si en el método *main* creásemos el gato *garfield* y llamásemos a su método *imprimeDetalles* de la siguiente manera:
```java
public class EjemploGato {
  public static void main(String[] args) {
    Gato garfield= new Gato();
    garfield.imprimeDetalles();
  }
}
```
Estaríamos utilizando el *constructor por defecto*. Este es un constructor *vacío* (no recibe ningún argumento) generado por Java al compilar una clase que no tiene ningún constructor definido. Si la clase *Gato* hubiese definido **al menos un constructor**, Java no generaría el constructor por defecto vacío.

Por tanto, con el código `new Gato()` estaríamos llamando al constructor por defecto de la clase Gato, que ha sido generado por Java. Lo único que hace este constructor es inicializar los atributos a sus valores por defecto comentados más arriba: referencias a objetos a *null*, boolean's a *false* y variables numéricas a 0.

Por tanto, el código main anterior produciría la siguiente salida:
```
$ java EjemploGato 
El gato null es de color null y tiene 0 patas
```

## Referencia a los elementos (atributos o métodos) de un objeto
Para referirnos a los elementos de un objeto hay que seguir una sintaxis concreta: se utilizará el identificador, o nombre de variable, del objeto, seguido del caracter punto '.'. Después del punto puede venir un atributo o un método. La forma de distinguirlos es con los paréntesis: al hacer referencia a un método, siempre hay que especificar los paréntesis después del nombre del método, aunque no reciba parámetros. Al referirnos a un atributo, utilizaremos el nombre del atributo sin paréntesis.

En el ejemplo anterior, para hacer referencia al atributo *nombre*, hemos utilizado el identificador (*milu* y *lassie*) seguido de un punto ('.') y el nombre del atributo:

En cambio, para llamar al método *imprimeDetalles*, hemos utilizado el identificador, el punto y el nombre del método **seguido de paréntesis** a pesar de que el método no recibe parámetros. Estos paréntesis son lo que nos permite saber que se trata de una llamada a un método, aunque no conociésemos la implementación de la clase Perro.

```java
System.out.println("Hemos creado dos perros: " 
                   + milu.nombre + " y " + lassie.nombre);
milu.imprimeDetalles();
lassie.imprimeDetalles();
```
