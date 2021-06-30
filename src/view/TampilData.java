/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mumta
 */
public class TampilData extends JFrame {
    JFrame frame = new JFrame("Database Karyawan");
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"No", "Nama Karyawan", "Usia", "Gaji"};
    
    public JButton bKembali = new JButton("Menu Awal");
    
    
    public TampilData(){
        
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Karyawan");
        setSize(700, 550);
        setVisible(true);
        setLayout(null);
        add(scrollPane);
        
        scrollPane.setBounds(40, 35, 600, 400);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(bKembali);
        bKembali.setBounds(20, 450,100, 30);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
