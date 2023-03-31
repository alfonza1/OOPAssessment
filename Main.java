package OOP;

public class Main {


    public static void main(String[] args) {
        Salaried fonza = new Salaried("Alfonza",1000000);
        System.out.println(fonza);
        Hourly employee2 = new Hourly("mike",10,10);
        System.out.println(employee2);
        Entrepreneurs entre1 = new Entrepreneurs("dan",10000,100);
        System.out.println(entre1);

        Payable[] payable = new Payable[]{fonza, employee2, entre1};
        for (int i = 0; i < payable.length; i++) {
            Employees employee = (Employees) payable[i];
            System.out.println(employee.getName() + "'s pay: " + payable[i].calculatePay());
        }

    }
}