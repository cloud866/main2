import orcestr.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Musical>musicals = new LinkedList<>();

        musicals.add(new Guitar());
        musicals.add(new Violin());

        Orchestra orchestra = new Orchestra(musicals);

        orchestra.addMusician(new Drum());
        orchestra.addMusician(new Bas());
        orchestra.addMusician(new Piano());

        orchestra.play();
    }
}