// In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

final class Configuration{
    final String url = "https://database.com/";
    final String username = "mohak123";
    final String password = "123@";

    final void displayLoginInfo(){
        System.out.println("URL: "+url);
        System.out.println("UserName: "+username);
        System.out.println("Password: "+password);
    }

}

public class Configure {
    public static void main(String[] args) {
        Configuration c = new Configuration();

        c.displayLoginInfo();
    }    
}
