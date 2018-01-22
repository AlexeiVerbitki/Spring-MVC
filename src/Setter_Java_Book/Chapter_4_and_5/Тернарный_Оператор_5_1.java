package Setter_Java_Book.Chapter_4_and_5;


/* this would create an infinite method while and Java will accept it
bulean t = true;

while (t){
}
*/


/*Тернарный оператор в Java имеет вид
<логическое выражение> ? <выражение1> : <выражение2>
Эта конструкция принимает значение первого выражения в случае, если логическое выражение истинно, и значение второго выражения в случае, если логическое выражение ложно.
Пример использования:
System.out.println(a == 1 ? "One" : "Not one");*/

public class Тернарный_Оператор_5_1 {
    public static void main(String[] args) {
        int result;
        for (int divisor = -5; divisor <=5; divisor++){
            //использование тернарного оператора для защиты от деления на ноль
            result = divisor != 0 ? 100 / divisor : 0;
            if (result !=0){
                System.out.println("100 / "+ divisor + "= "+ result);

            } else System.out.println("the divisor = " + divisor + " so skip dividing by ");
        }
    }  //end main method
} // end SecureDivisioOnOp class
