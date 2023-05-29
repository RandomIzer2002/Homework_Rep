public class DZ6Task4 {
    public static void main(String[] args) {
        AirlineCompany airlineCompany = new AirlineCompany();

        airlineCompany.addAirplane(new Airplane(120, 5000, 7000));
        airlineCompany.addHelicopter(new Helicopter(5, 100, 500));
        airlineCompany.addQuadcopter(new Quadcopter(1, 2, 50));

        System.out.println("Total capacity: " + airlineCompany.getTotalCapacity());
        System.out.println("Total carrying capacity: " + airlineCompany.getTotalCarryingCapacity());
        System.out.println("Average flight range: " + airlineCompany.getAverageFlightRange());

        airlineCompany.sortByFlightRange();

        Aircraft suitableAircraft = airlineCompany.findAircraft(10, 200, 1000);
        if (suitableAircraft != null) {
            System.out.println("Suitable aircraft found: " + suitableAircraft.getClass().getSimpleName());
        } else {
            System.out.println("Suitable aircraft not found");
        }
    }
}