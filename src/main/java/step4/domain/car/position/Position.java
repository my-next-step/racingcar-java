package step4.domain.car.position;

public class Position {
    private int position;

    public Position() {
        position = 0;
    }

    public final void increase() {
        position++;
    }

    public final int position() {
        return position;
    }

}