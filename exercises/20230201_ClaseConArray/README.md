## Ejercicio ClaseConArray

En este ejercicio vamos a ver cómo se manejan las clases que contienen arrays como atributos.

Se proporcionan 2 ficheros Java:

1. Curso.java: Define la clase Curso, que tiene como atributos:
  
   1. *String nombre* -> Nombre del curso
   2. *String[] nombresAlumnos* -> Array de Strings para almacenar los nombres de los alumnos
   3. *float[] notas* -> Array de floats para almacenar las notas de cada uno de los alumnos
   4. *int numAlumnos* -> Número entero que representa el número de alumnos registrados en el curso
   5. *int maxAlumnos* -> Número entero con el máximo de alumnos que se pueden almacenar. Este es también el tamaño de los arrays *nombresAlumnos* y *notas*

    También encontramos los siguientes métodos:
    1. El constructor *Curso(String nombre, int maxAlumnos)*. Revisar la implementación para ver cómo se inicializan los atributos de la clase Curso, en especial los arrays y las variables *numAlumnos* y *maxAlumnos*
    2. *String toString()* que nos permite imprimir fácilmente los detalles del curso
    3. El método *boolean addAlumno(String nombreAlumno, float nota)*: Este método es el que debéis implementar para permitir añadir alumnos, guardando el nombre y la nota de cada alumno en el array correspondiente mientras haya espacio.

2. ClaseConArray.java: Implementa el método main y ejecuta las siguientes acciones:
   1. Crea el objeto daw1v de tipo Curso en la siguiente línea:
      ```java
      Curso daw1v = new Curso("DAW1V", 3);
      ```
   2. Llama 4 veces al método *addAlumno(String, float)* de la siguiente forma: `if(daw1v.addAlumno(nombre, nota))`. *nombre* y *nota* van cambiando antes de cada llamada.
      
      En caso de devolver *true*, se imprime un resumen del estado del curso: `System.out.println(daw1v);`
      
      En caso de devolver *false*, se muestra un mensaje de error:
      ```
      ===> ClaseConArray

      Pulsa ENTER para continuar...

      ERROR: No se ha podido añadir el alumno Pedro con nota 5.8 al curso DAW1V
      Pulsa ENTER para continuar...

      ERROR: No se ha podido añadir el alumno María con nota 7.9 al curso DAW1V
      Pulsa ENTER para continuar...
        ```



