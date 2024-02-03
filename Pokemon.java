
public class Pokemon extends Card {
    
    private int hp;
    private String name;

    public Pokemon(){
        this.hp = 70;
        this.name = name;
    }
    
    public int getHp(){
        return hp;
    }

    public void setHp(int userInputHp){
        this.hp = userInputHp;
    }    
}
