/*Grupo crea un arreglo de objetos tipo Alumno
 * Autora: Denisse Alfaro
 * 2017*/
public class Grupo{
  private String codigo;
  
  Alumno1[] array;
  
  public Grupo(){
    array = new Alumno1[5];
    
    for(int i=0; i <5; i++){
      array[i] = new Alumno1();
    
    }
  }
  
  
  
}