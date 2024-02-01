
public class Pikachu extends Pokemon implements Attackable{
    private String attackOne;
    private String attackTwo;
    public Pikachu(){
        super();
        this.attackOne = "Quick Attack";
        this.attackTwo = "Electroball";
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
}
//str att 1 =
