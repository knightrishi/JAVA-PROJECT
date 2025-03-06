/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.breakoutballgame;

/**
 *
 * @author Arnav Singh
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {
    public int[][] map;
    public int bricksWidth;
    public int bricksHeight;

    public MapGenerator(int row, int col) {
        map = new int[row][col];
        for (int[] map1:map) {
            for (int j = 0; j < col; j++) {
                map1[j] = 1;  // Initialize all bricks to be present
            }
        }

        bricksWidth = 540 / col;
        bricksHeight = 150 / row;
    }

    public void draw(Graphics2D g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] > 0) {
                    g.setColor(new Color(255, 20, 147)); // Deep Pink

                    g.fillRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);

                        g.setStroke(new BasicStroke(3));
                    // Adding a white border around bricks
                    g.setColor(Color.BLACK);
                    g.drawRect(j * bricksWidth + 80, i * bricksHeight + 50, bricksWidth, bricksHeight);
                }
            }
        }
    }
    public void setBricksValue(int value, int row, int col ){
    map[row][col]=value;
    }
}

