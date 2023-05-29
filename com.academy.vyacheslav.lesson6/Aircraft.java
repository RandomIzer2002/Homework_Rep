public abstract class Aircraft {
    private int capacity;
    private int carryingCapacity;
    private int flightRange;

    public Aircraft(int capacity, int carryingCapacity, int flightRange) {
        this.capacity = capacity;
        this.carryingCapacity = carryingCapacity;
        this.flightRange = flightRange;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void setCarryingCapacity(int carryingCapacity){
        this.carryingCapacity = carryingCapacity;
    }

    public void setFlightRange(int flightRange){
        this.flightRange = flightRange;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public int getFlightRange() {
        return flightRange;
    }
}