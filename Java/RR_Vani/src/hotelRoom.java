public class hotelRoom {
    enum Type{
        SUITE, DE_LUXE, STANDART
    }
    private int roomNumber;
    private int roomCapacity;
    private int costPerDay;

    final private Type roomType;

    public hotelRoom(int roomNumber, int roomCapacity, int costPerDay, Type roomType) {
        this.roomNumber = roomNumber;
        this.roomCapacity = roomCapacity;
        this.costPerDay = costPerDay;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getRoomCapacity() {
        return roomCapacity;
    }

    public void setRoomCapacity(int roomCapacity) {
        this.roomCapacity = roomCapacity;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public String toString() {
        return "Кімната {" + "Номер кімнати - " + roomNumber + ", Кількість місць - " + roomCapacity +
                ", Ціна за добу - " + costPerDay + ", Тип кімнати - " + roomType + "}";
    }





}
