// Mobile Application Development
// Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

abstract class App{

    
    abstract void open();
    abstract void close();
}

class ChatApp extends App{

    @Override
    void open(){
        System.out.println("Opening "+this.getClass().getName());
    }

    @Override
    void close(){
        System.out.println("Closing "+this.getClass().getName());
    }
}



class PhotoEditingApp extends App{

    @Override
    void open(){
        System.out.println("Opening "+this.getClass().getName());
    }

    @Override
    void close(){
        System.out.println("Closing "+this.getClass().getName());
    }
}

public class MobileApplication {
    public static void main(String[] args) {
        ChatApp c = new ChatApp();
        PhotoEditingApp p = new PhotoEditingApp();

        c.open();
        c.close();

        p.open();
        p.close();
    }
}
