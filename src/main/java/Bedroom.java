public class Bedroom extends Room {

    private int number;
    private RoomType type;

    public Bedroom(int capacity, double rate, String name) {
        super(capacity, rate);
        this.number = number;
        this.type = type;
    }

    public RoomType getRoomType() {
        return type;
    }

    public int getRoomNumber() {
        return number;
    }
}