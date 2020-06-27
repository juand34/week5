package labDistribuirCodigo.game.characters.enemies;

import labDistribuirCodigo.game.characters.Character;

/**
 * This class model a generic vampire to be used in a simple game
 * @author: uc3m
 * @version: 1.0
 */
public class Vampire extends Enemy {
    /**
     * Construct a new Vampire using the specified name and description
     * the secret weapon for Vampires are always TEETH and their footprint is
     * the character 'v' in lowercase
     * @param name The String to be used as the name
     * @param description The String to be used as the description
     * @see Enemy
     */
    public Vampire(String name, String description){
        super(name, description, Character.TEETH);
        footprint = 'v';
    }
}