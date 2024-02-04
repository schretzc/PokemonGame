public class TestPokemonCardGame {

    public static void main(String[] args){
       //MonteCarloSimulation test = new MonteCarloSimulation();
      // test.runMonte();
        Player c = new Player();
        c.drawHand();
        c.printHand();
        c.drawCard();
        c.drawCard();
        System.out.println("");
        c.printHand();
        c.discardCard(3);
        System.out.println("");
        c.printHand();
        //System.out.println(c.getDeck());
    }
}