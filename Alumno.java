/*Objeto tipo Alumno con sus atributos y metodos
 * Autora: Denisse Alfaro
 * 2017*/
public class Alumno{
  private String nombre;
  private String apellidos;
  private String dni;
  private String telefono;
  
  public String getNombre(){
    return nombre;
  }
  
  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  
   public String getApellidos(){
    return apellidos;
  }
  
  public void setApellidos(String apellidos){
    this.apellidos = apellidos;
  }
  
   public String getDni(){
    return dni;
  }
  
  public void setDni(String dni){
    this.dni = dni;
  }
  
   public String getTelefono(){
    return telefono;
  }
  
  public void setTelefono(String telefono){
    this.telefono = telefono;
  }
}