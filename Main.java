package OOP;

public class Main {


    public static void main(String[] args) {



       Cloth hoodie = new Cloth("Sp5der Hoodie", 220.0);
        Cloth hoodieTwo = new Cloth("Sp5der Hoodie", 220.0);
        Cloth hoodieThree = new Cloth("Sp5der Hoodie", 220.0);
        Cloth hoodieFour = new Cloth("Sp5der Hoodie", 220.0);
       Cloth[] hoodies = {hoodie, hoodieTwo, hoodieThree, hoodieFour};

        Salaried fonza = new Salaried("Alfonza",1000000,hoodies);

        System.out.println(fonza.calculateDiscount(hoodies));

        Manager mikaila = new Manager("Mikaila",hoodies,true);
        System.out.println(mikaila.calculateDiscount(hoodies));

        Entrepreneurs entre = new Entrepreneurs("IDK",1,1,hoodies);
        System.out.println(entre.calculateDiscount(hoodies));



    }
}