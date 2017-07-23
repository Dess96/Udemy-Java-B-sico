/*Conversion de tipos en Java
 * Autora: Denisse Alfaro
 * 2017*/
public class EjemploConversiones{
  public static void main(String[] args) throws Exception{
    int a = 5;
    int b = 7;
    double c = 0.5;
    String s = "7";
    
    c = a; //Implícita
    a = (int)c; //Casting
    b = Integer.parseInt(s);
   
    
    
    
  }
}