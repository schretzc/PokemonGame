
public class Pikachu extends Pokemon implements Attackable{
    private String attackOne;
    private String attackTwo;
    private String cardName;
    public Pikachu(){
        super();
        this.attackOne = "Quick Attack";
        this.attackTwo = "Electroball";
        this.cardName = "Pikachu";
    }
     
    //Quick Attack
    public void attackOne(Pokemon target){
        //deal 10 damage
        int currentHp = target.getHp();
        int resultingHp = currentHp - 10;
        target.setHp(resultingHp);
     }
     //electroball
        public void attackTwo(Pokemon target){
        //deal 60 damage
        int currentHp = target.getHp();
        int resultingHp = currentHp - 60;
        target.setHp(resultingHp);
     }

     @Override
     public String getName(){
        return cardName;
     }
}
