/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrodelazapateria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author nicol
 */
public class Conexion {
    public Connection getConnection() throws SQLException {
    String url = "jdbc:mysql://localhost:3306/nombre_de_la_base_de_datos";
    String usuario = "tu_usuario";
    String contraseña = "tu_contraseña";
    
    Connection con = DriverManager.getConnection(url, usuario, contraseña);
    return con;
}

}
