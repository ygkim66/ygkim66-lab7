import java.util.Random;

public class TypeC extends Thing {
    public TypeC(){
        super();
    }
    public TypeC(int r, int c, int d, char l){
        super(r, c, d, l);
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
        step();
        leftTurn();
       // step();
    }
}
