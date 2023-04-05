package OOP;

public class Cloth {
    private String description;
    private double price;

   public Cloth(String description,double price){
       this.description = description;
       this.price = price;
}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
