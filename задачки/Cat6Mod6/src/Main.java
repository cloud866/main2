public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob", 5, "Gary");
        PedigreeCat catt = new PedigreeCat("Bobb", 6, "Jeb", "Kolly");
        System.out.println(cat);
        System.out.println(catt);
    }
}