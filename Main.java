package OOP;

public class Main {


    public static void main(String[] args) {



       Cloth hoodie = new Cloth("Sp5der Hoodie", 220.0);
        Cloth hoodieTwo = new Cloth("Sp5der Hoodie", 220.0);
        Cloth hoodieThree = new Cloth("Sp5der Hoodie", 220.0);
        Cloth hoodieFour = new Cloth("Sp5der Hoodie", 220.0);
       Cloth[] hoodies = {hoodie, hoodieTwo, hoodieThree, hoodieFour};

        Salaried fonza = new Salaried("Alfonza",1000000,hoodies);
        System.out.println(fonza.calculateDiscount());

        Manager mikaila = new Manager("Mikaila",hoodies);
        System.out.println(mikaila.calculateDiscount());

        Hourly hourly = new Hourly("IDK",1,1,hoodies);
        System.out.println(hourly.calculateDiscount());

        Entrepreneurs entre = new Entrepreneurs("IDK",1,1,hoodies);
        System.out.println(entre.calculateDiscount());



    }
}