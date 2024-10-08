package Lab.OOP.Days.Extra_2_EmailManagement;

import java.util.ArrayList;
import java.util.List;

public class EmailManagementSystem {
    List<Email> emails;

    public EmailManagementSystem() {
        emails = new ArrayList<>();
    }

    public void sentEmail(String sender,String recipient, String subject, String content) {
        emails.add(new Email(sender,recipient,subject,content));
        System.out.println("Email sent successfully");
    }

    public void displayEmails() {
        if(emails.isEmpty()){
            System.out.println("No emails found");
        }else{
            for(Email email : emails){
                System.out.println(email);
            }
        }
    }

    public void markEmailAsRead(int emailID) {
        for(Email email : emails){
            if(email.getEmailId() == emailID){
                email.markAsRead();
                System.out.println("Email ID " + emailID + " marked as read");
                return;
            }
        }
        System.out.println("Email ID " + emailID + " not marked as read");
    }

    public void displayUnreadEmailCount(){
        int unreadCount = 0;
        for(Email email : emails){
            if(!email.isRead()){
                unreadCount++;
            }
        }

        System.out.println("Unread emails count: " + unreadCount);
    }




}
