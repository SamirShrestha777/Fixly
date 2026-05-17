package fixly;


import Database.db;
import Database.MySqlConnector;

public class Fixly {
    public static void main(String[] args) {
        db data = new MySqlConnector();

       if(data.openConnection() !=null){

           System.out.println("Connection succesful");

         

       }else{

           System.out.println("Not successful");
    }
}}
