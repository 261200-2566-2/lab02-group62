import java.util.Random;
public class Main {
    public static void main(String[] args) {
        AirPurifier[] airPurifiers = new AirPurifier[10];
        String[] models = { "Default", "Mini", "Pro", "Max" };
        for (int i = 0; i < airPurifiers.length; i++) {
            airPurifiers[i] = new AirPurifier(models[new Random().nextInt(models.length)]);
        }
        for (int i = 0; i < airPurifiers.length; i++) {
            System.out.println("[" + (i+1) + "] : " + airPurifiers[i].getModel());
        }
        System.out.println("Most popular model: " + AirPurifier.getMostPopularModel());
        AirPurifier airPurifier = new AirPurifier();
        System.out.println("Serial Number: " + airPurifier.getSerialNumber());

        AirPurifier.turnOn();
        System.out.println(AirPurifier.power);
        AirPurifier.turnOff();
        System.out.println(AirPurifier.power);
    }
}