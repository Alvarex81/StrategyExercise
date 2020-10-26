package edu.grupo2.StrategyExercise;

public class LongPassesStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Pases largos con %d jugadores \n", numberOfPlayers);
    }
}
