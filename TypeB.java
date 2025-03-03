import java.util.Random;

public class TypeB extends Thing{
    private int timeSinceLast;
    
    public TypeB(){
        super();
        timeSinceLast = 0;
    }

    public TypeB(int r, int c, int d, char lab){
        super(r, c, d,lab);
    }

    public void maybeTurn(Random r) {
        int i = r.nextInt(3);

        timeSinceLast++;
        if (timeSinceLast == 10){
            timeSinceLast = 0;

            if (i == 1){
                rightTurn();
            }
            else{
                leftTurn();
            }
        }
    }
}
