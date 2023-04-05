package OOP;

public class Manager extends Employees{

    private Cloth[] clothes;


   public Manager(String name,Cloth[] clothes){
       super(name,clothes);
       this.clothes = clothes;
   }

    @Override
    public double calculateDiscount() {
        double sum = 0;
        for (int i = 0; i < clothes.length; i++) {
            sum += clothes[i].getPrice();
        }
        return sum * 0.15;
    }


    @Override
    public void printBadge() {
        System.out.println(getId());
    }

    @Override
    public double calculatePay() {
        return 0;
    }
}
