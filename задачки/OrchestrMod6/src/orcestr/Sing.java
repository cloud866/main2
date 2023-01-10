package orcestr;

public class Sing implements Musical{

    private final String name;
    private final boolean redPidzhak = true;

    public Sing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void greet() {
        System.out.println("Привет, друзья! Я " + name + "!");
    }

    @Override
    public void play() {
        System.out.println("ЯЯаахууу-вооаахаа");
    }
}
