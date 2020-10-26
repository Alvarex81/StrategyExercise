package edu.grupo2.StrategyExercise;

public class WaitGameStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.println("Esperar al rival");
    }
}
