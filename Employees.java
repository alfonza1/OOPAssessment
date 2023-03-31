package OOP;

public abstract class Employees extends People implements Payable {


    private String name;
    private static int uniqueId = 0;
    private static int id;

    public Employees(String name) {
        super(name);
        this.name = getName();
       this.id = ++uniqueId;
    }
    public static void printBadge(){
        System.out.println(id);
    }
    public int getId() {
        return id;
    }

    @Override
    public abstract double calculatePay();

}