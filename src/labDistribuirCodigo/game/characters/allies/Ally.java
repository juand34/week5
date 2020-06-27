package labDistribuirCodigo.game.characters.allies;

import labDistribuirCodigo.game.characters.Character;

/**
 * This class model an ally for an adventure game
 * @author uc3m
 * @version 1.0
 */
public class Ally extends Character{
    /**
     * Construct a new Ally using the specified name, description and weapon
     * @param name The String to be used as the name
     * @param description The String to be used as the description
     * @param secretWeapon The int to be used as secretWeapon.
     * @see Character
     */
    public Ally(String name, String description, int secretWeapon){
        super(name, description,secretWeapon);
    }

}