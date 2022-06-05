import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        
        HashSet<String> cars = new HashSet<String>();
        
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("United");
        cars.add("Honda");
        cars.add("Q-Mobile");
        cars.add("Infinix");
        cars.add("Crola");
        cars.add("Bhugati");
        
        cars.remove("Toyota");

        System.out.println(cars);

    }
}
