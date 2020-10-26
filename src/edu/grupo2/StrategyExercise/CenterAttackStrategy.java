package edu.grupo2.StrategyExercise;

public class CenterAttackStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Atacar por el centro con %d jugadores \n", numberOfPlayers);
    }
}
