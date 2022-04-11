package marsrover;

import marsrover.utils.InstructionsReader;

import java.util.List;


public class Application {
    public static void main(String[] args) throws Exception {
        Rover rover = new Rover();
        Position position = new Position();
        List<String> commandes= InstructionsReader.readCommandeFromFile("commandes.txt");
        Grid grid = new Grid(Integer.valueOf(commandes.get(0).split(" ")[0]),
                                Integer.valueOf(commandes.get(0).split(" ")[1]));
        for(int i=1; i<commandes.size();i++){
            if(commandes.get(i).matches("\\d \\d \\w")){
                position.setDirection(Direction.getDirection(commandes.get(i).split(" ")[2]));
                position.setX(Integer.valueOf(commandes.get(i).split(" ")[0]));
                position.setY(Integer.valueOf(commandes.get(i).split(" ")[1]));
                rover.setPosition(position);
            }else if(commandes.get(i).matches("[A-Z]+")){
                rover.execute(commandes.get(i).toString());
                System.out.println(rover.getPosition().toString());
            }
        }

    }
}