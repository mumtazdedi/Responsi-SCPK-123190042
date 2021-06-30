/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CLihatKaryawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.MLihatKaryawan;

/**
 *
 * @author mumta
 */
public class TampilMenu extends JFrame implements ActionListener {
    JLabel ljudul = new JLabel("Database Karyawan");

   public JButton btnInput = new JButton("Tambah Karyawan");
   public JButton btnLihat = new JButton("Lihat Karyawan");


    public TampilMenu(){
        
        setTitle("Database Karyawan");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLayout(null);
        add(ljudul);
        add(btnLihat);
        add(btnInput);

        ljudul.setBounds(10,10,150,20);


        btnInput.setBounds(10,40,150,20);
        btnLihat.setBounds(10,70,150,20);
        
        btnInput.addActionListener(this);
        btnLihat.addActionListener(this);


        setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed (ActionEvent e){
        if(e.getSource() == btnInput){
           TampilData tampil = new TampilData();
           tampil.dispose();
           dispose();
           InputData input = new InputData();
           UpdateData update = new UpdateData();
           update.dispose();
           MLihatKaryawan md = new MLihatKaryawan();
           CLihatKaryawan ct = new CLihatKaryawan(tampil, md,input,update);
          
        }
        if(e.getSource() == btnLihat){
           TampilData tampil = new TampilData();
           InputData input = new InputData();
           input.dispose();
           UpdateData update = new UpdateData();
           update.dispose();
           MLihatKaryawan md = new MLihatKaryawan();
           CLihatKaryawan ct = new CLihatKaryawan(tampil, md,input,update);
        }

    }
}
