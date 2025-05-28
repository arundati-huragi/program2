package prgrm2;
import java.time.LocalDate;
import java.time.Period;
public class students {
    String name;
    LocalDate dob;
    public students(String name, String dobStr) {
        this.name = name;
        this.dob = LocalDate.parse(dobStr);
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        int age = Period.between(dob, LocalDate.now()).getYears();
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        students srn237 = new students("Arundati", "2005-02-16");
        srn237.displayInfo();
    } }

