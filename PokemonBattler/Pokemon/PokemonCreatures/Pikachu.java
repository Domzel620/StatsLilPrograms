package PokemonBattler.Pokemon.PokemonCreatures;

import PokemonBattler.Pokemon.Pokemon;

public class Pikachu extends Pokemon{

    //Default Pikachu
    public Pikachu(){
        setHp(35);
        setAttack(55);
        setDefense(30);
        setSpeed(90);
        setType("Electric");
        setWeakness("Fighting");
    }
}
