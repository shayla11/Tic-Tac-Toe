package tic.tac.toe;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

/**
 * This program will allow two people to play Tic-Tac-Toe. This class will
 * extend JFrame and implement Action Listener to create the GUI and play the
 * game. 
 *
 * @author Sean Tisdale setisdale@aggies.ncat.edu 
 * @author Shayla Sexton sesexton@aggies.ncat.edu
 * @author Xavier Luna xilunacabrera@aggies.ncat.edu
 */
//package Tickitytackytoe


/**
 *
 * @author shayla
 */
public class TicTacToe extends JFrame implements ActionListener{
  //Here are all the buttons for our Tic-Tac-Toe Board
  JButton button1 = new JButton(); 
  JButton button2 = new JButton();
  JButton button3 = new JButton();
  JButton button4 = new JButton(); 
  JButton button5 = new JButton();
  JButton button6 = new JButton(); 
  JButton button7 = new JButton(); 
  JButton button8 = new JButton(); 
  JButton button9 = new JButton(); 
  JButton[] allBtns = {button1,button2,button3,button4,button5,button6,button7,button8,button9};
  JButton resetBtn = new JButton("Reset");
   
  ImageIcon xPic = new ImageIcon("TTT_X.png");
  ImageIcon oPic = new ImageIcon("GrayCircle.png");


  /**
   * This is the constructor method that makes the pane for the tic-tac-toe board
   * and adds the buttons to the pane and to the action listener
   *
   */ 
  public TicTacToe() {
    setSize(400,400);
    Container pane = getContentPane();
    GridLayout experimentLayout = new GridLayout(0,3);
   
    //Sets the layout for the tic-tacc-toe board
    setLayout(experimentLayout);
    pane.add(button1);
    pane.add(button2);
    pane.add(button3);
    pane.add(button4);
    pane.add(button5);
    pane.add(button6);
    pane.add(button7);
    pane.add(button8);
    pane.add(button9);
    pane.add(resetBtn);
    
    //Adds the buttons to the action listener
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    resetBtn.addActionListener(this);
    setTitle("Tic-Tac-Toe");
          
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  int clicks = 0;
  int Winner = 0;

  /**
   * This is the action preformed method that is in control of determining whose
   * turn it is, changing the icon to X or O, and finding who the winner is.
   *
   * @param event will be for the buttons
   */
  public void actionPerformed(ActionEvent event) {
    //This will set the title change
    if(clicks%2 == 0) {
      setTitle("Player's 2 turn");
    } else if(clicks%2 == 1) {
        setTitle("Player's 1 turn");
    }
   
    JButton btn = (JButton) event.getSource();
    if (event.getSource() == resetBtn) {
      // reset game
      clicks = 1;
      Winner = 0;
      for (int i = 0; i < allBtns.length; i++) {
        allBtns[i].setIcon(null);
        setTitle("Player's 1 turn");
      }
    }
    if (btn.getIcon() == null && Winner == 0) {
      btn.setIcon(clicks%2==0 ? xPic : oPic);
      clicks++;
      resetBtn.setIcon(null);
    }

    //123|
    if(button1.getIcon() == button2.getIcon() && button2.getIcon() == 
            button3.getIcon() && button1.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
      }
    }
    //456 |
    if(button4.getIcon() == button5.getIcon() && button5.getIcon() == 
            button6.getIcon() && button4.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
    }
    //789  |
    if(button7.getIcon() == button8.getIcon() && button8.getIcon() == 
            button9.getIcon() && button7.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
    }
    //147
    if(button1.getIcon() == button4.getIcon() && button4.getIcon() == 
            button7.getIcon() && button1.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
    }
    //258
    if(button2.getIcon() == button5.getIcon() && button5.getIcon() == 
            button8.getIcon() && button2.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
    }
    //369
    if(button3.getIcon() == button6.getIcon() && button6.getIcon() == 
            button9.getIcon() && button3.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
    }
    //159
    if(button1.getIcon() == button5.getIcon() && button5.getIcon() == 
            button9.getIcon() && button1.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
    }
    //357/
    if(button3.getIcon() == button5.getIcon() && button5.getIcon() == 
            button7.getIcon() && button3.getIcon() != null) {
      if (clicks % 2 == 1) {
        setTitle("Player 1 WINS!!!");
        Winner = 1;
      } else {
          setTitle("Player 2 WINS!!!");
          Winner = 1;
        }
   }
  }

/**
 * This is the main method that will run the entire Tic-Tac-Toe Game.
 * 
 * @param args of string array
 */
   public static void main(String[] args) {
      TicTacToe game = new TicTacToe();
   }
}

