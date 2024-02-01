//Christopher Schretzmann
//60 card deck
//In order to take a turn you need to have a basic pokemon in your hand
//hand of 7 cards
//every time you kill pokemon
//win condition take all prize cards, knock out all in play pokemon, or no cards in deck at beginning of opponent's

//lets write a monte caro simulation.
//use raw brute force, try to figure out something interesting

//what if your deck has exactly one pokemon. how many times would you expect to have to mulligan in order to have 
//your only pokemon in your hand?
//what if your deck had two... to 60?
//Write a simulation that shows the expected mulligans at 1-60 pokemons in your deck
//hypergeometric distribution
//numerical optimization
//monte carlo

import java.util.ArrayList;
public class PokemonCardGame {
    //deck of cards
    private Player playerOne;
    private Player playerTwo;
   
    public PokemonCardGame(){
        playerOne = new Player();
        playerTwo = new Player();
    }
    public void printHand(Player player){
        System.out.println("Hand: " + player.getHand());
    }
    public void printField(Player player){
        System.out.println("Active Pile: " + player.getActivePile());
    
    }
    public void printPrize(Player player){
        System.out.println(player.getPrizePile());
    }

    public void printCardStats(Player player){

    }

    public void setupGame(){

    }

    public void runGame(){
        while (playerOne.getPrizePile().size() > 0 || playerTwo.getPrizePile().size() > 0){
            playerOne.turn();
            playerTwo.turn();
    }
}

    /*
    public void runGame(){
        Pikachu pikaMain = new Pikachu();
        Pikachu pikaTarget = new Pikachu();
        Bulbasaur newBulb = new Bulbasaur();

        System.out.println("Bulbasaur USE Leechseed");
        newBulb.attackOne(pikaMain);
        System.out.println("Pika Main Hp: " + pikaMain.getHp() + "Bulbasaur Hp: " + newBulb.getHp());

        pikaMain.attackOne(newBulb);

        while(pikaTarget.getHp() > 0){
            System.out.println("Pikachu USE QUICK ATTACK!!!");
            pikaMain.attackOne(pikaTarget);
            //System.out.println("Pika Target Hp:" + pikaTarget.getHp());
            if (pikaTarget.getHp() == 0){
                System.out.println("Pika Target HP:" + pikaTarget.getHp());
                System.out.println("Pika Target has fainted!!!");
            }
            else{
                System.out.println("Pika Target HP:" + pikaTarget.getHp());
            }
        }
    }
    */
}
