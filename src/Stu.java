import java.util.Scanner;

public class Stu {
  public int rollno;  // member attributes
  public String name;
  public void show() // member method
  {
    System.out.println(rollno + "  " + name);
  }
}// end of the student class

class StuTest
{
  public static void main(String[] args) {
//    Stu obj = new Stu();
//   obj.rollno = 10;
//   obj.name = "aaa";
//   obj.show();
//   Stu obj1 = new Stu();
//   obj1.rollno= 20;
//   obj1.name = "bbb";
//   obj1.show();
    Scanner s = new Scanner(System.in);
    Stu arr[] = new Stu[5];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new Stu();
      arr[i].rollno = s.nextInt();
      s.nextLine();
      arr[i].name = s.nextLine();
    }
    for (int i = 0; i < arr.length; i++) {
      arr[i].show();
    }
// array element assignment
    int arr1[] = new int[5];
    arr1[0] = 10;
    arr1[1] = 'a';
// inheritance
// class first {  // member attributes}
// class second extends first {  //member attributes
 // }

Object arr2[] = new Object[5];
arr2[0] = new Object();
arr2[1] = new String("neeraj");
arr2[2] = new Integer(1);


  }
}

