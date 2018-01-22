package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_7_Arrays.Exercise_Chapter_7;

public class Variable_Length_Argument_List_7_14 {

    public int product(int...numbers){
        int total = 0;
        for (int value : numbers)
             total +=value;
        return total;
    }

    public int productArray(int []numbers){
        int total = 0;
        for (int value : numbers)
            total +=value;
        return total;
    }

    public int productMultiArray(int [][]numbers){
        int total = 0;
        for (int[] row : numbers)
            for (int columnValue : row)
                total +=columnValue;

        return total;
    }
    public static void main(String[] args) {

        int[] array ={5,6,7};
        int[][] multiArray ={{5,6,7},{3,5},{4}};
        Variable_Length_Argument_List_7_14 argumentList = new Variable_Length_Argument_List_7_14();
        System.out.printf("The total of product is: %d\n", argumentList.product(5,6,7));
        System.out.printf("The total of product is: %d\n", argumentList.product(5,6));
        System.out.printf("The total of productArray is: %d\n", argumentList.productArray(array));
        System.out.printf("The total of productMultiArray is: %d\n", argumentList.productMultiArray(multiArray));
    }

}


