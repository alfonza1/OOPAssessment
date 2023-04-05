package OOP;

public abstract class Person implements Payable{
    private String name;
    private Cloth[] clothingItems;

    public Person(String name,Cloth[] clothes) {
        this.name = name;
        this.clothingItems = clothes;
    }

    public String getName() {
        return name;
    }

    public static void printPay(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Payable) {
                Payable payable = (Payable) people[i];
                System.out.println(people[i].getName() + "'s pay: " + payable.calculatePay());
            }
            else {
                System.out.println("not payable");
            }
        }}

    public abstract double calculateDiscount();
}
