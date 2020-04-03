package classes;

public class class0228 {

  public void exampleOne() {
    int i = 0;                  // 1
    while (i < 1000) {          // 1001
      System.out.println("Hi"); // 1000
      ++i;                      // 1000
    }
  }

  public void exampleTwo() {
    int i = 0;                  // 1
    int N = 100;

    while (i < N) {             // N + 1
      System.out.println("HI"); // N
      ++i;                      // N

      //      f(N) = 3N + 2
      // View this as a graph...
      // The number of statements changes the slope of the function. The function is always linear

      // All code is linear as long as you have single for loops. So you can predict how long
      // code will take to execute in different scenarios. IE if it takes 1 second for 1000 loops
      // and you know the equation, then you would be able to know that it would take 2 seconds
      // for 2000 loops
    }
  }

  public void exampleThree() {
    int i;
    int N = 1000;
    int j;

    i = 0;                      // 1
    while(i < N) {              // N + 1
      j = 0;                    // N
      while(j < N) {            //(N * N) + N
        System.out.print("Hi"); // N * N
        j++;                    // N * N
      }
      i++;                      // N
    }

    //      f(n) = 3n^2 4n + 2

    // Executing code like this takes a long as time to go through. Big Data means NO MORE FOR
    // LOOPS BECAUSE OF SCALABILITY. STUFF TAKES TOO LONG TO EXECUTE
  }
}
