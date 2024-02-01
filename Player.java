import java.util.ArrayList;
import java.util.Random;

public class Player {
    private ArrayList<Card> deck;  //this is the constructors job= new Card[];
    private ArrayList<Card> hand;
    private ArrayList<Card> prizePile;
    private ArrayList<Card> discardPile;
    private ArrayList<Card> benchPile;
    private ArrayList<Card> activePile;

    public Player(){
        deck = new ArrayList<Card>();
        hand = new ArrayList<Card>();
        prizePile = new ArrayList<Card>();
        discardPile = new ArrayList<Card>();
        benchPile = new ArrayList<Card>();
        activePile = new ArrayList<Card>();

        //fill deck with 20 of each type
        for(int i = 0; i < 20; i++){
            deck.add(new Energy());
            deck.add(new Trainer());
            deck.add(new Pokemon());
        } 
        //fill prize pile with 6 pokemon
        for(int i = 0; i < 6; i++){
            prizePile.add(new Pokemon());
        }  
    }
    
    //draws card randomly from deck and puts it in hand. 
     public Card drawCard() { 
        Random rng = new Random();
        //System.out.println(deck.size());
        int cardIndex = rng.nextInt(deck.size() ); //find random card
        Card drawnCard = deck.get(cardIndex);
        deck.remove(cardIndex);
        return drawnCard;
    }
    //Draw hand and check if pokemon is in hand
    public void drawHand(){
        for(int i = 0; i < 7; i++) { //counting to 7
            
            hand.add(drawCard());
        }
    }

    //discards card from hand and adds it to discard pile
    public void discardCard(int cardIndex){
        discardPile.add(hand.get(cardIndex));
        hand.remove(cardIndex);
    }

    //evaluates hand to see if there is a pokemon card.
    //returns true if so
    public boolean evaluateOpeningHand(){
        boolean havePokemon = false;
        for(int i = 0; i < hand.size(); i++){
            Card currentCard = hand.get(i);
            if(currentCard instanceof Pokemon){
                havePokemon = true;
            }
        }
        return havePokemon;
    }

    //adds card to bench pile if bench pile is not full
    public void addToBench(int cardNumber){
        if (benchPile.size() < 5){
            benchPile.add(hand.get(cardNumber));
            hand.remove(cardNumber);
        }
        else{
            System.out.println("Bench is full");
        }
    }

    //adds card to the active pile if the pile is empty
    public void addToActive(int cardNumber){
        if (activePile.size() < 1){
            activePile.add(hand.get(cardNumber));
            hand.remove(cardNumber);
        }
        else {
            System.out.println("Active is full");
        }
    }

    //removes prize card from prize pile and adds it to hand
    public void removePrizeCard(int cardNumber){
        hand.add(prizePile.get(cardNumber));
        prizePile.remove(cardNumber);
    }

    public void turn(){
        drawCard();
        //play pokemon
        //play energy
        //play trainer
        //attack w/ pokemon
        //attack w/ pokemon and end turn
    }

    public ArrayList<Card> getDeck(){
        return deck;
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public ArrayList<Card> getPrizePile(){
        return prizePile;
    }

    public ArrayList<Card> getDiscardPile(){
        return discardPile;
    }

    public ArrayList<Card> getBenchPile(){
        return benchPile;
    }

    public ArrayList<Card> getActivePile(){
        return activePile;
    }
     
}
