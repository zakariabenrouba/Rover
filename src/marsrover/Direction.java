package marsrover;

import marsrover.exceptions.DirectionException;

public enum Direction {

    EAST("E") {
        @Override
        public Direction left(){
            return NORTH;
        }

        @Override
        public Direction right(){
            return SOUTH;
        }
    },

    WEST("W") {
        @Override
        public Direction left(){
            return SOUTH;
        }

        @Override
        public Direction right(){
            return NORTH;
        }
    },

    NORTH("N") {
        @Override
        public Direction left(){
            return WEST;
        }

        @Override
        public Direction right(){
            return EAST;
        }
    },

    SOUTH("S") {
        @Override
        public Direction left(){
            return EAST;
        }

        @Override
        public Direction right(){
            return WEST;
        }
    };

    private String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public abstract Direction left();

    public abstract Direction right();

    public static Direction getDirection(String code) throws DirectionException {
        switch (code) {
            case "E" -> {return EAST;}
            case "W" -> {return WEST;}
            case "N" -> {return NORTH;}
            case "S" -> {return SOUTH;}
            default -> throw new DirectionException("invalide direction");
        }
    }

}
