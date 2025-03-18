package PokemonBattler;

import PokemonBattler.Pokemon.PokemonCreatures.*;
public class BattleTester {
    public static void main(String[] args) {
        Stadium battle = new Stadium();
        Squirtle coolGuy = new Squirtle();
        Charmander hotGuy = new Charmander();
        battle.battle(coolGuy, hotGuy);
    }
}
