package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_15.Chapter_15_Exercises;



import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class File_Matching_15_4 {

}

class TransactionRecord implements Serializable {
    protected  int accountNumber;
    protected  double transaction;


    public TransactionRecord (){

    }


    public TransactionRecord(int accountNumber, double transaction){
//        this.accountNumber = accountNumber;
//        this.transaction = transaction;
        setAccountNumber(accountNumber);
        setTransaction(transaction);


    }// end constructor

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setTransaction(double transaction) {
        this.transaction = transaction;
    }

    public double getTransaction() {
        return transaction;
    }

    public int getAccountNumber() {

        return accountNumber;
    }


}



class Account extends TransactionRecord implements Serializable
{
    private int account;
    private String firstName;
    private String lastName;
    private double balance;
//    private int AccountNumber;
//    private double Transaction;
    private static ObjectInputStream input;
    private static ObjectInputStream input2;
    private static ObjectOutputStream output;

    // initializes an Account2 with default values
    public Account()
    {
        this(0, "", "", 0.0); // call other constructor
    }

    // initializes an Account2 with provided values
    public Account(int account, String firstName, String lastName, double balance)
    {
//        super(accountNumber,transaction);
        this.account = account;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // set account number
    public void setAccount(int acct)
    {
        this.account = account;
    }

    // get account number
    public int getAccount()
    {
        return account;
    }

    // set first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // get first name
    public String getFirstName()
    {
        return firstName;
    }

    // set last name
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // get last name
    public String getLastName()
    {
        return lastName;
    }

    // set balance
    public void setBalance(double balance) { this.balance = balance; }

    // get balance
    public double getBalance()
    {
        return balance;
    }

    public void combine(){



        try // open Clients file
        {
            input = new ObjectInputStream(
                    Files.newInputStream(Paths.get("clients.ser")));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }


        //Open Transaction file
        try
        {
            input2 = new ObjectInputStream(
                    Files.newInputStream(Paths.get("Transaction.ser")));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }

        // read Clients file
        try
        {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("Master.ser")));
//            CreateSequentialFile_Master.openFile();
            TransactionRecord transaction = (TransactionRecord) input2.readObject();

            while (true) // loop until there is an EOFException
            {
                Account record = (Account) input.readObject();


                if(record.getAccount()==transaction.getAccountNumber()){
                    record.setBalance(record.getBalance()+transaction.getTransaction());

//                    System.out.printf("\nrecord.getAccount() = %d", record.getAccount());
//                    System.out.printf("\ntransaction.getTransaction() = %d",transaction.getAccountNumber());


//                    CreateSequentialFile_Master.addRecords();
                    output.writeObject(record);
            }
            else{
                    output.writeObject(record);}

//                CreateSequentialFile_Master.closeFile();
            }

        }
        catch (EOFException endOfFileException)
        {
            System.out.printf("%nNo more records%n");
        }
        catch (ClassNotFoundException classNotFoundException)
        {
            System.err.println("Invalid object type. Terminating.");
        }
        catch (IOException ioException)
        {
            System.err.println("Error reading from file. Terminating.");
        }

    }

    public static void select(int selector) {
        switch (selector) {
            case 1: {
                CreateSequentialFile.openFile();
                CreateSequentialFile.addRecords();
                CreateSequentialFile.closeFile();
                break;
            }
            case 2: {
                CreateSequentialFileTransaction.openFile();
                CreateSequentialFileTransaction.addRecords();
                CreateSequentialFileTransaction.closeFile();
                break;
            }

            case 3: {
                ReadSequentialFile.openFile();
                ReadSequentialFile.readRecords();
                ReadSequentialFile.closeFile();
                break;
            }

            case 4: {
                ReadSequentialFileTransaction.openFile();
                ReadSequentialFileTransaction.readRecords();
                ReadSequentialFileTransaction.closeFile();
                break;
            }
        }
    }
    public String toString(){
//String test = getAccount() + getFirstName() + getLastName() + getBalance();
        return getAccount() + getFirstName() + getLastName() + getBalance() ;
    }
        public void print(){
        System.out.printf("\nAccount   First name Last name Balance\n%-10d%-11s%-10s%-10.2f\n", getAccount(), getFirstName(), getLastName(), getBalance());
//        System.out.printf("\naccountNumber= %d  transaction= %.2f",accountNumber, transaction);
    }

} // end class AccountRecordSerializabl

//--------------------------------------------------------------------------------------------------

class File_Matching_15_4_test {
    public static void main(String[] args) {
        Account account = new Account();
//        account.print();
        TransactionRecord transaction = new TransactionRecord();

//        System.out.printf("\naccount= %d\ntransaction = %.2f\n", transaction.getAccountNumber(), transaction.getTransaction());


//        account.print();

        {


//            CreateSequentialFile.openFile();
//            CreateSequentialFile.addRecords();
//            CreateSequentialFile.closeFile();
//
//            CreateSequentialFileTransaction.openFile();
//            CreateSequentialFileTransaction.addRecords();
//            CreateSequentialFileTransaction.closeFile();

            System.out.printf("Would you like to:" +
                    "\n1: Create Account" +
                    "\n2: Create Transaction" +
                    "\n3: Read Account" +
                    "\n4: Read Transaction" +
                    "\n Select: ");
            Scanner input = new Scanner(System.in);
            int selector = input.nextInt();

            account.select(selector);


//            account.combine();
//
//
//            ReadSequentialFileTransaction.openFile();
//            ReadSequentialFileTransaction.readRecords();
//            ReadSequentialFileTransaction.closeFile();
//
//            ReadSequentialFile.openFile();
//            ReadSequentialFile.readRecords();
//            ReadSequentialFile.closeFile();
//
//            ReadSequentialFile_Master.openFile();
//            ReadSequentialFile_Master.readRecords();
//            ReadSequentialFile_Master.closeFile();

            CreateSequentialFile_Array.openFile();
            CreateSequentialFile_Array.addRecords();
            CreateSequentialFile_Array.closeFile();

            ReadSequentialFile_Array.openFile();
            ReadSequentialFile_Array.readRecords();
            ReadSequentialFile_Array.closeFile();




        }
    }
}


