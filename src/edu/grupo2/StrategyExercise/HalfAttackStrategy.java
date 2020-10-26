package edu.grupo2.StrategyExercise;

public class HalfAttackStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Ataque medio con %d jugadores \n", numberOfPlayers);
    }
}
