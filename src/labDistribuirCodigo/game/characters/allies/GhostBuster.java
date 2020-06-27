package labDistribuirCodigo.game.characters.allies;

import labDistribuirCodigo.game.characters.Character;

/**
 * This class model an ally that fights against ghosts.
 * @author uc3m
 * @version 1.0
 */
public class GhostBuster extends Ally{
    /**
     * Construct a new GhostBuster using the specified name and description
     * the secret weapon for GhostBusters are always CHAINS and their footprint is
     * the character 'G' in uppercase
     * @param name The String to be used as the name
     * @param description The String to be used as the description
     * @see Ally
     */
    public GhostBuster(String name, String description){
        super(name, description,Character.CHAINS);
        footprint = 'G';
    }

    private void secretSkillAgainstGhosts(){
        System.out.println("This is my secret skill against Ghosts");

    }

}