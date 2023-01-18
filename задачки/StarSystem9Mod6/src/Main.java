public class Main {
    public static void main(String[] args) {
    SunSystem sunSystem = new SunSystem(8, 9, 10000000000l);
    StarSystem starSystem = new StarSystem("Vener", 6, 8);
        System.out.println(sunSystem.getInfo());
        System.out.println(starSystem.getInfo());
        //StarSystem.getInfo();
    }
}