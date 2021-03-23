import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Counter implements ActionListener {
  JLabel leftLabel;
  JLabel rightLabel;
  int leftCount = 0;
  int rightCount = 0;
  //program was having trouble reading the labels and counts, so I initialized them outside of the Counter() and actionPerformed().

    Counter() {
      JFrame frame = new JFrame("Lets Count");
      frame.setLayout(new FlowLayout());
      frame.setSize(200,110);
      //initialize the frame.

      JButton left = new JButton("Left");
      JButton right = new JButton("Right");
      //creates the buttons that will be used to add values to left and right.

      leftCount = 0;
      rightCount = 0;
      //sets up the counting variables.

      left.addActionListener(this);
      right.addActionListener(this);
      //tells the program to listen to actions done to the buttons.

      frame.add(left);
      frame.add(right);
      //makes buttons visible.

      leftLabel = new JLabel("Count: " + leftCount);
      rightLabel = new JLabel("Count: " + rightCount);
      frame.add(leftLabel);
      frame.add(rightLabel);
      //These labels will feature the count variables. They have been made visisble.

      JButton reset = new JButton("Reset");
      reset.addActionListener(this);
      frame.add(reset);
      //reset button is created, made actionable, and visible.

      frame.setVisible(true);
      //frame is now visible.

  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")) {
        leftCount++;
        leftLabel.setText("Count: " + leftCount);  
        //if the action hears the left button clicked, it adds to the count variable and updates the label name.
    }
    else if (ae.getActionCommand().equals("Right")) {
        rightCount++;
        rightLabel.setText("Count:" + rightCount);
        //if the action hears the right button clicked, it adds to the count variable and updates the label name.
    }
    else {
        leftCount = 0;
        rightCount = 0;
        leftLabel.setText("Count: " + leftCount);
        rightLabel.setText("Count " + rightCount);
        //resets the program.
    }
   }
  }