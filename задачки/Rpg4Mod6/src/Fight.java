public class Fight {
    public static void main(String[] args) {

        Ork ork = new Ork("Groot", 200, 17);
        Elf elf = new Elf("Elage", 150, 20);

        fight(ork, elf);

    }

    private static void fight(Creature firstFighter, Creature secondFighter) {

        while (secondFighter.isAlive() && firstFighter.isAlive()) {

            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }

        if (firstFighter.isAlive()) {

            System.out.printf("%s with name %s is dead\n", secondFighter.getClass().getSimpleName(), secondFighter.getName());
            System.out.printf("%s with name %s win", firstFighter.getClass().getSimpleName(), firstFighter.getName());

        } else if (secondFighter.isAlive()) {

            System.out.printf("%s with name %s is dead\n", firstFighter.getClass().getSimpleName(), firstFighter.getName());
            System.out.printf("%s with name %s win", secondFighter.getClass().getSimpleName(), secondFighter.getName());
        } else {

            System.out.println("All are dead...");
        }
    }

}