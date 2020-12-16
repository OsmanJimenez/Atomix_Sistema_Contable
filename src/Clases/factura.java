
package Clases;

/**
 *
 * @author edgar
 */
public class factura extends producto{
   private static int NumeroFactura;
   private static String Fecha;
   private static String Monto;
   private static Double Precio;
   private static int Cantidad;
   public factura( String Codigo,
           String Nombre,
           int NumeroFactura,
           String Fecha,
           Double Precio,
           int Cantidad)
   {
       super(Codigo, Nombre);
       this.NumeroFactura= NumeroFactura;
       this.Fecha = Fecha;
       this.Precio = Precio;
       this.Cantidad = Cantidad;
   }
   public factura () {}
   public int getNumeroFactura(){return NumeroFactura;}
   public String getFecha () {return Fecha;}
   public Double getPrecio() {return Precio;}
   public int getCantidad() {return Cantidad;}  
}
