package Examples.TestOne;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestPanel extends JPanel{

  private JButton button;

  public TestPanel() {
    button = new JButton("Test");
    add(button);
  }

  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

    }
  }
}
