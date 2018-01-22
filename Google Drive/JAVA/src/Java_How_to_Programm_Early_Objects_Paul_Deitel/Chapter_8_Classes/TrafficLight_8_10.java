package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public class TrafficLight_8_10 {
    public enum TraficLights {

        Red("Red", "30 seconds"),
        Yellow("Yellow", "3 seconds"),
        Green("Green", "20 seconds");

        public final String light;
        final String duration;

        TraficLights(String light, String duration) {
            this.light = light;
            this.duration = duration;
        }

        public String getLight() {
            return light;
        }

        public String getDuration() {
            return duration;
        }
    }

    public static void main(String[] args) {

        for (TraficLights light : TraficLights.values()){
            System.out.printf("%-7s- %s\n",light.getLight(),  light.getDuration());

        }
    }
}
