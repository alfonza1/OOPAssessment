package OOP;

public class Entrepreneurs extends Person {

    private double revenue;
    private double expenses;
    private Cloth[] clothes;

    public Entrepreneurs(String name,double revenue,double expenses,Cloth[] clothes) {
        super(name,clothes);
        this.revenue = revenue;
        this.expenses = expenses;
        this.clothes = clothes;
    }


    public double getRevenue() {

        return revenue;
    }


    public void setRevenue(double revenue) {

        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;

    }

        @Override
    public double calculatePay() {

        return revenue - expenses;
    }

    @Override
    public double calculateDiscount() {

        double sum = 0;
        for (int i = 0; i < clothes.length; i++) {
            sum += clothes[i].getPrice();
        }
        return sum * 0.02;
    }



    @Override
    public String toString() {
        return "Entrepreneurs{" +
                "revenue=" + revenue +
                ", expenses=" + expenses +
                '}';
    }

}
