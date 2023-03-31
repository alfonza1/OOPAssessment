package OOP;

public class Salaried extends Employees {
    private double salary;
    private int id;


    public Salaried(String name,double salary) {
        super(name);
        this.salary = salary;

    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salaried{" +
                "salary=" + salary +
                ", id=" + getId() +
                '}';
    }


    @Override
    public double calculatePay() {
        return salary;
    }
}