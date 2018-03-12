import java.util.ArrayList;

public class Hotel extends Room{

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public void addRooms(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public int countRooms(Bedroom bedroom){
        return bedrooms.size();
    }

    public void addGuestToRoom(Bedroom bedroom, Guest guest){
        bedrooms.addGuest(guest);
    }

}