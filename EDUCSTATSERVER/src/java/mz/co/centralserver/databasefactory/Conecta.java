package mz.co.centralserver.databasefactory;

import java.sql.*;

public class Conecta
{
    /*Variaveis da coneccao*/
  public static String user, password;
  
  public static Connection _abrirConeccao(String user, String password)
  {
    Connection conn = null;
    
    Conecta.user  = user;
    Conecta.password = password;
    try
    {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      
      String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
      
      conn = DriverManager.getConnection(url,user,password);
  
      System.out.println("Coneção aberta.");

    }catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e) { System.out.println(e.getMessage());} 
    
    
    return conn;
  }
  
  public static void _fecharConeccao(Connection conn)
  {
    try 
    {
          conn.close();
          
          System.out.println("Conecção fechada.");
    } catch (SQLException e) { System.out.println(e.getMessage());} 
      

  }
}
