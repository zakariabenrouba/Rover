package marsrover.movement;

import marsrover.Grid;
import marsrover.Position;
import marsrover.exceptions.DirectionException;

public interface IMovement {
    public Position turnRight(Position position);
    public Position turnLeft(Position position);
    public Position move(Position position) throws DirectionException;
    public boolean isPositionWithinGrid(Position position, Grid grid);
}
