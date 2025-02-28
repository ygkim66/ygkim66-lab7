import java.util.Random;

public class TypeB extends Thing{
    public TypeB(){
        super();
    }

/* 
    public void maybeTurn(){
        super.maybeTurn();;
        setTime(getTime() + 1);
        if (getTime() == 10)
            setTime(0);
    }*/

    public void maybeTurn(Random r) {
        int i = r.nextInt(3);

        setTime(getTime() + 1);
        if (getTime() == 10)
            setTime(0);

        if (i == 1)
            rightTurn();
        else
            leftTurn();
    }
}
