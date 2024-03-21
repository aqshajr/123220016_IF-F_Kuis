/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220016_iff_kuis;

import Total.Hitung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Lab Informatika
 */
public class HalamanPembelian extends JFrame implements ActionListener{
    JLabel header = new JLabel("Halaman Pembelian");
    
    JLabel labelKategori = new JLabel("Kategori");
    JLabel outputKategori = new JLabel();
    
    JLabel labelHarga = new JLabel("Harga");
    JLabel outputHarga = new JLabel();
    
    JLabel labelJumlah = new JLabel("Jumlah");
    JTextField inputJumlah = new JTextField();
    
    JButton tombolKembali = new JButton("Kembali");
    JButton tombolBeli = new JButton("Beli");
    
    JLabel subHeader = new JLabel();
    
    JLabel labelHargaSatuan = new JLabel("Harga Satuan");
    JLabel hargaSatuan = new JLabel();
    JLabel labelOutputJumlah = new JLabel("Jumlah");
    JLabel outputJumlah = new JLabel();
    JLabel labelTotal = new JLabel("Total Harga");
    JLabel total = new JLabel();
    
        public HalamanPembelian(String kategori, int harga){
        setVisible(true);
        setSize(500,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Halaman Pembelian");
        
        String hargaMajalah = String.valueOf(harga);
        
        add(header);
        add(labelKategori);
        add(outputKategori);
        add(labelHarga);
        add(outputHarga);
        add(labelJumlah);
        add(inputJumlah);
        add(tombolKembali);
        add(tombolBeli);
        add(subHeader);
        add(labelHargaSatuan);
        add(hargaSatuan);
        add(labelOutputJumlah);
        add(outputJumlah);
        add(labelTotal);
        add(total);
        
        header.setBounds(20,10,400,25);
        labelKategori.setBounds(20,40,100,25);
        outputKategori.setBounds(150,40,200,25);
        labelHarga.setBounds(20,60,100,25);
        outputHarga.setBounds(150,60,200,25);
        labelJumlah.setBounds(20,90,80,25);
        inputJumlah.setBounds(150,90,200,25);
        tombolKembali.setBounds(20,120,150,25);
        tombolBeli.setBounds(200,120,150,25);
        subHeader.setBounds(20,150,400,25);
        labelHargaSatuan.setBounds(20,170,200,25);
        hargaSatuan.setBounds(150,170,200,25);
        labelOutputJumlah.setBounds(20,190,200,25);
        outputJumlah.setBounds(150,190,200,25);
        labelTotal.setBounds(20,210,200,25);
        total.setBounds(150,210,200,25);
        
        outputKategori.setText(kategori);
        outputHarga.setText(hargaMajalah);
        
        tombolKembali.addActionListener(this);
        tombolBeli.addActionListener(this);

        }
        
    @Override
    public void actionPerformed(ActionEvent e) {
        int harga=Integer.parseInt(outputHarga.getText());
        int jumlah=Integer.parseInt(inputJumlah.getText());
        
        Hitung majalah=new Hitung(harga,jumlah);
        
        String hitungJumlah=String.valueOf(jumlah);
        String hitungTotal=String.valueOf(majalah.hargaTotal());
        
        if(e.getSource()==tombolBeli){
            outputJumlah.setText(hitungJumlah);
            total.setText(hitungTotal);
        }
        
        if(e.getSource()==tombolKembali){
            new HalamanLogin();
        }
    }
}
