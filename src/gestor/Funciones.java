
package gestor;

import auxilia.*;
import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Funciones {
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    private ResultSetMetaData rsm;
    DefaultTableModel dtm;
    
    
 
    private Connection getConexion()throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        cn=DriverManager.getConnection("jdbc:mysql://localhost/contabilidad","osman","armando9812");
        return cn; 
    }
    
    public void llenarTabla(JTable jTable1)throws Exception{
        ps=getConexion().prepareStatement("select codigo, nombre , Naturaleza from auxiliares"); 
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);
                
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)jTable1.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
        
    }
    public void llenarTabla2(JTable jTable1)throws Exception{
        ps=getConexion().prepareStatement("select Codigo, Correo , Nombre, Producto, Telefono from provedor2"); 
        rs=ps.executeQuery();
        rsm=rs.getMetaData();
        ArrayList<Object[]> datos=new ArrayList<>();
        while (rs.next()) {            
            Object[] filas=new Object[rsm.getColumnCount()];
            for (int i = 0; i < filas.length; i++) {
                filas[i]=rs.getObject(i+1);
                
            }
            datos.add(filas);
        }
        dtm=(DefaultTableModel)jTable1.getModel();
        for (int i = 0; i <datos.size(); i++) {
            dtm.addRow(datos.get(i));
        }
        
    }
}
