//package classes;
//
//public class class0212 {
//
//  // This allows for comparing
//
//  // Project 3 has 15 sort classes
//
//  // The way you sort is the number of fields in your database,
//  // You would have to have separate classes for every sort.
//
//  // (NO ONE LIKES THIS SOLUTION)
//  // SOLUTION:
//  // Don't make a separate class, imbed the classes
//
//  // Anonymous class:
//  // Collections.sort(friends, new Comparator<Student>() {
//  //  @Override
//  //    public int compare(Student o1, Student o2) {
//  //      return o1.getLastName().compareTo(o2.getLastName());
//  //    }
//  // }
//
//  /**
//   * ... but this is super messy and no one likes it because it fucks up how your code looks
//   *
//   * Want to stay with that approach because we dont want tons and tons of small classes...
//   *
//   * Their solution is very new, it's called lambdas...
//   *
//   * lambda functions in Java are restricted to interfaces with one method, no more. This is NOT
//   * true in python or C++
//   *
//   *
//   *  Collections.sort(friends, (s1, s2) ->
//   *    s1.getLastName().compareTo(s2.getLastName());
//   *
//   *
//   *
//   *  Collections.sort(friends, (s1, s2) -> {
//   *    if (s1.getLastName().compareTo(s2.getLastName()) < 0)
//   *      return -1;
//   *      else
//   *        return 0;
//   *  });
//   *
//   *  -> = Lambda
//   *
//   *
//   */
//
//  /**
//   * Thinking in parallel...
//   *
//   * Look at a huge array, try to find one value...
//   * why not just use all your cores to look at every index in the array? It's impractical.
//   *
//   * Java can allow for using multiple cores tho. its called Threads
//   *
//   *
//   * For loops = sequential
//   * Code is moving towards working in parallel
//   *
//   */
//
//  /**
//   * Course resources are posted on blackboard
//   *
//   * StudentList.java
//   *
//   * look at like 46-90
//   */
//
//
//
//
//  // Class ------- "Is A" Comparator of (type) Student
//  public class SortByFirstName implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//      return o1.getFirstName().compareTo(o2.getFirstName());
//    }
//  }
//
//  public class SortByLastName implements Comparator<Student> {
//    @Override
//    public int compare(Student o1, Student o2) {
//      return o1.getLastName().compareTo(o2.getLastName());
//    }
//  }
//
//}
