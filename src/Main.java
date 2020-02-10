import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee winston = new Employee(1582966, "Winston", "Nguyen", 1000);
        System.out.println(winston);

        System.out.println("\nWinston's annual salary");
        System.out.println(winston.getAnnualSalary());

        Scanner scan = new Scanner(System.in);
        System.out.println("\nHow big of a raise should Winston get? (percentage increase)");
        int percent = Integer.parseInt(scan.next());
        int raisedSalary = winston.raiseSalary(percent);
        System.out.println(raisedSalary);
    }
}
