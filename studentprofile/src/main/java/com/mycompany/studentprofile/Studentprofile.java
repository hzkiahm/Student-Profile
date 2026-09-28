/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentprofile;

import javax.swing.JFrame;

/**
 *
 * @author hezekiahmagalona
 */
public class Studentprofile {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Student Profile");
            frame.setSize(781, 606);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            NewJPanel panel = new NewJPanel();
            panel.setBounds(0, 0, 781, 606);
            frame.add(panel);

            frame.setVisible(true);  
        });
    }
}
   
