public enum RoomType {

    SINGLE_DAY("Single room", 1, 40.00),
    SINGLE_NIGHT("Single room", 1, 60.00),
    DOUBLE_DAY("Double room", 2, 70.00),
    DOUBLE_NIGHT("Double room", 2, 90.00),
    CONFERENCEROOM("Conference room", 60, 900.00);



    private final String type;
    private final int capacity;
    private final double rate;

    RoomType(String type, int capacity, double rate){
        this.type = type;
        this.capacity = capacity;
        this.rate = rate;
    }


    public String getRoomType(){
        return type;
    }

    public int getRoomCapacity(){
        return capacity;
    }

    public double getRoomRate(){
        return rate;
    }
}