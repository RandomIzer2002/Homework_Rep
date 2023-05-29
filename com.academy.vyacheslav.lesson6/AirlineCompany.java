import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class AirlineCompany {
    private List<Aircraft> aircrafts;

    public AirlineCompany() {
        aircrafts = new ArrayList<Aircraft>();
    }

    public void addAirplane(Airplane airplane) {
        aircrafts.add(airplane);
    }

    public void addHelicopter(Helicopter helicopter) {
        aircrafts.add(helicopter);
    }

    public void addQuadcopter(Quadcopter quadcopter) {
        aircrafts.add(quadcopter);
    }

    public int getTotalCapacity() {
        int totalCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }

    public int getTotalCarryingCapacity() {
        int totalCarryingCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalCarryingCapacity += aircraft.getCarryingCapacity();
        }
        return totalCarryingCapacity;
    }

    public double getAverageFlightRange() {
        double totalFlightRange = 0;
        for (Aircraft aircraft : aircrafts) {
            totalFlightRange += aircraft.getFlightRange();
        }
        return totalFlightRange / aircrafts.size();
    }

    public void sortByFlightRange() {
        Collections.sort(aircrafts, new Comparator<Aircraft>() {
            @Override
            public int compare(Aircraft aircraft1, Aircraft aircraft2) {
                return aircraft1.getFlightRange() - aircraft2.getFlightRange();
            }
        });
    }

    public Aircraft findAircraft(int requiredCapacity, int requiredCarryingCapacity, int requiredFlightRange) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getCapacity() >= requiredCapacity
                    && aircraft.getCarryingCapacity() >= requiredCarryingCapacity
                    && aircraft.getFlightRange() >= requiredFlightRange) {
                return aircraft;
            }
        }
        return null;
    }
}