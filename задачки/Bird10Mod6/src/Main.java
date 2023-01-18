public class Main {
    public static void main(String[] args) {
        //String[] continents  = {"Winter", "Spring", "Summer", "Autumn"};
    Pigeon pigeon = new Pigeon(new String[]{"Winter", "Spring", "Summer", "Autumn"}, 10, 10);
    Bird bird = new Bird("birds", new String[]{"Winter", "Spring", "Summer", "Autumn"}, 10);
        System.out.println(bird);
    }
}