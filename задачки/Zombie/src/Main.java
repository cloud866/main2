public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.add(new Zombie("Alice"));
        battle.add(new Human("Bob"));
        //battle.add(new Zombie("Eve"));
        battle.add(new GiantSnake("Kaa"));
        battle.add(new Tower("Son of Kaa"));

        battle.start();
    }
}