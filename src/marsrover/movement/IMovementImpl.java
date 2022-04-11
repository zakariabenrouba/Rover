package marsrover.movement;

import marsrover.Grid;
import marsrover.Position;
import marsrover.exceptions.DirectionException;

public class IMovementImpl implements IMovement{
    @Override
    public Position turnRight(Position position) {
        return new Position(position.getX(), position.getY(), position.getDirection().right());
    }

    @Override
    public Position turnLeft(Position position) {
        return new Position(position.getX(), position.getY(), position.getDirection().left());
    }

    @Override
    public Position move(Position position) throws DirectionException {
        switch (position.getDirection()) {
            case EAST -> {
                position.setX(position.getX() + 1);
                position.setY(position.getY());
                position.setDirection(position.getDirection());
                return position;
            }
            case NORTH -> {
                position.setX(position.getX());
                position.setY(position.getY() + 1);
                position.setDirection(position.getDirection());
                return position;
            }
            case SOUTH -> {
                position.setX(position.getX());
                position.setY(position.getY() - 1);
                position.setDirection(position.getDirection());
                return position;
            }
            case WEST -> {
                position.setX(position.getX() - 1);
                position.setY(position.getY());
                position.setDirection(position.getDirection());
                return position;
            }
            default -> throw new DirectionException("Direction inconnue");
        }
    }

    @Override
    public boolean isPositionWithinGrid(Position position, Grid grid) {
        return position.getX() <= grid.getX_length() && position.getY() <= grid.getY_length();
    }
}
