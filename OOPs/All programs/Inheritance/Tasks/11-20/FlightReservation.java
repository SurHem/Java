class Flight{
    private String flightNumber;
    private String origin;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber , String origin , String destination , int capacity ){
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    private boolean hasAvailableSeats(){
        return bookedSeats < capacity;
    }

    public String getFlightInfo(){
        return "Flight " + flightNumber + " from " + origin + " to " + destination;
    }

    public boolean bookSeat(){
        if (hasAvailableSeats()) {
            bookedSeats++;
            return true;
        }else{
            return false;
        }
    }
}

class Passenger{
    private String name;
    private String passportNumber;
    private Reservation[] reservations;
    private int numReservations;

    public Passenger(String name , String passportNumber){
        this.name = name;
        this.passportNumber = passportNumber;
        this.reservations = new Reservation[10];
        this.numReservations = 0;
    }

    public String getName(){
        return name;
    }

    public String passportNumber(){
        return passportNumber;
    }

    public boolean addReservation(Reservation reservation){
        if (numReservations < 1) {
            reservations[numReservations++] = reservation;
            return true;
        }else{
            System.out.println("Cannot add reservation for "+name+name+". Maximum reservation reached.");
            return false;
        }
    }

    public Reservation[] getReservations(){
        return reservations;
    }
}


class Reservation{
    private Passenger passenger;
    private Flight flight;

    public Reservation(Passenger passenger , Flight flight){
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassenger(){
        return passenger;
    }

    public Flight getFlight(){
        return flight;
    }
}



public class FlightReservation {
    public static void main(String[] args) {
        Flight flight1 = new Flight("M12n4", "India", "Romania", 200);
        Flight flight2 = new Flight("Mm4321", "Romania", "India", 150);

        Passenger passenger1 = new Passenger("Wish", "Wish1234");
        Passenger passenger2 = new Passenger("Vishva", "Vishva1234");

        bookTicket(passenger1 , flight1);
        bookTicket(passenger2 , flight2);
        bookTicket(passenger1 , flight2);

        displayReservation(passenger1);
        displayReservation(passenger2);
        
    }

    public static void bookTicket(Passenger passenger , Flight flight){
        if (flight.bookSeat()) {
            Reservation reservation = new Reservation(passenger, flight);
            if (passenger.addReservation(reservation)) {
                System.out.println(passenger.getName() + " booked a seat on " + flight.getFlightInfo());
            }
        }else{
            System.out.println("Sorry, no available seats on "+ flight.getFlightInfo());
        }
    }

    public static void displayReservation(Passenger passenger){
        System.out.println("Reservation for "+passenger.getName()+ ": ");
        System.out.println("---------------------------------");

        Reservation[] reservations = passenger.getReservations();

        if (reservations[0] == null) {
            System.out.println("No reservation found!");
        }else{
            for (Reservation reservation : reservations) {
                if (reservation != null) {
                    System.out.println("Flight: "+reservation.getFlight().getFlightInfo()
                    );
                }
            }
        }
        System.out.println();
    }
}
