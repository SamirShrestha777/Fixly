/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Database.MySqlConnector;
import java.sql.*;
import model.UserData;

/**
 *
 * @author Omne
 */
public class UserDao {
    MySqlConnector mysql = new MySqlConnector();
    public void createUser(UserData user){
          Connection conn= mysql.openConnection();
          String sql= "insert into users(username,email,password) values(?,?,?)";
        try(PreparedStatement pstm =  conn.prepareStatement(sql)){
            pstm.setString(1, user.getUsername());
            pstm.setString(2, user.getEmail());
            pstm.setString(3, user.getPassword());
            pstm.executeUpdate();
        }
        catch(Exception e){
        System.out.println(e);
        }
        finally{
            mysql.closeConnection(conn);
        }
    }
    
    
    
}
