package OOP;

public class Main {


    public static void main(String[] args) {
        Salaried fonza = new Salaried("Alfonza",1000000);
       fonza.printBadge();
       //Employees.printBadge();
        Hourly employee2 = new Hourly("mike",10,10);
        //System.out.println(employee2.getId());
employee2.printBadge();
        Entrepreneurs entre1 = new Entrepreneurs("dan",10000,100);
        System.out.println(entre1);

       Person[] payable = {fonza,employee2,entre1};
Person.printPay(payable);



    }
}