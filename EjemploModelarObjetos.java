/*Clase principal que crea objetos tipos Alumno y tipo Libro. Además del uso de algunos de sus metodos
 * Autora: Denisse Alfaro
 * 2017*/
public class EjemploModelarObjetos{
  
  public static void main(String[] args){
    Alumno al = new Alumno();
    al.setNombre("Ion");
    Libro lib = new Libro();
    lib.abrir();
    lib.cerrar();
  }
}