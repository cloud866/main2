public class Warrior extends Player {
    String armor;

    public Warrior(int hp, int level, String type, String weapon, String armor) {
        super(hp, level, type, weapon);
        this.armor = armor;
    }

    public String getFullInfo() {
        return hp + " " + level + " " + type + " " + weapon + " " + armor;
    }

    public void levelUp() {
        level++;
    }

    public boolean doDamage() {
        return true;
    }
}
