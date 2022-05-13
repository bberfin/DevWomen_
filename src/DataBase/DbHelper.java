<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Rumeysa
 */
public class DbHelper {
    private String userName="root";
    private  String password="Rumeysa06.";
    private String port="jdbc:mysql://localhost:3306/devwomen";
    
    public Connection getConnection()throws SQLException{
        
        return DriverManager.getConnection(port,userName,password);
        
    }
    public void showErrorMessage(SQLException e){
        System.out.println("DataBase.DbHelper.showErrorMessage() "+e.getMessage() +" "+e.getErrorCode());
    }

  

}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
/**
 *
 * @author Rumeysa
 */
public class DbHelper {
    private String userName="root";
    private String password="Rumeysa06.";
    private String port="jdbc:mysql://localhost:3306/devwomen";
    
    public Connection getConnection()throws SQLException{
        
        return (Connection) DriverManager.getConnection(port,userName,password);
        
    }
    public void showErrorMessage(SQLException e){
        System.out.println("DataBase.DbHelper.showErrorMessage() "+e.getMessage() +" "+e.getErrorCode());
    }


}
>>>>>>> b4ecd2cfa4fd571fa8586c2d4c6a90829b2b7643
