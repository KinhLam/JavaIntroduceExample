package Lab.OOP.Days.Extra_2_EmailManagement;

public class StudentManagementSystemTest {
    public static void main(String[] args) {
        EmailManagementSystem system = new EmailManagementSystem();
        system.sentEmail("alice@example.com", "bob@example.com", "Meeting", "Let's meet at 10 AM.");
        system.sentEmail("carol@example.com", "dave@example.com", "Project Update", "The project is almost complete.");
        system.sentEmail("eve@example.com", "frank@example.com", "Invitation", "You're invited to the event.");

        System.out.println("Display all email");
        system.displayEmails();

        System.out.println("\nMarking email with ID 2 as read:");
        system.markEmailAsRead(2);

        System.out.println("\nDisplaying unread email count:");
        system.displayUnreadEmailCount();

        System.out.println("\nDisplaying all emails after marking one as read:");
        system.displayEmails();
    }
}
