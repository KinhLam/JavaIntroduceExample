package Assignment.ASM2.Lab_6;

import java.util.LinkedList;

class Message {
    String sender;
    String content;

    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    @Override
    public String toString() {
        return sender + ": " + content;
    }
}

public class Ex_34 {
    String roomName;
    LinkedList<Message> messages = new LinkedList<>();

    public Ex_34(String roomName) {
        this.roomName = roomName;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public void displayMessages() {
        System.out.println("Chat Room: " + roomName);
        for (Message message : messages) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        Ex_34 chatRoom = new Ex_34("General");
        chatRoom.addMessage(new Message("Alice", "Hello everyone!"));
        chatRoom.addMessage(new Message("Bob", "Hi Alice!"));

        chatRoom.displayMessages();
    }
}