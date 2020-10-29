package edu.grupo2.StrategyExercise;

public class StrategyApp {

    public static void main(String[] args) {

        Team team = new Team();
        team.play(0);

        //tenemos el balon
        team.setGameStrategy(new AttackStrategy());
        team.play(5);

        //Sin balon
        team.setGameStrategy(new DefenseStrategy());
        team.play(8);

        //Medio Ataque
        team.setGameStrategy(new HalfAttackStrategy());
        team.play(1);

        //Aplicacion de Lambda
        team.setGameStrategy(numberOfPlayers -> System.out.println("Simula faltas"));
        team.play(0);

        //Atacar por las bandas - Alvaro
        team.setGameStrategy(new WingAttackStrategy());
        team.play(4);

        //Atacar por el centro - Guillermo
        team.setGameStrategy(new CenterAttackStrategy());
        team.play(5);

        //Contrataque - Patricia
        team.setGameStrategy(new CounterAttackStrategy());
        team.play(4);

        //Pases largos - Manuel
        team.setGameStrategy(new LongPassesStrategy());
        team.play(4);
    }
}
