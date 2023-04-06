package OOP;

public class Hourly extends Employees  {
    private int hoursWorked;
    private double rate;
    private Cloth[] clothes;


    public Hourly(String name,int hoursWorked, double rate,Cloth[] clothes) {
        super(name,clothes);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
        this.clothes = clothes;
    }

    @Override
    public void printBadge() {
        System.out.println(getId());
    }

    @Override
    public double calculatePay() {
        return hoursWorked * rate;
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