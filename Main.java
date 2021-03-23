/*
Lab 7
Nicholas Warren
Date: 3/23/2021
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//used to import the new Java Swing functions.

class Main {
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new Counter();
        //runs the counter operation which is in Counter.java
      }
    } );
  }
}