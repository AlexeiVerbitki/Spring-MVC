package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_5;
import javax.swing.JOptionPane;
public class Account2 {
    private String name;

    String getName (){
        return name;
    }

    public void setName (String name){
        this.name=name;
    }

} // end Account2 class

class AccountTest_by_Myself {
    public static void main(String[] args) {
        Account2 myAccount = new Account2();
/*        Scanner input = new Scanner(System.in);

        System.out.println("The initial name is: "+ myAccount.getName());

        System.out.print("Enter the new account name: ");
        String accountName = input.nextLine();
        myAccount.setName(accountName);

        System.out.println("\nThe new account name is: "+ myAccount.getName());
*/
        myAccount.setName(JOptionPane.showInputDialog("Enter the new account name"));
        String accountMessage = String.format ("Welcome , %s, to Java programming", myAccount.getName());
        JOptionPane.showMessageDialog(null, accountMessage);

    }

} // end class AccountTest2
