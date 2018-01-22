package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7;

public class card {
    private String face;
    private String suite;

    public card(String face, String suite){
        this.face = face;
        this.suite = suite;
    }
    public String toString (){
        return face + " of " + suite;
    }
}
