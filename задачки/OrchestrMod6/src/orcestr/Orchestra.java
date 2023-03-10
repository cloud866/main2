package orcestr;

import java.util.List;

public class Orchestra {
    private List<Musical> musicians;

    public Orchestra(List<Musical> musicians) {
        this.musicians = musicians;
    }

    public void addMusician(Musical m) {
        this.musicians.add(m);
    }

    public void play() {
        for (Musical m : musicians) {
            m.play();
        }

        musicians.forEach(Musical :: play);
    }
}
