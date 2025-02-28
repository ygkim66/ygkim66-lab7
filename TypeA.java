import java.util.Random;

public class TypeA extends Thing{
    public TypeA(){
        super();
    }

    public void maybeTurn(Random r) {
    if (r.nextInt(3) == 1)
        rightTurn();
    else
        leftTurn();
    }
}
