public class PieceWorkerEmployee extends Employee{
    private double wage; //wage per one piece
    private int pieces; //number of pieces produced

    // Constructor
    public PieceWorkerEmployee(String first, String last, String ssn, double wages, int piece) {
        super(first, last, ssn);
        setWages(wages);
        setPieces(piece);
    }

    //sets wages of employee
    public void setWages(double wages) {
        wage=(wages>0.0)?wages:0.0;
    }

    // gets wages of employee
    public double getWages() {
        return wage;
    }

    // sets number of pieces produced by employee
    public void setPieces(int piece) {
        pieces=(piece<0)?0:piece;
    }

    // returns number of pieces
    public int getPieces() {
        return pieces;
    }

    // calculate earnings; override abstract method earnings in Employee
    public double earnings() {
        return getWages()*getPieces();
    }

// return String representation of PieceworkerEmployee object
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %,d",
                "Piece worker",super.toString(), "wage per piece", getWages(),
                "pieces produced", getPieces() );
    }
}