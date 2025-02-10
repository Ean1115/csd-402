/*
  Ean Masoner Module 10 Assignment CSD-402
 */
package M10ProgrammingAssignment;

public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    public abstract void display();
}