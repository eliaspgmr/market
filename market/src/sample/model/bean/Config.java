package sample.model.bean;

import sample.model.RWConfig;

/**
 * Market
 * Class Bean Config
 * @author Elias Ferreira
 */
public class Config {
    
    private static String user;
    private static String password;
    private static String server;
    private static String port;
    
    public static void start() {
        
        String[] data= RWConfig.read();
        
        user     = data[0];
        password = data[1];
        server   = data[2];
        port     = data[3];
        
    }

    public static String getUser() {
        return user;
    }

    public static String getPassword() {
        return password;
    }

    public static String getServer() {
        return server;
    }

    public static String getPort() {
        return port;
    }
    
}
