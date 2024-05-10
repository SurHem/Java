// Messaging App
// In a messaging application, implement method overloading for sending messages. Create different methods with different parameter combinations, such as sending a text message, sending an image message, and sending a video message.

class Application{

    public static void sendMessage(String message){
        System.out.println("Message: "+message);
    }

    public static void sendMessage(String image , int count){
        System.out.println("Messagin"+count+" Image of: "+image);
    }

    public static void sendMessage(String video , double lenght){
        System.out.println("Messaging video name: "+video+" with length of: "+lenght);
    }
}

public class MessagingApp {
    public static void main(String[] args) {
        Application.sendMessage("Hello");
        Application.sendMessage("Cat",10);
        Application.sendMessage("dog",2.3);
    }
}
