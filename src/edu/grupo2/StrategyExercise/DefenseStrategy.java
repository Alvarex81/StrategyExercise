package edu.grupo2.StrategyExercise;

public class DefenseStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Defender con %d jugadores \n", numberOfPlayers);
    }
}
