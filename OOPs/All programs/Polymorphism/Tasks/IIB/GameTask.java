// In a game development scenario, have a class called "Game" with an instance initializer block that sets up the game environment, loads resources, and performs initialization tasks when a new game object is created.

class Game{
    int level;
    String playerName;

    {
        System.out.println("Setting up game evironment...");
        System.out.println("Loading Resources...");
        level = 0;
        playerName = null;
    }


    Game(String playerName){
        this.playerName = playerName;
    }

    void displayPlayerInfo(){
        System.out.println("Name: "+playerName);
        System.out.println("Level: "+level);
    }
}

class GameTask {
    public static void main(String[] args) {
        Game g = new Game("Mohak");
        g.displayPlayerInfo();
    }
}