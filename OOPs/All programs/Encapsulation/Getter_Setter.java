class Sport{
    private String name;
    private String typeOfSport;
    private boolean isTeamSport;

    public String getName(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getTypeOfSport(){
        return typeOfSport;
    }

    public void setTypeOfSport(String typeOfSport){
        this.typeOfSport = typeOfSport;
    }

    public boolean getIsTeamSport(){
        return isTeamSport;
    }

    public void setIsTeamSport(boolean isTeamSport){
        this.isTeamSport = isTeamSport;
    }

}


public class Getter_Setter {
    public static void main(String[] args) {
        Sport s = new Sport();

        s.setname("FootBall");
        s.setTypeOfSport("Outdoor");
        s.setIsTeamSport(true);


        System.out.println("Name: " + s.getName());
        System.out.println("What type of Sport it is? : " + s.getTypeOfSport());
        System.out.println("Is it a Team Sport? :"+s.getIsTeamSport());
    }
}


/*
Accessor - getter method
Mutator - setter method

getter & setter methods: it will restrict the user from accessing or manipulating the data inside the class from outside the class.

-> either we can get the value from the data memeber/ class variable
-> or we can modify the value of the data member.
*/