package src.helper.java;
import java.util.Scanner;

public class Helper {

  public static void out(Object val, int type){
     if(type == 1) {
       System.out.println(val);
     } else {
       System.out.print(val);
    } 
  }

  public static boolean isEqual(Object actual, Object expected, int type) {
    if (type == 1){
      if (actual == expected){
        return true;
      } else {
        return false;
      }
    } else {
      if(actual.equals(expected)){
        return true;
      } else {
        return false;
      }
    }
  }

  public static int inputInt(String text){
    int val;
    Scanner in = new Scanner(System.in);
    out(text, 2);
    val = in.nextInt();
    return val;
  }

  public static String inputStr(String text){
    String val;
    Scanner in = new Scanner(System.in);
    out(text, 2);
    val = in.nextLine();
    return val;
  }

  public static float inputFloat(String text){
    float val;
    Scanner in = new Scanner(System.in);
    out(text, 2);
    val = in.nextFloat();
    return val;
  }

  public static boolean inputBoolean(String text){
    boolean val;
    Scanner in = new Scanner(System.in);
    out(text, 2);
    val = in.nextBoolean();
    return val;
  }

  public static void list(Object[] val){
    for (int i = 0; i < val.length; i++){
      out(i+1 + "." + val[i], 1);
    }
  }

}

