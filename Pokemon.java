
public class Pokemon extends Card {
    
    private int hp;

    public Pokemon(){
        this.hp = 70;
    }
    
    public int getHp(){
        return hp;
    }

    public void setHp(int userInputHp){
        this.hp = userInputHp;
    }    
}
