/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.*;
import javax.swing.*;
import model.MLihatKaryawan;
import view.*;
/**
 *
 * @author mumta
 */
public class CLihatKaryawan {
    MLihatKaryawan model1;
    TampilData tampilView1;
    InputData input1;
    UpdateData edit1;
    
    public CLihatKaryawan(TampilData tampilView, MLihatKaryawan model,InputData input, UpdateData edit){
        this.model1 = model;
        this.tampilView1 = tampilView;
        this.input1 = input;
        this.edit1 = edit;
        
        if(model1.getBanyakData()!=0){
            String dataKaryawan[][] = model1.readData();
            tampilView1.tabel.setModel((new JTable(dataKaryawan, tampilView1.namaKolom)).getModel());
        }else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        
        
        tampilView1.bKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tampilView1.dispose();

            }
        });
        
        
        
        edit.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String nama = edit.getNama();
                String id = edit.getId();
                String usia = edit.getUsia();
                String gaji =edit.getGaji();
                model.update(nama,id, usia, gaji);
                edit.dispose();
            }
        });
        edit.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String cek = edit.getId();
                model.delete(cek);
                edit.dispose();
            }
        });
        edit1.btnKembalii.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edit.dispose();
            }
        });
        
        
        input1.btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String nama = input1.getNama();
                String usia = input1.getUsia();
                String gaji =input1.getGaji();
                model.insert(nama, usia, gaji);
         
                String dataKaryawan[][] = model.readData();
                tampilView1.tabel.setModel((new JTable(dataKaryawan, tampilView1.namaKolom)).getModel());
            }
        });
        
        
        
         input1.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.dispose();
                TampilMenu menu = new TampilMenu();
                   
            }
        });
        input1.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input1.tNama.setText(null);
                input1.tUsia.setText(null);  
                input1.tGaji.setText(null);
            }
        });
        
        
            tampilView1.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = tampilView1.tabel.getSelectedRow();
                
                String id = tampilView1.tabel.getValueAt(baris, 0).toString();
                String nama = tampilView1.tabel.getValueAt(baris, 1).toString();
                String usia = tampilView1.tabel.getValueAt(baris, 2).toString();
                String gaji = tampilView1.tabel.getValueAt(baris, 3).toString();
                
                tampilView1.dispose();
                UpdateData update = new UpdateData();
                update.ffNama.setText(nama);
                update.fId.setText(id);
                update.ffUsia.setText(usia);
                update.ffGaji.setText(gaji);
                TampilData tampil = new TampilData();
                tampil.dispose();
                InputData input = new InputData();
                input.dispose();
                MLihatKaryawan model = new MLihatKaryawan();
                CLihatKaryawan control = new CLihatKaryawan(tampil,model,input,update);
                System.out.println("");
                        
            }
        }
        );
    }
}
