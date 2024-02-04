
public class Bulbasaur extends Pokemon implements Attackable {
    private String attackOne;
    private String attackTwo;
    public Bulbasaur(){
        setHp(70);
        this.attackOne = "Leech Seed";
        this.attackTwo = "Vine Whip";
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
    //vine whip
    public void attackTwo(Pokemon target){
        //deal 45 damage
        int currentHp = target.getHp();
        int resultingHp = currentHp - 45;
        target.setHp(resultingHp);
     }

    @Override
    public String getName(){
        return "Bulbasaur";
    }
}
