package OOP;

public abstract class Employees extends Person implements Discountable {


    private static int uniqueId = 0;
    private static int id;
    private Cloth[] clothes;
    private final double DISCOUNT = 0.1;
    private final double MANAGERDISCOUNT = 0.15;
    private boolean isManager;

   public Employees(String name,Cloth[] clothes) {
        super(name,clothes);
       this.id = ++uniqueId;
       this.clothes = clothes;
    }
    public Employees(String name,Cloth[] clothes,boolean manager) {
        super(name,clothes);
        this.id = ++uniqueId;
        this.clothes = clothes;
        this.isManager = manager;

    }

   public abstract void printBadge();

    public int getId() {
        return id;
    }

    @Override
    public double calculateDiscount(Cloth[] clothes) {
        double sum = 0;
        for (int i = 0; i < clothes.length; i++) {
            sum += clothes[i].getPrice();
        }
    if(isManager == true){
    return MANAGERDISCOUNT  * sum;
    }

       else {
    return DISCOUNT * sum;

    }
} }