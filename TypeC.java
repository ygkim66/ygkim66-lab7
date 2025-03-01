import java.util.Random;

public class TypeC extends Thing {
    public TypeC(){
        super();
    }
    public void maybeTurn(Random r){
        int i = r.nextInt(3);


        /*setTime(getTime() + 1);
        if (getTime() < 15){
            rightTurn();
        }
        else{
            setTime(0);
            leftTurn();
        }*/

        rightTurn();
        leftTurn();
    }
}
