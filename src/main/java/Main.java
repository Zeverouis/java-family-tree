public class Main {
    public static void main(String[] args) {
        Person Johan = new Person("Johan", "Zachary", "Smith", 40, Sex.M);
        Person Mary = new Person("Mary", "Smith", 35, Sex.F);

        Person Bob = new Person("Bob", "Koekoe", 12, Sex.M);
        Person Alice = new Person("Alice", "Linda", "Koekoe", 14, Sex.F);

        Person Lulu = new Person("Delulu", "Craycray", 5, Sex.M);

        Pet Yoyo = new Pet("Yoyo", 1, "Puppy");

        Alice.addParents(Mary, Johan);
        Bob.addParents(Mary, Johan);

        Bob.addSibling(Alice);

        Alice.addChild(Lulu);

        Mary.getGrandChildren();

        Johan.addPet(Yoyo);

        System.out.println(Mary.getGrandChildren().getFirst().getName());
        System.out.println(Johan.getPets().get(0).getName());
        System.out.println(Lulu.getMother().getName());
        System.out.println(Alice.getChildren().get(0).getName());
    }
}
