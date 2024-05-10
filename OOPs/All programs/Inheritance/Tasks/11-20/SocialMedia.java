// Social Media Platform
// Create a social media platform with classes like "User," "Post," and "Comment." Implement methods for users to create posts, comment on posts, and interact with each other.

class Comment{
    String comment;

    Comment(){};

    void comment(String comment){
        this.comment = comment;
    }

    void displayComment(){
        System.out.println("Comment: "+this.comment);
    }
}


class Post extends Comment{
    String title;

    Post(){};

    void CreatePost(String title){
        this.title = title;
    }

    void commentOnPost(String comm){
        comment(comm);
        displayComment();
    }
}


class User extends Post{
    String username;

    User(String username){
        this.username = username;
    }
}



public class SocialMedia {
    public static void main(String[] args) {
        User u1 = new User("Mohak");
        u1.CreatePost("At the Beach");
        u1.displayComment();
    }
}
