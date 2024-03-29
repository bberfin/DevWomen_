/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Person.Entrepreneur;
import Person.Sponsor;
import java.sql.SQLException;


public class DbAccess {
      DbHelper db = new DbHelper();
		Connection connect = null;
		Statement statement = null;
		ResultSet resultset;
                
                public Entrepreneur entrepreneur(String email,String password){
                    Entrepreneur entrepreneur= null;
                    try {
                        connect=db.getConnection();
                        statement=connect.createStatement();
                        resultset=statement.executeQuery("select*from USERS");
                        while(resultset.next()){
                            if(resultset.getString("Email").equals(email)&&resultset.getString("Userpassword").equals(password)){
                                return entrepreneur;
                                /******************/
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("DataBase.DbAccess.entrepreneur()");
                    }
                    finally{
                        try {
                            connect.close();
                        } catch (SQLException e) {
                            System.out.println("DataBase.DbAccess.entrepreneur()");
                        }
                    }
          return null;
                }
             
                public Entrepreneur getData(String email,String password){
                    Entrepreneur entrepreneur=null;
                     try {
                    connect = db.getConnection();
                    statement = connect.createStatement();
                    resultset=statement.executeQuery("select * from USERS");
  
                    while (resultset.next()) {

				if(resultset.getString("Email").equals(email)&&resultset.getString("Userpassword").equals(password)){

                          entrepreneur = new Entrepreneur( resultset.getString("UserName"),resultset.getString("Area"), resultset.getString("Email"), resultset.getString("Userpassword"));
                            
                           return entrepreneur;
                        }}
                    if (entrepreneur==null)
                    { 
                    return null;}
            
        } catch (SQLException e) {
                    System.out.println(e.getErrorCode());
                   
        } finally {
                    try {
				connect.close();
			} catch (SQLException e2) {
				System.out.println("DataBase.DbAccess.getData()");
			}
        }
                return null;
                    
                }
 public Sponsor sponsor(String email,String password){
                    Sponsor sponsor= null;
                    try {
                        connect=db.getConnection();
                        statement=connect.createStatement();
                        resultset=statement.executeQuery("select*from SPONSOR");
                        while(resultset.next()){
                            if(resultset.getString("CompanyMail").equals(email)&&resultset.getString("CompanyPassword").equals(password)){
                                return sponsor;
                                
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("DataBase.DbAccess.sponsor()");
                    }
                    finally{
                        try {
                            connect.close();
                        } catch (SQLException e) {
                            System.out.println("DataBase.DbAccess.sponsor()");
                        }
                    }
          return null;
                }
             
                public Sponsor getSponsorData(String email,String password){
                    Sponsor sponsor=null;
                     try {
                    connect = db.getConnection();
                    statement = connect.createStatement();
                    resultset=statement.executeQuery("select * from SPONSOR");
  
                    while (resultset.next()) {

				if(resultset.getString("CompanyMail").equals(email)&&resultset.getString("CompanyPassword").equals(password)){

                          sponsor = new Sponsor( resultset.getString("CompanyName"),resultset.getString("WorkingArea"), resultset.getString("CompanyMail"), resultset.getString("CompanyPassword"));
                            
                           return sponsor;
                        }}
                    if (sponsor==null)
                    { 
                    return null;}
            
        } catch (SQLException e) {
                    System.out.println(e.getErrorCode());
                   
        } finally {
                    try {
				connect.close();
			} catch (SQLException e2) {
				System.out.println("DataBase.DbAccess.getData()");
			}
        }
                return null;
                    
                }

 
                
                
                
                
}
