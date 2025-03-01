import java.util.Random;

public class TypeA extends Thing{
    public TypeA(){
        super();
    }
    public TypeA(int r, int c, int d, char ch){
        super(r,c,d,ch);
    }

    public void maybeTurn(Random r) {
        step();
    if (r.nextInt(3) == 1)
        rightTurn();
    else
        leftTurn();
    }
}
