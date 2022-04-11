package marsrover;

public class Grid {
    public int x_length;
    public int y_length;

    public Grid(int x_length, int y_length) {
        this.x_length = x_length;
        this.y_length = y_length;
    }

    public int getX_length() {
        return x_length;
    }

    public void setX_length(int x_length) {
        this.x_length = x_length;
    }

    public int getY_length() {
        return y_length;
    }

    public void setY_length(int y_length) {
        this.y_length = y_length;
    }
}
