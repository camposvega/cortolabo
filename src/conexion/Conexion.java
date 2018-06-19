/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;

/**
 *
 * @author LN710Q
 */
public class Conexion {

    public static Conexion getInstance() {
        return instance;
    }

    public static void setInstance(Conexion aInstance) {
        instance = aInstance;
    }
    private String user;
    private String pass;
    private String driver;
    private String url;
    
    private Connection cnx;
    
    private static Conexion instance;
    
    public synchronized static Conexion conectar(){
        if(instance == null) return new Conexion();
        return instance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Connection getCnx() {
        return cnx;
    }

    public void setCnx(Connection cnx) {
        this.cnx = cnx;
    }
}
