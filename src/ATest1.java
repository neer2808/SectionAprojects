import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// instance of the class is known as object
// instance variable ( member variables of the class are known as instance variable
public class ATest1 {
  static public void m1() throws Exception
  {
    m2();
  }
  static public void m2()throws Exception
  {
    // problem raised
  }  public static void main(String[] args) throws Exception{
    ATest1.m1();

  }

}



















