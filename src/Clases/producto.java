
package Clases;

/**
 *
 * @author edgar
 */
public class producto {
    private static String codigo;
    private static String nombre;
    public producto(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public producto (){
    }
    public String getCodigo(){return codigo;} //para obtener los valores 
    public String getNombre() {return nombre;} 
    
    
    
}
