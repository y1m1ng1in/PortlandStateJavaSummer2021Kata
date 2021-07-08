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
    System.out.println(result);
    System.exit(0);
  }

   private static String compute(String s) {
    StringBuilder sb = new StringBuilder();
  
    for (int i = 0; i < s.length(); ++i) {
      char c = s.charAt(i);
      int num = Integer.parseInt(c);
      if (num % 3 == 0) {
        sb.append("Foo");
      }
      if (num % 5 == 0) {
        sb.append("Bar");
      }
      if (num % 7 == 0) {
        sb.append("Qix");
      }
    }
    return sb.toString();
  }
}

