package transport;

public interface Swimmable {
    default void swim() {
        System.out.println("Swim");
    }
}
