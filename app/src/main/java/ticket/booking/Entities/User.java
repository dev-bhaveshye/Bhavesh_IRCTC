package ticket.booking.Entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class User {
    @JsonProperty("name")  // Correctly mapping the 'name' field from JSON
    private String name;

    @JsonProperty("password")
    private String password;

    @JsonProperty("hashed_password")  // Mapping JSON's 'hashed_password' to Java's 'hashedPassword'
    private String hashedPassword;

    @JsonProperty("user_id")  // Correctly mapping JSON's 'user_id' to Java's 'userId'
    private String userId;

    @JsonProperty("tickets_booked")  // Correctly mapping JSON's 'tickets_booked' to Java's 'ticketsBooked'
    private List<Ticket> ticketsBooked;

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId){
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
    }
    public User(){}

    public String getName() {
        return name;
    }

    public String getPassword(){
        return password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void printTickets(){
        for (int i = 0; i<ticketsBooked.size(); i++){
            System.out.println(ticketsBooked.get(i).getTicketInfo());
        }
    }

    public String getUserId() {
        return userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}


