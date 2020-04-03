package classes;

public class class0207 {


  /**
   *        BTG
   *
   *        mult(5,3)
   *        5 + mult(5,2)
   *          5 + mult(5,1)
   *            5 + mult(5,0)
   *              0
   *
   *
   * BTG should teach us how to modify recursion
   *
   *
   *        BTG
   *        mult(-5,-2)
   *
   *
   *
   * @param a
   * @param b
   * @return
   */
  public static int mult(int a, int b) {
    if ( b < 0) {
      return -a + mult(a, b + 1);
    } else if (b > 0) {
      return a + mult(a, b - 1);
    }
      return 0;
  }

  public static int div(int a, int b) {
    if (a < b) {
      return 0;
    } else {
      return 1 + div(a - b,b);
    }
  }

  public static void main(String[] args) {
//    System.out.println(mult(-4,5));
//    System.out.println(mult(4,-5));
//    System.out.println(mult(-4,-5));

    System.out.println(div(5,2));
    System.out.println(div(-5,2));
    System.out.println(div(-5,-2));
    System.out.println(div(5,0));
    System.out.println(div(0,5));
  }

//  public boolean stuff(String s) {
//    if ((s.length() == 0) || (s.length() == 1)) {
//      return true;
//    } else if (s.charAt(0) == s.charAt(s.length() - 1)) {
//      return s.substring(1, s.length() - 2);
//    }
//  }
}
