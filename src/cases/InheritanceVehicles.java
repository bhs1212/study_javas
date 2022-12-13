package cases;

public class InheritanceVehicles {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        System.out.println("Vehicles speed : " + vehicles.speed(100,5));
        System.out.println("Vehicles weight : " + vehicles.weight(2, 4, 6) + "\n");

        Vans vans = new Vans();
        System.out.println("Vans speed : " + vans.speed(100, 10));
        System.out.println("Vans weight : " + vans.weight(2, 4, 6));
        System.out.println("Vans windows_count : " + vans.windows_count(5) + "\n");

        Cars cars = new Cars();
        System.out.println("Cars speed : " + cars.speed(100, 10));
        System.out.println("Cars weight : " + cars.weight(2, 4, 6));
    }
}
