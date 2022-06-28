/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Daniel Xithe
 */
public class ConexionBase {
    Connection conectar = null;
    Statement sentencia=null;
    ResultSet resultado=null;
    public ConexionBase(){
        try {
            String rutaDb="C:\\Users\\Daniel Xithe\\Documents\\covidSystem.accdb";
            String url="jdbc:ucanaccess://"+rutaDb;
            conectar=DriverManager.getConnection(url);
            sentencia=conectar.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: "+e);
        }
    }
public Connection getConnection(){
    return conectar;
}
}
