public class character{
    private String name;
    private int level;
    private int exp;
    private int nextXP;


    public void setNameOfCharacter(String selectedName){
        selectedName = name;
    }

    public void levelUp(){
        if(exp >= nextXP){
            level +=1;
        }
    }

    
}