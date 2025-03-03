import java.util.Random;

public abstract class Thing {
    protected int row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab;

    public Thing(){
        row = 0;
        col = 0;
        dir = (int) ((3-0+1)*Math.random()) ;
        lab = 'r';
    }

    
   public Thing(int r, int c, int d, char l){
        row = r;
        col = c;
        dir = d;
        lab = l;
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
