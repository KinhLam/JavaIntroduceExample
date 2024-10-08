package Assignment.ASM2.Lab_8;
class ConnectionException_Ex10 extends Exception {
    public ConnectionException_Ex10(String m) {
        super(m);
    }
}

class NetworkConnection{
    public void connectToServer(String ipAddress) throws ConnectionException_Ex10 {
        if (ipAddress == null || ipAddress.isEmpty()){
            throw new ConnectionException_Ex10("Invalid IP Address");
        }
        System.out.println("Connected to " + ipAddress);
    }
}
public class Ex_10 {
    public static void main(String[] args) {
        NetworkConnection nc = new NetworkConnection();
        try{
            nc.connectToServer("192.168.1.1");
            nc.connectToServer("");
        }catch (ConnectionException_Ex10 e){
            System.out.println(e.toString());
        }
    }
}
