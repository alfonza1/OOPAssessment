package OOP;

public class Manager extends Employees implements Discountable {

    private Cloth[] clothes;

    private boolean isManager = true;
   public Manager(String name,Cloth[] clothes,boolean istrue){
       super(name,clothes,istrue);
       this.clothes = clothes;
       isManager = istrue;
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
