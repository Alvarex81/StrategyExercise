package edu.grupo2.StrategyExercise;

public class CounterAttackStrategy implements GameStrategy {
    @Override
    public void play(int numberOfPlayers) {
        System.out.printf("Contra atacar con %d jugadores \n", numberOfPlayers);
    }
}
