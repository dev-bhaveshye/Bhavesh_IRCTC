package ticket.booking.Entities;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

public class Ticket {
    @JsonProperty("ticket_id")  // Maps "ticket_id" from JSON to "ticketId" in Java
    private String ticketId;

    @JsonProperty("user_id")  // Maps "user_id" from JSON to "userId" in Java
    private String userId;

    @JsonProperty("source")
    private String source;

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("date_of_travel")  // Maps "date_of_travel" from JSON to "dateOfTravel" in Java
    private String dateOfTravel;

    @JsonProperty("train")
    private Train train;

    @JsonProperty("ticket_info")  // Maps "ticket_info" from JSON
    private String ticketInfo;

    public Ticket() {}

    public Ticket(String ticketId, String userId, String source, String destination, String dateOfTravel, Train train){
        this.ticketId = ticketId;
        this.userId = userId;
        this.source = source;
        this.destination = destination;
        this.dateOfTravel = dateOfTravel;
        this.train = train;
    }

    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", ticketId, userId, source, destination, dateOfTravel);
    }
    public String getTicketId(){
        return ticketId;
    }

    public void setTicketId(String ticketId){
        this.ticketId = ticketId;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getUserId(){
        return userId;
    }

    public void setUserId(String userId){
        this.userId = userId;
    }

    public String getDestination(){
        return destination;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public String getDateOfTravel(){
        return dateOfTravel;
    }

    public void setDateOfTravel(String dateOfTravel){
        this.dateOfTravel = dateOfTravel;
    }

    public Train getTrain(){
        return train;
    }

    public void setTrain(Train train){
        this.train = train;
    }


    public void setTicketInfo(String ticketInfo) {
        this.ticketInfo = ticketInfo;
    }
}
