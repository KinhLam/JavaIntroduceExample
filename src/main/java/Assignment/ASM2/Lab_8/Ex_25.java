package Assignment.ASM2.Lab_8;

import java.io.File;

class ConfigurationException extends Exception{
    public ConfigurationException(String s){
        super(s);
    }
}

class ConfigurationReader{
    public void readConfiguration(String configPath) throws ConfigurationException{
        File configFile = new File(configPath);
        if(!configFile.exists() || !configFile.canRead()){
            throw new ConfigurationException(configPath+" is not a valid configuration file");
        }
        System.out.println("Configuration read successful");
    }
}
public class Ex_25 {
    public static void main(String[] args) {
        ConfigurationReader reader = new ConfigurationReader();
        try {
            reader.readConfiguration("invalid.cfg");
        }catch (ConfigurationException e){
            System.out.println(e.getMessage());
        }
    }
}
