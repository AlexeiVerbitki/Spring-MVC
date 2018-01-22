package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_8_Classes;

class Savings_Account_8_6 {

    static double interestRate = 0;
    static double savingsBalance = 1000;

    double calculateMonthlyInterest() {
        double interest = interestRate * savingsBalance / 12;
        savingsBalance += interest;
        return interest;
    } // end method calculateMonthlyInterest

    public static void modifyInterestRate(double interest) {
        interestRate = interest;
    }
} // end class Savings_Account_8_6

class Savings_Account_8_6Test {
    public static void main(String[] args) {
        Savings_Account_8_6.modifyInterestRate(0.05);

        Savings_Account_8_6 Account = new Savings_Account_8_6();


        for (int i = 1; i < 13; i++) {
            System.out.printf("Month %d:%n%n", i);

            if (i == 1) System.out.printf("The starting balance is %.2f%n%n", Account.savingsBalance);
            System.out.printf("The interest rate for this year was set to %.2f%n" +
                    "Your interest is %.2f%n" +
                    "Your total saving balance is %.2f", Account.interestRate, Account.calculateMonthlyInterest(), Account.savingsBalance);
            System.out.printf("%n%n-------------------%n%n");
            if (i == 12)
                System.out.printf("The balance at the end of the year is %.2f", Account.savingsBalance);

        } // end for
    }

}