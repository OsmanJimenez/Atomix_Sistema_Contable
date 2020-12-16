/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestor;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yohann
 */
public class conexion {
    private static Connection conn;
private static final String driver="com.mysql.jdbc.Driver";
private static final String user="osman";
private static final String password="armando9812";
private static final String url="jdbc:mysql://localhost:3306/contabilidad";

    public conexion() {
        conn=null;
        try{
        Class.forName(driver);
        conn=(Connection) DriverManager.getConnection(url,user,password);
        if(conn != null){
        System.out.println("Conexion establecida");
        }
        }catch(ClassNotFoundException | SQLException e){
        System.out.println("error al conectar"+e);
        
        }
    }
    public Connection getConnection(){
    return conn;
    }
    public void desconectar(){
    conn=null;
    if(conn==null){
    System.out.println("...");
    }
    }
}
