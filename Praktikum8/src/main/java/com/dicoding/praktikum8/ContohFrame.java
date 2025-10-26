/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dicoding.praktikum8;
import java.awt.Color;
import javax.swing.JFrame; // untuk buaat Frame
import javax.swing.JLabel; // untuk buat label
import javax.swing.SwingConstants; // untuk mengatur posisi make SwingConstants
import javax.swing.ImageIcon;  // untuk import Image
import java.awt.Font; // untuk import FONT guna ngedit FONT
import javax.swing.JTextField;
import javax.swing.JButton;

/**
 *
 * @author ASUS
 */
public class ContohFrame {
    public static void main(String[] args){
        // Membuat JFrame
        JFrame frame = new JFrame("Judul Window");
        
        // Mengatur ukuran (lebar, tinggi)
        frame.setSize(400, 300);
        
        // Mengatur operasi saat window ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat frame terlihat
        frame.setVisible(true);
        
        // Opsional : menempatkan frame di tengah layar
        frame.setLocationRelativeTo(null);
        
//        // Label dengan teks
//        JLabel label1 = new JLabel("Nama:");
//        
//        // Label dengan teks dan allignment
//        JLabel label2 = new JLabel("Selamat Datang", SwingConstants.CENTER);
//        
//        // Label dengan gambar
//        ImageIcon icon = new ImageIcon("D:\\Windows\\Pictures\\prodiTI.jpg");
//        JLabel label3 = new JLabel(icon);
//        
//        // Label dengan teks dan gambar
//        JLabel label4 = new JLabel("User", icon, SwingConstants.LEFT); // import javax.swing.SwingConstants;
//        
//        // Mengubah teks Label
//        label1.setText("Username:");
//        
//        // Mengubah font dan warna
//        label1.setFont(new Font("Arial", Font.BOLD, 16)); // make import java.awt.Font;
//        label1.setForeground(Color.BLUE);
        
//        frame.add(label1);
//        frame.add(label2);
//        frame.add(label3);
//        frame.add(label4);
        
//        // TextField kosong dengan lebar 20 Karakter
//        JTextField textField1 = new JTextField(20);
//        
//        // TextField dengan text default
//        JTextField textField2 = new JTextField("Text Default");
//        
//        // TextField ddengan teks dan lebar
//        JTextField textField3 = new JTextField("Hello", 15);
//        
//        // Mendapatkan Text dari field
//        String inputText = textField1.getText();
//        
//        // Mengatur text
//        textField1.setText("Teks Baru");
//
//        frame.add(textField1);
//        frame.add(textField2);
//        frame.add(textField3);
        
        
        //Button dengan text
        JButton button1 = new JButton("Klik Saya");
        
        // Button dengan Gambar
        ImageIcon icon1 = new ImageIcon("D:\\Windows\\Pictures\\idk.jpg");
        JButton button2 = new JButton(icon1);
        
        // Button dengan text dan gambar
        JButton button3 = new JButton("Submit", icon1);
        
        // Mengatur warna background
        button1.setBackground(Color.BLUE);
        button1.setForeground(Color.WHITE);

//          frame.add(button1);
//          frame.add(button2);
          frame.add(button3);


           
    }
}
