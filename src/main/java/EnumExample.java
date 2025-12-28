import java.util.Arrays;

public class EnumExample {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(CustomerType.Purpose.values));
        System.out.println();
        System.out.println(Arrays.toString(CustomerType.MultipleWithdrawls.values));
        System.out.println();
        System.out.println("LOW LEVEL CODE = "+Level.LOW.code);
        System.out.println("MEDIUM LEVE CODE = "+Level.MEDIUM.code);
        System.out.println("HIGH LEVEL CODE = "+Level.HIGH.code);
        System.out.println();
        System.out.println(TrafficLight.RED);
        System.out.println(TrafficLight.GREEN);
        System.out.println(TrafficLight.YELLOW);

    }
}
