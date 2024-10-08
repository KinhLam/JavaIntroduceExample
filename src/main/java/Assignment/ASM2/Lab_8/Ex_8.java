package Assignment.ASM2.Lab_8;
class EmailSendingException extends Exception{
    public EmailSendingException(String m){
        super(m);
    }
}

class EmailSender{
    public void sendEmail(String recipent, String message) throws EmailSendingException{
        if(recipent == null || recipent.isEmpty()){
            throw new EmailSendingException("Recipient email address is invalid.");
        }
        if(message == null || message.isEmpty()){
            throw new EmailSendingException("Message email address is invalid.");
        }

        System.out.println("Email sent to " + recipent + " with message: " + message);
    }
}
public class Ex_8 {
    public static void main(String[] args){
        EmailSender sender = new EmailSender();
        try{
            sender.sendEmail("lamduckinh2k2@gmail.com", "Hello");
            sender.sendEmail("", "This will throw an exception");
        }catch (EmailSendingException e){
            System.out.println(e.getMessage());
        }
    }
}
