package ticket.booking.Entities;
import java.sql.Time;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)  // Ignores "train_info" if it's not mapped
public class Train {
    @JsonProperty("train_id")  // Maps "train_id" from JSON to "trainId" in Java
    private String trainId;

    @JsonProperty("train_no")  // Maps "train_no" from JSON to "trainNo" in Java
    private int trainNo;

    @JsonProperty("seats")
    private List<List<Integer>> seats;

    @JsonProperty("station_times")  // Maps "station_times" from JSON to "stationTimes" in Java
    private Map<String, String> stationTimes;

    @JsonProperty("stations")
    private List<String> stations;

    public Train(){}

    public Train(String trainId, Integer trainNo, List<List<Integer>> seats, Map<String, String> stationTimes, List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public List<String> getStations(){
        return stations;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public void setSeats(List<List<Integer>> seats){
        this.seats = seats;
    }

    public String getTrainId(){
        return trainId;
    }

    public Map<String, String> getStationTimes(){
        return stationTimes;
    }

    public Integer getTrainNo(){
        return trainNo;
    }

    public void setTrainNo(Integer trainNo){
        this.trainNo = trainNo;
    }

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setStationTimes(Map<String, String> stationTimes){
        this.stationTimes = stationTimes;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }

    public String getTrainInfo(){
        return String.format("Train ID: %s Train No: %s", trainId, trainNo);
    }

}


