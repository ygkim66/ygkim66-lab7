import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab = 'r';
    private boolean isTypeB;

    public Thing(){
        row = 0;
        col = 0;
        dir = 0;
  //      timeSinceLast = 0;
        lab = 'r';
 //       isTypeB = false;

    }
 //   public Thing(int r, int c, char lab){

   // }
    
   // public Thing(int r, int c, int d, int t, char l, boolean b){
   public Thing(int r, int c, int d, char l){
        row = r;
        col = c;
        dir = d;
   //     timeSinceLast = t;
        lab = l;
     //   isTypeB = b;
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }
    
    public void leftTurn() {
        dir = (dir + 3) % 4;
    }
    public int getTime(){
        return timeSinceLast;
    }
    public void setTime(int i){
        timeSinceLast = i;
    }
   /*  public void maybeTurn() {
        Random rand = new Random(System.currentTimeMillis());
        int i = rand.nextInt(3);

        if (i == 1)
            rightTurn();
        else
            leftTurn();
    }*/
    public abstract void maybeTurn(Random r);

    public void step(){
        int[] dc = {0,1,0,-1};
        int[] dr = {1,0,-1,0};
        col = col + dc[dir];
        row = row + dr[dir];
    }
    public String toString(){
        return row + " " + col + " " + lab;
    }

}
