package Examples.Window;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window extends JPanel {
  JPanel panel;
  JButton button;
  JTextField output;
  ButtonListener listen;

  public Window() {
    button = new JButton("Click Me!");
    output = new JTextField();
    listen = new ButtonListener();

    button.addActionListener(listen);

    add(button);

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();

  }

  private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {

    }
  }
}
