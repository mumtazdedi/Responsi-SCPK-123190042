/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author mumta
 */
public class UpdateData extends JFrame {
    
    JLabel llJudul = new JLabel("Update Data Karyawan");
    
    JLabel llNama = new JLabel("Nama");
    JLabel llUsia = new JLabel("Usia");
    JLabel llGaji = new JLabel("Gaji");
    
    
    public final JTextField ffNama = new JTextField(10);
    public final JTextField fId = new JTextField(10);
    public final JTextField ffUsia= new JTextField(10);
    public final JTextField ffGaji = new JTextField(10);
    
    public JButton btnUpdate = new JButton("Ganti Data");
    public JButton btnDelete = new JButton("Hapus");
   
    public JButton btnKembalii = new JButton("Menu Awal");
    
     public UpdateData(){
         
        setVisible(true);
        setTitle("Update Data Karyawan");
        setSize(300,250);
        setLayout(null);
        
        add(llJudul);
        add(llNama);
        add(llUsia);
        add(llGaji);
        add(ffNama);
        add(ffGaji);
        add(ffUsia);  
        add(btnUpdate);
        add(btnDelete); 
        add(btnKembalii);
        
        llJudul.setBounds(20,5,200,20);
        llNama.setBounds(20,30,120,20);
        ffNama.setBounds(60,30,220,20);
        
        llUsia.setBounds(20,60,120,20);
        ffUsia.setBounds(60,60,220,20);
        
        llGaji.setBounds(20,90,120,20);
        ffGaji.setBounds(60,90,220,20);
        
        btnUpdate.setBounds(60,130,90,20);
        btnDelete.setBounds(160,130,90,20);
        btnKembalii.setBounds(20,165,250,20);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
        setLocationRelativeTo(null);
    }
     
     
    public String getNama(){
        return ffNama.getText();
    }
    public String getId(){
        return fId.getText();
    }
    
    public String getUsia(){
        return ffUsia.getText();
    }
    
    public String getGaji(){
        return ffGaji.getText();
    }
}
