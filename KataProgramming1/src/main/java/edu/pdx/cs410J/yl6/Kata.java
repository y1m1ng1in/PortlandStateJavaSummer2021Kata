package edu.pdx.cs410J.yl6;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    if (args.length < 1) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }
    String result = compute(args[0]);
    System.out.print(result);
    System.exit(0);
  }

  private static String compute(String s) {
    StringBuilder sb = new StringBuilder();
    int num = Integer.parseInt(s);
    int count = 0;
    if (num % 3 == 0) {
      sb.append("Foo");
    } 
    if (num % 5 == 0) {
      sb.append("Bar");
    } 
    if (num % 7 == 0) {
      sb.append("Qix");
    } 
    String tmp = "";
    if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0) {
      // sb.append(num);
      s = s.replaceAll("0","*");
      tmp = s;
    }

    for (int i = 0; i < s.length(); ++i) {
      char c = s.charAt(i);

      if (c == '3') {
        sb.append("Foo");
      }
      if (c == '5') {
        sb.append("Bar");
      }
      if (c == '7') {
        sb.append("Qix");
      }
      if(c == '0'){
        sb.append('*');
      }
    }
    if (sb.length() == 0) {
      return tmp;
    }
    return sb.toString();
  }


}

