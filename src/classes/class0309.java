package classes;

public class class0309 {
  int A;
  int B;
  int C;
  int N = 100;
  int i = 0;
  int j = 0;

  public void exampleOne() {
    A = A + B + C;
    System.out.println(A);
  }

  public void exampleTwo() {
    for (i = 0; i < N; ++i) {
      System.out.println("i = " + i);
      for (j = 0; j < N; ++j) {
        System.out.println("j = " + j);
      }
      System.out.println("i + j = " + (i + j));
    }
  }

  public void exampleThree() {
    i = 0;
    while (i < N) {
      System.out.println(i);
      j = 0;
      while (j < N) {
        System.out.println(j);
        System.out.println();
        j++;
      }
      System.out.println(i + j);
      i = i + 1;
    }
  }

  public static void main(String[] args) {
    class0309 c = new class0309();
    c.exampleThree();
  }
}
