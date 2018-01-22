package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

public enum Book_myself {
    Alexei("Male","23"),
    Julia("Femaile", "27");



     final String age;
     final String name;


    // enum constructor
    Book_myself(String age, String name)
    {
        this.age = age;
        this.name = name;
    }
//    public String toString()
//    {
//        return String.format("name: age: ", name, age);
//    }


}
