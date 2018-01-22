package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Exercises_Chapter_10.CarbonFootprint_Interface_Polymorphism_10_16;

public class Building implements CarbonFootprintInterface {
    private String type;
    private double sqft;
    private final static String[] NERCregionAcronim = {"ASCC", "FRCC", "HICC", "MRO", "NPC", "RFC", "SERC", "SPP", "TRE", "WECC"};
    private final static double[] NERCregionName = {914.0,1203.8,1509.5,1179.5,1266.1,557.8,1418.7,1429.9,1084.0,894.3};
    private final static String[] NERCregionEmission = {"Alaska Systems Coordinating Council","Florida Reliability Coordinating Council","Hawaiian Islands Coordinating Council","Midwest Reliability Organization","Northeast Power Coordinating Council","Reliability First Corporation","SERC Reliability Corporation","Southwest Power Pool","Texas Regional Entity","Western Electricity Coordinating Council"};

    @Override
    public double carbonFootprint() {
        return 0;
    }
}
