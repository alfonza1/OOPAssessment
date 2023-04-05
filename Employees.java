package OOP;

public abstract class Employees extends Person {


    private static int uniqueId = 0;
    private static int id;
    private Cloth[] clothes;


    public Employees(String name,Cloth[] clothes) {
        super(name,clothes);
       this.id = ++uniqueId;
       this.clothes = clothes;
    }

   public abstract void printBadge();
    public int getId() {
        return id;
    }


    public abstract double calculateDiscount();
}