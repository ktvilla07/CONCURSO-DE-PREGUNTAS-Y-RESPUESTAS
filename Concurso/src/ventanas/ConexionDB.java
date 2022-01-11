
package ventanas;

import java.sql.*;
public class ConexionDB {
    Connection cn;
    
    public Connection conexion(){
       try{
        Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/concurso","root","123");
        System.out.println("Conexion exitosa");
    }catch(Exception e){
           System.out.println(e.getMessage());
    }return cn;
    }
    Statement createStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
    }
        
