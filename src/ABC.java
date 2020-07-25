// Anonymus arrays
// name less arrays are known as anonymus arrays
// purpose of anonymus array is just for instant use
// this facility is only for one time use
// int arr[] = new int[5];
// new int[]{10,20,30,40};
// new int[][]{{10,20},{30,40}};
// passing anonymus array as an argument to a method
// i will print the value of all array elements
// i will use the for each loop to do this


import java.util.Scanner;
public class ABC {

public void show(int tarr[])  // instance method
{
  // for each element inside the array
  for (int a:tarr )
  {
    System.out.println(a);
  }
  for (int i = 0; i <tarr.length ; i++) {
    System.out.println(tarr[i]);

  }
}
  public static void main(String[] args) {

  ABC obj = new ABC();  // object creation
  obj.show(new int[]{10,20,30,40});



  }
}
