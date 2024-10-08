package Assignment.ASM2.Lab_8;

class DatabaseConnectionException extends Exception{
    public DatabaseConnectionException(String s){
        super(s);
    }
}

class DatabaseConnection {
    boolean connectionSuccess;

    public DatabaseConnection(){}

    public DatabaseConnection(boolean connectionSuccess){
        this.connectionSuccess = connectionSuccess;
    }

    public void connect() throws DatabaseConnectionException{
        if(!connectionSuccess){
            throw new DatabaseConnectionException("Connection failed");
        }else{
            System.out.println("Connection Successful");
        }
    }
}

public class Ex_5 {
    public static void main(String[] args) {
        DatabaseConnection success = new DatabaseConnection(true);
        try{
            success.connect();
        }catch (DatabaseConnectionException e){
            System.out.println(e.getMessage());
        }

        DatabaseConnection fail = new DatabaseConnection(false);
        try{
            fail.connect();
        }catch (DatabaseConnectionException e){
            System.out.println(e.getMessage());
        }

    }
}
