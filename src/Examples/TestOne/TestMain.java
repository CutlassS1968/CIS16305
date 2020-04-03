package Examples.TestOne;

import javax.swing.*;

public class TestMain extends JFrame {

  JFrame frame;

  public TestMain() {
    frame = new JFrame();
  }

  public static void main(String[] args) {
    TestMain main = new TestMain();
    TestPanel panel = new TestPanel();

    main.add(panel);
  }
}
