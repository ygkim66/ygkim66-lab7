import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.*;
import java.io.*;

public class Lab7_Tester {

  private boolean checkInFile(String filename, String phrase){
    try {
      File file = new File("./" + filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()){
        String line = scanner.nextLine();
        line = line.replaceAll("\\s+","") ;
        phrase = phrase.replaceAll("\\s+","") ;
        if (line.contains(phrase))
          return true;
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }

  private boolean checkNotInFile(String filename, String phrase){
    try {
      File file = new File("./" + filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()){
        String line = scanner.nextLine();
        line = line.replaceAll("\\s+","") ;
        phrase = phrase.replaceAll("\\s+","") ;
        if (line.contains(phrase))
          return false;
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return true;
  }

    private boolean checkNoStatic(String filename){
    try {
      File file = new File("./" + filename);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()){
        String line = scanner.nextLine();
        line = line.replaceAll("\\s+","") ;
        if (line.contains("static") && !line.contains("publicstaticvoidmain"))
          return false;
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return true;
  }

  @Test
  public void test1() {
    System.out.println("checking Type-s extend Thing");
    assertEquals(true, checkInFile("TypeA.java", "public class TypeA extends Thing"));
    assertEquals(true, checkInFile("TypeB.java", "public class TypeB extends Thing"));
  }

  @Test
  public void test2() {
    System.out.println("Thing does not use if-statements nor the instanceof operator");
    assertEquals(true, checkNotInFile("Thing.java", "instanceof"));
  }

  @Test
  public void test3() {
    System.out.println("no static methods besides main in any of your classes");
    assertEquals(true, checkNoStatic("Thing.java"));
    assertEquals(true, checkNoStatic("TypeA.java"));
    assertEquals(true, checkNoStatic("TypeB.java"));
    assertEquals(true, checkNoStatic("TypeC.java"));
    assertEquals(true, checkNoStatic("Thing.java"));
  }

  @Test
  public void test4() {
    System.out.println("the Thing class is responsible for movement, utilizing good OOP");
    System.out.println("TypeA and TypeB contain the minimum number of methods necessary, utilizing good OOP");
    assertEquals(true, checkInFile("Thing.java", "public void rightTurn()"));
    assertEquals(true, checkNotInFile("TypeA.java", "public void rightTurn"));
    assertEquals(true, checkNotInFile("TypeB.java", "public void rightTurn"));
    assertEquals(true, checkNotInFile("TypeC.java", "public void rightTurn"));
    assertEquals(true, checkInFile("Thing.java", "public void leftTurn()"));
    assertEquals(true, checkNotInFile("TypeA.java", "public void leftTurn"));
    assertEquals(true, checkNotInFile("TypeB.java", "public void leftTurn"));
    assertEquals(true, checkNotInFile("TypeC.java", "public void leftTurn"));
    assertEquals(true, checkInFile("Thing.java", "public void step()"));
    assertEquals(true, checkNotInFile("TypeA.java", "public void step"));
    assertEquals(true, checkNotInFile("TypeB.java", "public void step"));
    assertEquals(true, checkNotInFile("TypeC.java", "public void step"));
    assertEquals(true, checkInFile("Thing.java", "void maybeTurn(Random"));
    assertEquals(true, checkInFile("TypeA.java", "public void maybeTurn(Random"));
    assertEquals(true, checkInFile("TypeB.java", "public void maybeTurn(Random"));
    assertEquals(true, checkInFile("TypeC.java", "public void maybeTurn(Random"));
  }

  @Test
  public void test5() {
    System.out.println("the Thing class uses abstraction appropriately in all places, utilizing good OOP");
    assertEquals(true, checkInFile("Thing.java", "public abstract void maybeTurn(Random"));
    assertEquals(true, checkInFile("Thing.java", "abstract class Thing"));
  }

  @Test
  public void test6() {
    System.out.println("the ThingList class contains the Node class as an inner class, utilizing good OOP");
    assertEquals(true, checkInFile("ThingList.java", "private class Node"));
    assertEquals(true, checkInFile("ThingList.java", "Node next;"));
    assertEquals(true, checkInFile("ThingList.java", "Thing data;"));
  }

  @Test
  public void test7() {
    System.out.println("the ThingList class has methods to addAll, moveAll, and printAll Things inside the list/queue");
    assertEquals(true, checkInFile("ThingList.java", "public void addThing(Thing"));
    assertEquals(true, checkInFile("ThingList.java", "public void printAll()"));
    assertEquals(true, checkInFile("ThingList.java", "public void moveAll(Random"));
  }

  @Test
  public void test8() {
    System.out.println("TypeA and TypeB contain the minimum number of fields necessary (declare each on a new line), utilizing good OOP");
    System.out.println("the `Thing` class contains the appropriate fields, utilizing good OOP");
    boolean found_row = checkInFile("Thing.java", "protected int row") || checkInFile("Thing.java", "private int row");
    boolean found_col = checkInFile("Thing.java", "protected int col") || checkInFile("Thing.java", "private int col");
    boolean found_dir = checkInFile("Thing.java", "protected int dir") || checkInFile("Thing.java", "private int dir");
    boolean found_lab = checkInFile("Thing.java", "protected char lab") || checkInFile("Thing.java", "private char lab");
    assertEquals(true, found_row);
    assertEquals(true, found_col);
    assertEquals(true, found_dir);
    assertEquals(true, found_lab);

    boolean not_found_row = checkNotInFile("TypeA.java", "protected int row") && checkNotInFile("TypeA.java", "private int row") && checkNotInFile("TypeA.java", "public int row");
    boolean not_found_col = checkNotInFile("TypeA.java", "protected int col") && checkNotInFile("TypeA.java", "private int col") && checkNotInFile("TypeA.java", "public int col");
    boolean not_found_dir = checkNotInFile("TypeA.java", "protected int dir") && checkNotInFile("TypeA.java", "private int dir") && checkNotInFile("TypeA.java", "public int dir");
    boolean not_found_lab = checkNotInFile("TypeA.java", "protected char lab") && checkNotInFile("TypeA.java", "private char lab") && checkNotInFile("TypeA.java", "public char lab");
    assertEquals(true, not_found_row);
    assertEquals(true, not_found_col);
    assertEquals(true, not_found_dir);
    assertEquals(true, not_found_lab);

    not_found_row = checkNotInFile("TypeB.java", "protected int row") && checkNotInFile("TypeB.java", "private int row") && checkNotInFile("TypeB.java", "public int row");
    not_found_col = checkNotInFile("TypeB.java", "protected int col") && checkNotInFile("TypeB.java", "private int col") && checkNotInFile("TypeB.java", "public int col");
    not_found_dir = checkNotInFile("TypeB.java", "protected int dir") && checkNotInFile("TypeB.java", "private int dir") && checkNotInFile("TypeB.java", "public int dir");
    not_found_lab = checkNotInFile("TypeB.java", "protected char lab") && checkNotInFile("TypeB.java", "private char lab") && checkNotInFile("TypeB.java", "public char lab");
    assertEquals(true, not_found_row);
    assertEquals(true, not_found_col);
    assertEquals(true, not_found_dir);
    assertEquals(true, not_found_lab);
  }

}
