package Class02.Exc2_1;

public class Main {
    public static void main(String[] arg) {
        Pilot p1 = new Pilot("John Travolta");
        p1.setSalary(123456.78);
        System.out.println("Without flying hours: " + p1.toString());
        p1.increaseFlyingHoursWith(12);
        System.out.println("First pilot: " + p1);
        System.out.println();

        Pilot p2 = new Pilot("Leonardo di Caprio");
        p2.setSalary(5000.00);
        p2.increaseFlyingHoursWith(3);
        System.out.println("Second pilot's flying hours "+ p2.getFlyingHours());
        System.out.println("Second pilot's salary: " + p2.getFlyingHours());
        System.out.println("Second pilot: " + p2);
    }
}