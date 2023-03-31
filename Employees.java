package OOP;

public abstract class Employees extends People implements Payable {


    private String name;
    private static int uniqueId = 0;
    private  int id;

    public Employees(String name) {
        super(name);
        this.name = getName();
       this.id = ++uniqueId;
    }
    public void printBadge(){
        System.out.println(uniqueId);
    }
    public int getId() {
        return id;
    }

    @Override
    public abstract double calculatePay();

}