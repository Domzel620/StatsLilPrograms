package PokemonBattler;

import PokemonBattler.Pokemon.PokemonCreatures.*;
public class Battler {
    public static void main(String[] args) {
        StadiumTester battle = new StadiumTester();
        Squirtle coolGuy = new Squirtle();
        Charmander hotGuy = new Charmander();
        battle.battle(coolGuy, hotGuy);
    }
}
