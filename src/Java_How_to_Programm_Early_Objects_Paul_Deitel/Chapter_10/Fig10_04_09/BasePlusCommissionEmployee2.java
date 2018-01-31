//package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Fig10_04_09;
//
//public class BasePlusCommissionEmployee2 extends CommissionEmployee {
//    int baseSalary;
//
//    public BasePlusCommissionEmployee2 (String firstName, String lastName,
//                                        String socialSecurityNumber, double grossSales,
//                                        double commissionRate, int baseSalary)
//    {
//        super(firstName,lastName,socialSecurityNumber, grossSales, commissionRate);
//
//        this.baseSalary = baseSalary;
//
//    }
//    @Override
//    public double earnings ()
//    {
//
//        return baseSalary + super.earnings();
//    }
//
//    @Override
//    public String toString()
//    {
//        return String.format("%s %s%nsocial security number: %s",
//                getFirstName(), getLastName(), getSocialSecurityNumber());
//    }
//}// end class BasePlusCommissionEmployee2
//
//class test {
//    public static void main(String[] args) {
//        CommissionEmployee CommissionEmployee = new CommissionEmployee("Ted",  "Cruz", "666100503", 100, 0.3);
//        BasePlusCommissionEmployee2 BasePlusCommissionEmployee2 = new BasePlusCommissionEmployee2("\n------\nTEd", "Cruz", "666100503", 100, 0.3, 1000);
//        System.out.printf("%s %n%s", CommissionEmployee,  CommissionEmployee.earnings());
//
//        System.out.printf("%s %n%s",  BasePlusCommissionEmployee2, BasePlusCommissionEmployee2.earnings());
//    }
//}
