package OOP;

public abstract class Employees extends Person {


    private static int uniqueId = 0;
    private static int id;

    public Employees(String name) {
        super(name);
       this.id = ++uniqueId;
    }



   public abstract void printBadge();
    public int getId() {
        return id;
    }



}