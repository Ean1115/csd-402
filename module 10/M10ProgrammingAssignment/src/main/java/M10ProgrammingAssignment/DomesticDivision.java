/*
  Ean Masoner Module 10 Assignment CSD-402
 */
package M10ProgrammingAssignment;

public class DomesticDivision extends Division {
    private String state;

    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    @Override
    public void display() {
        System.out.println("Domestic Division: " + divisionName + ", Account Number: " + accountNumber +
                           ", State: " + state);
    }
}