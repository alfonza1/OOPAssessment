package OOP;

public class Salaried extends Employees  {
    private double salary;


    public Salaried(String name,double salary) {
        super(name);
        this.salary = salary;

    }
    @Override
   public void printBadge(){
        System.out.println( getId());
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
        return salary / 12 ;
    }
}