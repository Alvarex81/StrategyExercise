package edu.grupo2.StrategyExercise;

public class WingAttackStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Atacar por las bandas con %d jugadores \n", numberOfPlayers);
    }
}
