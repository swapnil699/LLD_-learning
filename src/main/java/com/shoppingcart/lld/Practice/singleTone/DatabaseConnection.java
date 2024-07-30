package com.shoppingcart.lld.Practice.singleTone;


public class DatabaseConnection {
    private static DatabaseConnection instance = null;
    private String dburl;
    private String UserName;
    private  String Password;

    private DatabaseConnection(){

    }

    public static DatabaseConnection getInstance() throws RuntimeException{
        if(instance == null){
            //Synchronized(DatabaseConnection.class) {
                if(instance == null){
                    return new DatabaseConnection();
                }
           // }
        }
        return instance;
    }

}
