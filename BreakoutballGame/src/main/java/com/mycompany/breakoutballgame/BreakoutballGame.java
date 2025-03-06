/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.breakoutballgame;

import java.awt.Color;
/**
 *
 * @author Arnav Singh
 */import javax.swing.JFrame;

public class BreakoutballGame {

    public static void main(String[] args) {
      JFrame obj=new JFrame();
      Gameplay game=new Gameplay();
      obj.setBounds(10,10,700,600);
      obj.setTitle("Breakout Ball");
      obj.setResizable(false);
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // Adding panel to frame
         obj.setVisible(true);
obj.add(game);
      
    }
}
