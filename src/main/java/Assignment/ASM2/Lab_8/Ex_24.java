package Assignment.ASM2.Lab_8;
class NetworkException extends Exception{
    public NetworkException(String s){
        super(s);
    }
}

class NetWorkClient{
    public void sendData(String data) throws NetworkException{
        if(data == null || data.isEmpty()){
            throw new NetworkException("Data is null or empty");
        }
        System.out.println("Data sent successfully");
    }
}
public class Ex_24 {
    public static void main(String[] args) {
        NetWorkClient net = new NetWorkClient();
        try{
            net.sendData("");
        }catch (NetworkException e){
            System.out.println(e);
        }
    }
}
