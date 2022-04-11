package marsrover;

import marsrover.exceptions.CommandeException;
import marsrover.exceptions.DirectionException;
import marsrover.movement.IMovement;
import marsrover.movement.IMovementImpl;
import marsrover.utils.Constants;

public class Rover {
    private Position position;
    private IMovement iMovement;

    public Rover(){
        iMovement=new IMovementImpl();
    }

    public Position getPosition() {
        return position;
    }

    public void execute(String commands) throws CommandeException, DirectionException {
        if(commands.length()==0)
            throw new CommandeException("la commande ne peut pas être vide");
        else {
            for(char c : commands.toCharArray()){
                switch(c){
                    case Constants.LEFT -> {
                        this.setPosition(this.iMovement.turnLeft(this.getPosition()));
                    }
                    case Constants.RIGHT -> {
                        this.setPosition(this.iMovement.turnRight(this.getPosition()));
                    }
                    case Constants.AHEAD -> {
                        this.setPosition(this.iMovement.move(this.getPosition()));
                    }
                    default -> throw new CommandeException("invalide commande");
                }
            }
        }
    }

    public void setPosition(Position position) {
        this.position=position;
    }


}