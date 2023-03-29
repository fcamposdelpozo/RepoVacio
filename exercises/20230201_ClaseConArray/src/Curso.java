public class Curso{
  String nombre;
  String[] nombresAlumnos;
  float[] notas;
  int numAlumnos;
  int maxAlumnos;

  public Curso(String nombre, int maxAlumnos){
    this.nombre = nombre;
    this.maxAlumnos = maxAlumnos;
    this.numAlumnos = 0;
    nombresAlumnos = new String[maxAlumnos];
    notas = new float[maxAlumnos];
  }

  public boolean addAlumno(String nombreAlumno, float nota){
    /*
     * TODO: Implementa la lógica para comprobar si hay espacio en los arrays alumnos y notas.
     * Si hay espacio se añidirá un nuevo alumno con su nota y se devolverá true.
     * Si no hay espacio, se devolverá false.
     */
      return false;
  }
  
  public String toString(){
    String detalles;
    detalles = "Curso " + nombre +"\nTenemos " + numAlumnos + " alumnos (max="+maxAlumnos+").";

    for(int i=0; i< numAlumnos; i++){
      detalles += "\n" + (i+1) + ") Alumno: " + nombresAlumnos[i] + ", nota=" + notas[i];
    }
    return detalles;
  }
}