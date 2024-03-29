/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Person.Entrepreneur;
import Person.Sponsor;

/**
 *
 * @author Rumeysa
 */
public class DbWrite {
    DbHelper db = new DbHelper();
    Connection connect = null;
    PreparedStatement statement = null;
    Statement statement2 = null;
    ResultSet resultset;
    public void addEntAccount(Entrepreneur entrepreneur){
       
        try {
            connect=db.getConnection();
             String query="INSERT INTO USERS(Area,UserName,Email,UserPassword) VALUES(?,?,?,?)";
             statement=connect.prepareStatement(query);
             statement.setString(1, entrepreneur.getWorkingArea());
             statement.setString(2,entrepreneur.getUserName());
             statement.setString(3,entrepreneur.getEmail());
             statement.setString(4,entrepreneur.getPassword());
             statement.executeUpdate();
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println( e.getMessage());
    }
        finally{
            try {
                statement.close();
                connect.close();
            } catch (SQLException e) {
                System.out.println("DataBase.DbWrite.addEntAccount()");
            }
        }
        }
    
     public void addSponsorAccount(Sponsor sponsor){
       
        try {
            connect=db.getConnection();
             String query="INSERT INTO SPONSOR(Area,CompanyName,CompanyMail,CompanyPassword) VALUES(?,?,?,?)";
             statement=connect.prepareStatement(query);
             statement.setString(1, sponsor.getWorkingArea());
             statement.setString(2,sponsor.getCompanyName());
             statement.setString(3,sponsor.getEmail());
             statement.setString(4,sponsor.getPassword());
             statement.executeUpdate();
            System.out.println("connected");
        } catch (SQLException e) {
            System.out.println( e.getMessage());
    }
        finally{
            try {
                statement.close();
                connect.close();
            } catch (SQLException e) {
                System.out.println("DataBase.DbWrite.addEntAccount()");
            }
        }
        }
   
}

        
