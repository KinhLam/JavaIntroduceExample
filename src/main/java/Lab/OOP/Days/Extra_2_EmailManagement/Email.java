package Lab.OOP.Days.Extra_2_EmailManagement;

public class Email {
    String sender, recipient, subject, content;
    boolean isRead;
    int emailID;
    static int idCounter = 1;

    public Email(String sender, String recipient, String subject, String content) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.content = content;
        this.isRead = false;
        this.emailID = idCounter++;
    }

    public Email() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        this.isRead = true;
    }

    public int getEmailId() {
        return emailID;
    }

    @Override
    public String toString() {
        return "Email [ID=" + emailID + ", Sender=" + sender + ", Recipient=" + recipient +
                ", Subject=" + subject + ", Content=" + content + ", Read=" + isRead + "]";
    }
}
