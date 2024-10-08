package Assignment.ASM2.Lab_8;

class DatabaseConnectionException_Ex21 extends Exception{
    public DatabaseConnectionException_Ex21(String message){
        super(message);
    }
}

class DatabaseConnection_Ex21{
    public void connect(String username, String password) throws DatabaseConnectionException_Ex21{
        if(!"admin".equals(username) || !"password".equals(password)){
            throw new DatabaseConnectionException_Ex21("Invalid username or password");
        }
        System.out.println("Connected to the database successfully");
    }
}
public class Ex_21 {
    public static void main(String[] args){
        DatabaseConnection_Ex21 db =  new DatabaseConnection_Ex21();
        try{
            db.connect("admin", "123123");
        }catch(DatabaseConnectionException_Ex21 e){
            System.out.println(e);
        }
    }
}
