package ZooScreen;

public class PopcornStall implements Soundable{
    public void print(){
        System.out.println(this);
    }

    @Override
    public void sound() {
        System.out.println("Hey! The best popcorn is here!");
    }

    @Override
    public String toString() {
        return "It's a PopcornStall";
    }

}
