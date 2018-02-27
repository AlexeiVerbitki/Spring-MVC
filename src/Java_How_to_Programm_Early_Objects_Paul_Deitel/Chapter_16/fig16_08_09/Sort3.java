package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.fig16_08_09;// Fig. 16.9: Sort3.java
// Collections method sort with a custom Comparator object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 
{
   public static void main(String[] args)
   {
      List<Time2> list = new ArrayList<>(); // create List

      list.add(new Time2(6, 24, 34));
      list.add(new Time2(18, 14, 58));
      list.add(new Time2(6, 05, 34));
      list.add(new Time2(12, 14, 58));
      list.add(new Time2(6, 24, 22));
      
      // output List elements
      System.out.printf("Unsorted array elements:%n%s%n", list);

      // sort in order using a comparator
      Collections.sort(list, new TimeComparator()); 

      // output List elements
      System.out.printf("Sorted list elements:%n%s%n", list);
   } 
} // end class Sort3



