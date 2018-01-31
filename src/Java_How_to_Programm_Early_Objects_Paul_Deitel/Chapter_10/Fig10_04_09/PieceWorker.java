package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_10.Fig10_04_09;

public class PieceWorker extends Employee {
    private int pieces;
    private double wage;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber,int pieces, double wage ){
        super(firstName, lastName, socialSecurityNumber);
        this.pieces = pieces;
        this.wage = wage;

    }

    @Override
    public double earnings() {
        return pieces * wage;
    }
    @Override
    public String toString()
    {
        return String.format("Piece Worker: %s%nWage = %.2f%nPieces = %d",
                super.toString(), wage, pieces);
    }
}// end class PiceWorker
