package person;

public class Main {
    public static void main(String[] args) {
        Person ivan = new Person(true, "Ivan");
        Person mariya = new Person(false, "Maria");

        ivan.marry(mariya);

        System.out.println("Ivan's spose: " + ivan.getSpouse().getName());
        System.out.println("Mariya's spose: " + mariya.getSpouse().getName());
    }
}