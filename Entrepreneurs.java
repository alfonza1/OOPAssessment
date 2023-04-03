package OOP;

public class Entrepreneurs extends People{

    private double revenue;
    private double expenses;

    public Entrepreneurs(String name) {
        super(name);
    }
    public Entrepreneurs(String name,double revenue,double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
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
    public double calculatePay() {
        return revenue - expenses;
    }

    @Override
    public String toString() {
        return "Entrepreneurs{" +
                "revenue=" + revenue +
                ", expenses=" + expenses +
                '}';
    }
}
