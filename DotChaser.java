import java.util.*;

public class DotChaser {
  public Random rand = new Random(System.currentTimeMillis());

  /**
   * A "Thing" moves in a grid world. A TypeA Thing randomly
   * decides to turn left or right (or not turn) every "round",
   * and, afterward, takes a step forward.  A TypeB Thing
   * only considers making a random turn every 10th round.
   *
   * A STATIC CLASS? OH NO! GET IT OUT OF HERE!
   *
  public static class Thing {
    // dir: 0=North, 1=East, 2=South, 3=West.
    // timeSinceLast: this is only important for "TypeB" Things.
    public int  row, col, dir, timeSinceLast;
    public char lab = 'r';
    public boolean isTypeB;
  }

  /**
   * This static method is ok :)
   */
  public static void main(String[] args) {
    int N = 20000;
    int count = 0;
    ThingList list = new ThingList();

    if( args.length != 0 )
      N = Integer.parseInt(args[0]); 

    while(count < N){
      count++;
      Random r = new Random(System.currentTimeMillis());
      int i = r.nextInt(3);
      if (count % 100 == 0){
        list.addThing(new TypeA(45,50, 0, 'r')); 
        list.addThing(new TypeB(55,50, 1, 'b'));
        list.addThing(new TypeC(100, 43, 2, 'y'));
      }
      if (count % 99 == 0){
        list.moveAll(r);
      }
      list.printAll();
      System.out.println("done");
      System.out.flush();
    }
 
  }
}
