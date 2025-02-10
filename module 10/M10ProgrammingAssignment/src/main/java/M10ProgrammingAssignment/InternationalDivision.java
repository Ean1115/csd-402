/*
 Ean Masoner Module 10 Assignment CSD-402
 */
package M10ProgrammingAssignment;

public class InternationalDivision extends Division {
    private final String country;
    private final String language;

    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    @Override
    public void display() {
        System.out.println("International Division: " + divisionName + ", Account Number: " + accountNumber +
                           ", Country: " + country + ", Language: " + language);
    }
}