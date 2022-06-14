package model;

public class Rules {
    private int main;

    public Rules(int main){
        this.main = main;

    }

    public int calculMain(){
        return this.main;
    }

    public boolean isNotLoose(){
        if(main > 21){
            return false;
        }
        return true;
    }

    public String compareMain(int main1, int main2){
        if(main1 > main2){
            return "main 1 gagne";
        }
        else{
            return "main 2 gagne";
        }
    }
}
