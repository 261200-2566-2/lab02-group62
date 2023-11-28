import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

public class AirPurifier {
    public static List<String> models = new ArrayList<String>();
    public static List<Integer> modelCounts = new ArrayList<Integer>();
    static boolean power;
    static void turnOn() {power = true;}
    static void turnOff() {power = false;}
    public static void createNewAirPurifier(String model) {
        if (AirPurifier.models.contains(model)) {
            int modelIndex = AirPurifier.models.indexOf(model);
            AirPurifier.modelCounts.set(modelIndex, AirPurifier.modelCounts.get(modelIndex) + 1);
        } else {
            AirPurifier.models.add(model);
            AirPurifier.modelCounts.add(1);
        }
    }
    public static String getMostPopularModel() {
        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < AirPurifier.modelCounts.size(); i++) {
            if (AirPurifier.modelCounts.get(i) > max) {
                max = AirPurifier.modelCounts.get(i);
                maxIndex = i;
            }
        }
        return AirPurifier.models.get(maxIndex);
    }
    private String model;
    private String serialNumber;
    public AirPurifier() {
        this("Default");
    }
    public AirPurifier(String model) {
        this.model = model;
        serialNumber = (UUID.randomUUID().toString()).split("-")[0].toUpperCase() + model.toUpperCase();
        AirPurifier.createNewAirPurifier(model);
    }
    public String getModel() {
        return model;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
}
