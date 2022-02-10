package Class02.Exc2_1;

public class Pilot {
    private String name;
    private double salary;
    private int flyingHours;

    public Pilot(String nm) {
        name = nm;
    }

    public void increaseFlyingHoursWith(int amount) {
        flyingHours = flyingHours + amount;
    }

    public void setSalary (double amount) {
        salary = amount;
    }

    public int getFlyingHours() {
        return flyingHours;
    }

    public String toString() {
        return name + " has made " + flyingHours + " flying hours and earns " + salary;
    }
}
