package OOP;

public class Hourly extends Employees {
    private int hoursWorked;
    private double rate;
    private int id;

    public Hourly(String name) {
        super(name);
    }

    @Override
    public double calculatePay() {
        return hoursWorked * rate;
    }


    public Hourly(String name,int hoursWorked, double rate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.rate = rate;

    }

    @Override
    public String toString() {
        return "Hourly{" +
                "hoursWorked=" + hoursWorked +
                ", rate=" + rate +
                ", id=" + getId() +
                '}';
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}