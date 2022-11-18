/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
package controller.DatabaseHandler;
import javax.swing.*;
/**
 *
 * @author Cent
 */
public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b1 = new JButton("Login");
        b1.addActionListener(e ->{
            JFrame f2 = new JFrame();
            f2.setSize(500,500);
            f2.setVisible(true);
            JLabel label = new JLabel();
            label.setIcon(new ImageIcon("download.png"));
            f2.add(label);
        });
        JButton b2 = new JButton("Register");
        JButton b3 = new JButton("Lihat Data Pengguna/Kategori");

        b1.setBounds(150,140,100,40);
        b2.setBounds(150,180,100,40);
        b3.setBounds(150,220,100,40);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(400,500);
        f.setVisible(true);
    }
}
