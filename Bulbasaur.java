
public class Bulbasaur extends Pokemon implements Attackable {
    String attackOne = "Leech Seed";
    String attackTwo;
   public Bulbasaur(){
        super();
        this.attackOne = "Leech Seed";
    }

    //leechseed
    public void attackOne(Pokemon target){
        //deal 20 damage heal 20
        int currentHp = target.getHp();
        int resultingHp = currentHp - 20;
        
        
        int thisCurrentHp = this.getHp();
        this.setHp(thisCurrentHp + 20);

        target.setHp(resultingHp);
    }

    public void attackTwo(Pokemon target){

    }
}
