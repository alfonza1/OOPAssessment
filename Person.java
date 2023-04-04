package OOP;

public abstract class Person implements Payable{
    private String name;

    public Person(String name) {
        this.name = name;
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
        }

    }

}
